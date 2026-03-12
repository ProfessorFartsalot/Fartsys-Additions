
package org.hydrogenhosting.fartsysmagitechproductions.item;

import org.hydrogenhosting.fartsysmagitechproductions.itemgroup.FartsysAdditionsItemGroup;
import org.hydrogenhosting.fartsysmagitechproductions.FartsysmagitechproductionsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@FartsysmagitechproductionsModElements.ModElement.Tag
public class CrystalIceItem extends FartsysmagitechproductionsModElements.ModElement {
	@ObjectHolder("fartsysmagitechproductions:crystal_ice")
	public static final Item block = null;

	public CrystalIceItem(FartsysmagitechproductionsModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FartsysAdditionsItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("crystal_ice");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
