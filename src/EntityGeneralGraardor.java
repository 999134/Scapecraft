package net.minecraft.src;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
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
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityGeneralGraardor extends EntityMob
{
    private float moveSpeed;


	public EntityGeneralGraardor(World par1World)
    {
        super(par1World);
        this.setSize(this.width * 3.3F, this.height * 8.0F);

        this.moveSpeed = 0.35F;
        this.isImmuneToFire = true;
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackDragon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackDragon.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos1.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos1.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos2.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos3.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos3.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTD.class, this.moveSpeed, false));
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
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKQ2.class, this.moveSpeed, false));
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

    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(400.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.90D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(50.0D);
	    }

    public int getTotalArmorValue()
    {
        return 13;
    }
    @Override
    protected boolean canDespawn()
    {
            return true;
    }

    
    
    public String getEntityName()
    {
      return "General Graardor";
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
    protected void attackEntity(Entity par1Entity, float par2)
    {
        float var3 = this.getBrightness(1.0F);

        if (var3 > 0.5F && this.rand.nextInt(100) == 0)
        {
            this.entityToAttack = null;
        }
        else
        {
            if (par2 > 2.0F && par2 < 6.0F && this.rand.nextInt(10) == 0)
            {
                if (this.onGround)
                {
                    double var4 = par1Entity.posX - this.posX;
                    double var6 = par1Entity.posZ - this.posZ;
                    float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
                    this.motionX = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.motionX * 0.20000000298023224D;
                    this.motionZ = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.motionZ * 0.20000000298023224D;
                    this.motionY = 0.4000000059604645D;
                }
            }
            else
            {
                super.attackEntity(par1Entity, par2);
            }
        }
    }

    
    protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(4) + 1;
        int quickvar1 = rand.nextInt(2000) + 1;
        int quickvar2 = rand.nextInt(100) + 1;
        int quickvar3 = rand.nextInt(1) + 1;
        int quickvar4 = rand.nextInt(100) + 1;
        int quickvar5 = rand.nextInt(3) + 1;
        int quickvar6 = rand.nextInt(4) + 1;
        int quickvar7 = rand.nextInt(100) + 1;
        int quickvar8 = rand.nextInt(20) + 1;
        int quickvar9 = rand.nextInt(30) + 1;
        int quickvar10 = rand.nextInt(100) + 1;
    	int quickvar11 = rand.nextInt(200) + 1;
    	int quickvar12 = rand.nextInt(1000) + 1;
    	int quickvar13 = rand.nextInt(500) + 1;
    	int quickvar14 = rand.nextInt(75) + 1;
    	int quickvar15 = rand.nextInt(75) + 1;
         
        if(quickvar <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.Addyore), 1);}
        if(quickvar <= 1){entityDropItem(new ItemStack(Item.ingotGold), 2);}
        if(quickvar1 <= 1){entityDropItem(new ItemStack(mod_MagicBow.Crystalbow), 1);}
        if(quickvar2 <= 1){entityDropItem(new ItemStack(mod_phat.dragonHelmet), 1);}
        if(quickvar3 <= 2){entityDropItem(new ItemStack(mod_MagicTree.Magicfruit), 1);}
        if(quickvar4 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.BandosHilt), 1);}
        if(quickvar5 <= 1){entityDropItem(new ItemStack(mod_phat.mithChestplate), 1);}
        if(quickvar6 <= 1){entityDropItem(new ItemStack(mod_phat.addyChestplate), 1);}
        if(quickvar7 <= 1){entityDropItem(new ItemStack(mod_phat.dragonBoots), 1);}
        if(quickvar8 <= 1){entityDropItem(new ItemStack(mod_phat.runegHelmet), 1);}
        if(quickvar9 <= 1){entityDropItem(new ItemStack(mod_phat.runegLeggings), 1);}
        if(quickvar10 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.MithoreSpawn), 1);}
        if(quickvar11 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.AddyoreSpawn), 1);}
        if(quickvar12 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.RuneoreSpawn), 1);}
        if(quickvar13 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.CoalSpawn), 1);}
        if(quickvar14 <= 1){entityDropItem(new ItemStack(mod_phat.chest), 1);}
        if(quickvar15 <= 1){entityDropItem(new ItemStack(mod_phat.boots), 1);}
       // if(quickvar15 <= 1){entityDropItem(new ItemStack(mod_phat.legs), 1);}
        
        int XP = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.BXPORB), 1);}
        }

    
    protected EntityGoblin createInstance()
    {
        return new EntityGoblin(this.worldObj);
    }
    
    @SideOnly(Side.CLIENT)
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
    	  Entity entity;
    	  entity = par1DamageSource.getSourceOfDamage();
    	  if (entity instanceof EntityArrow)
          {
              return false;
          }
    	if(!worldObj.isRemote)
    	{
    	  int j = 1;

          for (int k = 0; k < j; ++k)
          {
              float f = ((float)(k % 2) - 0.5F) * (float)1 / 4.0F;
              float f1 = ((float)(k / 2) - 0.5F) * (float)1 / 4.0F;
              EntityGoblin  EntityGoblin = this.createInstance();
              
              EntityGoblin.setLocationAndAngles(this.posX + (double)f, this.posY + 0.5D, this.posZ + (double)f1, this.rand.nextFloat() * 360.0F, 0.0F);
              this.worldObj.spawnEntityInWorld(EntityGoblin);
              
              ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7CGeneral Graardor: Split their skulls! Break their bones!");
          }}
    	
    	   return super.attackEntityFrom(par1DamageSource, par2);
    }
      
   




    public boolean isPotionApplicable(PotionEffect par1PotionEffect)
    {
        return par1PotionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(par1PotionEffect);
    }
    public boolean isBurning()
    {
        return false;
    }

    
    public void onLivingUpdate()
    {
      	if(ticksExisted > 400 * 20) setDead(); 
        	super.onLivingUpdate();
        }
        

    
	


}
