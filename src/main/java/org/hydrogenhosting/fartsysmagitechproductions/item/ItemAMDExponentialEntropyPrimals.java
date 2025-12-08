
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
public class ItemAMDExponentialEntropyPrimals extends ElementsFartsysmagitechproductionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysmagitechproductions:amd_exponential_entropy_primals")
	public static final Item block = null;
	public ItemAMDExponentialEntropyPrimals(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("fartsysmagitechproductions:amd_exponential_entropy_primals", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("amd_exponential_entropy_primals", ElementsFartsysmagitechproductionsMod.sounds
					.get(new ResourceLocation("fartsysmagitechproductions:ffxiv.exponential_entropy_primals")));
			setUnlocalizedName("amd_exponential_entropy_primals");
			setRegistryName("amd_exponential_entropy_primals");
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
