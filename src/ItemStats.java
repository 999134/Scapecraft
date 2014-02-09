package net.minecraft.src;
import java.util.Random;

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

public class ItemStats extends Item {

public ItemStats(int i)
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
		ExtendedPlayer props = ExtendedPlayer.get(entityplayer);
		ExtendedPlayer propsa = ExtendedPlayer.get(entityplayer);
		if (world.isRemote){
		if (props.getCombatxp() >= 0*2 && props.getCombatxp() < 5*2) {entityplayer.addChatMessage("Your current combat level is 1, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 5*2 && props.getCombatxp() < 15*2) {	entityplayer.addChatMessage("Your current combat level is 2, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 15*2 && props.getCombatxp() < 30*2) {	entityplayer.addChatMessage("Your current combat level is 3, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 30*2 && props.getCombatxp() < 50*2) {	entityplayer.addChatMessage("Your current combat level is 4, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 50*2 && props.getCombatxp() < 75*2) {	entityplayer.addChatMessage("Your current combat level is 5, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 75*2 && props.getCombatxp() < 90*2) {	entityplayer.addChatMessage("Your current combat level is 6, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 90*2 && props.getCombatxp() < 112*2) {	entityplayer.addChatMessage("Your current combat level is 7, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 112*2 && props.getCombatxp() < 124*2) {	entityplayer.addChatMessage("Your current combat level is 8, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 124*2 && props.getCombatxp() < 138*2) {	entityplayer.addChatMessage("Your current combat level is 9, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 138*2 && props.getCombatxp() < 151*2) {	entityplayer.addChatMessage("Your current combat level is 10, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 151*2 && props.getCombatxp() < 168*2) {	entityplayer.addChatMessage("Your current combat level is 11, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 168*2 && props.getCombatxp() < 185*2) {	entityplayer.addChatMessage("Your current combat level is 12, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 185*2 && props.getCombatxp() < 204*2) {	entityplayer.addChatMessage("Your current combat level is 13, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 204*2 && props.getCombatxp() < 226*2) {	entityplayer.addChatMessage("Your current combat level is 14, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 226*2 && props.getCombatxp() < 249*2) {	entityplayer.addChatMessage("Your current combat level is 15, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 498 && props.getCombatxp() < 600) {	entityplayer.addChatMessage("Your current combat level is 16, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 600 && props.getCombatxp() < 720) {	entityplayer.addChatMessage("Your current combat level is 17, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 720 && props.getCombatxp() < 850) {	entityplayer.addChatMessage("Your current combat level is 18, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 850 && props.getCombatxp() < 950) {	entityplayer.addChatMessage("Your current combat level is 19, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 950 && props.getCombatxp() < 1060) {	entityplayer.addChatMessage("Your current combat level is 20, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 1060 && props.getCombatxp() < 1200) {	entityplayer.addChatMessage("Your current combat level is 21, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 1200 && props.getCombatxp() < 1700) {	entityplayer.addChatMessage("Your current combat level is 22, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 1700 && props.getCombatxp() < 2300) {	entityplayer.addChatMessage("Your current combat level is 23, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 2300 && props.getCombatxp() < 3000) {	entityplayer.addChatMessage("Your current combat level is 24, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 3000 && props.getCombatxp() < 3800) {	entityplayer.addChatMessage("Your current combat level is 25, and your current xp is "+String.valueOf(props.getCombatxp()));}		
		else if (props.getCombatxp() >= 3800 && props.getCombatxp() < 4700) {	entityplayer.addChatMessage("Your current combat level is 26, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 4700 && props.getCombatxp() < 6100) {	entityplayer.addChatMessage("Your current combat level is 27, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 6100 && props.getCombatxp() < 7320) {	entityplayer.addChatMessage("Your current combat level is 28, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 7320 && props.getCombatxp() < 8784) {	entityplayer.addChatMessage("Your current combat level is 29, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 8784 && props.getCombatxp() < 10540) {  entityplayer.addChatMessage("Your current combat level is 30, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 10540 && props.getCombatxp() < 12648) { entityplayer.addChatMessage("Your current combat level is 31, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 12648 && props.getCombatxp() < 15178) {entityplayer.addChatMessage("Your current combat level is 32, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 15178 && props.getCombatxp() < 18214) {entityplayer.addChatMessage("Your current combat level is 33, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 18214 && props.getCombatxp() < 21857) {entityplayer.addChatMessage("Your current combat level is 34, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 21857 && props.getCombatxp() < 26228) {entityplayer.addChatMessage("Your current combat level is 35, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 26228 && props.getCombatxp() < 31474) {entityplayer.addChatMessage("Your current combat level is 36, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 31474 && props.getCombatxp() < 37769) {entityplayer.addChatMessage("Your current combat level is 37, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 37769 && props.getCombatxp() < 45323) {entityplayer.addChatMessage("Your current combat level is 38, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 45323 && props.getCombatxp() < 54388) {entityplayer.addChatMessage("Your current combat level is 39, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 54388 && props.getCombatxp() < 65265) {entityplayer.addChatMessage("Your current combat level is 40, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 65265 && props.getCombatxp() < 78319) {entityplayer.addChatMessage("Your current combat level is 41, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 78319 && props.getCombatxp() < 93982) {entityplayer.addChatMessage("Your current combat level is 42, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 93982 && props.getCombatxp() < 112779) {entityplayer.addChatMessage("Your current combat level is 43, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 112779 && props.getCombatxp() < 135335) {entityplayer.addChatMessage("Your current combat level is 44, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 135335 && props.getCombatxp() < 162402) {entityplayer.addChatMessage("Your current combat level is 45, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 162402 && props.getCombatxp() < 194822) {entityplayer.addChatMessage("Your current combat level is 46, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 233859 && props.getCombatxp() < 233859) {entityplayer.addChatMessage("Your current combat level is 47, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 280631 && props.getCombatxp() < 336757) {entityplayer.addChatMessage("Your current combat level is 48, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 336757 && props.getCombatxp() < 404108) {entityplayer.addChatMessage("Your current combat level is 49, and your current xp is "+String.valueOf(props.getCombatxp()));}
		else if (props.getCombatxp() >= 404108) {	entityplayer.addChatMessage("Your current combat level is 50, and your current xp is "+String.valueOf(props.getCombatxp())+" You have maxed out this level!");}		
		else if (props.getCombatxp() <= 0) {	entityplayer.addChatMessage("Your current combat level is 0, and your current xp is "+String.valueOf(props.getCombatxp()));}
		
		
		if (propsa.getAgilityxp() >= 0*2 && propsa.getAgilityxp() < 5*2) {entityplayer.addChatMessage("Your current agility level is 1, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 5*2 && propsa.getAgilityxp() < 15*2) {	entityplayer.addChatMessage("Your current agility level is 2, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 15*2 && propsa.getAgilityxp() < 30*2) {	entityplayer.addChatMessage("Your current agility level is 3, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 30*2 && propsa.getAgilityxp() < 50*2) {	entityplayer.addChatMessage("Your current agility level is 4, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 50*2 && propsa.getAgilityxp() < 75*2) {	entityplayer.addChatMessage("Your current agility level is 5, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 75*2 && propsa.getAgilityxp() < 90*2) {	entityplayer.addChatMessage("Your current agility level is 6, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 90*2 && propsa.getAgilityxp() < 112*2) {	entityplayer.addChatMessage("Your current agility level is 7, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 112*2 && propsa.getAgilityxp() < 124*2) {	entityplayer.addChatMessage("Your current agility level is 8, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 124*2 && propsa.getAgilityxp() < 138*2) {	entityplayer.addChatMessage("Your current agility level is 9, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 138*2 && propsa.getAgilityxp() < 151*2) {	entityplayer.addChatMessage("Your current agility level is 10, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 151*2 && propsa.getAgilityxp() < 168*2) {	entityplayer.addChatMessage("Your current agility level is 11, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 168*2 && propsa.getAgilityxp() < 185*2) {	entityplayer.addChatMessage("Your current agility level is 12, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 185*2 && propsa.getAgilityxp() < 204*2) {	entityplayer.addChatMessage("Your current agility level is 13, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 204*2 && propsa.getAgilityxp() < 226*2) {	entityplayer.addChatMessage("Your current agility level is 14, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 226*2 && propsa.getAgilityxp() < 249*2) {	entityplayer.addChatMessage("Your current agility level is 15, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 498 && propsa.getAgilityxp() < 600) {	entityplayer.addChatMessage("Your current agility level is 16, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 600 && propsa.getAgilityxp() < 720) {	entityplayer.addChatMessage("Your current agility level is 17, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 720 && propsa.getAgilityxp() < 850) {	entityplayer.addChatMessage("Your current agility level is 18, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 850 && propsa.getAgilityxp() < 950) {	entityplayer.addChatMessage("Your current agility level is 19, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 950 && propsa.getAgilityxp() < 1060) {	entityplayer.addChatMessage("Your current agility level is 20, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 1060 && propsa.getAgilityxp() < 1200) {	entityplayer.addChatMessage("Your current agility level is 21, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 1200 && propsa.getAgilityxp() < 1700) {	entityplayer.addChatMessage("Your current agility level is 22, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 1700 && propsa.getAgilityxp() < 2300) {	entityplayer.addChatMessage("Your current agility level is 23, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 2300 && propsa.getAgilityxp() < 3000) {	entityplayer.addChatMessage("Your current agility level is 24, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 3000 && propsa.getAgilityxp() < 3800) {	entityplayer.addChatMessage("Your current agility level is 25, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}		
		else if (propsa.getAgilityxp() >= 3800 && propsa.getAgilityxp() < 4700) {	entityplayer.addChatMessage("Your current agility level is 26, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 4700 && propsa.getAgilityxp() < 6100) {	entityplayer.addChatMessage("Your current agility level is 27, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 6100 && propsa.getAgilityxp() < 7320) {	entityplayer.addChatMessage("Your current agility level is 28, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 7320 && propsa.getAgilityxp() < 8784) {	entityplayer.addChatMessage("Your current agility level is 29, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 8784 && propsa.getAgilityxp() < 10540) {  entityplayer.addChatMessage("Your current agility level is 30, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 10540 && propsa.getAgilityxp() < 12648) { entityplayer.addChatMessage("Your current agility level is 31, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 12648 && propsa.getAgilityxp() < 15178) {entityplayer.addChatMessage("Your current agility level is 32, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 15178 && propsa.getAgilityxp() < 18214) {entityplayer.addChatMessage("Your current agility level is 33, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 18214 && propsa.getAgilityxp() < 21857) {entityplayer.addChatMessage("Your current agility level is 34, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 21857 && propsa.getAgilityxp() < 26228) {entityplayer.addChatMessage("Your current agility level is 35, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 26228 && propsa.getAgilityxp() < 31474) {entityplayer.addChatMessage("Your current agility level is 36, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 31474 && propsa.getAgilityxp() < 37769) {entityplayer.addChatMessage("Your current agility level is 37, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 37769 && propsa.getAgilityxp() < 45323) {entityplayer.addChatMessage("Your current agility level is 38, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 45323 && propsa.getAgilityxp() < 54388) {entityplayer.addChatMessage("Your current agility level is 39, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 54388 && propsa.getAgilityxp() < 65265) {entityplayer.addChatMessage("Your current agility level is 40, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 65265 && propsa.getAgilityxp() < 78319) {entityplayer.addChatMessage("Your current agility level is 41, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 78319 && propsa.getAgilityxp() < 93982) {entityplayer.addChatMessage("Your current agility level is 42, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 93982 && propsa.getAgilityxp() < 112779) {entityplayer.addChatMessage("Your current agility level is 43, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 112779 && propsa.getAgilityxp() < 135335) {entityplayer.addChatMessage("Your current agility level is 44, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 135335 && propsa.getAgilityxp() < 162402) {entityplayer.addChatMessage("Your current agility level is 45, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 162402 && propsa.getAgilityxp() < 194822) {entityplayer.addChatMessage("Your current agility level is 46, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 233859 && propsa.getAgilityxp() < 233859) {entityplayer.addChatMessage("Your current agility level is 47, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 280631 && propsa.getAgilityxp() < 336757) {entityplayer.addChatMessage("Your current agility level is 48, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 336757 && propsa.getAgilityxp() < 404108) {entityplayer.addChatMessage("Your current agility level is 49, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		else if (propsa.getAgilityxp() >= 404108) {	entityplayer.addChatMessage("Your current agility level is 50, and your current xp is "+String.valueOf(propsa.getAgilityxp())+" You have maxed out this level!");}		
		else if (propsa.getAgilityxp() <= 0) {	entityplayer.addChatMessage("Your current agility level is 0, and your current xp is "+String.valueOf(propsa.getAgilityxp()));}
		
		return itemstack;}
		return itemstack;}
	}
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IconRegister ir)
  {
          {
          this.itemIcon = ir.registerIcon("Stats");
          }
  }
	}
