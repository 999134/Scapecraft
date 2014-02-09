package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockOpenKeyBlock2 extends Block
{
    public BlockOpenKeyBlock2(int i, int j)
    {
    	  super(i, Material.plants);
        this.setCreativeTab(CreativeTabs.tabBlock);
        float f = 0.2F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3F, 0.5F + f);

		//setTickRandomly(true);
    }
//@Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate(par1World));}
        public int tickRate(World par1World){return 20*60;}
    
    public void updateTick(World world, int x, int y, int z, Random par5Random)

	{
    	   world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world));

		 world.setBlock(x, y, z, 2305);

		//world.setBlock(x, y, z, 0);

	}
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return stone.blockID;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
            return null;
    }
    
    public boolean isOpaqueCube()
    {
            return false;
    }

    public boolean renderAsNormalBlock()
    {
            return false;
    }

    public int getRenderType()
    {
            return 1;
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {  
           
            {
            this.blockIcon = ir.registerIcon("OpenKeyBlock");
            }
    }
}
