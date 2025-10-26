package net.Lily.lilymod.item;

import net.Lily.lilymod.Reblocked;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reblocked.MODID);

    public static final Supplier<CreativeModeTab> LILY_ITEMS_TAB = CREATIVE_MODE_TAB.register("lily_items_tab",
            ()->CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.LILYEGG.get()))
                    .title(Component.translatable("creativetab.reblockedbylily.lily_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LILYEGG);
                        output.accept(ModItems.ARMORCORE);
                        output.accept(ModItems.POTIONOFBLINDNESS);
                        output.accept(ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
