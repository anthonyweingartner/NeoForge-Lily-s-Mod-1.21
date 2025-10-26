package net.Lily.lilymod.item;

import net.Lily.lilymod.Reblocked;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Reblocked.MODID);

    public static final DeferredItem<Item> ARMORCORE = ITEMS.register("armorcore",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POTIONOFBLINDNESS = ITEMS.register("potionofblindness",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LILYEGG = ITEMS.register("lilyegg",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEATHER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("leather_upgrade_smithing_template",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)));

    public static  void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
