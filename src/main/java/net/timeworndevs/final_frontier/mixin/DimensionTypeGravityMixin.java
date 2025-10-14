package net.timeworndevs.final_frontier.mixin;

import net.minecraft.world.dimension.DimensionType;
import net.timeworndevs.final_frontier.duck.DimensionTypeGravity;
import org.spongepowered.asm.mixin.Mixin;

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
