package net.timeworndevs.final_frontier.planet;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.PacketListener;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class PlanetData {

    private Planet planet;
    private ResourceKey<Level> levelKey;
    private boolean isSky;
    private boolean overrideSky;
    private boolean hasClouds;
    private boolean hasWeather;
    private boolean hasOxygen;
    private double gravity;

    public PlanetData(ResourceLocation id, boolean isSky, boolean overrideSky, boolean hasClouds, boolean hasWeather, boolean hasOxygen, double gravity) {
        this.levelKey = ResourceKey.create(Registries.DIMENSION, id);
        this.isSky = isSky;
        this.overrideSky = overrideSky;
        this.hasClouds = hasClouds;
        this.hasWeather = hasWeather;
        this.hasOxygen = hasOxygen;
        this.gravity = gravity;
    }

    public PlanetData(FriendlyByteBuf buffer) {
        this.levelKey = buffer.readResourceKey(Registries.DIMENSION);
        this.isSky = buffer.readBoolean();
        this.overrideSky = buffer.readBoolean();
        this.hasClouds = buffer.readBoolean();
        this.hasWeather = buffer.readBoolean();
        this.hasOxygen = buffer.readBoolean();
        this.gravity = buffer.readDouble();
    }

    public static void write(FriendlyByteBuf buffer, PlanetData data) {
        buffer.writeResourceKey(data.levelKey);
        buffer.writeBoolean(data.isSky);
        buffer.writeBoolean(data.overrideSky);
        buffer.writeBoolean(data.hasClouds);
        buffer.writeBoolean(data.hasWeather);
        buffer.writeBoolean(data.hasOxygen);
        buffer.writeDouble(data.gravity);
    }

    public boolean isSky() {
        return isSky;
    }

    public boolean overrideSky() {
        return overrideSky;
    }

    public boolean hasClouds() {
        return hasClouds;
    }

    public boolean hasWeather() {
        return hasWeather;
    }

    public boolean hasOxygen() {
        return hasOxygen;
    }

    public double gravity() {
        return gravity;
    }
}
