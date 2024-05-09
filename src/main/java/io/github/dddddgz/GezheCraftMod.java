package io.github.dddddgz;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GezheCraftMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("gcm");

	public static final Item OBSIDIAN_INGOT = new Item(new FabricItemSettings());
	public static final Item OBSIDIAN_PICKAXE = new ObsidianPickaxe();
	public static final Item REMOTER_OPEN = new RemoterOpenItem(new FabricItemSettings());
	public static final Item REMOTER_CLOSE = new RemoterCloseItem(new FabricItemSettings());
	public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = new ObsidianArmorMaterial();
	public static final Item OBSIDIAN_MATERIAL_HELMET = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
	public static final Item OBSIDIAN_MATERIAL_CHESTPLATE = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());
	public static final Item OBSIDIAN_MATERIAL_LEGGINGS = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());
	public static final Item OBSIDIAN_MATERIAL_BOOTS = new ArmorItem(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());
	public static final Item HMCL = new HMCLItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).snack().saturationModifier(6f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 9), 1.0f).build()));
	public static final Item PCL = new PCLItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).snack().saturationModifier(6f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 9), 1.0f).build()));
	public static final Block OBSIDIAN_ORE = new Block(AbstractBlock.Settings.of(Material.STONE).strength(13.0F));
	public static final Block REMOTE_BLOCK = new RemoteBlock(Block.Settings.of(Material.STONE).strength(4.0F).luminance(
											 (state) -> (Boolean)state.get(BooleanProperty.of("state")) ? 15 : 0));
	public static final Block WHITE_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block ORANGE_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block MAGENTA_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block LIGHT_BLUE_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block YELLOW_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block LIME_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block PINK_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block GRAY_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block LIGHT_GRAY_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block CYAN_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block PURPLE_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block BLUE_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block BROWN_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block GREEN_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block RED_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block BLACK_STAINED_PLANKS = new Block(Block.Settings.copy(Blocks.OAK_PLANKS));
	public static final Block ROAD_BLOCK = new Block(Block.Settings.copy(Blocks.STONE));
	public static final Block ROAD_BLOCK_WHITE_LINE = new RoadBlockWhiteLine(Block.Settings.copy(Blocks.STONE));
	public static final Block ROAD_BLOCK_WHITE_LINE_DIAGONALLY = new RoadBlockWhiteLineDiagonally(Block.Settings.copy(Blocks.STONE));
	public static final Block ROAD_BLOCK_YELLOW_LINE = new RoadBlockYellowLine(Block.Settings.copy(Blocks.STONE));
	public static final Block ROAD_BLOCK_YELLOW_LINE_DIAGONALLY = new RoadBlockYellowLineDiagonally(Block.Settings.copy(Blocks.STONE));
	public static final Block ROAD_BLOCK_YELLOW_DOUBLE_LINE = new RoadBlockYellowDoubleLine(Block.Settings.copy(Blocks.STONE));
	public static final Block ROAD_BLOCK_YELLOW_DOUBLE_LINE_DIAGONALLY = new RoadBlockYellowDoubleLineDiagonally(Block.Settings.copy(Blocks.STONE));
	public static final Enchantment HIGH_JUMP = new HighJumpEnchantment();

	public static final ItemGroup GCM_GROUP = FabricItemGroupBuilder.create(
					new Identifier("gcm", "group"))
			.icon(() -> new ItemStack(REMOTE_BLOCK))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(OBSIDIAN_INGOT));
				stacks.add(new ItemStack(OBSIDIAN_PICKAXE));
				stacks.add(new ItemStack(REMOTER_OPEN));
				stacks.add(new ItemStack(REMOTER_CLOSE));
				stacks.add(new ItemStack(OBSIDIAN_MATERIAL_HELMET));
				stacks.add(new ItemStack(OBSIDIAN_MATERIAL_CHESTPLATE));
				stacks.add(new ItemStack(OBSIDIAN_MATERIAL_LEGGINGS));
				stacks.add(new ItemStack(OBSIDIAN_MATERIAL_BOOTS));
				stacks.add(new ItemStack(HMCL));
				stacks.add(new ItemStack(PCL));
				stacks.add(new ItemStack(OBSIDIAN_ORE));
				stacks.add(new ItemStack(REMOTE_BLOCK));
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
				stacks.add(new ItemStack(ROAD_BLOCK_WHITE_LINE));
				stacks.add(new ItemStack(ROAD_BLOCK_WHITE_LINE_DIAGONALLY));
				stacks.add(new ItemStack(ROAD_BLOCK_YELLOW_LINE));
				stacks.add(new ItemStack(ROAD_BLOCK_YELLOW_LINE_DIAGONALLY));
				stacks.add(new ItemStack(ROAD_BLOCK_YELLOW_DOUBLE_LINE));
				stacks.add(new ItemStack(ROAD_BLOCK_YELLOW_DOUBLE_LINE_DIAGONALLY));
			}).build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier("gcm", "obsidian_ingot"), OBSIDIAN_INGOT);
		Registry.register(Registry.ITEM, new Identifier("gcm", "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("gcm", "remoter_open"), REMOTER_OPEN);
		Registry.register(Registry.ITEM, new Identifier("gcm", "remoter_close"), REMOTER_CLOSE);
		Registry.register(Registry.ITEM, new Identifier("gcm", "obsidian_helmet"), OBSIDIAN_MATERIAL_HELMET);
		Registry.register(Registry.ITEM, new Identifier("gcm", "obsidian_chestplate"), OBSIDIAN_MATERIAL_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("gcm", "obsidian_leggings"), OBSIDIAN_MATERIAL_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("gcm", "obsidian_boots"), OBSIDIAN_MATERIAL_BOOTS);
		Registry.register(Registry.ITEM, new Identifier("gcm", "hmcl"), HMCL);
		Registry.register(Registry.ITEM, new Identifier("gcm", "pcl"), PCL);
		Registry.register(Registry.ITEM, new Identifier("gcm", "obsidian_ore"), new BlockItem(OBSIDIAN_ORE, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "remote_block"), new BlockItem(REMOTE_BLOCK, new FabricItemSettings()));
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
		Registry.register(Registry.ITEM, new Identifier("gcm", "road_block_white_line"), new BlockItem(ROAD_BLOCK_WHITE_LINE, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "road_block_white_line_diagonally"), new BlockItem(ROAD_BLOCK_WHITE_LINE_DIAGONALLY, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "road_block_yellow_line"), new BlockItem(ROAD_BLOCK_YELLOW_LINE, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "road_block_yellow_line_diagonally"), new BlockItem(ROAD_BLOCK_YELLOW_LINE_DIAGONALLY, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "road_block_yellow_double_line"), new BlockItem(ROAD_BLOCK_YELLOW_DOUBLE_LINE, new FabricItemSettings()));
		Registry.register(Registry.ITEM, new Identifier("gcm", "road_block_yellow_double_line_diagonally"), new BlockItem(ROAD_BLOCK_YELLOW_DOUBLE_LINE_DIAGONALLY, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("gcm", "obsidian_ore"), OBSIDIAN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "remote_block"), REMOTE_BLOCK);
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
		Registry.register(Registry.BLOCK, new Identifier("gcm", "road_block_white_line"), ROAD_BLOCK_WHITE_LINE);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "road_block_white_line_diagonally"), ROAD_BLOCK_WHITE_LINE_DIAGONALLY);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "road_block_yellow_line"), ROAD_BLOCK_YELLOW_LINE);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "road_block_yellow_line_diagonally"), ROAD_BLOCK_YELLOW_LINE_DIAGONALLY);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "road_block_yellow_double_line"), ROAD_BLOCK_YELLOW_DOUBLE_LINE);
		Registry.register(Registry.BLOCK, new Identifier("gcm", "road_block_yellow_double_line_diagonally"), ROAD_BLOCK_YELLOW_DOUBLE_LINE_DIAGONALLY);
		Registry.register(Registry.ENCHANTMENT, new Identifier("gcm", "high_jump"), HIGH_JUMP);
	}
}