package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

public class BlockAddyore extends Block
{
    public BlockAddyore(int i, int j)
    {
    	  super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
		 MinecraftForge.setBlockHarvestLevel(mod_BlocksGalore.Addyore, 0, "pickaxe", 2);
    }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return mod_BlocksGalore.Addyore.blockID;
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
           
            {
            this.blockIcon = ir.registerIcon("Addyore");
            }
    }
}
