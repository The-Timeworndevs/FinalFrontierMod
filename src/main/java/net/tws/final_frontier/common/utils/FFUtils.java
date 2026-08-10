package net.tws.final_frontier.common.utils;

import net.minecraft.world.level.Level;
import net.tws.final_frontier.common.init.FFDataMaps;

import java.util.Objects;

public class FFUtils {

    public static double getGravityMultiplier(Level level) {
        return Objects.requireNonNullElse(level.dimensionTypeRegistration().getData(FFDataMaps.GRAVITY_MULTIPLIER), 0.0D);
    }
}
