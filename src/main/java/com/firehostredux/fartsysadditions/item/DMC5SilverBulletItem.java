
package com.firehostredux.fartsysadditions.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import com.firehostredux.fartsysadditions.itemgroup.FartsysAdditionsItemGroup;
import com.firehostredux.fartsysadditions.FartsysAdditionsModElements;

@FartsysAdditionsModElements.ModElement.Tag
public class DMC5SilverBulletItem extends FartsysAdditionsModElements.ModElement {
	@ObjectHolder("fartsys_additions:dmc_5_silver_bullet")
	public static final Item block = null;

	public DMC5SilverBulletItem(FartsysAdditionsModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FartsysAdditionsModElements.sounds.get(new ResourceLocation("fartsys_additions:dmc5.silverbullet")),
					new Item.Properties().group(FartsysAdditionsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dmc_5_silver_bullet");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}