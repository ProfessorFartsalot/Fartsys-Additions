
package net.mcreator.fartsysadditions.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.fartsysadditions.item.ItemBagORockSalt;
import net.mcreator.fartsysadditions.ElementsFartsysadditionsMod;

@ElementsFartsysadditionsMod.ModElement.Tag
public class RecipeRecBagORockSalt extends ElementsFartsysadditionsMod.ModElement {
	public RecipeRecBagORockSalt(ElementsFartsysadditionsMod instance) {
		super(instance, 295);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.POTIONITEM, (int) (1)), new ItemStack(ItemBagORockSalt.block, (int) (1)), 200F);
	}
}
