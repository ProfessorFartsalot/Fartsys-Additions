package org.hydrogenhosting.fartsysmagitechproductions.procedures;

import org.hydrogenhosting.fartsysmagitechproductions.item.BagORockSaltItem;
import org.hydrogenhosting.fartsysmagitechproductions.block.RockSaltBlock;
import org.hydrogenhosting.fartsysmagitechproductions.FartsysmagitechproductionsMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

public class BagORockSaltSpawnRockSaltProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency world for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency x for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency y for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency z for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FartsysmagitechproductionsMod.LOGGER.warn("Failed to load dependency entity for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BagORockSaltItem.block)) : false) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
				world.setBlockState(new BlockPos(x, y + 1, z), RockSaltBlock.block.getDefaultState(), 3);
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BagORockSaltItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}
}
