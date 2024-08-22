package com.firehostredux.fartsysadditions.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.firehostredux.fartsysadditions.item.ItemJRInterphosP1;
import com.firehostredux.fartsysadditions.item.ItemAMDInterphosP1;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ProcedureJRInterphosP1RightClickedInAir extends ElementsFartsysmagitechfantasyMod.ModElement {
	public ProcedureJRInterphosP1RightClickedInAir(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 405);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JRInterphosP1RightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJRInterphosP1.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemAMDInterphosP1.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
