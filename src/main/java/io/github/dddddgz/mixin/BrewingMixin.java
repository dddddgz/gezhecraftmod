package io.github.dddddgz.mixin;

import io.github.dddddgz.GezheCraftMod;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public class BrewingMixin {
	@Inject(at = @At("HEAD"), method = "registerDefaults")
	private static void init(CallbackInfo info) {
		BrewingMixin.registerPotionRecipe(Potions.AWKWARD, Items.PAPER, GezheCraftMod.COMPOSITION_WRITING_P);
	}

	@Invoker("registerPotionRecipe")
	public static void registerPotionRecipe(Potion input, Item item, Potion output) {

	}
}