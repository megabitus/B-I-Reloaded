package com.BI.Interfaces.PowderingMachine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

import com.BI.Blocks.TileEntitys.PowderingMachineTileEntity;

public class ContainerPowderingMachine extends Container{
	
	PowderingMachineTileEntity machine;
	
	public  ContainerPowderingMachine(InventoryPlayer invPlayer, PowderingMachineTileEntity machine){
		this.machine = machine;
		for(int x = 0; x<9; x++){
			addSlotToContainer(new Slot(invPlayer,x,8+18*x,142));
		}
		for(int y = 0;y<3;y++){
			for(int x = 0;x<9;x++){
				addSlotToContainer(new Slot(invPlayer,x + y * 9 + 9,8 + 18 * x,84 + y * 18));
			}
		}
		for(int x =0; x < 1; x++){
			addSlotToContainer(new Slot(machine,x,80 + 18 * x,33));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return machine.isUseableByPlayer(entityplayer);
	}

}
