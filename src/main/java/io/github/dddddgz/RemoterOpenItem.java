package io.github.dddddgz;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RemoterOpenItem extends Item {
    public RemoterOpenItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        BlockPos playerPos = user.getBlockPos();
        int px = playerPos.getX();
        int py = playerPos.getY();
        int pz = playerPos.getZ();
        int radius = 5;
        for (int x = px - radius; x <= px + radius; x++) {
            for (int y = py - radius; y <= py + radius; y++) {
                for (int z = pz - radius; z <= pz + radius; z++) {
                    BlockPos pos = new BlockPos(x, y, z);
                    BlockState state = world.getBlockState(pos);
                    if (state.getBlock() == GezheCraftMod.REMOTE_BLOCK) {
                        world.setBlockState(pos, state.with(BooleanProperty.of("state"), true));
                    }
                }
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
