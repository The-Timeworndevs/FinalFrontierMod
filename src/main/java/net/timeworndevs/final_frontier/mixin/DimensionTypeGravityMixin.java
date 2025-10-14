package net.timeworndevs.final_frontier.mixin;

import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;

import java.util.OptionalDouble;

@Mixin(DimensionType.class)
public class DimensionTypeGravityMixin implements DimensionTypeGravity {


    @Override
    public double gravity() {
        return this.gravity();
    }

    @Override
    public double safeFall() {
        return this.safeFall();
    }
}
