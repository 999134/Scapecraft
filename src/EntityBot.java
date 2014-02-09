package net.minecraft.src;
 
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
 
public class EntityBot extends EntityMob
{
    private float moveSpeed;
	public EntityBot(World par1World)
    {
        super(par1World);
        this.isImmuneToFire = true;
        this.moveSpeed = 0.2F;

       // if(ticksAlive > 60 * 20) setDead;
        
 
   
    }
 
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(20.0D);
    // Follow Range - default 32.0D - min 0.0D - max 2048.0D
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
    // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.350D);
    // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(5.0D);
	    }
	
	
    public String getEntityName()
    {
      return "Yew Bot";
    }
    
    protected Entity findPlayerToAttack()
    {
        float var1 = this.getBrightness(1.0F);

        if (var1 < 0F)
        {
            double var2 = 16.0D;
            return this.worldObj.getClosestVulnerablePlayerToEntity(this, var2);
        }
        else
        {
            return null;
        }
    }
    
    public boolean isAIEnabled()
    {
        return false;
    }
 

 
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
    }
 
   
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
    }
 
    protected String getLivingSound()
    {
       return "mob.endermen.idle";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.endermen.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.endermen.death";
    }

 
    protected float getSoundVolume()
    {
        return 0.4F;
    }
 

 
    protected void dropFewItems(boolean par1, int par2){
        
        int quickvar = rand.nextInt(30000) + 1;
        int quickvar1 = rand.nextInt(33000) + 1;
        int quickvar2 = rand.nextInt(80000) + 1;
        int quickvar3 = rand.nextInt(1000) + 1;
        int quickvar4 = rand.nextInt(30) + 1;
        int quickvar5 = rand.nextInt(30) + 1;
         
        if(quickvar <= 1){
         
        	entityDropItem(new ItemStack(mod_BlocksGalore.korasis), 1);
         
        }
        if(quickvar1 <= 1){
            
        	entityDropItem(new ItemStack(mod_BlocksGalore.dlong), 1);
         
        }
if(quickvar2 <= 1){
            
        	entityDropItem(new ItemStack(mod_BlocksGalore.pickaxeGalore), 1);
         
        }
if(quickvar3 <= 1){
    
	entityDropItem(new ItemStack(mod_MagicTree.Magicsapling), 1);
 
}
if(quickvar4 <= 1){
    
	entityDropItem(new ItemStack(Item.axeWood), 1);
 
}
if(quickvar5 <= 1){
    
	entityDropItem(new ItemStack(Item.hoeWood), 1);
 
}
        }
    
    public int getAttackStrength(Entity par1Entity)
    {
        return 5;
    }
      
   
    
    public void initCreature()
    {
    	 
    	 this.setCanPickUpLoot(this.rand.nextFloat() < equipmentDropChances[this.worldObj.difficultySetting]);
    	   if (this.getCurrentItemOrArmor(4) == null){
    	
           //  this.func_70062_b(4, new ItemStack(mod_Phat.dragonHelmet));
           //  this.func_70062_b(1, new ItemStack(mod_Phat.dragonBoots));
         //    this.func_70062_b(2, new ItemStack(mod_Phat.dragonLeggings));
            // this.func_70062_b(3, new ItemStack(mod_Phat.dragonChestplate));
               this.equipmentDropChances[4] = 0.0F;
         //    System.out.println("Test");
             
         }
    }
    
 
    
    
    
    @Override
    protected boolean canDespawn()
    {
            return true;
    }

    
    public void onLivingUpdate()
{
  	if(ticksExisted > 20 * 20) setDead(); 
    	super.onLivingUpdate();
    }
    
    private static final ItemStack defaultHeldItem;
    public ItemStack getHeldItem()
         {
                 return defaultHeldItem;
         }

 static
         {
                 defaultHeldItem = new ItemStack(Item.axeWood, 1);
         }
    
	

}