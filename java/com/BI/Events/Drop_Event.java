package com.BI.Events;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.BI.Items.Mod_Items;
import com.BI.Items.Classes.DagerOfSightItem;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Drop_Event {
	public boolean randomBoolean(){
	    return Math.random() < 0.5;
	}
	@SubscribeEvent
	public void onPlayerKill(LivingDeathEvent event){
		if (event.source.getEntity() instanceof EntityPlayer)
			if(event.entity instanceof EntityMob)
				if (DagerOfSightItem.OK == 1)
					if(randomBoolean() == true)
					event.entityLiving.dropItem(Mod_Items.Eye, 1);
	}
	
}

