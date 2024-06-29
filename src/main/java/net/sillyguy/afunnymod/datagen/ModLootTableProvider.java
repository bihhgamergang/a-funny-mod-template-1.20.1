package net.sillyguy.afunnymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.sillyguy.afunnymod.block.ModBlocks;
import net.sillyguy.afunnymod.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ENDERITE_BLOCK);
        addDrop(ModBlocks.RAW_ENDERITE_BLOCK);

        addDrop(ModBlocks.ENDERITE_ORE, oreDrops(ModBlocks.ENDERITE_ORE, ModItems.RAWENDERITE));
    }

    public LootTable.Builder oreDrops(Block dropWithSilkTouch, Item drop) {
        return dropsWithSilkTouch(
                dropWithSilkTouch,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(dropWithSilkTouch, ItemEntry.builder(drop).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE)))
        );
    }
}
