package net.tws.final_frontier.common.utils;

import net.minecraft.world.level.Level;
import net.tws.final_frontier.common.init.FFDataMaps;

import java.util.Objects;

public class FFUtils {

    public static double getGravityMultiplier(Level level) {
        Double datamapValue = level.dimensionTypeRegistration().getData(FFDataMaps.GRAVITY_MULTIPLIER);
        if (datamapValue == null) {
            return 1.0D;
        }
        return datamapValue;
    }
}
