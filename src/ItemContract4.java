package net.minecraft.src;



import java.io.ByteArrayOutputStream;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;

import java.io.DataOutputStream;
import java.util.Random;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;



public class ItemContract4 extends Item {

	public static int counter = 0;
	Random r = new Random();



	public ItemContract4(int i) {
		super(i);
		
		
	       this.setCreativeTab(CreativeTabs.tabMaterials);
		
	}


	 public static Vec3 getPosition(float par1, EntityPlayer entityplayer)
	    {
	        if (par1 == 1.0F)
	        {
	            return Vec3.fakePool.getVecFromPool( entityplayer.posX,  entityplayer.posY,  entityplayer.posZ);
	        }
	        else
	        {
	            double var2 =  entityplayer.prevPosX + ( entityplayer.posX -  entityplayer.prevPosX) * (double)par1;
	            double var4 =  entityplayer.prevPosY + ( entityplayer.posY -  entityplayer.prevPosY) * (double)par1;
	            double var6 =  entityplayer.prevPosZ + ( entityplayer.posZ -  entityplayer.prevPosZ) * (double)par1;
	            return Vec3.fakePool.getVecFromPool(var2, var4, var6);
	        }
	    }

	
	public static MovingObjectPosition rayTrace(double par1, float par3, EntityPlayer entityplayer)
	    {
	        Vec3 var4 = ItemContract4.getPosition(par3, entityplayer);
	        Vec3 var5 = entityplayer.getLook(par3);
	        Vec3 var6 = var4.addVector(var5.xCoord * par1, var5.yCoord * par1, var5.zCoord * par1);
	        return entityplayer.worldObj.clip(var4, var6);
	    }
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world,
			EntityPlayer entityplayer){
		if(!world.isRemote && itemstack.getItemDamage() == 0)
	{
		if (itemstack.getItemDamage() == 0){
			MovingObjectPosition movingobjectposition = ItemContract4.rayTrace(
					250.0D, 1.0F, entityplayer);
			if (movingobjectposition == null) {
				return itemstack;
			}
			Vec3 vec3d = movingobjectposition.hitVec;
			double x = vec3d.xCoord;
			double y = vec3d.yCoord;
			double z = vec3d.zCoord;
			int i = MathHelper.floor_double(x);
			int j = MathHelper.floor_double(y);
			int k = MathHelper.floor_double(z);
			EntityHeroKnight entityspawning = new EntityHeroKnight(world);
	          entityspawning.setPosition(x, y, z);
			world.spawnEntityInWorld(entityspawning);
		
			
		    --itemstack.stackSize;
				  
				 
				
			
			  // entityplayer.capabilities.disableDamage = true;
		}
		return itemstack;}
		return itemstack;
	}
	
	
	

		

	

	public void onUpdate(ItemStack itemstack, World world, Entity entity,
			int i, boolean flag) {
		if (itemstack.getItemDamage() > 0) {
			itemstack.damageItem(-1, (EntityLiving) entity);
		}
	}
	  @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister ir)
	    {
	            {
	            this.itemIcon = ir.registerIcon("contract");
	            }
	    }
}