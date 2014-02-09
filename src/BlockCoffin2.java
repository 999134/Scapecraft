package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCoffin2 extends Block
{
    public BlockCoffin2(int i, int j)
    {
    	  super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
      
		//setTickRandomly(true);
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


	@SideOnly(Side.CLIENT)
	private Icon field_94393_a;
	@SideOnly(Side.CLIENT)
	private Icon field_94392_b;

	public Icon getIcon(int par1, int par2) {
	return par1 == 0 ? this.field_94392_b : (par1 == 1 ? this.field_94393_a
	: this.blockIcon);
	}

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
	{
    	   this.blockIcon = ir.registerIcon("yewplank");//side
	this.field_94393_a = ir.registerIcon("coffin");//Top
	this.field_94392_b = ir.registerIcon("coffin");//Bottom
	}
	
	
	
}
