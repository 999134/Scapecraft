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

public class BlockKosSpawn extends Block
{
    public BlockKosSpawn(int i, int j)
    {
    	  super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    

		//setTickRandomly(true);
    }
//@Override
 
    

    
    
        public int tickRate(World par1World){return 20*1;}
    
    public void updateTick(World world, int x, int y, int z, Random par5Random)

	{
    	   //world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world));
    	EntityKos1 entity = new EntityKos1(world);
		entity.setLocationAndAngles(x, y + 1, z,
				world.rand.nextFloat() * 360.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		 world.setBlock(x, y+1, z, 0);
		  world.setBlock(x, y+2, z, 0);
		  world.setBlock(x, y+3, z, 0);
		//world.setBlock(x, y, z, 0);

	}
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return stone.blockID;
    }
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    
    	
    	 ItemStack itemstack = par5EntityPlayer.inventory.getCurrentItem();

     	if (itemstack != null && itemstack.itemID == 266)
         {
             if (itemstack.stackSize-- == 1)
             {
                 par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, new ItemStack(Block.dirt));
                 par5EntityPlayer.addChatMessage("\u00a7EKoschei the Deathless: You are brave to face me but now is your time to die");
                 EntityKos1 entity = new EntityKos1(par1World);
         		entity.setLocationAndAngles(par2, par3 + 1, par4,
         				par1World.rand.nextFloat() * 360.0F, 0.0F);
         		par1World.spawnEntityInWorld(entity);
         		 par1World.setBlock(par2, par3+1, par4, 0);
         		  par1World.setBlock(par2, par3+2, par4, 0);
         		  par1World.setBlock(par2, par3+3, par4, 0);
             }
             else if (!par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Block.dirt)))
             {
                 par5EntityPlayer.dropPlayerItem(new ItemStack(Block.dirt, 1, 0));
                 par5EntityPlayer.addChatMessage("\u00a7EKoschei the Deathless: Begone fool, I require ONE gold ingot");
             }

             return true;
         }
     	else
    		par5EntityPlayer.addChatMessage("\u00a7EKoschei the Deathless: Collect one gold ingot to face me");
     	
     	 return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
           
            {
            this.blockIcon = ir.registerIcon("bandos");
            }
    }
}
