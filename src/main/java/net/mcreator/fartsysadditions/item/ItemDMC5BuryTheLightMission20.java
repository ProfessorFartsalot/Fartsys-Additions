
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
public class ItemDMC5BuryTheLightMission20 extends ElementsFartsysadditionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysadditions:dmc_5_bury_the_light_mission_20")
	public static final Item block = null;
	public ItemDMC5BuryTheLightMission20(ElementsFartsysadditionsMod instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("fartsysadditions:dmc_5_bury_the_light_mission_20", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("dmc_5_bury_the_light_mission_20",
					ElementsFartsysadditionsMod.sounds.get(new ResourceLocation("fartsysadditions:dmc5.burythelightmission20")));
			setUnlocalizedName("dmc_5_bury_the_light_mission_20");
			setRegistryName("dmc_5_bury_the_light_mission_20");
			setCreativeTab(TabFartsysAdditions.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
