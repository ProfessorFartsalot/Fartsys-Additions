
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.firehostredux.fartsysadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.firehostredux.fartsysadditions.FartsysmagitechfantasyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FartsysmagitechfantasyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FartsysmagitechfantasyMod.MODID);
	public static final RegistryObject<CreativeModeTab> FMF_MUSIC = REGISTRY.register("fmf_music",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fartsysmagitechfantasy.fmf_music")).icon(() -> new ItemStack(FartsysmagitechfantasyModItems.AMD_PENITUS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FartsysmagitechfantasyModItems.AMD_ATHENA_THE_TIRELESS_ONE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_SCREAM.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_TORN_FROM_THE_HEAVENS_ORCHESTRAL.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_FROM_THE_HEAVENS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_ESCAPE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_CLOSE_IN_THE_DISTANCE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_FOOTFALLS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_INSATIABLE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_TO_THE_EDGE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_AND_LOVE_YOU_SHALL_FIND.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_LUNAR_WHALE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_SHADOWBRINGERS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_METAL.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_METAL_BRUTE_JUSTICE_MODE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_LOCUS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_PENITUS.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_ATHENA_THE_TIRELESS_ONE.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_SCREAM.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_TORN_FROM_THE_HEAVENS_ORCHESTRAL.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_FROM_THE_HEAVENS.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_ESCAPE.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_CLOSE_IN_THE_DISTANCE.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_FOOTFALLS.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_INSATIABLE.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_TO_THE_EDGE.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_AND_LOVE_YOU_SHALL_FIND.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_LUNAR_WHALE.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_SHADOWBRINGERS.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_METAL.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_METAL_BRUTE_JUSTICE_MODE.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_LOCUS.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_PENITUS.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_ATHENA_THE_TIRELESS_ONE.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_SCREAM.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_TORN_FROM_THE_HEAVENS_ORCHESTRAL.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_FROM_THE_HEAVENS.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_ESCAPE.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_CLOSE_IN_THE_DISTANCE.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_FOOTFALLS.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_INSATIABLE.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_TO_THE_EDGE.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_AND_LOVE_YOU_SHALL_FIND.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_LUNAR_WHALE.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_METAL.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_METAL_BRUTE_JUSTICE_MODE.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_LOCUS.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_PENITUS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_BIG_BONED.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_IMAGINATION.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_LUNACY.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_NIGHTBLOOM.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_PA_PAYA.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_STEEL_REASON.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_THE_EWER_BRIMMETH.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_WAYWARD_DAUGHTER.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_BIG_BONED.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_IMAGINATION.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_LUNACY.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_NIGHTBLOOM.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_PA_PAYA.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_STEEL_REASON.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_THE_EWER_BRIMMETH.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_WAYWARD_DAUGHTER.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_BIG_BONED.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_IMAGINATION.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_LUNACY.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_NIGHTBLOOM.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_STEEL_REASON.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_THE_EWER_BRIMMETH.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_WAYWARD_DAUGHTER.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_SHADOWBRINGERS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_EXPONENTIAL_ENTROPY_PRIMALS.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_EXPONENTIAL_ENTROPY_PRIMALS.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_EXPONENTIAL_ENTROPY_PRIMALS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_BATTLE_AGAINST_A_TRUE_HERO.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_BETWEEN_HEAVEN_AND_EARTH.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_BAT_COUNTRY.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_CHIP_OIL_JIGGLE_TUNE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_APEX_OF_THE_WORLD.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_CHIP_SUN.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_CHIPS_OF_NATURE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_DEVIL_TRIGGER.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_DRIFTVEIL_CITY.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_DYNAMITE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_EXPONENTIAL_CHIPTUNE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_NEVER_GONNA_GIVE_YOU_UP.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_MOTOR_OIL_JIGGLE_JUNGLE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_SWEATY_SOCKS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_SWEATY_CHIPS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_LANDSLIDE.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_LANDSLIDE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_BRUTE_CHIPTUNE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_MELANCHIPTUNE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_TWICE_STRICKEN_INSTRUMENTAL.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_TWICE_STRICKEN.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_TWICE_STRICKEN.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_INTERPHOS_P_1.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_INTERPHOS_P_1.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMDA_LONG_FALL.get());
				tabData.accept(FartsysmagitechfantasyModItems.JRA_LONG_FALL.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_TRIUMPH_DISSIDIA_NT.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_TRIUMPH_DISSIDIA_NT.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_PAPAYA_DEMASTERED.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_PAPAYA_DEMASTERED.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_WHO_BRINGS_SHADOW.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_WHO_BRINGS_SHADOW.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_TOMORROW_AND_TOMORROW.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_TOMORROW_AND_TOMORROW.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_BATTLE.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_YOU_WILL_KNOW_OUR_NAMES_REMASTERED.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_BURNING_BATTLEFIELD.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_SANDS_OF_AMBER.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_SANDS_OF_AMBER.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_FIEND.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_FIEND.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_NEATH_DARK_WATERS.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_NEATH_DARK_WATERS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_AND_CHIPS_YOU_SHALL_FIND.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_INSATIABLE_CHIPS.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_HIC_SVNT_LEONES.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_HIC_SVNT_LEONES.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_ONE_AMONGST_THE_WEARY.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_ONE_AMONGST_THE_WEARY.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_CHIPBLOOM.get());
				tabData.accept(FartsysmagitechfantasyModItems.AMD_GIVE_IT_ALL.get());
				tabData.accept(FartsysmagitechfantasyModItems.JR_GIVE_IT_ALL.get());
				tabData.accept(FartsysmagitechfantasyModItems.FC_FIEND.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> FARTSYSADDITIONS = REGISTRY.register("fartsysadditions",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fartsysmagitechfantasy.fartsysadditions")).icon(() -> new ItemStack(FartsysmagitechfantasyModItems.DEBUG_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FartsysmagitechfantasyModItems.DEBUG_ITEM.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_ONE.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TEN.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_HUNDRED.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_THOUSAND.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TEN_THOUSAND.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_HUNDRED_THOUSAND.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_MILLION.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TEN_MILLION.get());
				tabData.accept(FartsysmagitechfantasyModBlocks.ROCK_SALT.get().asItem());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_SPECIAL.get());
				tabData.accept(FartsysmagitechfantasyModItems.BAG_O_ROCK_SALT.get());
				tabData.accept(FartsysmagitechfantasyModItems.PVC_DUST.get());
				tabData.accept(FartsysmagitechfantasyModItems.CRONUS.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHARD_EARTH.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHARD_FIRE.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHARD_ICE.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHARD_LIGHTNING.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHARD_UNASPECTED.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHARD_WATER.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHARD_WIND.get());
				tabData.accept(FartsysmagitechfantasyModItems.CRYSTAL_EARTH.get());
				tabData.accept(FartsysmagitechfantasyModItems.CRYSTAL_FIRE.get());
				tabData.accept(FartsysmagitechfantasyModItems.CRYSTAL_ICE.get());
				tabData.accept(FartsysmagitechfantasyModItems.CRYSTAL_LIGHTNING.get());
				tabData.accept(FartsysmagitechfantasyModItems.CRYSTAL_UNASPECTED.get());
				tabData.accept(FartsysmagitechfantasyModItems.CRYSTAL_WATER.get());
				tabData.accept(FartsysmagitechfantasyModItems.CRYSTAL_WIND.get());
				tabData.accept(FartsysmagitechfantasyModItems.CLUSTER_EARTH.get());
				tabData.accept(FartsysmagitechfantasyModItems.CLUSTER_FIRE.get());
				tabData.accept(FartsysmagitechfantasyModItems.CLUSTER_ICE.get());
				tabData.accept(FartsysmagitechfantasyModItems.CLUSTER_LIGHTNING.get());
				tabData.accept(FartsysmagitechfantasyModItems.CLUSTER_UNASPECTED.get());
				tabData.accept(FartsysmagitechfantasyModItems.CLUSTER_WATER.get());
				tabData.accept(FartsysmagitechfantasyModItems.CLUSTER_WIND.get());
				tabData.accept(FartsysmagitechfantasyModItems.BLANK_G_1_JR.get());
				tabData.accept(FartsysmagitechfantasyModItems.BLANK_G_2_JR.get());
				tabData.accept(FartsysmagitechfantasyModItems.BLANK_G_3_JR.get());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_UNASPECTED.get().asItem());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_EARTH.get().asItem());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_FIRE.get().asItem());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_FIRE_OVERWORLD.get().asItem());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_ICE.get().asItem());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_LIGHTNING.get().asItem());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_LIGHTNING_OVERWORLD.get().asItem());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_WATER.get().asItem());
				tabData.accept(FartsysmagitechfantasyModBlocks.ORE_WIND.get().asItem());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_IRON_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_GOLD_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_DIAMOND_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_LAPIS_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_REDSTONE_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_GLOWSTONE_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_EMERALD_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_QUARTZ_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_NETHER_BRICK_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.ENCHANTED_ENDER_PEARL_INK.get());
				tabData.accept(FartsysmagitechfantasyModItems.LA_CUCURACHA.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TWO.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TWENTY.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TWO_HUNDRED.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TWO_THOUSAND.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TWENTY_THOUSAND.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TWO_HUNDRED_THOUSAND.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TWO_MILLION.get());
				tabData.accept(FartsysmagitechfantasyModItems.SHART_TWENTY_MILLION.get());
				tabData.accept(FartsysmagitechfantasyModItems.WAFFLE_OF_ASS_DESTRUCTION.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(FartsysmagitechfantasyModItems.TESTENT_SPAWN_EGG.get());

		}
	}
}
