package net.timeworndevs.final_frontier.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityGravityMixin {

    @Inject(method = "getDefaultGravity()D", at = @At("RETURN"), cancellable = true)
    public void finalFrontier$getDefaultGravity(CallbackInfoReturnable<Double> info) {
        Entity entity = (Entity) (Object) this;

        if (entity != null) {

        }
    }
}
