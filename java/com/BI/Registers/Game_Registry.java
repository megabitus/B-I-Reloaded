package com.BI.Registers;

import net.minecraftforge.common.MinecraftForge;

import com.BI.Blocks.Mod_Blocks;
import com.BI.Blocks.TileEntitys.PowderingMachineTileEntity;
import com.BI.Events.Drop_Event;
import com.BI.Items.Mod_Items;
import com.BI.Lib.Names;
import com.BI.Lib.Reference;
import com.BI.Main_Package.Main_Class;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Game_Registry {
	public static void RegistersInitItems(){
		LanguageRegistry.addName(Mod_Items.DagerOfSight, Names.DagerOfSight);
		GameRegistry.registerItem(Mod_Items.DagerOfSight, Names.DagerOfSight);

		LanguageRegistry.addName(Mod_Items.Eye, Names.Eye);
		GameRegistry.registerItem(Mod_Items.Eye, Names.Eye);

		FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> succesfully registrated the items!");
	}
	public static void RegistersInitBlocks(){
		LanguageRegistry.addName(Mod_Blocks.TelotriteOre, Names.TelotriteOre);
		GameRegistry.registerBlock(Mod_Blocks.TelotriteOre, Names.TelotriteOre);

		LanguageRegistry.addName(Mod_Blocks.PowderingMachine, Names.PowderingMachine);
		GameRegistry.registerBlock(Mod_Blocks.PowderingMachine, Names.PowderingMachine);

		FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> succesfully registrated the blocks!");
	}
	public static void RegistersEvents(){
		MinecraftForge.EVENT_BUS.register(new Drop_Event());

		FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> succesfully registrated the events!");
	}
	public static void RegistersTileEntitys(){
		GameRegistry.registerTileEntity(PowderingMachineTileEntity.class, Names.PowderingMachine);

		FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> succesfully registrated the TileEntitys!");
	}
	public static void RegistersWorldGenerator(){
		GameRegistry.registerWorldGenerator(Main_Class.TelotriteOreWG, 1);

		FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> succesfully registrated the World Generator!");
	}

}
