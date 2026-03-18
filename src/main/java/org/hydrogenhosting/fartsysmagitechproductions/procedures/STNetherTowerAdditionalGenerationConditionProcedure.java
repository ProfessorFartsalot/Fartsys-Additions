package org.hydrogenhosting.fartsysmagitechproductions.procedures;

import org.hydrogenhosting.fartsysmagitechproductions.FartsysmagitechproductionsMod;

import java.util.Map;

public class STNetherTowerAdditionalGenerationConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency x for procedure STNetherTowerAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency y for procedure STNetherTowerAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency z for procedure STNetherTowerAdditionalGenerationCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.abs(y) + 0 < 72) {
			if (Math.abs(x) + 0 > 128) {
				return true;
			} else if (Math.abs(z) + 0 > 128) {
				return true;
			}
		}
		return false;
	}
}
