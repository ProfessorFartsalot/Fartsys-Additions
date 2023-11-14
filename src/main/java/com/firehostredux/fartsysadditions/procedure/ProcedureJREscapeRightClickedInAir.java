package com.firehostredux.fartsysadditions.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.firehostredux.fartsysadditions.item.ItemJREscape;
import com.firehostredux.fartsysadditions.item.ItemAMDEscape;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ProcedureJREscapeRightClickedInAir extends ElementsFartsysmagitechfantasyMod.ModElement {
	public ProcedureJREscapeRightClickedInAir(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 101);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JREscapeRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemAMDEscape.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJREscape.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
