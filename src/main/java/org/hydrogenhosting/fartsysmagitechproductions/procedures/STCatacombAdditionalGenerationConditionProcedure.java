package org.hydrogenhosting.fartsysmagitechproductions.procedures;

import org.hydrogenhosting.fartsysmagitechproductions.FartsysmagitechproductionsMod;

import java.util.Map;

public class STCatacombAdditionalGenerationConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency y for procedure STCatacombAdditionalGenerationCondition!");
			return false;
		}
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		if (y < 64) {
			return true;
		}
		return false;
	}
}
