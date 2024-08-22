
package com.firehostredux.fartsysadditions.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.List;

import com.firehostredux.fartsysadditions.creativetab.TabFMFMusic;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ItemAMDBetweenHeavenAndEarth extends ElementsFartsysmagitechfantasyMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysmagitechfantasy:amd_between_heaven_and_earth")
	public static final Item block = null;
	public ItemAMDBetweenHeavenAndEarth(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("fartsysmagitechfantasy:amd_between_heaven_and_earth", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("amd_between_heaven_and_earth",
					ElementsFartsysmagitechfantasyMod.sounds.get(new ResourceLocation("fartsysmagitechfantasy:fartsy.betweenchipsandtunes")));
			setUnlocalizedName("amd_between_heaven_and_earth");
			setRegistryName("amd_between_heaven_and_earth");
			setCreativeTab(TabFMFMusic.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Item is aetherial. Can not be melted down into PVC dust.");
		}
	}
}
