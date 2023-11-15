
package com.firehostredux.fartsysadditions.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.firehostredux.fartsysadditions.item.ItemPVCPlastic;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class RecipeRecPVCPlastic0c extends ElementsFartsysmagitechfantasyMod.ModElement {
	public RecipeRecPVCPlastic0c(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 109);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.RECORD_WAIT, (int) (1)), new ItemStack(ItemPVCPlastic.block, (int) (1)), 20F);
	}
}
