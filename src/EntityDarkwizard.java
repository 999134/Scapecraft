package net.minecraft.src;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityDarkwizard extends EntityMob
{
	private int field_40152_d;
	private float moveSpeed;

    public EntityDarkwizard(World par1World)
    {
        super(par1World);
  
        this.moveSpeed = 0.4F;
        this.isImmuneToFire = true;
 
      


    }


    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(60.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.350D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(5.0D);
	    }
	
    
    
    public String getEntityName()
    {
      return "Dark Wizard";
    }
    
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    
  
    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

      
    }



 
    protected String getHurtSound()
    {
        return "mob.villager.defaulthurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.villager.defaultdeath";
    }
    /**
     * Plays step sound at given x, y, z for the entity
     */
    protected void playStepSound(int var1, int var2, int var3, int var4)
    {
        this.worldObj.playSoundAtEntity(this, "mob.villager.default", 0.15F, 1.0F);
    }

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity par1Entity, float par2)
    {
    	 if (attackTime <= 0 && par2 < 2.0F && par1Entity.boundingBox.maxY > boundingBox.minY && par1Entity.boundingBox.minY < boundingBox.maxY)
         {
                 attackTime = 20;
                 attackEntityAsMob(par1Entity);
         }
         else if (par2 < 30F)
         {
                 double d = par1Entity.posX - posX;
                 double d1 = (par1Entity.boundingBox.minY + (double)(par1Entity.height / 2.0F)) - (posY + (double)(height / 2.0F));
                 double d2 = par1Entity.posZ - posZ;

                 if (attackTime == 0)
                 {
                         field_40152_d++;

                         if (field_40152_d == 1)
                         {
                                 attackTime = 60;
                                 //func_40148_a(true); /* THIS METHOD MAY DIFFER. CHECK NEAR BOTTOM OF CLASS */
                         }
                         else if (field_40152_d <= 4)
                         {
                                 attackTime = 6;
                         }
                         else
                         {
                                 attackTime = 100;
                                 field_40152_d = 0;
                                 //func_40148_a(false);
                         }

                         if (field_40152_d > 1)
                         {
                                 float f = MathHelper.sqrt_float(par2) * 0.5F;
                                 worldObj.playAuxSFXAtEntity(null, 1009, (int)posX, (int)posY, (int)posZ, 0);

                                 for (int i = 0; i < 1; i++)
                                 {
                                         EntityLargeFireball entitylargefireball = new EntityLargeFireball(worldObj, this, d + rand.nextGaussian() * (double)f, d1, d2 + rand.nextGaussian() * (double)f);
                                         entitylargefireball.posY = posY + (double)(height / 2.0F) + 0.5D;
                                         worldObj.spawnEntityInWorld(entitylargefireball);
                                 }
                         }
                 }

                 rotationYaw = (float)((Math.atan2(d2, d) * 180D) / Math.PI) - 90F;
                 hasAttacked = true;
         }
    }

    
    
    
    protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(600) + 1;
        int quickvar1 = rand.nextInt(1100) + 1;
        int quickvar11 = rand.nextInt(5000) + 1;
        int quickvar2 = rand.nextInt(8) + 1;
        int quickvar3 = rand.nextInt(8) + 1;
        int quickvar4 = rand.nextInt(8) + 1;
        int quickvar5 = rand.nextInt(8) + 1;
        int quickvar6 = rand.nextInt(8) + 1;
        int quickvar7 = rand.nextInt(8) + 1;
        int quickvar8 = rand.nextInt(8) + 1;
        int quickvar9 = rand.nextInt(8) + 1;
        int quickvar10 = rand.nextInt(8) + 1;
        int quickvar12 = rand.nextInt(8) + 1;
        
  
         
        if(quickvar <= 1){
         
        	entityDropItem(new ItemStack(mod_BlocksGalore.Zammystaff), 1);
         
        }
        if(quickvar1 <= 1){
            
        	entityDropItem(new ItemStack(mod_BlocksGalore.Guthixstaff), 1);
         
        }
    if(quickvar11 <= 1){
            
        	entityDropItem(new ItemStack(mod_BlocksGalore.ZamorakHilt), 1);
         
        }
    if(quickvar12 <= 1){
        
    	entityDropItem(new ItemStack(Item.goldNugget), 1);
     
    }
    if(quickvar3 <= 1){entityDropItem(new ItemStack(mod_Flower.Vtab), 1);}
    if(quickvar4 <= 1){entityDropItem(new ItemStack(mod_Flower.Ftab), 1);}
    if(quickvar5 <= 1){entityDropItem(new ItemStack(mod_Flower.Btab), 1);}
    if(quickvar6 <= 1){entityDropItem(new ItemStack(mod_Flower.TDtab), 1);}
    if(quickvar7 <= 1){entityDropItem(new ItemStack(mod_Flower.Ctab), 1);}
    if(quickvar8 <= 1){entityDropItem(new ItemStack(mod_Flower.Bandostab), 1);}
    if(quickvar9 <= 1){entityDropItem(new ItemStack(mod_Flower.Htab), 1);}
    if(quickvar10 <= 1){entityDropItem(new ItemStack(mod_Flower.Ltab), 1);}
    int XP = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.XPORB), 1);}
        }
    
    
    public int getAttackStrength(Entity par1Entity)
    {
        return 5;
    }
      
    public boolean isBurning()
    {
        return false;
    }

   

    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    public boolean isPotionApplicable(PotionEffect par1PotionEffect)
    {
        return par1PotionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(par1PotionEffect);
    }

    
    public void onLivingUpdate()
    {
      	if(ticksExisted > 180 * 20) setDead(); 
        	super.onLivingUpdate();
        }
        

    
    private static final ItemStack defaultHeldItem;
    public ItemStack getHeldItem()
         {
                 return defaultHeldItem;
         }

 static
         {
                 defaultHeldItem = new ItemStack(mod_BlocksGalore.Zammystaff, 1);
         }



 

    
	


}
