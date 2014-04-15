package com.BI.Main_Package;

import com.BI.Items.Mod_Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CMTab extends CreativeTabs {

	public CMTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return Mod_Items.DagerOfSight;
	}

}
