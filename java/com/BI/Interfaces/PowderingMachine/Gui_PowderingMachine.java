package com.BI.Interfaces.PowderingMachine;

import org.lwjgl.opengl.GL11;

import com.BI.Blocks.TileEntitys.PowderingMachineTileEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Gui_PowderingMachine extends GuiContainer{

	public Gui_PowderingMachine(InventoryPlayer invPlayer, PowderingMachineTileEntity machine) {
		super(new ContainerPowderingMachine(invPlayer, machine));
		xSize = 176;
		ySize = 166;
	}
	
//	private static final ResourceLocation texture = new ResourceLocation("minecraft", "textures/gui/GuiEssenceReceiver.jpg");

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1, 1, 1, 1);
		this.mc.renderEngine.bindTexture(new ResourceLocation("minecraft", "textures/gui/GuiPowderingMachine.jpg"));
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
