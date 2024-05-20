package io.github.dddddgz;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ObsidianPickaxe extends PickaxeItem {

    public ObsidianPickaxe() {
        super(ObsidianToolMaterial.INSTANCE, 20, 10, new Item.Settings());
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        assert player != null;
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        Item item = block.asItem();
        world.removeBlock(blockPos, false);
        if (!(player.isCreative() || player.isSpectator())) {
            ItemEntity itemEntity = new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), item.getDefaultStack());
            world.spawnEntity(itemEntity);
            context.getStack().decrement(1);
        }
        return super.useOnBlock(context);
    }
}
