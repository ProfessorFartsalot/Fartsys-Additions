
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
public class ItemDemetoriWorldsEnd extends ElementsFartsysadditionsMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysadditions:demetori_worlds_end")
	public static final Item block = null;
	public ItemDemetoriWorldsEnd(ElementsFartsysadditionsMod instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fartsysadditions:demetori_worlds_end", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("demetori_worlds_end", ElementsFartsysadditionsMod.sounds.get(new ResourceLocation("fartsysadditions:demetori.worldsend")));
			setUnlocalizedName("demetori_worlds_end");
			setRegistryName("demetori_worlds_end");
			setCreativeTab(TabFartsysAdditions.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
