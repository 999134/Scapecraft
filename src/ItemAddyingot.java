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
import net.minecraft.world.World;

public class ItemAddyingot extends Item {

public ItemAddyingot(int i)
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
	
		return itemstack;}
	}
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IconRegister ir)
  {
          if(itemID == mod_BlocksGalore.Addyingot.itemID)
          {
          this.itemIcon = ir.registerIcon("Addyingot");
          }
  }
	}
