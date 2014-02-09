package net.minecraft.src;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.World;



public class TileEntityBlockStallBlock extends BlockContainer {

        //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
        //And the second three are the top-right corner.
        public TileEntityBlockStallBlock(int id) {
                super(id, Material.rock);
                this.setCreativeTab(CreativeTabs.tabBlock);
                this.setBlockBounds(0.4F, 0.0F, 0.4F, 1.6F, 2.0F, 1.6F);
        }

    
         
        
        
        //Make sure you set this as your TileEntity class relevant for the block!
        @Override
        public TileEntity createNewTileEntity(World world) {
                return new TileEntityBlockStallEntity();
        }
   

        public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
        {
       	 ItemStack itemstack = par5EntityPlayer.inventory.getCurrentItem();
       	 
       	if (itemstack != null && itemstack.itemID == Item.goldNugget.itemID)
        {
            if (itemstack.stackSize-- == 1)
            {
                par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, new ItemStack(Block.glass));
                par5EntityPlayer.addChatMessage("\u00a7EBlock Stall: Thank you for your custom!");
            	
            }
            else if (!par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Block.glass)))
            {
                par5EntityPlayer.dropPlayerItem(new ItemStack(Block.glass.blockID, 1, 0));
            }
            else{
            	par5EntityPlayer.addChatMessage("\u00a7EBlock Stall: Thank you for your custom!");}
            }
       	else
    		par5EntityPlayer.addChatMessage("\u00a7EBlock Stall: Selling Glass one gold nugget");
     	
            return true;
        }
        //You don't want the normal render type, or it wont render properly.
        @Override
        public int getRenderType() {
                return -1;
        }
        
        //It's not an opaque cube, so you need this.
        @Override
        public boolean isOpaqueCube() {
                return false;
        }
        
        //It's not a normal block, so you need this too.
        public boolean renderAsNormalBlock() {
                return false;
        }

        //This is the icon to use for showing the block in your hand.
        public void registerIcons(IconRegister icon) {
                this.blockIcon = icon.registerIcon("Stall");
        }

      
        public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
        {
        	par5Entity.motionX = 0.0D;
            par5Entity.motionY = 0.0D;
            par5Entity.motionZ *= 0.0D;
        }
}