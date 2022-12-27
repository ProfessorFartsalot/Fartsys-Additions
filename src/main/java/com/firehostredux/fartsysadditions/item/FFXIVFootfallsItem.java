
package com.firehostredux.fartsysadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import com.firehostredux.fartsysadditions.itemgroup.FartsysAdditionsItemGroup;
import com.firehostredux.fartsysadditions.FartsysAdditionsModElements;

@FartsysAdditionsModElements.ModElement.Tag
public class FFXIVFootfallsItem extends FartsysAdditionsModElements.ModElement {
	@ObjectHolder("fartsys_additions:ffxiv_footfalls")
	public static final Item block = null;

	public FFXIVFootfallsItem(FartsysAdditionsModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FartsysAdditionsModElements.sounds.get(new ResourceLocation("fartsys_additions:ffxiv.footfalls")),
					new Item.Properties().group(FartsysAdditionsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ffxiv_footfalls");
		}
	}
}