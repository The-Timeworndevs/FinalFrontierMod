package net.tws.final_frontier.client.renderer;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.BindGroupLayouts;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.SkyRenderer;
import net.minecraft.client.renderer.state.level.SkyRenderState;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.model.sprite.AtlasManager;
import net.minecraft.data.AtlasIds;
import net.minecraft.world.level.MoonPhase;
import net.minecraft.world.level.dimension.DimensionType;
import net.tws.final_frontier.Main;
import net.tws.final_frontier.client.mixin.SkyRendererAccessor;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector4f;

import java.util.Optional;
import java.util.OptionalDouble;

public class FFSkyRenderer implements AutoCloseable {
    public static final RenderPipeline CELESTIAL_TRANSLUCENT = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.GLOBALS_SNIPPET)
                    .withBindGroupLayout(BindGroupLayouts.MATRICES_PROJECTION)
                    .withLocation("pipeline/celestial")
                    .withVertexShader("core/position_tex")
                    .withFragmentShader("core/position_tex")
                    .withBindGroupLayout(BindGroupLayouts.SAMPLER0)
                    .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT))
                    .withVertexBinding(0, DefaultVertexFormat.POSITION_TEX)
                    .withPrimitiveTopology(PrimitiveTopology.QUADS)
                    .build()
    );

    public static FFSkyRenderer instance; // Use a singleton instance

    private final TextureAtlas celestialsAtlas;
    private final RenderSystem.AutoStorageIndexBuffer quadIndices;
    private final RenderTarget renderTarget;
    private final SkyRenderer skyRenderer; // Keep a reference to the vanilla sky renderer

    // Celestial Buffers
    private final GpuBuffer vacuumSunBuffer;
    private final GpuBuffer earthBuffer;

    public FFSkyRenderer(TextureManager textureManager, AtlasManager atlasManager, RenderTarget renderTarget, SkyRenderer skyRenderer) {
        this.celestialsAtlas = atlasManager.getAtlasOrThrow(AtlasIds.CELESTIALS);
        this.quadIndices = RenderSystem.getSequentialBuffer(PrimitiveTopology.QUADS);
        this.renderTarget = renderTarget;
        this.skyRenderer = skyRenderer;

        // Build Celestial Buffers
        this.vacuumSunBuffer = buildCelestialQuad("Vacuum Sun","vacuum_sun");
        this.earthBuffer = buildCelestialPhases("Earth", "earth");
    }

    /**
     * Check if the skybox is part of Final Frontier.
     * Call the render method and return true, otherwise return false.
     */
    public boolean renderSky(GpuBufferSlice skyFog, SkyRenderState state) {
        if (state.skybox == DimensionType.Skybox.FINAL_FRONTIER_MOON) {
            RenderSystem.setShaderFog(skyFog);
            this.renderMoonSky(state.sunAngle, state.starAngle, state.moonPhase);
            return true;
        }
        else
            return false;
    }

    public void renderMoonSky(float sunAngle, float starAngle, MoonPhase phase) {
        PoseStack poseStack = new PoseStack();
        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(90.0f));
        // Stars
        poseStack.pushPose();
        poseStack.mulPose(Axis.XP.rotation(starAngle));
        this.renderStars(1.0f, poseStack);
        poseStack.popPose();
        // Sun
        poseStack.pushPose();
        poseStack.mulPose(Axis.XP.rotation(sunAngle));
        this.renderCelestial("Sun", this.vacuumSunBuffer, 30.0f, 1.0f, poseStack);
        poseStack.popPose();
        // Earth
        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(-90.0f));
        this.renderCelestialPhase("Earth", this.earthBuffer, phase.index(), 100.0f, 1.0f, poseStack);
        poseStack.popPose();
        // Final pop
        poseStack.popPose();
    }

    /**
     * GpuBuffer with one quad for the opaque texture and one quad for the translucent glow texture.
     * The first quad is the translucent glow.
     */
    private GpuBuffer buildCelestialQuad(String bufferName, String texture) {
        VertexFormat format = DefaultVertexFormat.POSITION_TEX;

        try (ByteBufferBuilder byteBufferBuilder = ByteBufferBuilder.exactlySized(8 * format.getVertexSize())) {
            BufferBuilder builder = new BufferBuilder(byteBufferBuilder, PrimitiveTopology.QUADS, format);

            for (int i = 0; i < 2; i++) {
                String path = i == 0 ? (texture + "_glow") : texture;
                TextureAtlasSprite sprite = this.celestialsAtlas.getSprite(Main.id(texture + "/" + path));
                builder.addVertex(-1.0f, 0.0f, -1.0f).setUv(sprite.getU0(), sprite.getV0());
                builder.addVertex(1.0f, 0.0f, -1.0f).setUv(sprite.getU1(), sprite.getV0());
                builder.addVertex(1.0f, 0.0f, 1.0f).setUv(sprite.getU1(), sprite.getV1());
                builder.addVertex(-1.0f, 0.0f, 1.0f).setUv(sprite.getU0(), sprite.getV1());
            }

            try (MeshData mesh = builder.buildOrThrow()) {
                return RenderSystem.getDevice().createBuffer(() -> bufferName, 32, mesh.vertexBuffer());
            }
        }
    }

    /**
     * GpuBuffer with eight quads for the opaque texture and one quad for the translucent glow texture.
     * The first quad is the translucent glow.
     */
    private GpuBuffer buildCelestialPhases(String bufferName, String texture) {
        VertexFormat format = DefaultVertexFormat.POSITION_TEX;

        try (ByteBufferBuilder byteBufferBuilder = ByteBufferBuilder.exactlySized(36 * format.getVertexSize())) {
            BufferBuilder builder = new BufferBuilder(byteBufferBuilder, PrimitiveTopology.QUADS, format);

            for (int i = 0; i < 9; i++) {
                String path = i == 0 ? (texture + "_glow") : (texture + "_" + (i - 1));
                TextureAtlasSprite sprite = this.celestialsAtlas.getSprite(Main.id(texture + "/" + path));
                builder.addVertex(-1.0f, 0.0f, -1.0f).setUv(sprite.getU0(), sprite.getV0());
                builder.addVertex(1.0f, 0.0f, -1.0f).setUv(sprite.getU1(), sprite.getV0());
                builder.addVertex(1.0f, 0.0f, 1.0f).setUv(sprite.getU1(), sprite.getV1());
                builder.addVertex(-1.0f, 0.0f, 1.0f).setUv(sprite.getU0(), sprite.getV1());
            }

            try (MeshData mesh = builder.buildOrThrow()) {
                return RenderSystem.getDevice().createBuffer(() -> bufferName, 32, mesh.vertexBuffer());
            }
        }
    }

    private void renderCelestial(String name, GpuBuffer celestial, float scale, float alpha, PoseStack poseStack) {
        this.renderCelestialPhase(name, celestial, 0, scale, alpha, poseStack);
    }

    /**
     * Render a celestial from the GpuBuffer at the phase index.
     * The phase index should be zero if the celestial does not have phases.
     */
    private void renderCelestialPhase(String name, GpuBuffer celestial, int phase, float scale, float alpha, PoseStack poseStack) {
        int vertexOffset = (phase + 1) * 4; // Offset the base vertex to render the quad for the given phase
        Matrix4fStack stack = RenderSystem.getModelViewStack();
        stack.pushMatrix();
        stack.mul(poseStack.last().pose());
        stack.translate(0.0f, 100.0f, 0.0f);
        stack.scale(scale, 1.0f, scale);
        GpuBufferSlice dynamicTransforms = RenderSystem.getDynamicUniforms().writeTransform(new Matrix4f(stack), new Vector4f(1.0f, 1.0f, 1.0f, alpha));
        GpuTextureView color = this.renderTarget.getColorTextureView();
        GpuTextureView depth = this.renderTarget.getDepthTextureView();
        GpuBuffer indexBuffer = this.quadIndices.getBuffer(6);

        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> name, color, Optional.empty(), depth, OptionalDouble.empty())) {
            RenderSystem.bindDefaultUniforms(renderPass);
            renderPass.setUniform("DynamicTransforms", dynamicTransforms);
            renderPass.bindTexture("Sampler0", this.celestialsAtlas.getTextureView(), this.celestialsAtlas.getSampler());
            renderPass.setVertexBuffer(0, celestial.slice());
            renderPass.setIndexBuffer(indexBuffer, this.quadIndices.type());
            renderPass.setPipeline(RenderPipelines.CELESTIAL);
            renderPass.drawIndexed(6, 1, 0, 0, 0); // Glow Quad
            renderPass.setPipeline(CELESTIAL_TRANSLUCENT);
            renderPass.drawIndexed(6, 1, 0, vertexOffset, 0); // Main Quad
        }

        stack.popMatrix();
    }

    /**
     * Invoke the vanilla renderStars method
     */
    private void renderStars(float starBrightness, PoseStack poseStack) {
        ((SkyRendererAccessor) this.skyRenderer).final_frontier$renderStars(starBrightness, poseStack);
    }

    @Override
    public void close() {
        this.vacuumSunBuffer.close();
        this.earthBuffer.close();
    }
}