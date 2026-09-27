package net.tws.final_frontier;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.tws.final_frontier.common.init.FFBlocks;
import net.tws.final_frontier.common.init.FFItems;
import net.tws.final_frontier.common.init.FFTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "final_frontier";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("FinalFrontier");

	@Override
	public void onInitialize() {

		LOGGER.info("Initializing");

		FFBlocks.init();
		FFItems.init();
		FFTabs.init();

		LOGGER.info("Initialized");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
