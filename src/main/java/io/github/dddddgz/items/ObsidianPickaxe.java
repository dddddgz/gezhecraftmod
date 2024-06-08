package io.github.dddddgz.items;

import io.github.dddddgz.ModMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ObsidianPickaxe extends PickaxeItem {
    public ObsidianPickaxe() {
        super(ModMaterial.OBSIDIAN_TOOL_MATERIAL, 20, 10, new FabricItemSettings());
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        assert player != null;
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        world.removeBlock(blockPos, false);
        if (!(player.isCreative() || player.isSpectator())) {
            ItemScatterer.spawn(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), world.getBlockState(blockPos).getBlock().asItem().getDefaultStack());
            context.getStack().decrement(1);
        }
        return super.useOnBlock(context);
    }


}
