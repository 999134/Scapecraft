package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class BlockWHITESpawn extends Block
{
    public BlockWHITESpawn(int i, int j)
    {
        super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    
        this.setTickRandomly(true);

    }
    


    
//@Override
    public void updateTick(World world, int x, int y, int z, Random par5Random)

	{
    //	world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world));
    	
   // 	world.addWeatherEffect(new EntityLightningBolt(world, x, y+1, z));
    	 
    	
		EntityWhiteKnight entity = new EntityWhiteKnight(world);
		entity.setLocationAndAngles(x, y + 1, z,
				world.rand.nextFloat() * 360.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		 world.setBlock(x, y+1, z, 0);
		  world.setBlock(x, y+2, z, 0);
		  world.setBlock(x, y+3, z, 0);
		//world.setBlockWithNotify(x, y, z, 0);

	}
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return stone.blockID;
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
           
            {
            this.blockIcon = ir.registerIcon("WhiteKnightspawn");
            }
    }
}
