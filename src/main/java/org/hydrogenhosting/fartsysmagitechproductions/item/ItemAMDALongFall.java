
package org.hydrogenhosting.fartsysmagitechproductions.item;

import org.hydrogenhosting.fartsysmagitechproductions.creativetab.TabFMFMusic;
import org.hydrogenhosting.fartsysmagitechproductions.ElementsFartsysmagitechproductionsMod;

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

@ElementsFartsysmagitechproductionsMod.ModElement.Tag
public class ItemAMDALongFall extends ElementsFartsysmagitechproductionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysmagitechproductions:amda_long_fall")
	public static final Item block = null;
	public ItemAMDALongFall(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fartsysmagitechproductions:amda_long_fall", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("amda_long_fall",
					ElementsFartsysmagitechproductionsMod.sounds.get(new ResourceLocation("fartsysmagitechproductions:ffxiv.alongfall")));
			setUnlocalizedName("amda_long_fall");
			setRegistryName("amda_long_fall");
			setCreativeTab(TabFMFMusic.tab);
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Item is aetherial. Can not be melted down into PVC dust.");
		}
	}
}
