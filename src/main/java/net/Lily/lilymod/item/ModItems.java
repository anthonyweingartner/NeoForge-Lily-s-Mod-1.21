package net.Lily.lilymod.item;

import net.Lily.lilymod.Reblocked;
import net.Lily.lilymod.item.custom.ModArmorItem;
import net.minecraft.world.item.ArmorItem;
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
    //Mastercraft Armor
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_LEATHER_HELMET = ITEMS.register("master_craft_leather_helmet",
            ()-> new ModArmorItem(ModArmorMaterials.LEATHER_MASTER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability((ArmorItem.Type.HELMET.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_LEATHER_CHESTPLATE = ITEMS.register("master_craft_leather_chestplate",
            ()-> new ModArmorItem(ModArmorMaterials.LEATHER_MASTER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability((ArmorItem.Type.CHESTPLATE.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_LEATHER_LEGGINGS = ITEMS.register("master_craft_leather_leggings",
            ()-> new ModArmorItem(ModArmorMaterials.LEATHER_MASTER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability((ArmorItem.Type.LEGGINGS.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_LEATHER_BOOTS = ITEMS.register("master_craft_leather_boots",
            ()-> new ModArmorItem(ModArmorMaterials.LEATHER_MASTER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability((ArmorItem.Type.BOOTS.getDurability(0)))));



    public static final DeferredItem<ArmorItem> MASTER_CRAFT_CHAINMAIL_HELMET = ITEMS.register("master_craft_chainmail_helmet",
            ()-> new ModArmorItem(ModArmorMaterials.Chainmail_MASTER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability((ArmorItem.Type.HELMET.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_CHAINMAIL_CHESTPLATE = ITEMS.register("master_craft_chainmail_chestplate",
            ()-> new ModArmorItem(ModArmorMaterials.Chainmail_MASTER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability((ArmorItem.Type.CHESTPLATE.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_CHAINMAIL_LEGGINGS = ITEMS.register("master_craft_chainmail_leggings",
            ()-> new ModArmorItem(ModArmorMaterials.Chainmail_MASTER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability((ArmorItem.Type.LEGGINGS.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_CHAINMAIL_BOOTS = ITEMS.register("master_craft_chainmail_boots",
            ()-> new ModArmorItem(ModArmorMaterials.Chainmail_MASTER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability((ArmorItem.Type.BOOTS.getDurability(0)))));

    public static final DeferredItem<ArmorItem> MASTER_CRAFT_IRON_HELMET = ITEMS.register("master_craft_iron_helmet",
            ()-> new ModArmorItem(ModArmorMaterials.IRON_MASTER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability((ArmorItem.Type.HELMET.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_IRON_CHESTPLATE = ITEMS.register("master_craft_iron_chestplate",
            ()-> new ModArmorItem(ModArmorMaterials.IRON_MASTER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability((ArmorItem.Type.CHESTPLATE.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_IRON_LEGGINGS = ITEMS.register("master_craft_iron_leggings",
            ()-> new ModArmorItem(ModArmorMaterials.IRON_MASTER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability((ArmorItem.Type.LEGGINGS.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_IRON_BOOTS = ITEMS.register("master_craft_iron_boots",
            ()-> new ModArmorItem(ModArmorMaterials.IRON_MASTER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability((ArmorItem.Type.BOOTS.getDurability(0)))));

    public static final DeferredItem<ArmorItem> MASTER_CRAFT_GOLD_HELMET = ITEMS.register("master_craft_gold_helmet",
            ()-> new ModArmorItem(ModArmorMaterials.GOLD_MASTER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability((ArmorItem.Type.HELMET.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_GOLD_CHESTPLATE = ITEMS.register("master_craft_gold_chestplate",
            ()-> new ModArmorItem(ModArmorMaterials.GOLD_MASTER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability((ArmorItem.Type.CHESTPLATE.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_GOLD_LEGGINGS = ITEMS.register("master_craft_gold_leggings",
            ()-> new ModArmorItem(ModArmorMaterials.GOLD_MASTER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability((ArmorItem.Type.LEGGINGS.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_GOLD_BOOTS = ITEMS.register("master_craft_gold_boots",
            ()-> new ModArmorItem(ModArmorMaterials.GOLD_MASTER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability((ArmorItem.Type.BOOTS.getDurability(0)))));

    public static final DeferredItem<ArmorItem> MASTER_CRAFT_DIAMOND_HELMET = ITEMS.register("master_craft_diamond_helmet",
            ()-> new ModArmorItem(ModArmorMaterials.DIAMOND_MASTER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability((ArmorItem.Type.HELMET.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_DIAMOND_CHESTPLATE = ITEMS.register("master_craft_diamond_chestplate",
            ()-> new ModArmorItem(ModArmorMaterials.DIAMOND_MASTER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability((ArmorItem.Type.CHESTPLATE.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_DIAMOND_LEGGINGS = ITEMS.register("master_craft_diamond_leggings",
            ()-> new ModArmorItem(ModArmorMaterials.DIAMOND_MASTER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability((ArmorItem.Type.LEGGINGS.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_DIAMOND_BOOTS = ITEMS.register("master_craft_diamond_boots",
            ()-> new ModArmorItem(ModArmorMaterials.DIAMOND_MASTER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability((ArmorItem.Type.BOOTS.getDurability(0)))));

    public static final DeferredItem<ArmorItem> MASTER_CRAFT_NEITHERITE_HELMET = ITEMS.register("master_craft_neitherite_helmet",
            ()-> new ModArmorItem(ModArmorMaterials.NEITHERITE_MASTER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability((ArmorItem.Type.HELMET.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_NEITHERITE_CHESTPLATE = ITEMS.register("master_craft_neitherite_chestplate",
            ()-> new ModArmorItem(ModArmorMaterials.NEITHERITE_MASTER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability((ArmorItem.Type.CHESTPLATE.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_NEITHERITE_LEGGINGS = ITEMS.register("master_craft_neitherite_leggings",
            ()-> new ModArmorItem(ModArmorMaterials.NEITHERITE_MASTER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability((ArmorItem.Type.LEGGINGS.getDurability(0)))));
    public static final DeferredItem<ArmorItem> MASTER_CRAFT_NEITHERITE_BOOTS = ITEMS.register("master_craft_neitherite_boots",
            ()-> new ModArmorItem(ModArmorMaterials.NEITHERITE_MASTER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability((ArmorItem.Type.BOOTS.getDurability(0)))));







    public static  void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
