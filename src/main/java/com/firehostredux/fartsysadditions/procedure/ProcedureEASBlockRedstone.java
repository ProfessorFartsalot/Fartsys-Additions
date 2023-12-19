package com.firehostredux.fartsysadditions.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.ICommandSender;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import java.util.Map;

import java.util.Iterator;
import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

import com.firehostredux.fartsysadditions.item.ItemEASReceiver;
import net.minecraft.entity.player.InventoryPlayer;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ProcedureEASBlockRedstone extends ElementsFartsysmagitechfantasyMod.ModElement {
  public ProcedureEASBlockRedstone(ElementsFartsysmagitechfantasyMod instance) {
    super(instance, 291);
  }

  public static void executeProcedure(Map < String, Object > dependencies) {
    int x = (int) dependencies.get("x");
    int y = (int) dependencies.get("y");
    int z = (int) dependencies.get("z");
    BlockPos pos = new BlockPos((int) x, (int) y, (int) z);
    World world = (World) dependencies.get("world");
    if (!world.isRemote && world.getMinecraftServer() != null) {
      final MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
      List < EntityPlayer > pl = (List) server.getPlayerList().getPlayers();
      for (int i = 0; i < pl.size(); i++) {
        if (((pl.get(i) instanceof EntityPlayer) ? ((EntityPlayer) pl.get(i)).inventory.hasItemStack(new ItemStack(ItemEASReceiver.block, (int)(1))) : false)) {
          for (int inv = 0; inv < 36; inv++) {
            if (pl.get(i).inventory.getStackInSlot(inv).toString().equals("1xitem.eas_receiver@0")) {
              ItemStack it = pl.get(i).inventory.getStackInSlot(inv);
              if ((((it).hasTagCompound() ? (it).getTagCompound().getDouble("easFreq") : -1) == (world.getTileEntity(pos).getTileData().getDouble("easFreq")))) {
                //Broadcast EAS if matching frequency
                if (world.getTileEntity(pos).getTileData().getBoolean("easSound") == true){
        			world.playSound(null, pl.get(i).posX,pl.get(i).posY,pl.get(i).posZ, ElementsFartsysmagitechfantasyMod.sounds.get(new ResourceLocation("fartsysmagitechfantasy:eas")), SoundCategory.BLOCKS, 0.5F, 1.0F);
                }
                world.getMinecraftServer().getCommandManager().executeCommand(server, "tellraw @p {\"text\":\"--- EAS BROADCAST REQUESTED ---\",\"color\":\"dark_red\"}");
                pl.get(i).sendMessage(new TextComponentString(world.getTileEntity(pos).getTileData().getString("easMessage")));
                world.getMinecraftServer().getCommandManager().executeCommand(server, "tellraw @p {\"text\":\"-------------------------------\",\"color\":\"dark_red\"}");
              }
            }
          }
        }
      }
    }
  }
}