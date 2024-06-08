package io.github.dddddgz;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GezheCraftMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("gcm");

	public static final Item ICON = new Item(new FabricItemSettings());
	public static final Block REMOTE_BLOCK = new RemoteBlock();
	public static final Block WHITE_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block ORANGE_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block MAGENTA_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block LIGHT_BLUE_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block YELLOW_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block LIME_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block PINK_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block GRAY_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block LIGHT_GRAY_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block CYAN_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block PURPLE_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block BLUE_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block BROWN_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block GREEN_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block RED_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block BLACK_LIGHT = new RedstoneLampBlock(Block.Settings.copy(Blocks.REDSTONE_LAMP));
	public static final Block WHITE_STAINED_PLANKS = new StainedPlanks();
	public static final Block ORANGE_STAINED_PLANKS = new StainedPlanks();
	public static final Block MAGENTA_STAINED_PLANKS = new StainedPlanks();
	public static final Block LIGHT_BLUE_STAINED_PLANKS = new StainedPlanks();
	public static final Block YELLOW_STAINED_PLANKS = new StainedPlanks();
	public static final Block LIME_STAINED_PLANKS = new StainedPlanks();
	public static final Block PINK_STAINED_PLANKS = new StainedPlanks();
	public static final Block GRAY_STAINED_PLANKS = new StainedPlanks();
	public static final Block LIGHT_GRAY_STAINED_PLANKS = new StainedPlanks();
	public static final Block CYAN_STAINED_PLANKS = new StainedPlanks();
	public static final Block PURPLE_STAINED_PLANKS = new StainedPlanks();
	public static final Block BLUE_STAINED_PLANKS = new StainedPlanks();
	public static final Block BROWN_STAINED_PLANKS = new StainedPlanks();
	public static final Block GREEN_STAINED_PLANKS = new StainedPlanks();
	public static final Block RED_STAINED_PLANKS = new StainedPlanks();
	public static final Block BLACK_STAINED_PLANKS = new StainedPlanks();
	public static final Block ROAD_BLOCK = new Block(Block.Settings.copy(Blocks.STONE));
	public static final StatusEffect COMPOSITION_WRITING_SE = new CompositionWritingStatusEffect();
	public static final StatusEffect SPICY_STATUS_EFFECT = new SpicyStatusEffect();
	public static final Potion COMPOSITION_WRITING_P = new Potion(new StatusEffectInstance(COMPOSITION_WRITING_SE, 3600));

	public static final ItemGroup GCM_GROUP = FabricItemGroupBuilder.create(
					new Identifier("gcm", "group"))
			.icon(() -> new ItemStack(ICON))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItem.OBSIDIAN_INGOT));
				stacks.add(new ItemStack(ModItem.OBSIDIAN_PICKAXE));
				stacks.add(new ItemStack(ModItem.OBSIDIAN_SWORD));
				stacks.add(new ItemStack(ModItem.REMOTER_1));
				stacks.add(new ItemStack(ModItem.REMOTER_0));
				stacks.add(new ItemStack(ModItem.OBSIDIAN_HELMET));
				stacks.add(new ItemStack(ModItem.OBSIDIAN_CHESTPLATE));
				stacks.add(new ItemStack(ModItem.OBSIDIAN_LEGGINGS));
				stacks.add(new ItemStack(ModItem.OBSIDIAN_BOOTS));
				stacks.add(new ItemStack(ModItem.HMCL));
				stacks.add(new ItemStack(ModItem.PCL));
				stacks.add(new ItemStack(ModItem.GOLDEN_BUCKET));
				stacks.add(new ItemStack(ModItem.OBSIDIAN_BUCKET));
				stacks.add(new ItemStack(ModItem.MARKER));
				stacks.add(new ItemStack(ModItem.PEPPER));
				stacks.add(new ItemStack(REMOTE_BLOCK));
				stacks.add(new ItemStack(WHITE_LIGHT));
				stacks.add(new ItemStack(ORANGE_LIGHT));
				stacks.add(new ItemStack(MAGENTA_LIGHT));
				stacks.add(new ItemStack(LIGHT_BLUE_LIGHT));
				stacks.add(new ItemStack(YELLOW_LIGHT));
				stacks.add(new ItemStack(LIME_LIGHT));
				stacks.add(new ItemStack(PINK_LIGHT));
				stacks.add(new ItemStack(GRAY_LIGHT));
				stacks.add(new ItemStack(LIGHT_GRAY_LIGHT));
				stacks.add(new ItemStack(CYAN_LIGHT));
				stacks.add(new ItemStack(PURPLE_LIGHT));
				stacks.add(new ItemStack(BLUE_LIGHT));
				stacks.add(new ItemStack(BROWN_LIGHT));
				stacks.add(new ItemStack(GREEN_LIGHT));
				stacks.add(new ItemStack(RED_LIGHT));
				stacks.add(new ItemStack(BLACK_LIGHT));
				stacks.add(new ItemStack(WHITE_STAINED_PLANKS));
				stacks.add(new ItemStack(ORANGE_STAINED_PLANKS));
				stacks.add(new ItemStack(MAGENTA_STAINED_PLANKS));
				stacks.add(new ItemStack(LIGHT_BLUE_STAINED_PLANKS));
				stacks.add(new ItemStack(YELLOW_STAINED_PLANKS));
				stacks.add(new ItemStack(LIME_STAINED_PLANKS));
				stacks.add(new ItemStack(PINK_STAINED_PLANKS));
				stacks.add(new ItemStack(GRAY_STAINED_PLANKS));
				stacks.add(new ItemStack(LIGHT_GRAY_STAINED_PLANKS));
				stacks.add(new ItemStack(CYAN_STAINED_PLANKS));
				stacks.add(new ItemStack(PURPLE_STAINED_PLANKS));
				stacks.add(new ItemStack(BLUE_STAINED_PLANKS));
				stacks.add(new ItemStack(BROWN_STAINED_PLANKS));
				stacks.add(new ItemStack(GREEN_STAINED_PLANKS));
				stacks.add(new ItemStack(RED_STAINED_PLANKS));
				stacks.add(new ItemStack(BLACK_STAINED_PLANKS));
				stacks.add(new ItemStack(ROAD_BLOCK));
				stacks.add(new ItemStack(ModBlock.RB_WHITE_LINE));
				stacks.add(new ItemStack(ModBlock.RB_WHITE_LINE_D));
				stacks.add(new ItemStack(ModBlock.RB_YELLOW_LINE));
				stacks.add(new ItemStack(ModBlock.RB_YELLOW_LINE_D));
				stacks.add(new ItemStack(ModBlock.RB_YELLOW_DOUBLE_LINE));
				stacks.add(new ItemStack(ModBlock.RB_YELLOW_DOUBLE_LINE_D));
			}).build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModBlock.register();
		ModEnchantment.register();
		ModItem.register();
		Registry.register(Registry.ITEM, new Identifier("gcm", "icon"), ICON);
		Registry.register(Registry.ITEM, new Identifier("gcm", "remote_block"), new BlockItem(REMOTE_BLOCK, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "white_light"), new BlockItem(WHITE_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "orange_light"), new BlockItem(ORANGE_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "magenta_light"), new BlockItem(MAGENTA_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "light_blue_light"), new BlockItem(LIGHT_BLUE_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "yellow_light"), new BlockItem(YELLOW_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "lime_light"), new BlockItem(LIME_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "pink_light"), new BlockItem(PINK_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "gray_light"), new BlockItem(GRAY_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "light_gray_light"), new BlockItem(LIGHT_GRAY_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "cyan_light"), new BlockItem(CYAN_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "purple_light"), new BlockItem(PURPLE_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "blue_light"), new BlockItem(BLUE_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "brown_light"), new BlockItem(BROWN_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "green_light"), new BlockItem(GREEN_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "red_light"), new BlockItem(RED_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "black_light"), new BlockItem(BLACK_LIGHT, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "white_stained_planks"), new BlockItem(WHITE_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "orange_stained_planks"), new BlockItem(ORANGE_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "magenta_stained_planks"), new BlockItem(MAGENTA_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "light_blue_stained_planks"), new BlockItem(LIGHT_BLUE_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "yellow_stained_planks"), new BlockItem(YELLOW_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "lime_stained_planks"), new BlockItem(LIME_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "pink_stained_planks"), new BlockItem(PINK_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "gray_stained_planks"), new BlockItem(GRAY_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "light_gray_stained_planks"), new BlockItem(LIGHT_GRAY_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "cyan_stained_planks"), new BlockItem(CYAN_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "purple_stained_planks"), new BlockItem(PURPLE_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "blue_stained_planks"), new BlockItem(BLUE_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "brown_stained_planks"), new BlockItem(BROWN_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "green_stained_planks"), new BlockItem(GREEN_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "red_stained_planks"), new BlockItem(RED_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "black_stained_planks"), new BlockItem(BLACK_STAINED_PLANKS, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "road_block"), new BlockItem(ROAD_BLOCK, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("gcm", "remote_block"), REMOTE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "white_light"), WHITE_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "orange_light"), ORANGE_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "magenta_light"), MAGENTA_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "light_blue_light"), LIGHT_BLUE_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "yellow_light"), YELLOW_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "lime_light"), LIME_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "pink_light"), PINK_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "gray_light"), GRAY_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "light_gray_light"), LIGHT_GRAY_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "cyan_light"), CYAN_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "purple_light"), PURPLE_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "blue_light"), BLUE_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "brown_light"), BROWN_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "green_light"), GREEN_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "red_light"), RED_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "black_light"), BLACK_LIGHT);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "white_stained_planks"), WHITE_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "orange_stained_planks"), ORANGE_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "magenta_stained_planks"), MAGENTA_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "light_blue_stained_planks"), LIGHT_BLUE_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "yellow_stained_planks"), YELLOW_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "lime_stained_planks"), LIME_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "pink_stained_planks"), PINK_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "gray_stained_planks"), GRAY_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "light_gray_stained_planks"), LIGHT_GRAY_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "cyan_stained_planks"), CYAN_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "purple_stained_planks"), PURPLE_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "blue_stained_planks"), BLUE_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "brown_stained_planks"), BROWN_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "green_stained_planks"), GREEN_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "red_stained_planks"), RED_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "black_stained_planks"), BLACK_STAINED_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "road_block"), ROAD_BLOCK);
		Registry.register(Registry.STATUS_EFFECT, new Identifier("gcm", "composition_writing"), COMPOSITION_WRITING_SE);
		Registry.register(Registry.STATUS_EFFECT, new Identifier("gcm", "spicy"), SPICY_STATUS_EFFECT);
		Registry.register(Registry.POTION, new Identifier("gcm", "composition_writing"), COMPOSITION_WRITING_P);
	}
}