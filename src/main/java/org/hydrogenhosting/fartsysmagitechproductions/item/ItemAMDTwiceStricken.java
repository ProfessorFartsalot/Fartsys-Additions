
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
public class ItemAMDTwiceStricken extends ElementsFartsysmagitechproductionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysmagitechproductions:amd_twice_stricken")
	public static final Item block = null;
	public ItemAMDTwiceStricken(ElementsFartsysmagitechproductionsMod instance) {
		super(instance, 107);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fartsysmagitechproductions:amd_twice_stricken", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("amd_twice_stricken",
					ElementsFartsysmagitechproductionsMod.sounds.get(new ResourceLocation("fartsysmagitechproductions:ffxiv.twicestricken")));
			setUnlocalizedName("amd_twice_stricken");
			setRegistryName("amd_twice_stricken");
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
