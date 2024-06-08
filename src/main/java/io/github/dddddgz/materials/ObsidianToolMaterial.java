package io.github.dddddgz.materials;

import io.github.dddddgz.ModItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 3276;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 50.0F;
    }

    @Override
    public float getAttackDamage() {
        return -1;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItem.OBSIDIAN_INGOT);
    }
}
