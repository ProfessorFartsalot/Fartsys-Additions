
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.firehostredux.fartsysadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.firehostredux.fartsysadditions.block.RockSaltBlock;
import com.firehostredux.fartsysadditions.block.OreWindBlock;
import com.firehostredux.fartsysadditions.block.OreWaterBlock;
import com.firehostredux.fartsysadditions.block.OreUnaspectedBlock;
import com.firehostredux.fartsysadditions.block.OreLightningOverworldBlock;
import com.firehostredux.fartsysadditions.block.OreLightningBlock;
import com.firehostredux.fartsysadditions.block.OreIceBlock;
import com.firehostredux.fartsysadditions.block.OreFireOverworldBlock;
import com.firehostredux.fartsysadditions.block.OreFireBlock;
import com.firehostredux.fartsysadditions.block.OreEarthBlock;
import com.firehostredux.fartsysadditions.FartsysmagitechfantasyMod;

public class FartsysmagitechfantasyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FartsysmagitechfantasyMod.MODID);
	public static final RegistryObject<Block> ROCK_SALT = REGISTRY.register("rock_salt", () -> new RockSaltBlock());
	public static final RegistryObject<Block> ORE_UNASPECTED = REGISTRY.register("ore_unaspected", () -> new OreUnaspectedBlock());
	public static final RegistryObject<Block> ORE_EARTH = REGISTRY.register("ore_earth", () -> new OreEarthBlock());
	public static final RegistryObject<Block> ORE_FIRE = REGISTRY.register("ore_fire", () -> new OreFireBlock());
	public static final RegistryObject<Block> ORE_FIRE_OVERWORLD = REGISTRY.register("ore_fire_overworld", () -> new OreFireOverworldBlock());
	public static final RegistryObject<Block> ORE_ICE = REGISTRY.register("ore_ice", () -> new OreIceBlock());
	public static final RegistryObject<Block> ORE_LIGHTNING = REGISTRY.register("ore_lightning", () -> new OreLightningBlock());
	public static final RegistryObject<Block> ORE_LIGHTNING_OVERWORLD = REGISTRY.register("ore_lightning_overworld", () -> new OreLightningOverworldBlock());
	public static final RegistryObject<Block> ORE_WATER = REGISTRY.register("ore_water", () -> new OreWaterBlock());
	public static final RegistryObject<Block> ORE_WIND = REGISTRY.register("ore_wind", () -> new OreWindBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
