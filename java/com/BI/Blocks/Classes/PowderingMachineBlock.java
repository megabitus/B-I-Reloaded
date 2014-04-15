package com.BI.Blocks.Classes;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.BI.Blocks.TileEntitys.PowderingMachineTileEntity;
import com.BI.Lib.Names;
import com.BI.Main_Package.Main_Class;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;

public class PowderingMachineBlock extends BlockContainer {

	public PowderingMachineBlock(Material p_i45394_1_) {
		super(Material.rock);
		this.setCreativeTab(Main_Class.CMTab);
		this.setBlockName(Names.PowderingMachine);
		this.setBlockTextureName(Names.PowderingMachine);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new PowderingMachineTileEntity();
	}
	@Override
	public boolean onBlockActivated(World world,int x,int y, int z, EntityPlayer player,int side,float hitX,float hitY, float hitZ){
//		if(!world.isRemote){
			FMLNetworkHandler.openGui(player, Main_Class.instance, 1, world, x, y, z);
//		}
		return true;
	}

}
