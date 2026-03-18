package org.hydrogenhosting.fartsysmagitechproductions.procedures;

import org.hydrogenhosting.fartsysmagitechproductions.FartsysmagitechproductionsMod;

import java.util.Map;

public class STEndTowerAdditionalGenerationConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency x for procedure STEndTowerAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency z for procedure STEndTowerAdditionalGenerationCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.abs(x) + 0 > 256) {
			return true;
		} else if (Math.abs(z) + 0 > 256) {
			return true;
		}
		return false;
	}
}
