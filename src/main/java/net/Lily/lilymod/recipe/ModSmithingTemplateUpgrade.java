package net.Lily.lilymod.recipe;

import net.minecraft.resources.ResourceLocation;
import net.Lily.lilymod.item.ModItems;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmithingTransformRecipe;

public class ModSmithingTemplateUpgrade extends SmithingTransformRecipe {

    public ModSmithingTemplateUpgrade(Ingredient template, Ingredient base, Ingredient addition, ItemStack result) {
        super(template, base, addition, result);
    }


    public ItemStack assemble(CraftingContainer inv) {
        ItemStack baseStack = inv.getItem(1); // base slot
        ItemStack additionStack = inv.getItem(2);
        /*
        // check armor type
        if (baseStack.getItem() == Items.LEATHER_HELMET) return new ItemStack(ModItems.MASTER_LEATHER_HELMET);
        if (baseStack.getItem() == Items.LEATHER_CHESTPLATE) return new ItemStack(ModItems.MASTER_LEATHER_CHESTPLATE);
        if (baseStack.getItem() == Items.LEATHER_LEGGINGS) return new ItemStack(ModItems.MASTER_LEATHER_LEGGINGS);
        if (baseStack.getItem() == Items.LEATHER_BOOTS) return new ItemStack(ModItems.MASTER_LEATHER_BOOTS);
        */
        // fallback
        return ItemStack.EMPTY;



    }
}
