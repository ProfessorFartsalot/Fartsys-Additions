package com.firehostredux.fartsy.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import com.firehostredux.fartsy.init.FartsysMagitekFantasyModItems;
import com.firehostredux.fartsy.init.FartsysMagitekFantasyModBlocks;

public class BagORockSaltSpawnRockSaltProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(FartsysMagitekFantasyModItems.BAG_O_ROCK_SALT.get()))
				: false) {
			world.setBlock(new BlockPos(x, y + 1, z), FartsysMagitekFantasyModBlocks.ROCK_SALT.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FartsysMagitekFantasyModItems.BAG_O_ROCK_SALT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
