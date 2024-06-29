package net.sillyguy.afunnymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.sillyguy.afunnymod.block.ModBlocks;
import net.sillyguy.afunnymod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ENDERITEINGOT_SMELTABLES = List.of(ModItems.RAWENDERITE,
            ModBlocks.ENDERITE_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, ENDERITEINGOT_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITEINGOT,
                1.3f, 200, "enderite_ingot");
        offerBlasting(exporter, ENDERITEINGOT_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITEINGOT,
                1.3f, 100, "enderite_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERITEINGOT, RecipeCategory.DECORATIONS,
                ModBlocks.ENDERITE_BLOCK);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ENDERITE_BLOCK, 1)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAWENDERITE)
                .criterion(hasItem(ModItems.RAWENDERITE), conditionsFromItem(ModItems.RAWENDERITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAWENDERITE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_PICKAXE, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .input('S', Items.STICK)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_AXE, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .input('S', Items.STICK)
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_SHOVEL, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .input('S', Items.STICK)
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_HOE, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .input('S', Items.STICK)
                .pattern("EE ")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDERITE_SWORD, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .input('S', Items.STICK)
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDERITE_HELMET, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .pattern("EEE")
                .pattern("E E")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDERITE_CHESTPLATE, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDERITE_LEGGINGS, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDERITE_BOOTS, 1)
                .input('E', ModItems.ENDERITEINGOT)
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ModItems.ENDERITEINGOT), conditionsFromItem(ModItems.ENDERITEINGOT))
                .offerTo(exporter);

    }
}
