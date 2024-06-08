package io.github.dddddgz;

import io.github.dddddgz.blocks.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {
    public static Block RB_WHITE_LINE, RB_WHITE_LINE_D, RB_YELLOW_LINE, RB_YELLOW_LINE_D, RB_YELLOW_DOUBLE_LINE, RB_YELLOW_DOUBLE_LINE_D, PEPPER, OBSIDIAN_FLUID_BLOCK;

    public static void register() {
        RB_WHITE_LINE = registerBlock("road_block_white_line", new RoadBlockWithFacing());
        RB_WHITE_LINE_D = registerBlock("road_block_white_line_diagonally", new RoadBlockWithFacing());
        RB_YELLOW_LINE = registerBlock("road_block_yellow_line", new RoadBlockWithFacing());
        RB_YELLOW_LINE_D = registerBlock("road_block_yellow_line_diagonally", new RoadBlockWithFacing());
        RB_YELLOW_DOUBLE_LINE = registerBlock("road_block_yellow_double_line", new RoadBlockWithFacing());
        RB_YELLOW_DOUBLE_LINE_D = registerBlock("road_block_yellow_double_line_diagonally", new RoadBlockWithFacing());
        PEPPER = registerBlockNoItem("pepper", new Pepper(AbstractBlock.Settings.copy(Blocks.WHEAT).breakInstantly().nonOpaque()));
        OBSIDIAN_FLUID_BLOCK = registerBlockNoItem("obsidian", new FluidBlock(ModFluid.STILL_OBSIDIAN_FLUID, FabricBlockSettings.copyOf(Blocks.WATER)));
    }

    public static Block registerBlock(String identifier, Block block) {
        registerBlockNoItem(identifier, block);
        Registry.register(Registry.ITEM, new Identifier("gcm", identifier), new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBlockNoItem(String identifier, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("gcm", identifier), block);
    }
}
