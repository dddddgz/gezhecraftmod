package io.github.dddddgz;

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
        PlayerEntity player = (PlayerEntity) user;
        if (player.isCreative() || player.isSpectator()) {
            target.kill();
        } else {
            if (user.getWorld().random.nextDouble() < 0.5) {
                target.kill();
            } else {
                user.kill();
            }
        }
        super.onTargetDamaged(user, target, level);
    }
}
