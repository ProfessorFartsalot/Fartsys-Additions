
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
public class ItemDemetoriOrientalDarkFlight extends ElementsFartsysadditionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysadditions:demetori_oriental_dark_flight")
	public static final Item block = null;
	public ItemDemetoriOrientalDarkFlight(ElementsFartsysadditionsMod instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("fartsysadditions:demetori_oriental_dark_flight", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("demetori_oriental_dark_flight",
					ElementsFartsysadditionsMod.sounds.get(new ResourceLocation("fartsysadditions:demetori.orientaldarkflight")));
			setUnlocalizedName("demetori_oriental_dark_flight");
			setRegistryName("demetori_oriental_dark_flight");
			setCreativeTab(TabFartsysAdditions.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
