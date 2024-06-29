package net.sillyguy.afunnymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sillyguy.afunnymod.AFunnyMod;
import net.sillyguy.afunnymod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup NEW_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AFunnyMod.MOD_ID, "new"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.new"))
                    .icon(() -> new ItemStack(ModItems.ENDERITEINGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAWENDERITE);
                        entries.add(ModItems.ENDERITEINGOT);
                        entries.add(ModBlocks.ENDERITE_BLOCK);
                        entries.add(ModBlocks.RAW_ENDERITE_BLOCK);
                        entries.add(ModBlocks.ENDERITE_ORE);
                        entries.add(ModItems.GOLDEN_STEAK);
                        entries.add(ModItems.ENDERITE_PICKAXE);
                        entries.add(ModItems.ENDERITE_AXE);
                        entries.add(ModItems.ENDERITE_SHOVEL);
                        entries.add(ModItems.ENDERITE_HOE);
                        entries.add(ModItems.ENDERITE_SWORD);
                        entries.add(ModItems.ENDERITE_HELMET);
                        entries.add(ModItems.ENDERITE_CHESTPLATE);
                        entries.add(ModItems.ENDERITE_LEGGINGS);
                        entries.add(ModItems.ENDERITE_BOOTS);

                    }).build());

    public static void registerItemGroups() {
        AFunnyMod.LOGGER.info("Registering Item Groups for " + AFunnyMod.MOD_ID);
    }
}
