package net.Lily.lilymod.block;


import net.Lily.lilymod.Reblocked;
import net.Lily.lilymod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS  =
            DeferredRegister.createBlocks(Reblocked.MODID);

    public static final DeferredBlock<Block> GLISTERING_MELON_BLOCK = registerBlock(
            "glistering_melon_block",
            () -> new Block(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MELON)
                            .lightLevel(state -> 15)
            )
    );

    public static <T extends  Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static  void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }


}
