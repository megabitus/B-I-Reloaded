package com.BI.Items;

import net.minecraft.item.Item;

import com.BI.Items.Classes.DagerOfSightItem;
import com.BI.Items.Classes.EyeItem;
import com.BI.Lib.Reference;
import com.BI.Main_Package.Main_Class;

import cpw.mods.fml.common.FMLLog;

public class Mod_Items {
	public static Item DagerOfSight;
	public static Item Eye;
	public static void ItemsInit(){
		DagerOfSight = new DagerOfSightItem(Main_Class.DagerM);
		Eye = new EyeItem();
		FMLLog.info("Chaos Magic " + Reference.MOD_VERSION + ">> initialized succesfully the items!");
	}

}
