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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class BlockMagiclog extends Block {

	protected BlockMagiclog(int i, int j) {
		super(i, Material.wood);

        this.setCreativeTab(CreativeTabs.tabBlock);
        MinecraftForge.setBlockHarvestLevel(mod_MagicTree.Magiclog, 0, "axe", 3);
		setTickRandomly(true);

	}
	public void randomDisplayTick(World world, int i, int j, int k, Random random) 
	{        world.spawnParticle("magicCrit", i, j, k, 0.0D, 0.0D, 1.0D);
	 world.spawnParticle("magicCrit", i+0.5, j, k, 0.0D, 0.0D, 1.0D);
	 world.spawnParticle("magicCrit", i+1.5, j, k, 0.0D, 0.0D, 1.0D);
	 world.spawnParticle("magicCrit", i, j, k+0.5, 0.0D, 0.0D, 1.0D);
	 world.spawnParticle("magicCrit", i, j-0.5, k-0.5, 0.0D, 0.0D, 1.0D);
	}
	//public Icon getBlockTextureFromSide(int side)
//	{
	//     if(side == 1)
	//     {
	 //         return 20;
	//     }
	 //    else
	//     {
	 //         return blockIndexInTexture;
	//     }
	//} 
      
	  
	public int quantityDropped(Random random) {
		return 1;
	}

	public int idDropped(int i, Random random, int j) {
		return mod_MagicTree.Magiclog.blockID;
	}

	public void harvestBlock(World world, EntityPlayer entityplayer, int i,
			int j, int k, int l) {
		super.harvestBlock(world, entityplayer, i, j, k, l);
	}

	public void onBlockRemoval(World world, int i, int j, int k) {
		byte byte0 = 4;
		int l = byte0 + 1;
		if (world.checkChunksExist(i - l, j - l, k - l, i + l, j + l, k + l)) {
			for (int i1 = -byte0; i1 <= byte0; i1++) {
				for (int j1 = -byte0; j1 <= byte0; j1++) {
					for (int k1 = -byte0; k1 <= byte0; k1++) {
						int l1 = world.getBlockId(i + i1, j + j1, k + k1);
						if (l1 != mod_MagicTree.Magicleaf.blockID) {
							continue;
						}
						int i2 = world.getBlockMetadata(i + i1, j + j1, k + k1);
						if ((i2 & 8) == 0) {
							world.setBlock(i + i1, j + j1, k + k1,
									i2 | 8);
						}
					}

				}

			}

		}
	}

	public void updateTick(World world, int x, int y, int z, Random par5Random)

	{

		EntityBot2 entity = new EntityBot2(world);
		entity.setLocationAndAngles(x+5, y + 1, z+4,
				world.rand.nextFloat() * 360.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		  world.setBlock(x+5, y+1, z+4, 0);
		  world.setBlock(x+5, y+2, z+4, 0);
		  world.setBlock(x+5, y+3, z+4, 0);
	}

	public int damageDropped(int i) {
		return i;
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
    	   this.blockIcon = ir.registerIcon("magiclog0");
	this.field_94393_a = ir.registerIcon("magiclog1");//Top
	this.field_94392_b = ir.registerIcon("magiclog1");//Bottom
	}
	
	
}