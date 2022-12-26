
package com.firehostredux.fartsy.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import com.firehostredux.fartsy.init.FartsysAdditionsModTabs;
import com.firehostredux.fartsy.init.FartsysAdditionsModSounds;

public class FFXIVWoeThatIsMadnessItem extends RecordItem {
	public FFXIVWoeThatIsMadnessItem() {
		super(0, FartsysAdditionsModSounds.REGISTRY.get(new ResourceLocation("fartsys_additions:ffxiv.woethatismadness")),
				new Item.Properties().tab(FartsysAdditionsModTabs.TAB_FARTSYS_ADDITIONS).stacksTo(1).rarity(Rarity.RARE));
	}
}
