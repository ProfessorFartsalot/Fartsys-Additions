package com.firehostredux.fartsysadditions.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.firehostredux.fartsysadditions.item.ItemJRPapayaDemastered;
import com.firehostredux.fartsysadditions.item.ItemAMDPapayaDemastered;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ProcedureJRPapayaDemasteredRightClickedInAir extends ElementsFartsysmagitechfantasyMod.ModElement {
	public ProcedureJRPapayaDemasteredRightClickedInAir(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 408);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JRPapayaDemasteredRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJRPapayaDemastered.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemAMDPapayaDemastered.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
