package io.github.dddddgz.enchantments;

import io.github.dddddgz.GezheCraftMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;

public class CompositionWritingEnchantment extends Enchantment {
    public CompositionWritingEnchantment() {
        super(Rarity.COMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity targetLE) {
            targetLE.setStackInHand(targetLE.getActiveHand(), Items.PAPER.getDefaultStack());
            targetLE.addStatusEffect(new StatusEffectInstance(GezheCraftMod.COMPOSITION_WRITING_SE, 3600, level - 1));
        }
        super.onTargetDamaged(user, target, level);
    }
}
