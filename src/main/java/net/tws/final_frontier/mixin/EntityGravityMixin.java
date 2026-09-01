package net.tws.final_frontier.mixin;

import net.minecraft.world.entity.Entity;
import net.tws.final_frontier.common.utils.FFUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityGravityMixin {

    @Inject(method = "getGravity", at = @At("RETURN"), cancellable = true)
    private void scaleGravity(CallbackInfoReturnable<Double> cir) {
        cir.setReturnValue(cir.getReturnValue() * FFUtils.getGravityMultiplier(((Entity) (Object) this).level()));
    }
}
