
package org.hydrogenhosting.fartsysmagitechproductions.itemgroup;

import org.hydrogenhosting.fartsysmagitechproductions.item.DebugItemItem;
import org.hydrogenhosting.fartsysmagitechproductions.FartsysmagitechproductionsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@FartsysmagitechproductionsModElements.ModElement.Tag
public class FartsysAdditionsItemGroup extends FartsysmagitechproductionsModElements.ModElement {
	public FartsysAdditionsItemGroup(FartsysmagitechproductionsModElements instance) {
		super(instance, 153);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfartsysadditions") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DebugItemItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
