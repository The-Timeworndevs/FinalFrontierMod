package net.tws.final_frontier.common.init;

import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.dimension.DimensionType;
import net.neoforged.neoforge.registries.datamaps.DataMapType;
import net.tws.final_frontier.FinalFrontier;

public class FFDataMaps {

    public static final DataMapType<DimensionType, Double> GRAVITY_MULTIPLIER = register("gravity_multiplier", Registries.DIMENSION_TYPE, Codec.DOUBLE);

    private static <A, B>DataMapType<A, B> register(String id, ResourceKey<Registry<A>> registry, Codec<B> codec) {
        return DataMapType.builder(Identifier.fromNamespaceAndPath(FinalFrontier.MODID, id), registry, codec).build();
    }
}
