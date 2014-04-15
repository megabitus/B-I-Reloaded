package com.BI.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.BI.Blocks.Classes.PowderingMachineBlock;
import com.BI.Blocks.Classes.TelotriteOreBlock;
import com.BI.Lib.Reference;

import cpw.mods.fml.common.FMLLog;

public class Mod_Blocks {
	public static Block TelotriteOre;
	public static Block PowderingMachine;
	public static void BlocksInit(){
		
		TelotriteOre = new TelotriteOreBlock(Material.rock);
		PowderingMachine = new PowderingMachineBlock(Material.rock);
		FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> initialized succesfully the blocks!");
	}

}
