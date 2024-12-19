
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.firehostredux.fartsysadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.firehostredux.fartsysadditions.entity.TestentEntity;
import com.firehostredux.fartsysadditions.entity.LyziCookieEntity;
import com.firehostredux.fartsysadditions.FartsysmagitechfantasyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FartsysmagitechfantasyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FartsysmagitechfantasyMod.MODID);
	public static final RegistryObject<EntityType<TestentEntity>> TESTENT = register("testent",
			EntityType.Builder.<TestentEntity>of(TestentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestentEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LyziCookieEntity>> LYZI_COOKIE = register("lyzi_cookie",
			EntityType.Builder.<LyziCookieEntity>of(LyziCookieEntity::new, MobCategory.MISC).setCustomClientFactory(LyziCookieEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TestentEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TESTENT.get(), TestentEntity.createAttributes().build());
	}
}
