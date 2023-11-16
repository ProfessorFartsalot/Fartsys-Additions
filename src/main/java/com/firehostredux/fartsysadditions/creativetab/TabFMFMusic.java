
package com.firehostredux.fartsysadditions.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import com.firehostredux.fartsysadditions.item.ItemAMDPenitus;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class TabFMFMusic extends ElementsFartsysmagitechfantasyMod.ModElement {
	public TabFMFMusic(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 175);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabfmf_music") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAMDPenitus.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
