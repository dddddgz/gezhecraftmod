package io.github.dddddgz.materials;

import io.github.dddddgz.ModItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ObsidianArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{43, 49, 50, 43};
    private static final int[] PROTECTION_VALUES = new int[]{6, 17, 18, 9};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 9;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItem.OBSIDIAN_INGOT);
    }

    @Override
    public String getName() {
        return "obsidian";
    }

    @Override
    public float getToughness() {
        return 9.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.9F;
    }
}
