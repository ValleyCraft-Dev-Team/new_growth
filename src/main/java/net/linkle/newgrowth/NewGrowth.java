package net.linkle.newgrowth;

import net.fabricmc.api.ModInitializer;
import net.linkle.newgrowth.z_INIT.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewGrowth implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("New Growth");

	public static final String MOD_ID = "newgrowth";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//initializers
		NG_Groups.initialize();
		NG_Dishes.initialize();
		NG_Crops.initialize();
		NG_Blocks.initialize();
		NG_Items_Misc.initialize();

		LOGGER.info("The main mod initialization sections loaded fine somehow.");
	}
}
