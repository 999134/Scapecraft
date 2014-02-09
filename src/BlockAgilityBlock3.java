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

public class BlockAgilityBlock3 extends Block
{
    public BlockAgilityBlock3(int i, int j)
    {
    	  super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return stone.blockID;
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {ExtendedPlayer.get(par5EntityPlayer).addAXp(20);ExtendedPlayer props = ExtendedPlayer.get(par5EntityPlayer);
    if (par1World.isRemote){ par5EntityPlayer.addChatMessage("Your current agility xp is "+String.valueOf(props.getAgilityxp()));}
     par5EntityPlayer.setPositionAndUpdate(-969, 58, -149);
                 return true;}
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {{this.blockIcon = ir.registerIcon("agility");}}
}
