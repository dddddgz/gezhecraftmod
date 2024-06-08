package io.github.dddddgz.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class GoldenBucketItem extends Item {
    public GoldenBucketItem() {
        super(new FabricItemSettings());
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.getNbt() != null && stack.getNbt().contains("block");
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        Block block = world.getBlockState(blockPos).getBlock();
        ItemStack stack = context.getStack();
        NbtCompound nbt = stack.getNbt();
        if (nbt == null) {
            nbt = new NbtCompound();
        }
        if (nbt.contains("block")) {
            BlockState target = Registry.BLOCK.get(Identifier.tryParse(nbt.getString("block"))).getDefaultState();
            world.setBlockState(blockPos.offset(context.getSide()), target);
            nbt.remove("block");
        } else {
            world.removeBlock(blockPos, false);
            nbt.putString("block", Registry.BLOCK.getId(block).toString());
        }
        stack.setNbt(nbt);
        return super.useOnBlock(context);
    }
}
