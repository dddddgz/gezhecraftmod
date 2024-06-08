package io.github.dddddgz;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class SpicyStatusEffect extends StatusEffect {
    public SpicyStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xaa66666);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 20 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.setHealth(entity.getHealth() - entity.getWorld().random.nextFloat());
        super.applyUpdateEffect(entity, amplifier);
    }
}
