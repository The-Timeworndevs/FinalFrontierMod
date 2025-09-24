package net.timeworndevs.final_frontier.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(LivingEntity.class)
public class EntityGravityMixin {
    @ModifyReturnValue(method = "getGravity", at = @At("RETURN"))
    public double getGravity$setGravityChanges(double original) {
        return 0.013;
    }

    @ModifyReturnValue(method = "getSafeFallDistance()I", at = @At("RETURN"))
    public int getSafeFallDistance$setFallChanges(int original) {
        return 18;
    }
}
