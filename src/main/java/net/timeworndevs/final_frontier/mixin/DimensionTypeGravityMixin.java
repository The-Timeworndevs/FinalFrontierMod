package net.timeworndevs.final_frontier.mixin;

import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;

import java.util.OptionalDouble;

@Mixin(DimensionType.class)
public class DimensionTypeGravityMixin implements DimensionTypeGravity {


    @Override
    public double final_frontier$gravity() {
        return this.final_frontier$gravity();
    }

    @Override
    public double final_frontier$safeFall() {
        return this.final_frontier$safeFall();
    }
}
