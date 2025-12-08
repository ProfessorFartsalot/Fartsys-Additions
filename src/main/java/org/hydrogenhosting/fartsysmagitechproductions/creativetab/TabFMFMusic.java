
package org.hydrogenhosting.fartsysmagitechproductions.creativetab;

import org.hydrogenhosting.fartsysmagitechproductions.item.ItemAMDYouWillKnowOurNamesRemastered;
import org.hydrogenhosting.fartsysmagitechproductions.ElementsFartsysmagitechproductionsMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsFartsysmagitechproductionsMod.ModElement.Tag
public class TabFMFMusic extends ElementsFartsysmagitechproductionsMod.ModElement {
	public TabFMFMusic(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 232);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabfmf_music") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAMDYouWillKnowOurNamesRemastered.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
