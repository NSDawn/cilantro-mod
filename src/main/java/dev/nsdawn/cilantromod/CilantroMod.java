package dev.nsdawn.cilantromod;

import dev.nsdawn.cilantromod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CilantroMod implements ModInitializer {
	public static final String MOD_ID = "cilantro-mod";
	// java's just dumb i don't know what to tell you
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}