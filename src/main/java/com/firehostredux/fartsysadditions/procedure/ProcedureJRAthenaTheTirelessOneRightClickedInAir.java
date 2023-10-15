package com.firehostredux.fartsysadditions.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.firehostredux.fartsysadditions.item.ItemJRAthenaTheTirelessOne;
import com.firehostredux.fartsysadditions.item.ItemAMDAthenaTheTirelessOne;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ProcedureJRAthenaTheTirelessOneRightClickedInAir extends ElementsFartsysmagitechfantasyMod.ModElement {
	public ProcedureJRAthenaTheTirelessOneRightClickedInAir(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 489);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JRAthenaTheTirelessOneRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemAMDAthenaTheTirelessOne.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJRAthenaTheTirelessOne.block, (int) (1)).getItem(), -1, (int) 1,
					null);
	}
}
