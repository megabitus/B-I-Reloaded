package com.BI.Main_Package;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.BI.Blocks.Mod_Blocks;
import com.BI.Events.Drop_Event;
import com.BI.Interfaces.Gui_Handeler;
import com.BI.Items.Mod_Items;
import com.BI.Lib.Reference;
import com.BI.Registers.Game_Registry;
import com.BI.WorldGen.TelotriteWG;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION, name = Reference.MOD_NAME)
public class Main_Class
{
	@Instance(Reference.MOD_ID)
	public static Main_Class instance;
	private Gui_Handeler guiHandler = new Gui_Handeler();
	public static CreativeTabs CMTab = new CMTab(CreativeTabs.getNextID(), "Chaos Magic");
	public static final Item.ToolMaterial DagerM = EnumHelper.addToolMaterial("DagerM", 3, 151, 12.0F, 3.5F, 22);
	public static TelotriteWG TelotriteOreWG = new TelotriteWG();
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> is initializating!");
    	NetworkRegistry.INSTANCE.registerGuiHandler(this, new Gui_Handeler());
		Mod_Blocks.BlocksInit();
		Mod_Items.ItemsInit();
		Game_Registry.RegistersInitItems();
		Game_Registry.RegistersInitBlocks();
		Game_Registry.RegistersEvents();
		Game_Registry.RegistersTileEntitys();
		Game_Registry.RegistersWorldGenerator();
		FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> has succesfully initialized all the modules!");
    }
}
