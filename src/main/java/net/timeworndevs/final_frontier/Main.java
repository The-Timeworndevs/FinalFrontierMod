package net.timeworndevs.final_frontier;

import net.fabricmc.api.ModInitializer;

import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.ReplaceBlobsFeature;
import net.timeworndevs.final_frontier.common.FFBlocks;
import net.timeworndevs.final_frontier.common.FFGroups;
import net.timeworndevs.final_frontier.common.FFItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "final_frontier";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		LOGGER.info("It's time to blast off!");

		LOGGER.info("Registering Blocks");
		FFBlocks.init();
		LOGGER.info("Registered Blocks");

		LOGGER.info("Registering Items");
		FFItems.init();
		LOGGER.info("Registered Items");

		LOGGER.info("Registering Tabs");
		FFGroups.init();
		LOGGER.info("Registered Tabs");
	}
}