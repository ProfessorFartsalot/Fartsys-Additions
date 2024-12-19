
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.firehostredux.fartsysadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import com.firehostredux.fartsysadditions.client.renderer.TestentRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FartsysmagitechfantasyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FartsysmagitechfantasyModEntities.TESTENT.get(), TestentRenderer::new);
		event.registerEntityRenderer(FartsysmagitechfantasyModEntities.LYZI_COOKIE.get(), ThrownItemRenderer::new);
	}
}
