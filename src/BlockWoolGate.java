package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockWoolGate extends Block
{
    public BlockWoolGate(int i, int j)
    {
    	  super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    

		//setTickRandomly(true);
    }
//@Override
 
    
  
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return stone.blockID;
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    
    	
    	 ItemStack itemstack = par5EntityPlayer.inventory.getCurrentItem();

     	if (itemstack != null && itemstack.itemID == 35)
         {
             if (itemstack.stackSize-- == 20)
             {
                 par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, new ItemStack(Block.dirt));
                 par5EntityPlayer.addChatMessage("\u00a7EFarmer: Thanks for Collecting that wool, there is a reward in this room");
                 par5EntityPlayer.setPositionAndUpdate(par2, par3+1, par4+4);
             }
             else if (!par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Block.dirt)))
             {
                 par5EntityPlayer.dropPlayerItem(new ItemStack(Block.dirt, 1, 0));
                 par5EntityPlayer.addChatMessage("\u00a7EFarmer: Please Collect (exactly)20 wool for me!");
             }

             return true;
         }
     	else
    		par5EntityPlayer.addChatMessage("\u00a7EFarmer: Please Collect 20 wool for me!");
     	
     	 return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
           
            {
            this.blockIcon = ir.registerIcon("wool_colored_white");
            }
    }
}
