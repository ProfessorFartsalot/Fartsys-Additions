
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
public class FFXIVPrimalsLocusItem extends FartsysAdditionsModElements.ModElement {
	@ObjectHolder("fartsys_additions:ffxiv_primals_locus")
	public static final Item block = null;

	public FFXIVPrimalsLocusItem(FartsysAdditionsModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FartsysAdditionsModElements.sounds.get(new ResourceLocation("fartsys_additions:ffxiv.primals.locus")),
					new Item.Properties().group(FartsysAdditionsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ffxiv_primals_locus");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
