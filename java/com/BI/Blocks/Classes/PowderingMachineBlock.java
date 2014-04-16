package com.BI.Blocks.Classes;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.BI.Blocks.TileEntitys.PowderingMachineTileEntity;
import com.BI.Lib.Names;
import com.BI.Main_Package.Main_Class;

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

}
