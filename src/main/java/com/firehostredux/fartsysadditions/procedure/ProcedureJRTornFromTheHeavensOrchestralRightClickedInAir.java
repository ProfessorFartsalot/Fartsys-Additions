package com.firehostredux.fartsysadditions.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.firehostredux.fartsysadditions.item.ItemJRTornFromTheHeavensOrchestral;
import com.firehostredux.fartsysadditions.item.ItemAMDTornFromTheHeavensOrchestral;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ProcedureJRTornFromTheHeavensOrchestralRightClickedInAir extends ElementsFartsysmagitechfantasyMod.ModElement {
	public ProcedureJRTornFromTheHeavensOrchestralRightClickedInAir(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 491);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JRTornFromTheHeavensOrchestralRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemAMDTornFromTheHeavensOrchestral.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJRTornFromTheHeavensOrchestral.block, (int) (1)).getItem(), -1,
					(int) 1, null);
	}
}
