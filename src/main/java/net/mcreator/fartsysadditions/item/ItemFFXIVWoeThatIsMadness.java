
package net.mcreator.fartsysadditions.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.fartsysadditions.creativetab.TabFartsysAdditions;
import net.mcreator.fartsysadditions.ElementsFartsysadditionsMod;

@ElementsFartsysadditionsMod.ModElement.Tag
public class ItemFFXIVWoeThatIsMadness extends ElementsFartsysadditionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysadditions:ffxiv_woe_that_is_madness")
	public static final Item block = null;
	public ItemFFXIVWoeThatIsMadness(ElementsFartsysadditionsMod instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fartsysadditions:ffxiv_woe_that_is_madness", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("ffxiv_woe_that_is_madness",
					ElementsFartsysadditionsMod.sounds.get(new ResourceLocation("fartsysadditions:ffxiv.woethatismadness")));
			setUnlocalizedName("ffxiv_woe_that_is_madness");
			setRegistryName("ffxiv_woe_that_is_madness");
			setCreativeTab(TabFartsysAdditions.tab);
		}
	}
}
