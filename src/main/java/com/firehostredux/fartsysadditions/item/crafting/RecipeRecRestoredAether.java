
package com.firehostredux.fartsysadditions.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import com.firehostredux.fartsysadditions.item.ItemRestoredAetherCrystal;
import com.firehostredux.fartsysadditions.item.ItemResonantAether;
import com.firehostredux.fartsysadditions.ElementsFartsysadditionsMod;

@ElementsFartsysadditionsMod.ModElement.Tag
public class RecipeRecRestoredAether extends ElementsFartsysadditionsMod.ModElement {
	public RecipeRecRestoredAether(ElementsFartsysadditionsMod instance) {
		super(instance, 454);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemResonantAether.block, (int) (1)), new ItemStack(ItemRestoredAetherCrystal.block, (int) (1)), 1F);
	}
}
