package net.tws.final_frontier.client.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.framegraph.FrameGraphBuilder;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.SkyRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.state.level.SkyRenderState;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.model.sprite.AtlasManager;
import net.tws.final_frontier.client.renderer.FFSkyRenderer;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public class LevelRendererMixin {
    @Shadow @Final private GameRenderer gameRenderer;
    @Shadow @Final private TextureManager textureManager;
    @Shadow @Final private AtlasManager atlasManager;
    @Shadow private @Nullable SkyRenderer skyRenderer;

    /**
     * Wrap the render pass lambda method
     */
    @WrapMethod(method = "lambda$addSkyPass$0")
    private void addFinalFrontierSkyPass(GpuBufferSlice skyFog, SkyRenderState state, Operation<Void> original) {
        FFSkyRenderer ffSkyRenderer = FFSkyRenderer.instance;

        // Render the Final Frontier sky or continue vanilla sky rendering
        if (!ffSkyRenderer.renderSky(skyFog, state))
            original.call(skyFog, state);
    }

    /**
     * Initialize the Final Frontier sky renderer after the vanilla sky renderer
     */
    @Inject(method = "addSkyPass", at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/LevelRenderer;skyRenderer:Lnet/minecraft/client/renderer/SkyRenderer;", shift = At.Shift.AFTER))
    private void initializeSkyRenderer(FrameGraphBuilder frame, CameraRenderState cameraState, GpuBufferSlice skyFog, CallbackInfo ci) throws Exception {
        if (FFSkyRenderer.instance != null)
            FFSkyRenderer.instance.close();

        FFSkyRenderer.instance = new FFSkyRenderer(this.textureManager, this.atlasManager, this.gameRenderer.mainRenderTarget(), this.skyRenderer);
    }
}