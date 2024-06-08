package io.github.dddddgz.items;

import io.github.dddddgz.ModMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(ModMaterial.OBSIDIAN_TOOL_MATERIAL, 50, 25, new FabricItemSettings());
    }
}
