package net.sillyguy.afunnymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sillyguy.afunnymod.AFunnyMod;

public class ModItems {
    public static final Item ENDERITEINGOT = registerItem("enderite_ingot", new Item(new FabricItemSettings()));
    public static final Item RAWENDERITE = registerItem("raw_enderite", new Item(new FabricItemSettings()));

    public static final Item GOLDEN_STEAK = registerItem("golden_steak", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_STEAK)));

    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDERITE, 2, 2f, new FabricItemSettings()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new AxeItem(ModToolMaterial.ENDERITE, 6, 1f, new FabricItemSettings()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterial.ENDERITE, 0, 2f, new FabricItemSettings()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterial.ENDERITE, 0, 2f, new FabricItemSettings()));
    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new SwordItem(ModToolMaterial.ENDERITE, 5, 3f, new FabricItemSettings()));

    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDERITEINGOT);
        entries.add(RAWENDERITE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AFunnyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AFunnyMod.LOGGER.info("Registering Mod Items for " + AFunnyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
