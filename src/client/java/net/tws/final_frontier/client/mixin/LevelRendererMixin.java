package net.tws.final_frontier.client.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.SkyRenderer;
import net.minecraft.client.renderer.state.level.SkyRenderState;
import net.minecraft.world.level.dimension.DimensionType;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(LevelRenderer.class)
public class LevelRendererMixin {
    @Shadow private @Nullable SkyRenderer skyRenderer;

    @WrapMethod(method = "lambda$addSkyPass$0")
    private void addFinalFrontierSkyPass(GpuBufferSlice skyFog, SkyRenderState state, Operation<Void> original) {
        if (state.skybox == DimensionType.Skybox.FINAL_FRONTIER_MOON) {
            assert this.skyRenderer != null;

            RenderSystem.setShaderFog(skyFog);

            this.skyRenderer.renderEndSky();
            if (state.endFlashIntensity > 1.0E-5F) {
                PoseStack poseStack = new PoseStack();
                this.skyRenderer.renderEndFlash(poseStack, state.endFlashIntensity, state.endFlashXAngle, state.endFlashYAngle);
            }
        }
        else
            original.call(skyFog, state);
    }
}