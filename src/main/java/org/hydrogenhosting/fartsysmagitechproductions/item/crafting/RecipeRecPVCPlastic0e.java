
package org.hydrogenhosting.fartsysmagitechproductions.item.crafting;

import org.hydrogenhosting.fartsysmagitechproductions.item.ItemPVCPlastic;
import org.hydrogenhosting.fartsysmagitechproductions.ElementsFartsysmagitechproductionsMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

@ElementsFartsysmagitechproductionsMod.ModElement.Tag
public class RecipeRecPVCPlastic0e extends ElementsFartsysmagitechproductionsMod.ModElement {
	public RecipeRecPVCPlastic0e(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 165);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.AIR, (int) (1)), new ItemStack(ItemPVCPlastic.block, (int) (1)), 20F);
	}
}
