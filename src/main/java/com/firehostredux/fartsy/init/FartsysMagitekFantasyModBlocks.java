
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.firehostredux.fartsy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.firehostredux.fartsy.block.RockSaltBlock;
import com.firehostredux.fartsy.FartsysMagitekFantasyMod;

public class FartsysMagitekFantasyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FartsysMagitekFantasyMod.MODID);
	public static final RegistryObject<Block> ROCK_SALT = REGISTRY.register("rock_salt", () -> new RockSaltBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RockSaltBlock.registerRenderLayer();
		}
	}
}
