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
import net.minecraft.entity.effect.EntityLightningBolt;
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


public class EntityKos3 extends EntityMob
{
    private float moveSpeed;


	public EntityKos3(World par1World)
    {
        super(par1World);
    
        this.moveSpeed = 0.45F;
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
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(1337.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.60D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(80.0D);
    
    this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(0.7D);
	    }

	
    @Override
    protected boolean canDespawn()
    {
            return true;
    }

    
    public int getTotalArmorValue()
    {
        return 16;
    }

    public String getEntityName()
    {
      return "Koschei the Deathless true form";
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

        if (!this.worldObj.isRemote)
        {
            this.setBesideClimbableBlock(this.isCollidedHorizontally);
        }
    }

    
    
    
    public boolean isBesideClimbableBlock()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    /**
     * Updates the WatchableObject (Byte) created in entityInit(), setting it to 0x01 if par1 is true or 0x00 if it is
     * false.
     */
    public boolean isOnLadder()
    {
        return this.isBesideClimbableBlock();
    }

    public void setBesideClimbableBlock(boolean par1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);

        if (par1)
        {
            var2 = (byte)(var2 | 1);
        }
        else
        {
            var2 &= -2;
        }

        this.dataWatcher.updateObject(16, Byte.valueOf(var2));
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
    
    
    protected EntityKos4 createInstance()
    {
        return new EntityKos4(this.worldObj);
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
      
 


  protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(1) + 1;
        int quickvar1 = rand.nextInt(100) + 1;
        int quickvar2 = rand.nextInt(10) + 1;
        int quickvar3 = rand.nextInt(40) + 1;
        int quickvar4 = rand.nextInt(15) + 1;
        int quickvar5 = rand.nextInt(3) + 1;
        int quickvar6 = rand.nextInt(2) + 1;
        int quickvar7 = rand.nextInt(50) + 1;
        int quickvar8 = rand.nextInt(30) + 1;
        int quickvar9 = rand.nextInt(20) + 1;
        int quickvar10 = rand.nextInt(30) + 1;
    	int quickvar11 = rand.nextInt(60) + 1;
    	int quickvar12 = rand.nextInt(200) + 1;
    	int quickvar13 = rand.nextInt(100) + 1;
         
        if(quickvar <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.Runeore), 1);}
        if(quickvar <= 1){entityDropItem(new ItemStack(Item.ingotGold), 2);}
        if(quickvar1 <= 1){entityDropItem(new ItemStack(mod_MagicBow.Crystalbow), 1);}
        if(quickvar2 <= 1){entityDropItem(new ItemStack(mod_phat.dragonHelmet), 1);}
        if(quickvar3 <= 2){entityDropItem(new ItemStack(mod_BlocksGalore.DiamondSpawn), 1);}
        if(quickvar4 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.CabbageSpawn), 1);}
        if(quickvar5 <= 1){entityDropItem(new ItemStack(mod_phat.mithChestplate), 1);}
        if(quickvar6 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.fremsword), 1);}
        if(quickvar7 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.fremswordf), 1);}
        if(quickvar8 <= 1){entityDropItem(new ItemStack(mod_phat.runegBoots), 1);}
        if(quickvar9 <= 1){entityDropItem(new ItemStack(mod_phat.dragonLeggings), 1);}
        if(quickvar10 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.MithoreSpawn), 1);}
        if(quickvar11 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.AddyoreSpawn), 1);}
        if(quickvar12 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.RuneoreSpawn), 1);}
        if(quickvar13 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.CoalSpawn), 1);}
       
        int XP = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.BXPORB), 1);}
        int XP1 = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.BXPORB), 1);}
        int XP2 = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.BXPORB), 1);}
        int XP3 = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.BXPORB), 1);}

        
        }



    public boolean isPotionApplicable(PotionEffect par1PotionEffect)
    {
        return par1PotionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(par1PotionEffect);
    }
    public boolean isBurning()
    {
        return false;
    }

    
    int spawnvar = 1;
    public void onLivingUpdate()
    {
    	++spawnvar;
    	
    	if (spawnvar >= 20){
      	if(!worldObj.isRemote)
    	{
    	  int j = 1;

          for (int k = 0; k < j; ++k)
          {
              float f = ((float)(k % 2) - 0.5F) * (float)1 / 4.0F;
              float f1 = ((float)(k / 2) - 0.5F) * (float)1 / 4.0F;
         
        EntityKos4 entityKos4 = this.createInstance();
    
             entityKos4.setLocationAndAngles(this.posX + (double)f, this.posY + 0.5D+1, this.posZ + (double)f1+4, this.rand.nextFloat() * 360.0F, 0.0F);
             this.worldObj.spawnEntityInWorld(entityKos4);
          }}
      	
      	spawnvar = 0;
      	
        }
    	if(ticksExisted > 600 * 20) setDead(); 
    	super.onLivingUpdate();
    }

    
	


}
