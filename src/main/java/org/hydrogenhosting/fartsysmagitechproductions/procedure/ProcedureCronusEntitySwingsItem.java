package org.hydrogenhosting.fartsysmagitechproductions.procedure;

import org.hydrogenhosting.fartsysmagitechproductions.ElementsFartsysmagitechproductionsMod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsFartsysmagitechproductionsMod.ModElement.Tag
public class ProcedureCronusEntitySwingsItem extends ElementsFartsysmagitechproductionsMod.ModElement {
	public ProcedureCronusEntitySwingsItem(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 167);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CronusEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getCooldownTracker().setCooldown(
					(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getItem(),
					(int) 50);
	}
}
