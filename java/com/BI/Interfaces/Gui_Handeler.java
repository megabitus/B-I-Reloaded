package com.BI.Interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.BI.Blocks.TileEntitys.PowderingMachineTileEntity;
import com.BI.Interfaces.PowderingMachine.ContainerPowderingMachine;

import cpw.mods.fml.common.network.IGuiHandler;

public class Gui_Handeler implements IGuiHandler{

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		switch(ID){
		case 1: if(te !=null && te instanceof PowderingMachineTileEntity){
			return new ContainerPowderingMachine(player.inventory, (PowderingMachineTileEntity)te);
		}
		}
		return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		switch(ID){
		case 1: if(te !=null && te instanceof PowderingMachineTileEntity){
			return new ContainerPowderingMachine(player.inventory, (PowderingMachineTileEntity)te);
		}
		}
		return null;
	}

}
