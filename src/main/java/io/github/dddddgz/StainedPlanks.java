package io.github.dddddgz;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class StainedPlanks extends Block {
    public static final Block[] YUANBAN_PLANKS = new Block[]{
            Blocks.OAK_PLANKS,
            Blocks.SPRUCE_PLANKS,
            Blocks.BIRCH_PLANKS,
            Blocks.JUNGLE_PLANKS,
            Blocks.ACACIA_PLANKS,
            Blocks.DARK_OAK_PLANKS,
            Blocks.WARPED_PLANKS,
            Blocks.CRIMSON_PLANKS
    };
    public static final Item[] DYES = new Item[] {
            Items.WHITE_DYE,
            Items.ORANGE_DYE,
            Items.MAGENTA_DYE,
            Items.LIGHT_BLUE_DYE,
            Items.YELLOW_DYE,
            Items.LIME_DYE,
            Items.PINK_DYE,
            Items.GRAY_DYE,
            Items.LIGHT_GRAY_DYE,
            Items.CYAN_DYE,
            Items.PURPLE_DYE,
            Items.BLUE_DYE,
            Items.BROWN_DYE,
            Items.GREEN_DYE,
            Items.RED_DYE,
            Items.BLACK_DYE
    };
    public static final Block[] STAINED_PLANKS = new Block[] {
            GezheCraftMod.WHITE_STAINED_PLANKS,
            GezheCraftMod.ORANGE_STAINED_PLANKS,
            GezheCraftMod.MAGENTA_STAINED_PLANKS,
            GezheCraftMod.LIGHT_BLUE_STAINED_PLANKS,
            GezheCraftMod.YELLOW_STAINED_PLANKS,
            GezheCraftMod.LIME_STAINED_PLANKS,
            GezheCraftMod.PINK_STAINED_PLANKS,
            GezheCraftMod.GRAY_STAINED_PLANKS,
            GezheCraftMod.LIGHT_GRAY_STAINED_PLANKS,
            GezheCraftMod.CYAN_STAINED_PLANKS,
            GezheCraftMod.PURPLE_STAINED_PLANKS,
            GezheCraftMod.BLUE_STAINED_PLANKS,
            GezheCraftMod.BROWN_STAINED_PLANKS,
            GezheCraftMod.GREEN_STAINED_PLANKS,
            GezheCraftMod.RED_STAINED_PLANKS,
            GezheCraftMod.BLACK_STAINED_PLANKS
    };

    public StainedPlanks() {
        super(Block.Settings.copy(Blocks.OAK_PLANKS));
    }
}
