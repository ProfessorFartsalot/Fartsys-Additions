package com.firehostredux.fartsysadditions.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class LyziRightClickInteractProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
			if (entity.getPersistentData().getBoolean("follow") == true) {
				entity.getPersistentData().putBoolean("follow", false);
			} else {
				entity.getPersistentData().putBoolean("follow", true);
			}
		}
	}
}
