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
import net.minecraft.world.World;

public class BlockMagicplank extends Block
{
    public BlockMagicplank(int i, int j)
    {
    	 super(i, Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);	
    }
    
    
    
    
    
    
    
    
    
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return mod_MagicTree.Magicplank.blockID;
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
           
            {
            this.blockIcon = ir.registerIcon("magicplank");
            }
    }
}
