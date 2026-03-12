
package org.hydrogenhosting.fartsysmagitechproductions.itemgroup;

import org.hydrogenhosting.fartsysmagitechproductions.item.AMDYouWillKnowOurNamesRemasteredItem;
import org.hydrogenhosting.fartsysmagitechproductions.FartsysmagitechproductionsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@FartsysmagitechproductionsModElements.ModElement.Tag
public class FMFMusicItemGroup extends FartsysmagitechproductionsModElements.ModElement {
	public FMFMusicItemGroup(FartsysmagitechproductionsModElements instance) {
		super(instance, 182);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfmf_music") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AMDYouWillKnowOurNamesRemasteredItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
