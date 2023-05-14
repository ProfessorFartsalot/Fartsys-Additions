package net.mcreator.fartsysadditions.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.fartsysadditions.ElementsFartsysadditionsMod;

import java.util.Map;

@ElementsFartsysadditionsMod.ModElement.Tag
public class ProcedureCronusEntitySwingsItem extends ElementsFartsysadditionsMod.ModElement {
	public ProcedureCronusEntitySwingsItem(ElementsFartsysadditionsMod instance) {
		super(instance, 332);
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
