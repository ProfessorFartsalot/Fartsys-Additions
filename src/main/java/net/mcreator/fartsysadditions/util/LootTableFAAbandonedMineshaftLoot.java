
package net.mcreator.fartsysadditions.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.fartsysadditions.ElementsFartsysadditionsMod;

@ElementsFartsysadditionsMod.ModElement.Tag
public class LootTableFAAbandonedMineshaftLoot extends ElementsFartsysadditionsMod.ModElement {
	public LootTableFAAbandonedMineshaftLoot(ElementsFartsysadditionsMod instance) {
		super(instance, 334);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("minecraft", "chests/abandoned_mineshaft"));
	}
}
