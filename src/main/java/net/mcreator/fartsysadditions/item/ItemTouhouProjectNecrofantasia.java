
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
public class ItemTouhouProjectNecrofantasia extends ElementsFartsysadditionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysadditions:touhou_project_necrofantasia")
	public static final Item block = null;
	public ItemTouhouProjectNecrofantasia(ElementsFartsysadditionsMod instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fartsysadditions:touhou_project_necrofantasia", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("touhou_project_necrofantasia",
					ElementsFartsysadditionsMod.sounds.get(new ResourceLocation("fartsysadditions:touhou.necrofantasia")));
			setUnlocalizedName("touhou_project_necrofantasia");
			setRegistryName("touhou_project_necrofantasia");
			setCreativeTab(TabFartsysAdditions.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
