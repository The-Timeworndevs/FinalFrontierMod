package net.tws.final_frontier.client.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SkyRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(SkyRenderer.class)
public interface SkyRendererAccessor {
    @Invoker("renderStars") void final_frontier$renderStars(final float starBrightness, final PoseStack poseStack);
}