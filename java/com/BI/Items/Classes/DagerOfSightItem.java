package com.BI.Items.Classes;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

import com.BI.Lib.Names;
import com.BI.Main_Package.Main_Class;

public class DagerOfSightItem extends ItemSword {

	public static int OK;
	public DagerOfSightItem(ToolMaterial id) {
		super(id);
		this.setCreativeTab(Main_Class.CMTab);
		this.setUnlocalizedName(Names.DagerOfSight);
		this.setTextureName(Names.DagerOfSight);
	}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean isHeld) {
		if(isHeld)OK=1;
		else OK=0;
	}

}
