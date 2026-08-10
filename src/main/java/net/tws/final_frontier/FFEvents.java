package net.tws.final_frontier;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.datamaps.RegisterDataMapTypesEvent;
import net.tws.final_frontier.common.init.FFDataMaps;

@EventBusSubscriber
public class FFEvents {
    
    @SubscribeEvent
    public static void registerDataType(RegisterDataMapTypesEvent event) {
        event.register(FFDataMaps.GRAVITY_MULTIPLIER);
    }
}
