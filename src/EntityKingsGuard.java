package net.minecraft.src;

import java.util.Random;

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
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityKingsGuard extends EntityMob
{
    private float moveSpeed;
	public EntityKingsGuard(World par1World)
    {
        super(par1World);

        this.moveSpeed = 0.4F;
        this.func_82163_bD();
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackGuard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackGuard.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackDragon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackDragon.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTD.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackKnight.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackKnight.class, this.moveSpeed, false));
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos1.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos1.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos2.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos3.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos3.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityEliteBlackKnight.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityEliteBlackKnight.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWolf.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityOcelot.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGreenDragon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGreenDragon.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTheif.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTheif.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityCreeper.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySkeleton.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityZombie.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySpider.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ2.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKQ2.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBot.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBot.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKQ.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKQ.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLesserDemon.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLesserDemon.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDarkwizard.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityDarkwizard.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGoblin.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGoblin.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityScorpion.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityScorpion.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHellhound.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHellhound.class, this.moveSpeed, false));
        

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHighMage.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHighMage.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWither.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWither.class, this.moveSpeed, false));
        
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantGrimspike.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySergeantGrimspike.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantSteelwill.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySergeantSteelwill.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySergeantStrongstack.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySergeantStrongstack.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGeneralGraardor.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGeneralGraardor.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAhrim.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityAhrim.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTorag.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTorag.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVerac.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityVerac.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGuthan.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGuthan.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKaril.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKaril.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDharok.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityDharok.class, this.moveSpeed, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAkrisae.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityAkrisae.class, this.moveSpeed, false));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(45.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.70D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(6.0D);
	    }
	
    public String getEntityName()
    {
      return "King's Guard";
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
    @SideOnly(Side.CLIENT)
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
    	 
    	if(!worldObj.isRemote)
    	{
    	  int j = 1;

          for (int k = 0; k < j; ++k)
          {
              float f = ((float)(k % 2) - 0.5F) * (float)1 / 4.0F;
              float f1 = ((float)(k / 2) - 0.5F) * (float)1 / 4.0F;
              
              ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7CKing's Guard: Long live the king!");
          }}
    	
    	   return super.attackEntityFrom(par1DamageSource, par2);
    }
     
    
    protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(100) + 1;
        int quickvar1 = rand.nextInt(10000) + 1;
        int quickvar4 = rand.nextInt(10) + 1;
        int quickvar5 = rand.nextInt(10) + 1;
         
        if(quickvar <= 1){
         
        	entityDropItem(new ItemStack(Item.swordGold), 1);
         
        }
        if(quickvar1 <= 1){
            
        	entityDropItem(new ItemStack(mod_BlocksGalore.sarasword), 1);
         
        

 
}
if(quickvar4 <= 1){
    
	entityDropItem(new ItemStack(mod_phat.guardHelmet), 1);
 
}
if(quickvar5 <= 1){
    
	entityDropItem(new ItemStack(mod_phat.guardChestplate), 1);
 
}
int XP = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.XPORB), 1);}
        }
    

      
   
    protected int getDropItemId()
    {
        return Item.silk.itemID;
    }



    public boolean isPotionApplicable(PotionEffect par1PotionEffect)
    {
        return par1PotionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(par1PotionEffect);
    }

    
    public void onLivingUpdate()
    {
      	if(ticksExisted > 300 * 20) setDead(); 
        	super.onLivingUpdate();
        }
        
    public void func_82163_bD()
    {
    	 
    	 this.setCanPickUpLoot(this.rand.nextFloat() < equipmentDropChances[this.worldObj.difficultySetting]);
    	   if (this.getCurrentItemOrArmor(4) == null){
    	
    		   this.setCurrentItemOrArmor(4, new ItemStack(mod_phat.guardHelmet));
    		   this.setCurrentItemOrArmor(3, new ItemStack(mod_phat.guardChestplate));
    		   this.setCurrentItemOrArmor(2, new ItemStack(Item.legsGold));
    		   this.equipmentDropChances[4] = 0.0F;
         //    System.out.println("Test");
             
         }
    }
    
    private static final ItemStack defaultHeldItem;
    public ItemStack getHeldItem()
         {
                 return defaultHeldItem;
         }

 static
         {
                 defaultHeldItem = new ItemStack(mod_BlocksGalore.sarasword, 1);
         }
    
	


}
