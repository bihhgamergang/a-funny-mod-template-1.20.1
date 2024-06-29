package net.sillyguy.afunnymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.sillyguy.afunnymod.AFunnyMod;

public class ModBlocks {
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block RAW_ENDERITE_BLOCK = registerBlock("raw_enderite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(30f, 1200f), UniformIntProvider.create(4, 8)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AFunnyMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AFunnyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        AFunnyMod.LOGGER.info("Registering ModBlocks for " + AFunnyMod.MOD_ID);
    }
}
