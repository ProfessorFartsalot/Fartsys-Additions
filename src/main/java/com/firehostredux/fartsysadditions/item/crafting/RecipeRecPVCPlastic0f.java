
package com.firehostredux.fartsysadditions.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.firehostredux.fartsysadditions.item.ItemPVCPlastic;
import com.firehostredux.fartsysadditions.ElementsFartsysadditionsMod;

@ElementsFartsysadditionsMod.ModElement.Tag
public class RecipeRecPVCPlastic0f extends ElementsFartsysadditionsMod.ModElement {
	public RecipeRecPVCPlastic0f(ElementsFartsysadditionsMod instance) {
		super(instance, 328);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.COAL, (int) (1)), new ItemStack(ItemPVCPlastic.block, (int) (1)), 1F);
	}
}
