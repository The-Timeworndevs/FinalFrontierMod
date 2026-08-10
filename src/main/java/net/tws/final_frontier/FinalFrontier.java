package net.tws.final_frontier;

import net.neoforged.neoforge.registries.datamaps.RegisterDataMapTypesEvent;
import net.tws.final_frontier.common.init.FFBlocks;
import net.tws.final_frontier.common.init.FFDataMaps;
import net.tws.final_frontier.common.init.FFItems;
import net.tws.final_frontier.common.init.FFTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(FinalFrontier.MODID)
public class FinalFrontier {
    public static final String MODID = "final_frontier";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FinalFrontier(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        FFBlocks.register(modEventBus);
        FFItems.register(modEventBus);
        FFTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, FFConfig.SPEC);
    }



    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (FFConfig.LOG_DIRT_BLOCK.getAsBoolean()) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        }

        LOGGER.info("{}{}", FFConfig.MAGIC_NUMBER_INTRODUCTION.get(), FFConfig.MAGIC_NUMBER.getAsInt());

        FFConfig.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }
}
