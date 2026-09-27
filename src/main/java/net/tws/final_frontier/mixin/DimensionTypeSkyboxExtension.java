package net.tws.final_frontier.mixin;

import net.minecraft.world.level.dimension.DimensionType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(DimensionType.Skybox.class)
public enum DimensionTypeSkyboxExtension {

    FINAL_FRONTIER_MOON("moon");

    @Final
    @Shadow
    private String name;
    DimensionTypeSkyboxExtension(String name) {

    }
}
