package com.firehostredux.fartsysadditions.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.firehostredux.fartsysadditions.FartsysAdditionsMod;

public class ShartSpecialLivingEntityIsHitWithItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure ShartSpecialLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("waterydemise").setDamageBypassesArmor(), (float) 100000);
		}
	}
}
