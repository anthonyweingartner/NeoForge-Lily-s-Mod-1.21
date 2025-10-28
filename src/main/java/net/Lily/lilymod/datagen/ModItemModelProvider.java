package net.Lily.lilymod.datagen;

import net.Lily.lilymod.Reblocked;
import net.Lily.lilymod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static{
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND,0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);

    }
    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = Reblocked.MODID; // Change this to your mod id

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Reblocked.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.LILYEGG.get());
        basicItem(ModItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get());

        basicItem(ModItems.POTIONOFBLINDNESS.get());
        basicItem(ModItems.ARMORCORE.get());
        trimmedArmorItem(ModItems.MASTER_CRAFT_LEATHER_HELMET);
        trimmedArmorItem(ModItems.MASTER_CRAFT_LEATHER_CHESTPLATE);
        trimmedArmorItem(ModItems.MASTER_CRAFT_LEATHER_LEGGINGS);
        trimmedArmorItem(ModItems.MASTER_CRAFT_LEATHER_BOOTS);

        trimmedArmorItem(ModItems.MASTER_CRAFT_CHAINMAIL_HELMET);
        trimmedArmorItem(ModItems.MASTER_CRAFT_CHAINMAIL_CHESTPLATE);
        trimmedArmorItem(ModItems.MASTER_CRAFT_CHAINMAIL_LEGGINGS);
        trimmedArmorItem(ModItems.MASTER_CRAFT_CHAINMAIL_BOOTS);

        trimmedArmorItem(ModItems.MASTER_CRAFT_IRON_HELMET);
        trimmedArmorItem(ModItems.MASTER_CRAFT_IRON_CHESTPLATE);
        trimmedArmorItem(ModItems.MASTER_CRAFT_IRON_LEGGINGS);
        trimmedArmorItem(ModItems.MASTER_CRAFT_IRON_BOOTS);

        trimmedArmorItem(ModItems.MASTER_CRAFT_GOLD_HELMET);
        trimmedArmorItem(ModItems.MASTER_CRAFT_GOLD_CHESTPLATE);
        trimmedArmorItem(ModItems.MASTER_CRAFT_GOLD_LEGGINGS);
        trimmedArmorItem(ModItems.MASTER_CRAFT_GOLD_BOOTS);

        trimmedArmorItem(ModItems.MASTER_CRAFT_DIAMOND_HELMET);
        trimmedArmorItem(ModItems.MASTER_CRAFT_DIAMOND_CHESTPLATE);
        trimmedArmorItem(ModItems.MASTER_CRAFT_DIAMOND_LEGGINGS);
        trimmedArmorItem(ModItems.MASTER_CRAFT_DIAMOND_BOOTS);


        trimmedArmorItem(ModItems.MASTER_CRAFT_NEITHERITE_HELMET);
        trimmedArmorItem(ModItems.MASTER_CRAFT_NEITHERITE_CHESTPLATE);
        trimmedArmorItem(ModItems.MASTER_CRAFT_NEITHERITE_LEGGINGS);
        trimmedArmorItem(ModItems.MASTER_CRAFT_NEITHERITE_BOOTS);




    }
}