
package com.firehostredux.fartsy.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import com.firehostredux.fartsy.init.FartsysAdditionsModTabs;
import com.firehostredux.fartsy.init.FartsysAdditionsModSounds;

public class FFXIVPrimalsLocusItem extends RecordItem {
	public FFXIVPrimalsLocusItem() {
		super(0, FartsysAdditionsModSounds.REGISTRY.get(new ResourceLocation("fartsys_additions:ffxiv.primals.locus")),
				new Item.Properties().tab(FartsysAdditionsModTabs.TAB_FARTSYS_ADDITIONS).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
