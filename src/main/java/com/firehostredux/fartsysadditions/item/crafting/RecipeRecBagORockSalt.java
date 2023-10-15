
package com.firehostredux.fartsysadditions.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import com.firehostredux.fartsysadditions.item.ItemBagORockSalt;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class RecipeRecBagORockSalt extends ElementsFartsysmagitechfantasyMod.ModElement {
	public RecipeRecBagORockSalt(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 295);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.POTIONITEM, (int) (1)), new ItemStack(ItemBagORockSalt.block, (int) (1)), 200F);
	}
}
