package net.minecraft.src;
import java.util.Random;
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

public class BlockYewleaf extends BlockLeavesBase
{
        private int baseIndexInPNG;
        int adjacentTreeBlocks[];
        
        protected BlockYewleaf(int i, int j)
        {
                super(i, Material.leaves, false);
                setTickRandomly(true);
                this.setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public int getBlockColor()
        {
                double d = 0.5D;
                double d1 = 1.0D;
                return 0;
        }

        public void onBlockRemoval(World world, int i, int j, int k)
        {
                int l = 1;
                int i1 = l + 1;
                if(world.checkChunksExist(i - i1, j - i1, k - i1, i + i1, j + i1, k + i1))
                {
                        for(int j1 = -l; j1 <= l; j1++)
                        {
                                for(int k1 = -l; k1 <= l; k1++)
                                {
                                        for(int l1 = -l; l1 <= l; l1++)
                                        {
                                                int i2 = world.getBlockId(i + j1, j + k1, k + l1);
                                                if(i2 == mod_YewTree.Yewsapling.blockID)
                                                {
                                                        int j2 = world.getBlockMetadata(i + j1, j + k1, k + l1);
                                                        world.setBlock(i + j1, j + k1, k + l1, j2 | 8);
                                                }
                                        }

                                }

                        }

                }
        }
        public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
        {
            if (!par1World.isRemote)
            {
                byte var8 = 20;

                if ((par5 & 3) == 3)
                {
                    var8 = 40;
                }

                if (par1World.rand.nextInt(var8) == 0)
                {
                    int var9 = this.idDropped(par5, par1World.rand, par7);
                    this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(var9, 1, this.damageDropped(par5)));
                }

                if ((par5 & 3) == 0 && par1World.rand.nextInt(200) == 0)
                {
                    this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(mod_YewTree.Yewlog, 1, 0));
                }
            }
        }
        public void updateTick(World world, int i, int j, int k, Random random)
        {
                if(world.isRemote)
                {
                        return;
                }
                int l = world.getBlockMetadata(i, j, k);
                if((l & 8) != 0 && (l & 4) == 0)
                {
                        byte byte0 = 4;
                        int i1 = byte0 + 1;
                        byte byte1 = 32;
                        int j1 = byte1 * byte1;
                        int k1 = byte1 / 2;
                        if(adjacentTreeBlocks == null)
                        {
                                adjacentTreeBlocks = new int[byte1 * byte1 * byte1];
                        }
                        if(world.checkChunksExist(i - i1, j - i1, k - i1, i + i1, j + i1, k + i1))
                        {
                                for(int l1 = -byte0; l1 <= byte0; l1++)
                                {
                                        for(int k2 = -byte0; k2 <= byte0; k2++)
                                        {
                                                for(int i3 = -byte0; i3 <= byte0; i3++)
                                                {
                                                        int k3 = world.getBlockId(i + l1, j + k2, k + i3);
                                                        if(k3 == mod_YewTree.Yewlog.blockID)
                                                        {
                                                                adjacentTreeBlocks[(l1 + k1) * j1 + (k2 + k1) * byte1 + (i3 + k1)] = 0;
                                                                continue;
                                                        }
                                                        if(k3 == mod_YewTree.Yewleaf.blockID)
                                                        {
                                                                adjacentTreeBlocks[(l1 + k1) * j1 + (k2 + k1) * byte1 + (i3 + k1)] = -2;
                                                        } else
                                                        {
                                                                adjacentTreeBlocks[(l1 + k1) * j1 + (k2 + k1) * byte1 + (i3 + k1)] = -1;
                                                        }
                                                }

                                        }

                                }

                                for(int i2 = 1; i2 <= 4; i2++)
                                {
                                        for(int l2 = -byte0; l2 <= byte0; l2++)
                                        {
                                                for(int j3 = -byte0; j3 <= byte0; j3++)
                                                {
                                                        for(int l3 = -byte0; l3 <= byte0; l3++)
                                                        {
                                                                if(adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + (l3 + k1)] != i2 - 1)
                                                                {
                                                                        continue;
                                                                }
                                                                if(adjacentTreeBlocks[((l2 + k1) - 1) * j1 + (j3 + k1) * byte1 + (l3 + k1)] == -2)
                                                                {
                                                                        adjacentTreeBlocks[((l2 + k1) - 1) * j1 + (j3 + k1) * byte1 + (l3 + k1)] = i2;
                                                                }
                                                                if(adjacentTreeBlocks[(l2 + k1 + 1) * j1 + (j3 + k1) * byte1 + (l3 + k1)] == -2)
                                                                {
                                                                        adjacentTreeBlocks[(l2 + k1 + 1) * j1 + (j3 + k1) * byte1 + (l3 + k1)] = i2;
                                                                }
                                                                if(adjacentTreeBlocks[(l2 + k1) * j1 + ((j3 + k1) - 1) * byte1 + (l3 + k1)] == -2)
                                                                {
                                                                        adjacentTreeBlocks[(l2 + k1) * j1 + ((j3 + k1) - 1) * byte1 + (l3 + k1)] = i2;
                                                                }
                                                                if(adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1 + 1) * byte1 + (l3 + k1)] == -2)
                                                                {
                                                                        adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1 + 1) * byte1 + (l3 + k1)] = i2;
                                                                }
                                                                if(adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + ((l3 + k1) - 1)] == -2)
                                                                {
                                                                        adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + ((l3 + k1) - 1)] = i2;
                                                                }
                                                                if(adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + (l3 + k1 + 1)] == -2)
                                                                {
                                                                        adjacentTreeBlocks[(l2 + k1) * j1 + (j3 + k1) * byte1 + (l3 + k1 + 1)] = i2;
                                                                }
                                                        }

                                                }

                                        }

                                }

                        }
                        int j2 = adjacentTreeBlocks[k1 * j1 + k1 * byte1 + k1];
                        if(j2 >= 0)
                        {
                               // world.setBlock(i, j, k, l & -9);
                        } else
                        {
                           //     removeLeaves(world, i, j, k);
                        }
                }
        }

        private void removeLeaves(World world, int i, int j, int k)
        {
                dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
                world.setBlock(i, j, k, 0);
        }

        public int quantityDropped(Random random)
        {
                return random.nextInt(20) != 0 ? 0 : 1;
        }

        public int idDropped(int i, Random random, int j)
        {
                return mod_YewTree.Yewsapling.blockID;
        }

        public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l)
        {
                if (!world.isRemote && entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.shears.itemID)
                {
                        entityplayer.addStat(StatList.mineBlockStatArray[blockID], 1);
                        dropBlockAsItem_do(world, i, j, k, new ItemStack(Block.leaves.blockID, 1, l & 3));
                }
                else
                {
                        super.harvestBlock(world, entityplayer, i, j, k, l);
                }
        }

        public int damageDropped(int i)
        {
                return i & 3;
        }

        public int getRenderBlockPass()
        {
            return 0;
        }

        /**
         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
         */
        public boolean isOpaqueCube()
        {
            return false;
        }

        /**
         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
         */
        public boolean renderAsNormalBlock()
        {
            return false;
        }

        public void setGraphicsLevel(boolean flag)
        {
                graphicsLevel = flag;
        }
        
        public void onEntityWalking(World world, int i, int j, int k, Entity entity)
        {
                super.onEntityWalking(world, i, j, k, entity);
        }
        
     

       

        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister ir)
        {
               
                {
                this.blockIcon = ir.registerIcon("yewleaf");
                }
        }
}