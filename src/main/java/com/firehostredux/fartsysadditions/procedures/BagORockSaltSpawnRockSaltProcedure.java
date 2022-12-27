package com.firehostredux.fartsysadditions.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.firehostredux.fartsysadditions.item.BagORockSaltItem;
import com.firehostredux.fartsysadditions.block.RockSaltBlock;
import com.firehostredux.fartsysadditions.FartsysAdditionsMod;

public class BagORockSaltSpawnRockSaltProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FartsysAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BagORockSaltItem.block)) : false) {
			world.setBlockState(new BlockPos(x, y + 1, z), RockSaltBlock.block.getDefaultState(), 3);
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BagORockSaltItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
