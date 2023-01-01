
package com.firehostredux.fartsy.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import com.firehostredux.fartsy.init.FartsysMagitekFantasyModTabs;
import com.firehostredux.fartsy.init.FartsysMagitekFantasyModSounds;

public class FFXIVWoeThatIsMadnessItem extends RecordItem {
	public FFXIVWoeThatIsMadnessItem() {
		super(0, FartsysMagitekFantasyModSounds.REGISTRY.get(new ResourceLocation("fartsys_magitek_fantasy:ffxiv.woethatismadness")),
				new Item.Properties().tab(FartsysMagitekFantasyModTabs.TAB_FARTSYS_ADDITIONS).stacksTo(1).rarity(Rarity.RARE));
	}
}
