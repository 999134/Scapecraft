package net.minecraft.src;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.World;



public class TileEntityFireBlock extends BlockContainer {

        //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
        //And the second three are the top-right corner.
        public TileEntityFireBlock(int id) {
                super(id, Material.rock);
                this.setCreativeTab(CreativeTabs.tabBlock);
                this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 0.5F, 0.6F);
        }

        //Make sure you set this as your TileEntity class relevant for the block!
        @Override
        public TileEntity createNewTileEntity(World world) {
                return new TileEntityFireEntity();
        }
   

        //You don't want the normal render type, or it wont render properly.
        @Override
        public int getRenderType() {
                return -1;
        }
        
        //It's not an opaque cube, so you need this.
        @Override
        public boolean isOpaqueCube() {
                return false;
        }
        
        //It's not a normal block, so you need this too.
        public boolean renderAsNormalBlock() {
                return false;
        }
        public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
        {
            
          
                float f = (float)par2 + 0.5F;
                float f1 = (float)par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
                float f2 = (float)par4 + 0.5F;
                float f3 = 0.52F;
                float f4 = par5Random.nextFloat() * 0.6F - 0.3F;

              
                    par1World.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                    par1World.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                    par1World.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                    par1World.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                    par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                    par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);              
                    par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                    par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
        }
        //This is the icon to use for showing the block in your hand.
        public void registerIcons(IconRegister icon) {
                this.blockIcon = icon.registerIcon("Fire");
        }

        public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
        {
            par5Entity.motionY = 0.55D;
            par5Entity.motionZ = 0.4D;
        }
        
}