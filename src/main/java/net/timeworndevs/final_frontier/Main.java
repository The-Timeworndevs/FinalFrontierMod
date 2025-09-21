package net.timeworndevs.final_frontier;

import net.fabricmc.api.ModInitializer;

import net.timeworndevs.final_frontier.common.FFBlocks;
import net.timeworndevs.final_frontier.common.FFCreativeItemTabs;
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
		FFBlocks.register();
		LOGGER.info("Registered Blocks");

		LOGGER.info("Registering Items");
		FFItems.register();
		LOGGER.info("Registered Items");

		LOGGER.info("Registering Tabs");
		FFCreativeItemTabs.register();
		LOGGER.info("Registered Tabs");
	}
}