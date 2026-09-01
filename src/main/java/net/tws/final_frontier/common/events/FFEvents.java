package net.tws.final_frontier.common.events;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingFallEvent;
import net.neoforged.neoforge.registries.datamaps.RegisterDataMapTypesEvent;
import net.tws.final_frontier.common.init.FFDataMaps;
import net.tws.final_frontier.common.utils.FFUtils;

@EventBusSubscriber
public class FFEvents {

    @SubscribeEvent
    public static void scaleFallDamageWithGravity(LivingFallEvent event) {
        event.setDamageMultiplier((float) (event.getDamageMultiplier() * FFUtils.getGravityMultiplier(event.getEntity().level())));
    }
}
