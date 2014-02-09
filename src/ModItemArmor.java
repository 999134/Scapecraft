package net.minecraft.src;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.Instance;

public class ModItemArmor extends ItemArmor 
{
	public String armorNamePrefix;	 
	
	public ModItemArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armornamePrefix)
        {
		super(par1, par2EnumArmorMaterial, par3, par4);
                armorNamePrefix = armornamePrefix;
        }

        public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
                {
        if (stack.toString().contains("leggings")) 
        {
        return "minecraft:" + armorNamePrefix + "_2.png";
        }
        if (stack.toString().contains("Leggings")) 
        {
        return "minecraft:" + armorNamePrefix + "_2.png";
        }
        return "minecraft:" + armorNamePrefix + "_1.png";
        }
        
        
        public void registerIcons(IconRegister iconReg) 
        
        {
        if(itemID == mod_phat.addyBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("addyBoots");
        }
        else if(itemID == mod_phat.addyLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("addyLeggings");
        }
        else if(itemID == mod_phat.addyChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("addyChestplate");
        }
        else if(itemID == mod_phat.addyHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("addyHelmet");
        }
        
        else if(itemID == mod_phat.graniteBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("graniteBoots");
        }
        else if(itemID == mod_phat.graniteLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("graniteLeggings");
        }
        else if(itemID == mod_phat.graniteChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("graniteChestplate");
        }
        else if(itemID == mod_phat.graniteHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("graniteHelmet");
        }
        
        
        else if(itemID == mod_phat.blackBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("blackBoots");
        }
        else if(itemID == mod_phat.blackLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("blackLeggings");
        }
        else if(itemID == mod_phat.blackChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("blackChestplate");
        }
        else if(itemID == mod_phat.blackHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("blackHelmet");
        }

        else if(itemID == mod_phat.runeBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("runeBoots");
        }
        else if(itemID == mod_phat.runeLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("runeLeggings");
        }
        else if(itemID == mod_phat.runeChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("runeChestplate");
        }
        else if(itemID == mod_phat.runeHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("runeHelmet");
        }
        
        else if(itemID == mod_phat.blackBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("blackBoots");
        }
        else if(itemID == mod_phat.blackLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("blackLeggings");
        }
        else if(itemID == mod_phat.blackChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("blackChestplate");
        }
        else if(itemID == mod_phat.blackHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("blackHelmet");
        }
        
        else if(itemID == mod_phat.whiteBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("whiteBoots");
        }
        else if(itemID == mod_phat.whiteLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("whiteLeggings");
        }
        else if(itemID == mod_phat.whiteChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("whiteChestplate");
        }
        else if(itemID == mod_phat.whiteHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("whiteHelmet");
        }
        
        else if(itemID == mod_phat.phatBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("phatBoots");
        }
        else if(itemID == mod_phat.phatLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("phatLeggings");
        }
        else if(itemID == mod_phat.phatChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("phatChestplate");
        }
        else if(itemID == mod_phat.phatHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("phatHelmet");
        }
        
        else if(itemID == mod_phat.wphatBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("wphatBoots");
        }
        else if(itemID == mod_phat.wphatLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("wphatLeggings");
        }
        else if(itemID == mod_phat.wphatChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("wphatChestplate");
        }
        else if(itemID == mod_phat.wphatHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("wphatHelmet");
        }
        
        else if(itemID == mod_phat.yphatBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("yphatBoots");
        }
        else if(itemID == mod_phat.yphatLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("yphatLeggings");
        }
        else if(itemID == mod_phat.yphatChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("yphatChestplate");
        }
        else if(itemID == mod_phat.yphatHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("yphatHelmet");
        }

        else if(itemID == mod_phat.rphatBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("rphatBoots");
        }
        else if(itemID == mod_phat.rphatLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("rphatLeggings");
        }
        else if(itemID == mod_phat.rphatChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("rphatChestplate");
        }
        else if(itemID == mod_phat.rphatHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("rphatHelmet");
        }
        
        else if(itemID == mod_phat.gphatBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("gphatBoots");
        }
        else if(itemID == mod_phat.gphatLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("gphatLeggings");
        }
        else if(itemID == mod_phat.gphatChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("gphatChestplate");
        }
        else if(itemID == mod_phat.gphatHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("gphatHelmet");
        }
        
        else if(itemID == mod_phat.mithBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("mithBoots");
        }
        else if(itemID == mod_phat.mithLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("mithLeggings");
        }
        else if(itemID == mod_phat.mithChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("mithChestplate");
        }
        else if(itemID == mod_phat.mithHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("mithHelmet");
        }
        
        else if(itemID == mod_phat.dragonBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonBoots");
        }
        else if(itemID == mod_phat.dragonLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonLeggings");
        }
        else if(itemID == mod_phat.dragonChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonChestplate");
        }
        else if(itemID == mod_phat.dragonHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonHelmet");
        }
        
        else if(itemID == mod_phat.guardBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("guardBoots");
        }
        else if(itemID == mod_phat.guardLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("guardLeggings");
        }
        else if(itemID == mod_phat.guardChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("guardChestplate");
        }
        else if(itemID == mod_phat.guardHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("guardHelmet");
        }
        
        else if(itemID == mod_phat.pphatBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("pphatBoots");
        }
        else if(itemID == mod_phat.pphatLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("pphatLeggings");
        }
        else if(itemID == mod_phat.pphatChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("pphatChestplate");
        }
        else if(itemID == mod_phat.pphatHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("pphatHelmet");
        }
        
        else if(itemID == mod_phat.santaBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("santaBoots");
        }
        else if(itemID == mod_phat.santaLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("santaLeggings");
        }
        else if(itemID == mod_phat.santaChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("santaChestplate");
        }
        else if(itemID == mod_phat.santaHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("santaHelmet");
        }

        else if(itemID == mod_phat.runegBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("runegBoots");
        }
        else if(itemID == mod_phat.runegLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("runegLeggings");
        }
        else if(itemID == mod_phat.runegChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("runegChestplate");
        }
        else if(itemID == mod_phat.runegHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("runegHelmet");
        }
            
     
        else if(itemID == mod_phat.blackgBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("blackgBoots");
        }
        else if(itemID == mod_phat.blackgLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("blackgLeggings");
        }
        else if(itemID == mod_phat.blackgChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("blackgChestplate");
        }
        else if(itemID == mod_phat.blackgHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("blackgHelmet");
        } 
      
        else if(itemID == mod_phat.ToragBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("ToragBoots");
        }
        else if(itemID == mod_phat.ToragLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("ToragLegs");
        }
        else if(itemID == mod_phat.ToragChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("ToragChest");
        }
        else if(itemID == mod_phat.ToragHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("ToragHelm");
        } 
        
        else if(itemID == mod_phat.VeracBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("VeracBoots");
        }
        else if(itemID == mod_phat.VeracLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("VeracLegs");
        }
        else if(itemID == mod_phat.VeracChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("VeracChest");
        }
        else if(itemID == mod_phat.VeracHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("VeracHelm");
        }
        
        else if(itemID == mod_phat.GuthanBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("GuthanBoots");
        }
        else if(itemID == mod_phat.GuthanLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("GuthanLegs");
        }
        else if(itemID == mod_phat.GuthanChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("GuthanChest");
        }
        else if(itemID == mod_phat.GuthanHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("GuthanHelm");
        }
        
        else if(itemID == mod_phat.DharokBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("DharokBoots");
        }
        else if(itemID == mod_phat.DharokLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("DharokLegs");
        }
        else if(itemID == mod_phat.DharokChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("DharokChest");
        }
        else if(itemID == mod_phat.DharokHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("DharokHelm");
        }
        
        else if(itemID == mod_phat.KarilBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("KarilBoots");
        }
        else if(itemID == mod_phat.KarilLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("KarilLegs");
        }
        else if(itemID == mod_phat.KarilChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("KarilChest");
        }
        else if(itemID == mod_phat.KarilHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("KarilHelm");
        }
        
        else if(itemID == mod_phat.AhrimBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("AhrimBoots");
        }
        else if(itemID == mod_phat.AhrimLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("AhrimLegs");
        }
        else if(itemID == mod_phat.AhrimChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("AhrimChest");
        }
        else if(itemID == mod_phat.AhrimHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("AhrimHelm");
        }
        
        else if(itemID == mod_phat.AkrisaeBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("AkrisaeBoots");
        }
        else if(itemID == mod_phat.AkrisaeLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("AkrisaeLegs");
        }
        else if(itemID == mod_phat.AkrisaeChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("AkrisaeChest");
        }
        else if(itemID == mod_phat.AkrisaeHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("AkrisaeHelm");
        }
        
        
        else if(itemID == mod_phat.greendBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("GreendBoots");
        }
        else if(itemID == mod_phat.greendLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("GreendLegs");
        }
        else if(itemID == mod_phat.greendChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("GreendChest");
        }
        else if(itemID == mod_phat.greendHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("GreendHelm");
        }
        
        else if(itemID == mod_phat.dragonlBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonlBoots");
        }
        else if(itemID == mod_phat.dragonlLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonlLegs");
        }
        else if(itemID == mod_phat.dragonlChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonlChest");
        }
        else if(itemID == mod_phat.dragonlHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonlHelm");
        }
        
        else if(itemID == mod_phat.cdragonBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonCBoots");
        }
        else if(itemID == mod_phat.cdragonLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonCLeggings");
        }
        else if(itemID == mod_phat.cdragonChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonCChestplate");
        }
        else if(itemID == mod_phat.cdragonHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("dragonCHelmet");
        }
        
        else if(itemID == mod_phat.blackdBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("blackdboots");
        }
        else if(itemID == mod_phat.blackdLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("blackdchaps");
        }
        else if(itemID == mod_phat.blackdChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("blackdbody");
        }
        else if(itemID == mod_phat.blackdHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("blackdcoif");
        }
        
        else if(itemID == mod_phat.stoneBoots.itemID)
        {
        itemIcon = iconReg.registerIcon("stoneboots");
        }
        else if(itemID == mod_phat.stoneLeggings.itemID)
        {
        itemIcon = iconReg.registerIcon("stonelegs");
        }
        else if(itemID == mod_phat.stoneChestplate.itemID)
        {
        itemIcon = iconReg.registerIcon("stonechest");
        }
        else if(itemID == mod_phat.stoneHelmet.itemID)
        {
        itemIcon = iconReg.registerIcon("stonehelmet");
        }
        }
    }
 