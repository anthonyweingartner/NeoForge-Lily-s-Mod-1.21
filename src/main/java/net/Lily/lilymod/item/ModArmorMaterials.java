package net.Lily.lilymod.item;

import net.Lily.lilymod.Reblocked;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {


    public static final Holder<ArmorMaterial> LEATHER_MASTER_ARMOR_MATERIAL = register("leather",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 1);
            }), 30, 10000, 0.0f, () -> ModItems.ARMORCORE.get());

    public static final Holder<ArmorMaterial> Chainmail_MASTER_ARMOR_MATERIAL = register("chainmail",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 6);
            }), 30, 10000, 0.0f, () -> ModItems.ARMORCORE.get());
    public static final Holder<ArmorMaterial> IRON_MASTER_ARMOR_MATERIAL = register("iron",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 13);
                attribute.put(ArmorItem.Type.HELMET, 8);
                attribute.put(ArmorItem.Type.BODY, 15);
            }), 30, 10000, 1.0f, () -> ModItems.ARMORCORE.get());
    public static final Holder<ArmorMaterial> GOLD_MASTER_ARMOR_MATERIAL = register("gold",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 60, 10000, 0.0f, () -> ModItems.ARMORCORE.get());
    public static final Holder<ArmorMaterial> DIAMOND_MASTER_ARMOR_MATERIAL = register("diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 13);
            }), 30, 10000, 0.0f, () -> ModItems.ARMORCORE.get());
    public static final Holder<ArmorMaterial> NEITHERITE_MASTER_ARMOR_MATERIAL = register("neitherite",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 13);
            }), 30, 10000, 0.2f, () -> ModItems.ARMORCORE.get());

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Reblocked.MODID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}

