
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

public class ResonantAetherItem extends Item {
	public ResonantAetherItem() {
		super(new Item.Properties().tab(FartsysMagitekFantasyModTabs.TAB_FARTSYS_ADDITIONS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("A vial of resonant aether. Can be dehydrated to make restored aether crystals."));
	}
}