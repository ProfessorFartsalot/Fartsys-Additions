
package com.firehostredux.fartsysadditions.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.firehostredux.fartsysadditions.procedures.ShartTenMillionItemIsDroppedByPlayerProcedure;

public class ShartTwentyMillionItem extends Item {
	public ShartTwentyMillionItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Twenty MILLION sharts. What are you EATING???? That's like"));
		list.add(Component.literal("a weapon of ass destruction! Oh wait-"));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		ShartTenMillionItemIsDroppedByPlayerProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return true;
	}
}
