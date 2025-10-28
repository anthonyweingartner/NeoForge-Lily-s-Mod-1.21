package net.Lily.lilymod.datagen;

import net.Lily.lilymod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmokingRecipe;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLISTERING_MELON_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.GLISTERING_MELON_SLICE)
                .unlockedBy("has_glistering_melon_slices", has(Items.GLISTERING_MELON_SLICE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GUNPOWDER, 3)
                        .requires(Items.EGG).requires(Items.DRIED_KELP).requires(Items.COAL)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .save(recipeOutput, "egg_to_gunpowder_crafting");

        // Rotten Flesh → Leather (Smoking)
        SimpleCookingRecipeBuilder.smoking(
                        Ingredient.of(Items.ROTTEN_FLESH),         // input
                        RecipeCategory.MISC,
                        Items.LEATHER,                             // output
                        0.35f,                                     // XP
                        100                                        // Cooking time
                )
                .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
                .save(recipeOutput, "rotten_flesh_to_leather_smoking");
    }

}
