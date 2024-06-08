package io.github.dddddgz.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class RoadBlockWithFacing extends Block {
    private static final BooleanProperty FACING = BooleanProperty.of("facing");

    public RoadBlockWithFacing() {
        super(FabricBlockSettings.copy(Blocks.STONE));
        setDefaultState(getStateManager().getDefaultState().with(FACING, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
