
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
public class TouhouProjectNecrofantasiaItem extends FartsysAdditionsModElements.ModElement {
	@ObjectHolder("fartsys_additions:touhou_project_necrofantasia")
	public static final Item block = null;

	public TouhouProjectNecrofantasiaItem(FartsysAdditionsModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FartsysAdditionsModElements.sounds.get(new ResourceLocation("fartsys_additions:touhou.necrofantasia")),
					new Item.Properties().group(FartsysAdditionsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("touhou_project_necrofantasia");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
