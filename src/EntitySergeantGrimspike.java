package net.minecraft.src;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
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
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntitySergeantGrimspike extends EntityMob implements IRangedAttackMob
{
	private int field_40152_d;
	 private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 0.25F, 60, 10.0F);
	private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.31F, false);
	private float moveSpeed;

	public EntitySergeantGrimspike(World par1World)
    {
        super(par1World);

        this.moveSpeed = 0.3F;
        this.isImmuneToFire = true;
   
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos1.class, this.moveSpeed, false));
        
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos2.class, this.moveSpeed, false));
 
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos3.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWhiteKnight.class, 0, true));
     
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGreenDragon.class, 0, true));

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGuard.class, 0, true));

        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ2.class, 0, true));

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ.class, 0, true));

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWizard.class, 0, true));

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHeroKnight.class, 0, true));
   
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKing.class, 0, true));

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKingsGuard.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBarbarian.class, 0, true));

        if (par1World != null && !par1World.isRemote)
        	
        {
        	this.setCombatTask();
        }
        
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(50.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.7D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(12.0D);
	    }
	
    public String getEntityName()
    {
      return "Sergeant Grimspike";
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

    
    protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(15) + 1;
        int quickvar1 = rand.nextInt(10000) + 1;
        int quickvar2 = rand.nextInt(500) + 1;
        int quickvar3 = rand.nextInt(100) + 1;
        int quickvar4 = rand.nextInt(1000) + 1;
         
        if(quickvar <= 1){
         
        	entityDropItem(new ItemStack(Item.swordWood), 1);
         
        }
        if(quickvar1 <= 1){
            
        	entityDropItem(new ItemStack(mod_MagicBow.Crystalbow), 1);
         
        }
if(quickvar2 <= 1){
            
        	entityDropItem(new ItemStack(mod_phat.dragonBoots), 1);
         
        }
if(quickvar3 <= 2){
    
	entityDropItem(new ItemStack(mod_MagicTree.Magicfruit), 1);
 
}
if(quickvar4 <= 1){
    
	entityDropItem(new ItemStack(mod_BlocksGalore.shard1), 1);
 
}
        }
    public int getAttackStrength(Entity par1Entity)
    {
        return 1;
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
      	if(ticksExisted > 30 * 20) setDead(); 
        	super.onLivingUpdate();
        }
        

    
    public void setCombatTask()
    {
        this.tasks.removeTask(this.aiAttackOnCollide);
        this.tasks.removeTask(this.aiArrowAttack);
        ItemStack itemstack = this.getHeldItem();

       
        {
            this.tasks.addTask(4, this.aiArrowAttack);
        }
        
    }

    public boolean isBurning()
    {
        return false;
    }

   public void attackEntityWithRangedAttack(EntityLiving entityliving, float f) {
   	 EntityArrow var2 = new EntityArrow(this.worldObj, this, entityliving, 5.6F, 12.0F);

   	  
        this.worldObj.spawnEntityInWorld(var2);
   }

   @Override
   public void attackEntityWithRangedAttack(EntityLivingBase entitylivingbase,
   		float f) {
   	EntityArrow var2 = new EntityArrow(this.worldObj, this, entitylivingbase, 5.6F, 12.0F);

   	  
       this.worldObj.spawnEntityInWorld(var2);
   	
   }


       


}
