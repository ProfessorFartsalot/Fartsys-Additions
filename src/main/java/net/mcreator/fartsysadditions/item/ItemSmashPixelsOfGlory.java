
package net.mcreator.fartsysadditions.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.fartsysadditions.creativetab.TabFartsysAdditions;
import net.mcreator.fartsysadditions.ElementsFartsysadditionsMod;

@ElementsFartsysadditionsMod.ModElement.Tag
public class ItemSmashPixelsOfGlory extends ElementsFartsysadditionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysadditions:smash_pixels_of_glory")
	public static final Item block = null;
	public ItemSmashPixelsOfGlory(ElementsFartsysadditionsMod instance) {
		super(instance, 253);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fartsysadditions:smash_pixels_of_glory", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("smash_pixels_of_glory", ElementsFartsysadditionsMod.sounds.get(new ResourceLocation("fartsysadditions:smash.pixelsofglory")));
			setUnlocalizedName("smash_pixels_of_glory");
			setRegistryName("smash_pixels_of_glory");
			setCreativeTab(TabFartsysAdditions.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
