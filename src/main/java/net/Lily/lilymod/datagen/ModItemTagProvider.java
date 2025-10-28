package net.Lily.lilymod.datagen;


import net.Lily.lilymod.Reblocked;
import net.Lily.lilymod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Reblocked.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MASTER_CRAFT_LEATHER_BOOTS.get())
                .add(ModItems.MASTER_CRAFT_LEATHER_LEGGINGS.get())
                .add(ModItems.MASTER_CRAFT_LEATHER_CHESTPLATE.get())
                .add(ModItems.MASTER_CRAFT_LEATHER_HELMET.get())

                .add(ModItems.MASTER_CRAFT_CHAINMAIL_BOOTS.get())
                .add(ModItems.MASTER_CRAFT_CHAINMAIL_LEGGINGS.get())
                .add(ModItems.MASTER_CRAFT_CHAINMAIL_CHESTPLATE.get())
                .add(ModItems.MASTER_CRAFT_CHAINMAIL_HELMET.get())

                .add(ModItems.MASTER_CRAFT_IRON_BOOTS.get())
                .add(ModItems.MASTER_CRAFT_IRON_LEGGINGS.get())
                .add(ModItems.MASTER_CRAFT_IRON_CHESTPLATE.get())
                .add(ModItems.MASTER_CRAFT_IRON_HELMET.get())

                .add(ModItems.MASTER_CRAFT_GOLD_BOOTS.get())
                .add(ModItems.MASTER_CRAFT_GOLD_LEGGINGS.get())
                .add(ModItems.MASTER_CRAFT_GOLD_CHESTPLATE.get())
                .add(ModItems.MASTER_CRAFT_GOLD_HELMET.get())

                .add(ModItems.MASTER_CRAFT_DIAMOND_BOOTS.get())
                .add(ModItems.MASTER_CRAFT_DIAMOND_LEGGINGS.get())
                .add(ModItems.MASTER_CRAFT_DIAMOND_CHESTPLATE.get())
                .add(ModItems.MASTER_CRAFT_DIAMOND_HELMET.get())

                .add(ModItems.MASTER_CRAFT_NEITHERITE_BOOTS.get())
                .add(ModItems.MASTER_CRAFT_NEITHERITE_LEGGINGS.get())
                .add(ModItems.MASTER_CRAFT_NEITHERITE_CHESTPLATE.get())
                .add(ModItems.MASTER_CRAFT_NEITHERITE_HELMET.get());







    }
}
