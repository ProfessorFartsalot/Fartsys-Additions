
package org.hydrogenhosting.fartsysmagitechproductions.item;

import org.hydrogenhosting.fartsysmagitechproductions.itemgroup.FMFMusicItemGroup;
import org.hydrogenhosting.fartsysmagitechproductions.FartsysmagitechproductionsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@FartsysmagitechproductionsModElements.ModElement.Tag
public class AMDMotorOilJiggleJungleItem extends FartsysmagitechproductionsModElements.ModElement {
	@ObjectHolder("fartsysmagitechproductions:amd_motor_oil_jiggle_jungle")
	public static final Item block = null;

	public AMDMotorOilJiggleJungleItem(FartsysmagitechproductionsModElements instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FartsysmagitechproductionsModElements.sounds
					.get(new ResourceLocation("fartsysmagitechproductions:kissonekinoma.motoroiljigglejungle")),
					new Item.Properties().group(FMFMusicItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("amd_motor_oil_jiggle_jungle");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"Item is aetherial. Can not be melted down into PVC dust. Kinda like Kissone's metal rods in his spine."));
		}
	}
}
