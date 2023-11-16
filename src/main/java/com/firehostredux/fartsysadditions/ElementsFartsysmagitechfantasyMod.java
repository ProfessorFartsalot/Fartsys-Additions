/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package com.firehostredux.fartsysadditions;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class ElementsFartsysmagitechfantasyMod implements IFuelHandler, IWorldGenerator {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public ElementsFartsysmagitechfantasyMod() {
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.athenathetirelessone"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.athenathetirelessone")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.scream"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.scream")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.tornfromtheheavensorchestral"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.tornfromtheheavensorchestral")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.escape_journeys"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.escape_journeys")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.fromtheheavens"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.fromtheheavens")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.closeinthedistance"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.closeinthedistance")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.footfalls"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.footfalls")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.insatiable"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.insatiable")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.totheedge"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.totheedge")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.lunarwhale"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.lunarwhale")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.shadowbringers"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.shadowbringers")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.metal"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.metal")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.locus"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.locus")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.metalbrutejusticemode"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.metalbrutejusticemode")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.penitus"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.penitus")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.andloveyoushallfind"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.andloveyoushallfind")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.big_boned"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.big_boned")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.imagination"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.imagination")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.lunacy"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.lunacy")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.nightbloom"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.nightbloom")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.papaya"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.papaya")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.steel_reason"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.steel_reason")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.the_ewer_brimmeth"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.the_ewer_brimmeth")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.wayward_daughter"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.wayward_daughter")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "la_cucuracha"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "la_cucuracha")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.exponential_entropy_primals"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "ffxiv.exponential_entropy_primals")));
		sounds.put(new ResourceLocation("fartsysmagitechfantasy", "sweaty_socks"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("fartsysmagitechfantasy", "sweaty_socks")));
	}

	public void preInit(FMLPreInitializationEvent event) {
		try {
			for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
				Class<?> clazz = Class.forName(asmData.getClassName());
				if (clazz.getSuperclass() == ElementsFartsysmagitechfantasyMod.ModElement.class)
					elements.add((ElementsFartsysmagitechfantasyMod.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(ElementsFartsysmagitechfantasyMod.ModElement::initElements);
		this.addNetworkMessage(FartsysmagitechfantasyModVariables.WorldSavedDataSyncMessageHandler.class,
				FartsysmagitechfantasyModVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData mapdata = FartsysmagitechfantasyModVariables.MapVariables.get(event.player.world);
			WorldSavedData worlddata = FartsysmagitechfantasyModVariables.WorldVariables.get(event.player.world);
			if (mapdata != null)
				FartsysmagitechfantasyMod.PACKET_HANDLER.sendTo(new FartsysmagitechfantasyModVariables.WorldSavedDataSyncMessage(0, mapdata),
						(EntityPlayerMP) event.player);
			if (worlddata != null)
				FartsysmagitechfantasyMod.PACKET_HANDLER.sendTo(new FartsysmagitechfantasyModVariables.WorldSavedDataSyncMessage(1, worlddata),
						(EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData worlddata = FartsysmagitechfantasyModVariables.WorldVariables.get(event.player.world);
			if (worlddata != null)
				FartsysmagitechfantasyMod.PACKET_HANDLER.sendTo(new FartsysmagitechfantasyModVariables.WorldSavedDataSyncMessage(1, worlddata),
						(EntityPlayerMP) event.player);
		}
	}
	private int messageID = 0;
	public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass,
			Side... sides) {
		for (Side side : sides)
			FartsysmagitechfantasyMod.PACKET_HANDLER.registerMessage(handler, messageClass, messageID, side);
		messageID++;
	}
	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}
	}
	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityEntry>> getEntities() {
		return entities;
	}

	public List<Supplier<Potion>> getPotions() {
		return potions;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final ElementsFartsysmagitechfantasyMod elements;
		protected final int sortid;
		public ModElement(ElementsFartsysmagitechfantasyMod elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
