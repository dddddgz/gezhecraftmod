package io.github.dddddgz.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MarkerItem extends Item {
    public MarkerItem() {
        super(new FabricItemSettings().maxCount(1));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        NbtCompound nbt = itemStack.getNbt();
        if (user.isSneaking() || nbt == null) {
            nbt = new NbtCompound();
            double x = user.getX();
            double y = user.getY();
            double z = user.getZ();
            String dimension = world.getRegistryKey().getValue().toString();
            nbt.putDouble("x", x);
            nbt.putDouble("y", y);
            nbt.putDouble("z", z);
            nbt.putString("dimension", dimension);
            String description = "(" + x + ", " + y + ", " + z + ", " + dimension + ")";
            user.sendMessage(Text.of("[GCM] Marked position. 位置已标记。" + description));
        } else {
            double x = nbt.getDouble("x");
            double y = nbt.getDouble("y");
            double z = nbt.getDouble("z");
            String dimension = nbt.getString("dimension");
            String description = "(" + x + ", " + y + ", " + z + ", " + dimension + ")";
            if (dimension.equals(world.getRegistryKey().getValue().toString())) {
                user.teleport(x, y, z);
                user.sendMessage(Text.of("[GCM] Teleported to marked position. 传送到标记处。" + description));
            } else {
                user.sendMessage(Text.of("[GCM] You cannot teleport to a different dimension. 你不能在不同的维度之间传送。"));
            }
        }
        itemStack.setNbt(nbt);
        return super.use(world, user, hand);
    }
}
