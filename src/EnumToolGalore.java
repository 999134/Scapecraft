package net.minecraft.src;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public enum EnumToolGalore
{
    GALOREG(3, 500, 60.0F, 7.0F, 10),
    DRAGON(3, 1500, 15.0F, 6.0F, 30),
    CHAOTIC(3, 2000, 15.0F, 7.0F, 30),
    KORASIS(3, 30, 5.0F, 1.0F, 10),
    MITH(2, 400, 6.5F, 2.0F, 10),
    ADDY(2, 700, 7.5F, 3.0F, 10),
    RUNE(3, 2000, 10.5F, 4.0F, 10),
    BLACK(2, 300, 6.0F, 2.0F, 15);


    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    
    private final int harvestLevel;

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    private final int maxUses;

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    private final float efficiencyOnProperMaterial;

    /** Damage versus entities. */
    private final float damageVsEntity;

    /** Defines the natural enchantability factor of the material. */
    private final int enchantability;

    //Added by forge for custom Armor materials.
    public Item customCraftingMaterial = null;

    private EnumToolGalore(int par3, int par4, float par5, float par6, int par7)
    {
        this.harvestLevel = par3;
        this.maxUses = par4;
        this.efficiencyOnProperMaterial = par5;
        this.damageVsEntity = par6;
        this.enchantability = par7;
    }

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    public int getMaxUses()
    {
        return this.maxUses;
    }

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    /**
     * Damage versus entities.
     */
    public float getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    /**
     * Return the natural enchantability factor of the material.
     */
    public int getEnchantability()
    {
        return this.enchantability;
    }
    public int getToolCraftingMaterial()
    {
        switch (this)
        {
        case MITH:    return mod_BlocksGalore.Mithingot.itemID;
        
            default:      return (customCraftingMaterial == null ? 0 : customCraftingMaterial.itemID);
        }
    }

    /**
     * Return the crafting material for this tool material, used to determine the item that can be used to repair a tool
     * with an anvil
     */
  
    }

