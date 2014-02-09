package net.minecraft.src;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModFood extends ItemFood
{
   public final int field_35430_a = 32;

   /** The amount this food item heals the player. */
   private final int healAmount;
   private final float saturationModifier;

   /** Whether wolves like this food (true for raw and cooked porkchop). */
   private final boolean isWolfsFavoriteMeat;

   /**
    * If this field is true, the food can be consumed even if the player don't need to eat.
    */
   private boolean alwaysEdible;

   //Amount of hearts gained (1 = 0.5 hearts)
   private final int hearts;

   /**
    * represents the potion effect that will occurr upon eating this food. Set by setPotionEffect
    */
   private int potionId;

   /** set by setPotionEffect */
   private int potionDuration;

   /** set by setPotionEffect */
   private int potionAmplifier;

   /** probably of the set potion effect occurring */
   private float potionEffectProbability;

   public ItemModFood(int par1, int par2, float par3, boolean par4, int par5)
   {
       super(par1, par2, par5, par4);
       healAmount = par2;
       isWolfsFavoriteMeat = par4;
       saturationModifier = par3;
       hearts = par5;
   }

   public ItemModFood(int par1, int par2, int par5 ,boolean par3)
   {
       this(par1, par2, 0.6F, par3, par5);
   }

   public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
   {
       par1ItemStack.stackSize--;
       par3EntityPlayer.getFoodStats().addStats(this);
       par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);

       if (!par2World.isRemote && potionId > 0 && par2World.rand.nextFloat() < potionEffectProbability)
       {
           par3EntityPlayer.addPotionEffect(new PotionEffect(potionId, potionDuration * 20, potionAmplifier));
       }
       par3EntityPlayer.heal(hearts);

       return par1ItemStack;
   }

   /**
    * How long it takes to use or consume an item
    */
   public int getMaxItemUseDuration(ItemStack par1ItemStack)
   {
       return 32;
   }

   /**
    * returns the action that specifies what animation to play when the items is being used
    */
   public EnumAction getItemUseAction(ItemStack par1ItemStack)
   {
       return EnumAction.eat;
   }

   /**
    * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
    */
   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
   {
       if (par3EntityPlayer.canEat(alwaysEdible))
       {
           par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
       }

       return par1ItemStack;
   }

   public int getHealAmount()
   {
       return healAmount;
   }

   /**
    * gets the saturationModifier of the ItemFood
    */
   public float getSaturationModifier()
   {
       return saturationModifier;
   }

   /**
    * Whether wolves like this food (true for raw and cooked porkchop).
    */
   public boolean isWolfsFavoriteMeat()
   {
       return isWolfsFavoriteMeat;
   }

   /**
    * sets a potion effect on the item. Args: int potionId, int duration (will be multiplied by 20), int amplifier,
    * float probability of effect happening
    */
   public ItemFood setPotionEffect(int par1, int par2, int par3, float par4)
   {
       potionId = par1;
       potionDuration = par2;
       potionAmplifier = par3;
       potionEffectProbability = par4;
       return this;
   }

   /**
    * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
    */
   public ItemFood setAlwaysEdible()
   {
       alwaysEdible = true;
       return this;
   }

 
} 