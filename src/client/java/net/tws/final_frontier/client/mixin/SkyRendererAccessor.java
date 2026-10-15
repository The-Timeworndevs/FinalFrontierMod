package net.tws.final_frontier.client.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.renderpearl.api.commands.RenderPass;
import net.minecraft.client.renderer.SkyRenderer;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(SkyRenderer.class)
public interface SkyRendererAccessor {
    @Invoker("renderStars") void final_frontier$renderStars(final RenderPass renderPass, final float starBrightness, final PoseStack poseStack);
    @Invoker("renderSkyDisc") void final_frontier$renderSkyDisc(final RenderPass renderPass, final Vector3fc skyColor);
    @Invoker("renderDarkDisc") void final_frontier$renderDarkDisc(final RenderPass renderPass);
}