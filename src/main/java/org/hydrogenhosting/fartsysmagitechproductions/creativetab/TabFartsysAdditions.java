
package org.hydrogenhosting.fartsysmagitechproductions.creativetab;

import org.hydrogenhosting.fartsysmagitechproductions.item.ItemDebugItem;
import org.hydrogenhosting.fartsysmagitechproductions.ElementsFartsysmagitechproductionsMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsFartsysmagitechproductionsMod.ModElement.Tag
public class TabFartsysAdditions extends ElementsFartsysmagitechproductionsMod.ModElement {
	public TabFartsysAdditions(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabfartsysadditions") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDebugItem.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
