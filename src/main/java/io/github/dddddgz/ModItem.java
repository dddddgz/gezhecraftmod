package io.github.dddddgz;

import io.github.dddddgz.items.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItem {
    public static Item GOLDEN_BUCKET, HMCL, PCL, OBSIDIAN_INGOT, OBSIDIAN_PICKAXE, OBSIDIAN_SWORD, OBSIDIAN_HELMET, OBSIDIAN_CHESTPLATE, OBSIDIAN_LEGGINGS, OBSIDIAN_BOOTS, REMOTER_1, REMOTER_0, MARKER, PEPPER, OBSIDIAN_BUCKET;

    public static void register() {
        GOLDEN_BUCKET = registerItem("golden_bucket", new GoldenBucketItem());
        HMCL = registerItem("hmcl", new HMCLItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).snack().saturationModifier(6f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 9), 1.0f).build())));
        PCL = registerItem("pcl", new PCLItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).snack().saturationModifier(6f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 9), 1.0f).build())));
        OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).snack().saturationModifier(3f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 9600, 0), 0.75f).build())));
        OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new ObsidianPickaxe());
        OBSIDIAN_SWORD = registerItem("obsidian_sword", new ObsidianSword());
        OBSIDIAN_HELMET = registerItem("obsidian_helmet", new ArmorItem(ModMaterial.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings()));
        OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate", new ArmorItem(ModMaterial.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings()));
        OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings", new ArmorItem(ModMaterial.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings()));
        OBSIDIAN_BOOTS = registerItem("obsidian_boots", new ArmorItem(ModMaterial.OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings()));
        REMOTER_1 = registerItem("remoter_open", new RemoterItem(true));
        REMOTER_0 = registerItem("remoter_close", new RemoterItem(false));
        MARKER = registerItem("marker", new MarkerItem());
        PEPPER = registerItem("pepper", new AliasedBlockItem(ModBlock.PEPPER, new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(5f).snack().alwaysEdible().statusEffect(new StatusEffectInstance(GezheCraftMod.SPICY_STATUS_EFFECT, 1000), 0.9f).build())));
        OBSIDIAN_BUCKET = registerItem("obsidian_bucket", new BucketItem(ModFluid.STILL_OBSIDIAN_FLUID, new FabricItemSettings().maxCount(8)));
    }

    public static Item registerItem(String identifier, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("gcm", identifier), item);
    }
}
