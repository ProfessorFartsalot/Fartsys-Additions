
package com.firehostredux.fartsysadditions.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import java.util.Random;

import com.firehostredux.fartsysadditions.item.ItemCrystalWater;
import com.firehostredux.fartsysadditions.creativetab.TabFartsysAdditions;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class BlockOreWater extends ElementsFartsysmagitechfantasyMod.ModElement {
	@GameRegistry.ObjectHolder("fartsysmagitechfantasy:ore_water")
	public static final Block block = null;
	public BlockOreWater(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 215);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("ore_water"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fartsysmagitechfantasy:ore_water", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == 0)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX, 128, chunkZ));
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("ocean")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("swampland")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("river")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("deep_ocean")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
			biomeCriteria = true;
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
		for (int i = 0; i < 4; i++) {
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(48) + 0;
			int z = chunkZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), 8, new com.google.common.base.Predicate<IBlockState>() {
				public boolean apply(IBlockState blockAt) {
					boolean blockCriteria = false;
					IBlockState require;
					if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
						blockCriteria = true;
					return blockCriteria;
				}
			})).generate(world, random, new BlockPos(x, y, z));
		}
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("ore_water");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabFartsysAdditions.tab);
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(ItemCrystalWater.block, (int) (2)));
		}
	}
}
