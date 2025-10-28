package net.Lily.lilymod.datagen;


import net.Lily.lilymod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;


import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider (HolderLookup.Provider registries){
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
    }
@Override
    protected void generate(){
    add(ModBlocks.GLISTERING_MELON_BLOCK.get(), block -> createMultipleItemDrops(ModBlocks.GLISTERING_MELON_BLOCK, Items.GLISTERING_MELON_SLICE, 9));
}
    protected LootTable.Builder createMultipleItemDrops(DeferredBlock<Block> block, Item item, int amount) {
        return LootTable.lootTable()
                .withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(item)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(amount)))
                                )
                );
    }

@Override
    protected Iterable<Block> getKnownBlocks() {
    return ModBlocks.BLOCKS.getEntries()
            .stream()
            .map(Holder::value)
            .toList();
}
}
