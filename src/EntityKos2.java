package net.minecraft.src;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityKos2 extends EntityMob
{
    private float moveSpeed;


	public EntityKos2(World par1World)
    {
        super(par1World);
    
        this.moveSpeed = 0.55F;
        this.isImmuneToFire = true;
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackDragon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackDragon.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWolf.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityOcelot.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHellhound.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWhiteKnight.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWhiteKnight.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGreenDragon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGreenDragon.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGuard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGuard.class, this.moveSpeed, false));
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLavaBlock.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLavaBlock.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKQ.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWizard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWizard.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHeroKnight.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHeroKnight.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKing.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKing.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKingsGuard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKingsGuard.class, this.moveSpeed, false));
        
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTD.class, this.moveSpeed, false));

    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(500.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.70D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(45.0D);
    
    this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(0.6D);
	    }

	
    @Override
    protected boolean canDespawn()
    {
            return true;
    }

    
    public int getTotalArmorValue()
    {
        return 12;
    }

    public String getEntityName()
    {
      return "Koschei the Deathless Stage 2";
    }
    
    public boolean isAIEnabled()
    {
        return true;
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

  

    protected Entity findPlayerToAttack()
    {
        float var1 = this.getBrightness(1.0F);

        if (var1 < 0.5F)
        {
            double var2 = 16.0D;
            return this.worldObj.getClosestVulnerablePlayerToEntity(this, var2);
        }
        else
        {
            return null;
        }
    }

    /**
     * Returns the sound this mob makes while it's alive.
protected String getLivingSound()
    {
        return "mob.villager.default";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
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
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        if (super.attackEntityAsMob(par1Entity))
        {
            if (par1Entity instanceof EntityLivingBase)
            {
           

        
            	par1Entity.setFire(20);
                
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    private static final ItemStack defaultHeldItem;
    public ItemStack getHeldItem()
         {
                 return defaultHeldItem;
         }

 static
         {
                 defaultHeldItem = new ItemStack(mod_BlocksGalore.fremswordf, 1);
         }
    
    
    protected EntityKos3 createInstance()
    {
        return new EntityKos3(this.worldObj);
    }

    
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
    	  Entity entity;
    	  entity = par1DamageSource.getSourceOfDamage();
    	  if (entity instanceof EntityArrow)
          {
              return false;
          }
  
    	
    	   return super.attackEntityFrom(par1DamageSource, par2);
    }
      
 

    public void onDeath(DamageSource par1DamageSource) 
    {
    	if(!worldObj.isRemote)
    	{
    	  int j = 1;

          for (int k = 0; k < j; ++k)
          {
              float f = ((float)(k % 2) - 0.5F) * (float)1 / 4.0F;
              float f1 = ((float)(k / 2) - 0.5F) * (float)1 / 4.0F;
         
        EntityKos3 entityKos3 = this.createInstance();
    
             
             entityKos3.setLocationAndAngles(this.posX + (double)f, this.posY + 0.5D+1, this.posZ + (double)f1+4, this.rand.nextFloat() * 360.0F, 0.0F);
             this.worldObj.spawnEntityInWorld(entityKos3);
          }}
    }





    public boolean isPotionApplicable(PotionEffect par1PotionEffect)
    {
        return par1PotionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(par1PotionEffect);
    }
    public boolean isBurning()
    {
        return false;
    }

    
    protected EntityKos4 createInstance2()
    {
        return new EntityKos4(this.worldObj);
    }
    
    int spawnvar = 1;
    public void onLivingUpdate()
    {
    	++spawnvar;
    	
    	if (spawnvar >= 100){
      	if(!worldObj.isRemote)
    	{
    	  int j = 1;

          for (int k = 0; k < j; ++k)
          {
              float f = ((float)(k % 2) - 0.5F) * (float)1 / 4.0F;
              float f1 = ((float)(k / 2) - 0.5F) * (float)1 / 4.0F;
         
        EntityKos4 entityKos4 = this.createInstance2();
    
             
             entityKos4.setLocationAndAngles(this.posX + (double)f, this.posY + 0.5D+1, this.posZ + (double)f1+4, this.rand.nextFloat() * 360.0F, 0.0F);
             this.worldObj.spawnEntityInWorld(entityKos4);
          }}
      	
      	spawnvar = 0;
      	
        }
    	if(ticksExisted > 600 * 20) setDead(); 
    	super.onLivingUpdate();
    }

    
	


}
