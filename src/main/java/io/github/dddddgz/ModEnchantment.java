package io.github.dddddgz;

import io.github.dddddgz.enchantments.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantment {
    public static Enchantment HIGH_JUMP, FATAL, DIE_TOGETHER, TAKE_CHANCE, COMPOSITION_WRITING;

    public static void register() {
        HIGH_JUMP = registerEnchantment("gcm:high_jump", new HighJumpEnchantment());
        FATAL = registerEnchantment("gcm:fatal", new FatalEnchantment());
        DIE_TOGETHER = registerEnchantment("gcm:die_together", new DieTogetherEnchantment());
        TAKE_CHANCE = registerEnchantment("gcm:take_chance", new TakeChanceEnchantment());
        COMPOSITION_WRITING = registerEnchantment("gcm:composition_writing", new CompositionWritingEnchantment());
    }

    public static Enchantment registerEnchantment(String identifier, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(identifier), enchantment);
    }
}
