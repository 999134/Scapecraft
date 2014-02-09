package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
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
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWizard extends EntityMob implements IRangedAttackMob
{
	private int field_40152_d;
	 private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 0.25F, 60, 10.0F);
	private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.31F, false);
	private float moveSpeed;
	
    public EntityWizard(World par1World)
    {
        super(par1World);
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackGuard.class, 0, true));
        this.moveSpeed = 0.4F;
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackDragon.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos1.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos2.class, 0, true));   
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos3.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWither.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHighMage.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWolf.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityOcelot.class, this.moveSpeed, false));
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));      
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityEliteBlackKnight.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackKnight.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTheif.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ2.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ.class, 0, true));        
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDarkwizard.class, 0, true));        
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGreenDragon.class, 0, true));       
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGhast.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHellhound.class, 0, true));     
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantGrimspike.class, 0, true));    
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantSteelwill.class, 0, true));      
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantStrongstack.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGeneralGraardor.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAhrim.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTorag.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVerac.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGuthan.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKaril.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDharok.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAkrisae.class, 0, true));
        if (par1World != null && !par1World.isRemote)
        {
        	this.setCombatTask();
        }
    }
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(40.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.7D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(6.0D);
	    }

    public String getEntityName()
    {
      return "Wizard";
    }
    
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    
    public boolean isAIEnabled()
    {
        return true;
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
 
    
    
    
    protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(1000) + 1;
        int quickvar1 = rand.nextInt(1000) + 1;
        int quickvar2 = rand.nextInt(8) + 1;
        int quickvar3 = rand.nextInt(8) + 1;
        int quickvar4 = rand.nextInt(8) + 1;
        int quickvar5 = rand.nextInt(8) + 1;
        int quickvar6 = rand.nextInt(8) + 1;
        int quickvar7 = rand.nextInt(8) + 1;
        int quickvar8 = rand.nextInt(8) + 1;
        int quickvar9 = rand.nextInt(8) + 1;
        int quickvar10 = rand.nextInt(8) + 1;
        int quickvar11 = rand.nextInt(5000) + 1;
  
         
        if(quickvar <= 1){
         
        	entityDropItem(new ItemStack(mod_BlocksGalore.Sarastaff), 1);
         
        }
        if(quickvar1 <= 1){
            
        	entityDropItem(new ItemStack(mod_BlocksGalore.Guthixstaff), 1);
         
        }
   if(quickvar11 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.SaradominHilt), 1);}
   
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
                 defaultHeldItem = new ItemStack(mod_BlocksGalore.Sarastaff, 1);
         }



 
 public void setCombatTask()
 {
     this.tasks.removeTask(this.aiAttackOnCollide);
     this.tasks.removeTask(this.aiArrowAttack);
     ItemStack itemstack = this.getHeldItem();

     if (itemstack != null && itemstack.itemID == mod_BlocksGalore.Sarastaff.itemID)
     {
         this.tasks.addTask(4, this.aiArrowAttack);
     }
     else
     {
         this.tasks.addTask(4, this.aiAttackOnCollide);
     }
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

@SideOnly(Side.CLIENT)	
public boolean interact(EntityPlayer par1EntityPlayer)
{
	ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EWizard: You assume my services are free..."
			+ "\u00a7F*You ignore the wizard's attempts to demand payment*");
    return super.interact(par1EntityPlayer);
}
	


}
