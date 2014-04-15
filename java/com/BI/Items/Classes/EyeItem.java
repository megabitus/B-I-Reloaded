package com.BI.Items.Classes;

import com.BI.Lib.Names;
import com.BI.Main_Package.Main_Class;

import net.minecraft.item.Item;

public class EyeItem extends Item {
	public EyeItem(){
		this.setCreativeTab(Main_Class.CMTab);
		this.setUnlocalizedName(Names.Eye);
		this.setTextureName(Names.Eye);
	}

}
