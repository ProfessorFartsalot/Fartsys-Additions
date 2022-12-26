
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.firehostredux.fartsy.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FartsysAdditionsModTabs {
	public static CreativeModeTab TAB_FARTSYS_ADDITIONS;

	public static void load() {
		TAB_FARTSYS_ADDITIONS = new CreativeModeTab("tabfartsys_additions") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FartsysAdditionsModItems.DEBUG_ITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
