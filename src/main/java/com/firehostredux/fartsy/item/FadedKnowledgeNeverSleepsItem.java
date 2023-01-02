
package com.firehostredux.fartsy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.firehostredux.fartsy.init.FartsysMagitekFantasyModTabs;

public class FadedKnowledgeNeverSleepsItem extends Item {
	public FadedKnowledgeNeverSleepsItem() {
		super(new Item.Properties().tab(FartsysMagitekFantasyModTabs.TAB_FARTSYS_ADDITIONS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("A faded copy of Knowledge Never Sleeps. Can be restored by alchemy."));
	}
}
