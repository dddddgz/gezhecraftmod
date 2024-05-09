package io.github.dddddgz;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class RoadBlockYellowLineDiagonally extends Block {
    private static final BooleanProperty FACING = BooleanProperty.of("facing");

    public RoadBlockYellowLineDiagonally(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(FACING, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
