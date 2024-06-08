package io.github.dddddgz;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class CompositionWritingStatusEffect extends StatusEffect {
    public CompositionWritingStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xd6fff3);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 10 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.setHealth(entity.getHealth() - (amplifier + 1) * 0.5f);
        super.applyUpdateEffect(entity, amplifier);
    }
}
