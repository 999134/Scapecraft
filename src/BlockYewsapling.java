package net.minecraft.src;

import java.util.Random;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
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
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockYewsapling extends BlockFlower
{

                protected BlockYewsapling(int i, int j)
                {
                                super(i);
                                float f = 0.4F;
                                setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
                }

                public void updateTick(World world, int i, int j, int k, Random random)
                {
                                if(world.isRemote)
                                {
                                                return;
                                }
                                super.updateTick(world, i, j, k, random);
                                if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(1) == 0)
                                {
                                	growTree(world, i, j, k, random);
                                }
                }

                public void growTree(World world, int i, int j, int k, Random random)
                {
                                int l = world.getBlockMetadata(i, j, k) & 3;
                                world.setBlock(i, j, k, 0);
                                Object obj = null;
                                if(l == 1)
                                {
                                                obj = new WorldGenTaiga2(true);
                                } else
                                if(l == 2)
                                {
                                                obj = new WorldGenForest(true);
                                }
                                else
                                {
                                                obj = new WorldGenYewtree();
                                                if (random.nextInt(10) == 0)
                                                {
                                                                obj = new WorldGenBigTree(true);
                                                }
                                }
                                if (!((WorldGenerator) (obj)).generate(world, random, i, j, k))
                                {
                                    world.setBlock(i, j, k, this.blockID, l, 4);;
                                }
                }

                public int idDropped(int i, Random random)
                {
                                return mod_YewTree.Yewsapling.blockID;
                }

        public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
        {
                                        ItemStack equipped = entityplayer.getCurrentEquippedItem();
                                        if (equipped == null)
                                        {
                                                                        return false;
                                        }
                                        if ((equipped.getItem() == Item.dyePowder) && (equipped.getItemDamage() == 15)) //if bone meal
                                        {
                                                                        growTree(world, i, j, k, world.rand);
                                                                        equipped.stackSize -= 1;
                                        }
                                        return false;
        }

        
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister ir)
        {
               
                {
                this.blockIcon = ir.registerIcon("yewsapling");
                }
        }
        
}