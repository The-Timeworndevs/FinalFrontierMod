package net.timeworndevs.final_frontier.networking.server_client;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.timeworndevs.final_frontier.Main;
import net.timeworndevs.final_frontier.planet.Planet;

import java.util.HashMap;

public record PlanetDynamicDataS2C(HashMap<String, Planet.DynamicData> dynamicDataMap, ResourceKey<Level> viewpoint) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<PlanetDynamicDataS2C> PACKET_ID = new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "planet_dynamic_data"));
    public static final StreamCodec<FriendlyByteBuf, PlanetDynamicDataS2C> PACKET_CODEC = CustomPacketPayload.codec(PlanetDynamicDataS2C::write, PlanetDynamicDataS2C::new);

    private PlanetDynamicDataS2C(FriendlyByteBuf buffer) {
        this((HashMap<String, Planet.DynamicData>) buffer.readMap(FriendlyByteBuf::readUtf, Planet.DynamicData::new), buffer.readResourceKey(Registries.DIMENSION), buffer.readInt());
    }

    private void write(FriendlyByteBuf buffer) {
        buffer.writeMap(dynamicDataMap, FriendlyByteBuf::writeUtf, Planet::writeDynamicData);
        buffer.writeResourceKey(viewpoint);
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return PACKET_ID;
    }
}
