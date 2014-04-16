package com.BI.Blocks.TileEntitys;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class PowderingMachineTileEntity extends TileEntity implements IInventory{
	private ItemStack[] items;
	int k;
	public PowderingMachineTileEntity(){
		items = new ItemStack[1];
	}
	public boolean search(World world, int x, int y, int z,Block block){
		boolean variabila = false;
		for (int i = x - 2; i <= x + 2; ++i)
		{
			for (int k = z - 2; k <= z + 2; ++k)
			{
				for (int j = y - 1; j <= y + 1; ++j)
				{
					if (i!=0 || k != 0 || j != 0)
					{
						if (world.getBlock(i, j, k) == block)
						{
							//							System.out.println("The block has been detected!");
							variabila = true;
						}
					}
				} 
			}
		} 
		return variabila;
	}
	@Override
	public void updateEntity() {
		if(search(worldObj, xCoord, yCoord, zCoord, Blocks.water)){
			if(worldObj.isDaytime()){
				///////////TO DO INCEREASE ITEM
			}
		}
	}
	@Override
	public void closeInventory() {}
	@Override
	public ItemStack decrStackSize(int i, int count) {
		ItemStack itemstack = getStackInSlot(i);
		if(itemstack != null){
			if(itemstack.stackSize <= count){
				setInventorySlotContents(i, null);
			}else{
				itemstack = itemstack.splitStack(count);
				markDirty();
			}
		}
		return itemstack;
	}
	@Override
	public String getInventoryName() {
		return "Powdering Machine";
	}
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	@Override
	public int getSizeInventory() {
		return items.length;
	}
	@Override
	public ItemStack getStackInSlot(int i) {
		return items[i];
	}
	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		ItemStack item = getStackInSlot(i);
		setInventorySlotContents(i, null);
		return item;
	}
	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}
	@Override
	public boolean isItemValidForSlot(int var1, ItemStack var2) {
		return true;
	}
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
	}
	@Override
	public void openInventory() {}
	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		items[i] = itemstack;
		if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()){
			itemstack.stackSize = getInventoryStackLimit();
		}
		markDirty();
	}
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		NBTTagList items = new NBTTagList();
		for(int i = 0; i < getSizeInventory(); i++){
			ItemStack stack = getStackInSlot(i);
			if(stack != null){
				NBTTagCompound item = new NBTTagCompound();
				item.setByte("Slot", (byte)i);
				stack.writeToNBT(item);
				items.appendTag(item);
			}
		}
		compound.setTag("Items", items);
	}
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		NBTTagList items = compound.getTagList("Items", compound.getId());   
		for (int i = 0; i < items.tagCount(); ++i) {
			NBTTagCompound item = items.getCompoundTagAt(i);
			byte slot = item.getByte("Slot");
			if (slot >= 0 && slot < getSizeInventory()) {
				setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(item));
			}
		}
	}
}
