
package org.hydrogenhosting.fartsysmagitechproductions.item.crafting;

import org.hydrogenhosting.fartsysmagitechproductions.item.ItemPVCPlastic;
import org.hydrogenhosting.fartsysmagitechproductions.ElementsFartsysmagitechproductionsMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@ElementsFartsysmagitechproductionsMod.ModElement.Tag
public class RecipeRecPVCPlastic03 extends ElementsFartsysmagitechproductionsMod.ModElement {
	public RecipeRecPVCPlastic03(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 155);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.RECORD_BLOCKS, (int) (1)), new ItemStack(ItemPVCPlastic.block, (int) (1)), 20F);
	}
}
