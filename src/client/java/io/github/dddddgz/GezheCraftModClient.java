package io.github.dddddgz;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class GezheCraftModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		FluidRenderHandlerRegistry.INSTANCE.register(
				ModFluid.STILL_OBSIDIAN_FLUID, ModFluid.FLOWING_OBSIDIAN_FLUID,
				new SimpleFluidRenderHandler(
						new Identifier("minecraft:block/water_still"),
						new Identifier("minecraft:block/water_flow"),
						0xa37a5ca1
				)
		);
		BlockRenderLayerMap.INSTANCE.putFluids(
				RenderLayer.getTranslucent(), ModFluid.STILL_OBSIDIAN_FLUID, ModFluid.FLOWING_OBSIDIAN_FLUID
		);
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		ClientLifecycleEvents.CLIENT_STARTED.register(
				client -> {
					BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PEPPER, RenderLayer.getCutout());
				}
		);
	}
}