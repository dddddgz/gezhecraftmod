package io.github.dddddgz.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class FatalEnchantment extends Enchantment {
    public FatalEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (user.getWorld().random.nextDouble() < 0.5) {
            if (user instanceof PlayerEntity player) {
                if (!(player.isSpectator() || player.isCreative())) {
                    user.kill();
                }
            }
        } else {
            target.kill();
        }
        user.getStackInHand(user.getActiveHand()).decrement(1);
        super.onTargetDamaged(user, target, level);
    }
}