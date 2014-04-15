package com.BI.Blocks.Classes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.BI.Lib.Names;
import com.BI.Main_Package.Main_Class;

public class TelotriteOreBlock extends Block {

	public TelotriteOreBlock(Material p_i45394_1_) {
		super(Material.rock);
		this.setCreativeTab(Main_Class.CMTab);
		this.setBlockName(Names.TelotriteOre);
		this.setBlockTextureName(Names.TelotriteOre);
	}
}
