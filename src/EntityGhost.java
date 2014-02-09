package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
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
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityGhost extends EntityMob
{
    private float moveSpeed;


	public EntityGhost(World par1World)
    {
        super(par1World);

        this.moveSpeed = 0.5F;

        this.setSize(this.width * 1.0F, this.height * 2.0F);
      
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTD.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWolf.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityOcelot.class, this.moveSpeed, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHellhound.class, this.moveSpeed, false));
      
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));

    }
	
	
	   protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(40.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.65D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(6.0D);
		    }
	
    public String getEntityName()
    {
      return "Ghost";
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
        
        int quickvar = rand.nextInt(700) + 1;
        int quickvar1 = rand.nextInt(2000) + 1;
        int quickvar2 = rand.nextInt(55) + 1;
        int quickvar3 = rand.nextInt(130) + 1;
        int quickvar4 = rand.nextInt(30) + 1;
        int quickvar5 = rand.nextInt(100) + 1;
        int quickvar6 = rand.nextInt(2) + 1;
        int quickvar7 = rand.nextInt(30) + 1;
        int quickvar8 = rand.nextInt(20) + 1;
        int quickvar9 = rand.nextInt(30) + 1;
        int quickvar10 = rand.nextInt(50) + 1;
         
 if(quickvar <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.dlong), 1);}
if(quickvar1 <= 1){entityDropItem(new ItemStack(mod_phat.dragonLeggings), 1);}
if(quickvar2 <= 1){entityDropItem(new ItemStack(mod_BlocksGalore.Addyore), 1);}
if(quickvar3 <= 1){entityDropItem(new ItemStack(mod_phat.runeHelmet), 1);}
if(quickvar4 <= 1){entityDropItem(new ItemStack(mod_phat.mithHelmet), 1);}
if(quickvar5 <= 1){entityDropItem(new ItemStack(mod_phat.addyChestplate), 1);}
if(quickvar6 <= 1){entityDropItem(new ItemStack(Item.goldNugget), 1);}
if(quickvar7 <= 1){entityDropItem(new ItemStack(mod_phat.blackChestplate), 1);}
if(quickvar8 <= 1){entityDropItem(new ItemStack(Block.obsidian), 1);}
if(quickvar9 <= 1){entityDropItem(new ItemStack(mod_phat.mithBoots), 1);}
if(quickvar10 <= 1){entityDropItem(new ItemStack(mod_phat.Granite), 1);}
int XP = rand.nextInt(1) + 1;if(XP <= 1){entityDropItem(new ItemStack(mod_Flower.XPORB), 1);}
        }

    public boolean isPotionApplicable(PotionEffect par1PotionEffect)
    {
        return par1PotionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(par1PotionEffect);
    }

    
    public void onLivingUpdate()
    {
      	if(ticksExisted > 200 * 20) setDead(); 
        	super.onLivingUpdate();
        }
    
    @SideOnly(Side.CLIENT)	
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
    	ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a7EGhost: wooooooooo!");
        return super.interact(par1EntityPlayer);
    }
}
