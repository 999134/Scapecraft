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

public class Blockcabbage extends Block
{
        protected Blockcabbage(int i, int j)
        {
                super(i, Material.plants);
             
                setTickRandomly(true);
                float f = 0.2F;
                setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3F, 0.5F + f);
                this.setCreativeTab(CreativeTabs.tabBlock);
        }

        public boolean canPlaceBlockAt(World world, int i, int j, int k)
        {
                return super.canPlaceBlockAt(world, i, j, k) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
        }

        protected boolean canThisPlantGrowOnThisBlockID(int i)
        {
                return i == Block.grass.blockID || i == Block.dirt.blockID || i == Block.tilledField.blockID || i ==mod_BlocksGalore.CabbageSpawn.blockID;
        }

        public void onNeighborBlockChange(World world, int i, int j, int k, int l)
        {
                super.onNeighborBlockChange(world, i, j, k, l);
                checkFlowerChange(world, i, j, k);
        }

        public void updateTick(World world, int i, int j, int k, Random random)
        {
                checkFlowerChange(world, i, j, k);
        }

        protected final void checkFlowerChange(World world, int i, int j, int k)
        {
                if (!canBlockStay(world, i, j, k))
                {
                        dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
                        world.setBlock(i, j, k, 0);
                }
        }

        public boolean canBlockStay(World world, int i, int j, int k)
        {
                return (world.getFullBlockLightValue(i, j, k) >= 8 || world.canBlockSeeTheSky(i, j, k)) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
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
                this.blockIcon = ir.registerIcon("cabbage");
                }
        }
        
     }
