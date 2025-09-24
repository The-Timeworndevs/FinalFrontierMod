package net.timeworndevs.final_frontier.mixin;

import net.minecraft.entity.LivingEntity;
import net.timeworndevs.final_frontier.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class EntityGravityMixin {
    @Inject(method = "tick", at = @At("TAIL"))
    public void tick$GravitySetterMixin(CallbackInfo ci) {
        if () {

        }
    }
}
