package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockAnvilSpawn extends Block
{
    public BlockAnvilSpawn(int i, int j)
    {
    	  super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    

		//setTickRandomly(true);
    }
//@Override
    private int blockint = 0;
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    	blockint = 1;
    	par1World.setBlock(par2, par3+2, par4, 7 );
     
    	{par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate(par1World));
    	
            return true;}
       
    }
        public int tickRate(World par1World){return 20*40;}
    
    public void updateTick(World world, int x, int y, int z, Random par5Random)

	{
    	//   world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world));

		 world.setBlock(x, y+1, z, 145 );
		 world.setBlock(x, y+2, z, 0 );
		 blockint = 0;
		//world.setBlock(x, y, z, 0);

	}
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return stone.blockID;
    }
    
   
    
    public Icon getIcon(int par1, int par2) {
        
    	
    	
   	 if (blockint == 0)
        {
   		 return Texture[1];

        }      
   	 
   	 
   	  if (blockint == 1)
         {
   		  return Texture[0];

         }
   	  
   	  return Texture[1];
    }

    private Icon[] Texture = new Icon[2];
    public void registerIcons(IconRegister iconRegister)
    
    {
   	 //localIconRegister = iconRegister;
    	this.blockIcon = iconRegister.registerIcon("coal_ore");
                     for (int N = 0; N < 2; N++)
                     {
                                     this.Texture[0] = iconRegister.registerIcon("coal_ore");
                                     this.Texture[1] = iconRegister.registerIcon("bedrock");
                     }
                     }
}
