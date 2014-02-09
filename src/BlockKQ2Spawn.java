package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
public class BlockKQ2Spawn extends Block
{
    public BlockKQ2Spawn(int i, int j)
    {
    	  super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    	

		setTickRandomly(true);
    }
//@Override
    public void updateTick(World world, int x, int y, int z, Random par5Random)

	{

		EntityKQ2 entity = new EntityKQ2(world);
		entity.setLocationAndAngles(x, y + 1, z+1,
				world.rand.nextFloat() * 360.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		  world.setBlock(x, y+1, z, 0);
		  world.setBlock(x, y+2, z, 0);
		  world.setBlock(x, y+3, z, 0);
		 


	}
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return sand.blockID;
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
           
            {
            this.blockIcon = ir.registerIcon("KQspawn");
            }
    }
}
