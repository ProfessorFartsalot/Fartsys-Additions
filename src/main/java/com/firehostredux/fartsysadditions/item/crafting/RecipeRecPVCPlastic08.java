
package com.firehostredux.fartsysadditions.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.firehostredux.fartsysadditions.item.ItemPVCPlastic;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class RecipeRecPVCPlastic08 extends ElementsFartsysmagitechfantasyMod.ModElement {
	public RecipeRecPVCPlastic08(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 321);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.RECORD_STAL, (int) (1)), new ItemStack(ItemPVCPlastic.block, (int) (1)), 20F);
	}
}
