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
import net.minecraftforge.common.MinecraftForge;

public class BlockRuneore extends Block
{
    public BlockRuneore(int i, int j)
    {
        super(i, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        MinecraftForge.setBlockHarvestLevel(mod_BlocksGalore.Runeore, 0, "pickaxe", 3);
    }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return mod_BlocksGalore.Runeore.blockID;
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
           
            {
            this.blockIcon = ir.registerIcon("Runeore");
            }
    }
}
