
package com.firehostredux.fartsysadditions.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import com.firehostredux.fartsysadditions.item.ItemPVCPlastic;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class RecipeRecPVCPlastic0e extends ElementsFartsysmagitechfantasyMod.ModElement {
	public RecipeRecPVCPlastic0e(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 163);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.AIR, (int) (1)), new ItemStack(ItemPVCPlastic.block, (int) (1)), 20F);
	}
}
