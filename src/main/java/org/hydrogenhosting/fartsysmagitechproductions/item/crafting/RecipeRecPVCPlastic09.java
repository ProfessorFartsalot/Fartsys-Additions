
package org.hydrogenhosting.fartsysmagitechproductions.item.crafting;

import org.hydrogenhosting.fartsysmagitechproductions.item.ItemPVCPlastic;
import org.hydrogenhosting.fartsysmagitechproductions.ElementsFartsysmagitechproductionsMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@ElementsFartsysmagitechproductionsMod.ModElement.Tag
public class RecipeRecPVCPlastic09 extends ElementsFartsysmagitechproductionsMod.ModElement {
	public RecipeRecPVCPlastic09(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 161);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.RECORD_STRAD, (int) (1)), new ItemStack(ItemPVCPlastic.block, (int) (1)), 20F);
	}
}
