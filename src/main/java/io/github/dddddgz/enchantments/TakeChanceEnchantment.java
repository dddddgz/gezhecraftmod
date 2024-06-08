package io.github.dddddgz.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class TakeChanceEnchantment extends Enchantment {
    private static final ItemStack[] itemStacks = new ItemStack[] {
            setCount(Items.OAK_LOG.getDefaultStack(), 16),       // Log 1
            setCount(Items.BIRCH_LOG.getDefaultStack(), 16),     // Log 2
            setCount(Items.SPRUCE_LOG.getDefaultStack(), 16),    // Log 3
            setCount(Items.JUNGLE_LOG.getDefaultStack(), 16),    // Log 4
            setCount(Items.ACACIA_LOG.getDefaultStack(), 16),    // Log 5
            setCount(Items.DARK_OAK_LOG.getDefaultStack(), 16),  // Log 6
            setCount(Items.STONE.getDefaultStack(), 10),         // Stone 1
            setCount(Items.COBBLESTONE.getDefaultStack(), 10),   // Stone 2
            setCount(Items.COAL.getDefaultStack(), 9),           // Ore 1
            setCount(Items.CHARCOAL.getDefaultStack(), 9),       // Ore 2
            setCount(Items.COPPER_INGOT.getDefaultStack(), 9),   // Ore 3
            setCount(Items.REDSTONE.getDefaultStack(), 8),       // Ore 4
            setCount(Items.LAPIS_LAZULI.getDefaultStack(), 8),   // Ore 5
            setCount(Items.IRON_INGOT.getDefaultStack(), 7),     // Ore 6
            setCount(Items.GOLD_INGOT.getDefaultStack(), 7),     // Ore 7
            setCount(Items.DIAMOND.getDefaultStack(), 3),        // Ore 8
            setCount(Items.EMERALD.getDefaultStack(), 2),        // Ore 9
            Items.NETHERITE_INGOT.getDefaultStack(),                   // Ore 10
            Items.GOLDEN_APPLE.getDefaultStack(),                      // Food 1
            Items.ENCHANTED_GOLDEN_APPLE.getDefaultStack(),            // Food 2
            setCount(Items.BEDROCK.getDefaultStack(), 64)        // Block 1
    };
    private static final double[] chances = new double[] {
            0.06, 0.06, 0.06, 0.06, 0.06, 0.06,                   // Logs
            0.10, 0.10,                                           // Stones
            0.07, 0.07, 0.07, 0.05, 0.04, 0.03, 0.03, 0.02, 0.02, // Ores
            0.03, 0.005,                                          // Foods
            0.005                                                 // Block
    };

    public TakeChanceEnchantment() {
        super(Rarity.COMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        World world = user.getWorld();
        double x = world.random.nextDouble();
        if (x < 1.0 / (6 - level)) {
            x = world.random.nextDouble();
            double y = 0.0;
            for (int i = 0; i < 20; i++) {
                double chance = chances[i];
                y += chance;
                if (x < y) {
                    ItemStack stack = itemStacks[i];
                    target.dropStack(stack);
                    break;
                }
            }
        } else {
            PlayerEntity player = (PlayerEntity) user;
            if (!(player.isCreative() || player.isSpectator())) {
                user.setHealth(user.getHealth() - (5 - level) * 2);
            }
        }
        super.onTargetDamaged(user, target, level);
    }

    private static ItemStack setCount(ItemStack stack, int count) {
        stack.setCount(count);
        return stack;
    }
}
