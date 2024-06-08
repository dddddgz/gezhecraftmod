package io.github.dddddgz.blocks;

import io.github.dddddgz.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class Pepper extends CropBlock {
    public static final IntProperty AGE = Properties.AGE_3;

    public Pepper(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(getAgeProperty(), 0));
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModBlock.PEPPER;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
