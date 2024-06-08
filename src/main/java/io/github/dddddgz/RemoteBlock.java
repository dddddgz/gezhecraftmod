package io.github.dddddgz;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RemoteBlock extends Block {
    private static final BooleanProperty STATE = BooleanProperty.of("state");

    public RemoteBlock() {
        super(Block.Settings.of(Material.STONE).strength(4.0F).luminance((state) -> (Boolean)state.get(STATE) ? 15 : 0));
        setDefaultState(getStateManager().getDefaultState().with(STATE, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return state.get(STATE) ? 15 : 0;
    }
}
