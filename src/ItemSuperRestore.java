package net.minecraft.src;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSuperRestore extends Item {

public ItemSuperRestore(int i)
  {
   super(i);
   this.setCreativeTab(CreativeTabs.tabMaterials);
  
  }

  public boolean hasEffect(ItemStack itemstack)
  {
   return false;
  }

  public ItemStack onItemRightClick(ItemStack itemstack, World world,
			EntityPlayer entityplayer){
	
	{
		  if (!world.isRemote)
	        {
	            entityplayer.curePotionEffects(itemstack);
	        }

		  entityplayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 0));
		  entityplayer.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 600, 0));
			 
		--itemstack.stackSize;
		return itemstack;}
	}
  @SideOnly(Side.CLIENT)
  public void registerIcons(IconRegister ir)
  {
          {
          this.itemIcon = ir.registerIcon("superrestore");
          }
  }

	}
