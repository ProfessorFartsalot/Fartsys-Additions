
package org.hydrogenhosting.fartsysmagitechproductions.item.crafting;

import org.hydrogenhosting.fartsysmagitechproductions.item.ItemBagORockSalt;
import org.hydrogenhosting.fartsysmagitechproductions.ElementsFartsysmagitechproductionsMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@ElementsFartsysmagitechproductionsMod.ModElement.Tag
public class RecipeRecBagORockSalt extends ElementsFartsysmagitechproductionsMod.ModElement {
	public RecipeRecBagORockSalt(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 150);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.POTIONITEM, (int) (1)), new ItemStack(ItemBagORockSalt.block, (int) (1)), 200F);
	}
}
