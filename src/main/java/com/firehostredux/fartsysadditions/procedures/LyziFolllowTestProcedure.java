package com.firehostredux.fartsysadditions.procedures;

import net.minecraft.world.entity.Entity;

public class LyziFolllowTestProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("follow") == true ? true : false;
	}
}
