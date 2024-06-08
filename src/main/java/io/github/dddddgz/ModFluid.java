package io.github.dddddgz;

import io.github.dddddgz.fluids.ObsidianFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluid {
    public static FlowableFluid STILL_OBSIDIAN_FLUID = registerFlowableFluid("obsidian", new ObsidianFluid.Still());
    public static FlowableFluid FLOWING_OBSIDIAN_FLUID = registerFlowableFluid("flowing_obsidian", new ObsidianFluid.Flowing());

    public static Fluid registerFluid(String identifier, Fluid fluid) {
        return Registry.register(Registry.FLUID, new Identifier("gcm", identifier), fluid);
    }

    public static FlowableFluid registerFlowableFluid(String identifier, FlowableFluid fluid) {
        return Registry.register(Registry.FLUID, new Identifier("gcm", identifier), fluid);
    }
}
