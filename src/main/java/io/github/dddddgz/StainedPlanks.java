package io.github.dddddgz;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StainedPlanks extends Block {
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

//    @Override
//    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
//        ItemStack itemStack = player.getStackInHand(hand);
//        Item item = itemStack.getItem();
//        int index = -1;
//        for (int i = 0; i < DYES.length; i++) {
//            if (item == DYES[i]) {
//                index = i;
//                break;
//            }
//        }
//        if (index != -1) {
//            world.setBlockState(pos, STAINED_PLANKS[index].getDefaultState());
//            return ActionResult.SUCCESS;
//        } else {
//            return ActionResult.PASS;
//        }
//    }
}
