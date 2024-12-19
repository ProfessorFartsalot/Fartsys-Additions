package com.firehostredux.fartsysadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import com.firehostredux.fartsysadditions.init.FartsysmagitechfantasyModItems;
import com.firehostredux.fartsysadditions.init.FartsysmagitechfantasyModBlocks;

public class BagORockSaltSpawnRockSaltProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FartsysmagitechfantasyModItems.BAG_O_ROCK_SALT.get())) : false) {
			world.setBlock(BlockPos.containing(x, y + 1, z), FartsysmagitechfantasyModBlocks.ROCK_SALT.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FartsysmagitechfantasyModItems.BAG_O_ROCK_SALT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
