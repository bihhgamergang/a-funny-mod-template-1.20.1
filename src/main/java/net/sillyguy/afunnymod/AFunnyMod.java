package net.sillyguy.afunnymod;

import net.fabricmc.api.ModInitializer;

import net.sillyguy.afunnymod.block.ModBlocks;
import net.sillyguy.afunnymod.item.ModItemGroups;
import net.sillyguy.afunnymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AFunnyMod implements ModInitializer {
	public static final String MOD_ID = "afunnymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}