package com.firehostredux.fartsysadditions.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.firehostredux.fartsysadditions.item.ItemBagORockSalt;
import com.firehostredux.fartsysadditions.block.BlockRockSalt;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ProcedureBagORockSaltSpawnRockSalt extends ElementsFartsysmagitechfantasyMod.ModElement {
	public ProcedureBagORockSaltSpawnRockSalt(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 293);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BagORockSaltSpawnRockSalt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemBagORockSalt.block, (int) (1)))
				: false)) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockRockSalt.block.getDefaultState(), 3);
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBagORockSalt.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
