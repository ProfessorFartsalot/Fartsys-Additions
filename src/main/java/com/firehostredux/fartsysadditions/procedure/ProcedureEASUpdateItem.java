package com.firehostredux.fartsysadditions.procedure;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.GuiTextField;

import java.util.Map;
import java.util.HashMap;

import com.firehostredux.fartsysadditions.ElementsFartsysmagitechfantasyMod;

@ElementsFartsysmagitechfantasyMod.ModElement.Tag
public class ProcedureEASUpdateItem extends ElementsFartsysmagitechfantasyMod.ModElement {
	public ProcedureEASUpdateItem(ElementsFartsysmagitechfantasyMod instance) {
		super(instance, 297);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure EASUpdateItem!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure EASUpdateItem!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		{
			ItemStack _stack = (itemstack);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setString("easFreq", (new Object() {
				public String getText() {
					GuiTextField textField = (GuiTextField) guistate.get("text:ReceiverFrequency");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText()));
		}
	}
}
