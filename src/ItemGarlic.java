package net.minecraft.src;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGarlic extends Item {

public ItemGarlic(int i)
  {
   super(i);
   this.setCreativeTab(CreativeTabs.tabMaterials);
  
  }

  public boolean hasEffect(ItemStack itemstack)
  {
   return false;
  }

  public boolean onItemUse(ItemStack par1ItemStack,
		  EntityPlayer par2EntityPlayer, World par3World, int X, int Y,
		  int Z, int par7, float par8, float par9, float par10) {
		  if (!par3World.isRemote) {
		  for (int y = 1; y < 3; y++) {
		  for (int z = 1; z < 3; z++) {
		  if (par3World.getBlockId(X, Y, Z) == 0) {
		  return false;
		  }
		  }
		  }

		  if (par3World.getBlockId(X, Y, Z) == mod_BlocksGalore.Coffin2.blockID)
		  {
		  par3World.setBlock(X, Y, Z, mod_BlocksGalore.Coffin.blockID);
		  --par1ItemStack.stackSize;
		  par2EntityPlayer.addChatMessage("\u00a7ECount Draynor: You dare to wake me? Then die!");
		  }
		  
		  
		  return true;}
		return true;
		  }
  
  
  
  public ItemStack onItemRightClick(ItemStack itemstack, World world,
			EntityPlayer entityplayer){
	
	{
	
		return itemstack;}
	}
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IconRegister ir)
  {
          {
          this.itemIcon = ir.registerIcon("garlic");
          }
  }
	}
