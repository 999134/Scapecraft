package net.minecraft.src;
 
import java.util.Map;

import potato.TestClientProxy;
import potato.TestCommonProxy;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.boss.BossStatus;
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

@Mod( modid = "mod_mobs", name="mod_mobs", version="1.6.4")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_mobs
{
 
        
 
  
        
 @SidedProxy(clientSide="potato.TestClientProxy", serverSide="potato.TestCommonProxy") 
 public static TestCommonProxy proxy;
       
 
 @Instance
 public static mod_mobs instance;
        
 @Init
        public void load(FMLInitializationEvent evt) {
           proxy.registerRenderThings();   
           EntityRegistry.registerGlobalEntityID(EntityMagicBoat.class, "MagicBoat", EntityRegistry.findGlobalUniqueEntityId());
   		EntityRegistry.registerModEntity(EntityMagicBoat.class, "MagicBoat", 0, this, 128, 1, true);
   		LanguageRegistry.instance().addStringLocalization("entity.MagicBoat.mod_mobs.name", "Magic Boat");
   		
        EntityRegistry.registerGlobalEntityID(EntityBlackDragon.class, "BlackDragon", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBlackDragon.class, "BlackDragon", 1, this, 129, 2, true);
		LanguageRegistry.instance().addStringLocalization("entity.BlackDragon.mod_mobs.name", "Black Dragon");   		
		int id = 300; // has to be unique
		EntityList.IDtoClassMapping.put(id, EntityBlackDragon.class);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, 0x85ff2c, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityLootChest.class, "LootChest", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityLootChest.class, "LootChest", 2, this, 130, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.LootChest.mod_mobs.name", "Loot Chest");   		
		int id1 = 301; // has to be unique
		EntityList.IDtoClassMapping.put(id1, EntityLootChest.class);
		EntityList.entityEggs.put(id1, new EntityEggInfo(id1, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityHillGiant.class, "HillGiant", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityHillGiant.class, "HillGiant", 3, this, 131, 4, true);
		LanguageRegistry.instance().addStringLocalization("entity.HillGiant.mod_mobs.name", "Hill Giant");   		
		int id2 = 302; // has to be unique
		EntityList.IDtoClassMapping.put(id2, EntityHillGiant.class);
		EntityList.entityEggs.put(id2, new EntityEggInfo(id2, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityBlackGuard.class, "BlackGuard", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBlackGuard.class, "BlackGuard", 4, this, 132, 5, true);
		LanguageRegistry.instance().addStringLocalization("entity.BlackGuard.mod_mobs.name", "Black Guard");   		
		int id3 = 303; // has to be unique
		EntityList.IDtoClassMapping.put(id3, EntityBlackGuard.class);
		EntityList.entityEggs.put(id3, new EntityEggInfo(id3, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityBlackGuard2.class, "BlackGuard2", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBlackGuard2.class, "BlackGuard2", 6, this, 134, 7, true);
		LanguageRegistry.instance().addStringLocalization("entity.BlackGuard2.mod_mobs.name", "Black Guard2");   		
		int id5 = 305; // has to be unique
		EntityList.IDtoClassMapping.put(id5, EntityBlackGuard2.class);
		EntityList.entityEggs.put(id5, new EntityEggInfo(id5, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityVarze.class, "Varze", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityVarze.class, "Varze", 5, this, 133, 6, true);
		LanguageRegistry.instance().addStringLocalization("entity.Varze.mod_mobs.name", "Sir Armik Varze");   		
		int id4 = 304; // has to be unique
		EntityList.IDtoClassMapping.put(id4, EntityVarze.class);
		EntityList.entityEggs.put(id4, new EntityEggInfo(id4, 0xffd64a, 0xf6dc76));

		EntityRegistry.registerGlobalEntityID(EntityMossGiant.class, "MossGiant", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityMossGiant.class, "MossGiant", 7, this, 135, 8, true);
		LanguageRegistry.instance().addStringLocalization("entity.MossGiant.mod_mobs.name", "Moss Giant");   		
		int id6 = 306; // has to be unique
		EntityList.IDtoClassMapping.put(id6, EntityMossGiant.class);
		EntityList.entityEggs.put(id6, new EntityEggInfo(id6, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityFireGiant.class, "FireGiant", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFireGiant.class, "FireGiant", 8, this, 136, 9, true);
		LanguageRegistry.instance().addStringLocalization("entity.FireGiant.mod_mobs.name", "Fire Giant");   		
		int id7 = 307; // has to be unique
		EntityList.IDtoClassMapping.put(id7, EntityFireGiant.class);
		EntityList.entityEggs.put(id7, new EntityEggInfo(id7, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityCaveCrawler.class, "CaveCrawler", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityCaveCrawler.class, "CaveCrawler", 9, this, 137, 10, true);
		LanguageRegistry.instance().addStringLocalization("entity.CaveCrawler.mod_mobs.name", "Cave Crawler");   		
		int id8 = 308; // has to be unique
		EntityList.IDtoClassMapping.put(id8, EntityCaveCrawler.class);
		EntityList.entityEggs.put(id8, new EntityEggInfo(id8, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityGhost.class, "Ghost", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityGhost.class, "Ghost", 10, this, 138, 11, true);
		LanguageRegistry.instance().addStringLocalization("entity.Ghost.mod_mobs.name", "Ghost");   		
		int id9 = 309; // has to be unique
		EntityList.IDtoClassMapping.put(id9, EntityGhost.class);
		EntityList.entityEggs.put(id9, new EntityEggInfo(id9, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityBlackDemon.class, "BlackDemon", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBlackDemon.class, "BlackDemon", 11, this, 139, 12, true);
		LanguageRegistry.instance().addStringLocalization("entity.BlackDemon.mod_mobs.name", "Black Demon");   		
		int id10 = 10; // has to be unique
		EntityList.IDtoClassMapping.put(id10, EntityBlackDemon.class);
		EntityList.entityEggs.put(id10, new EntityEggInfo(id10, 0xffd63a, 0xf6dc76));
		
		EntityRegistry.registerGlobalEntityID(EntityCook.class, "Cook", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityCook.class, "Cook", 12, this, 140, 13, true);
		LanguageRegistry.instance().addStringLocalization("entity.Cook.mod_mobs.name", "Cook");   		
		int id11 = 11; // has to be unique
		EntityList.IDtoClassMapping.put(id11, EntityCook.class);
		EntityList.entityEggs.put(id11, new EntityEggInfo(id11, 0xffd63a, 0xf6dc76));
		
             EntityRegistry.registerGlobalEntityID(EntityKQ2.class, "Kalphite", 74);                  
                       ModLoader.addSpawn(EntityKQ2.class, 1, 1, 2, EnumCreatureType.creature);
                   	EntityList.entityEggs.put(Integer.valueOf(74), new EntityEggInfo(74, 0xffd63a, 0xf6dc76));
					ModLoader.addLocalization("entity.Kalphite.name", "Kalphite");
                
                EntityRegistry.registerGlobalEntityID(EntityKQ.class, "Kalphite queen", 75);                  
                       ModLoader.addSpawn(EntityKQ.class, 0, 4, 10, EnumCreatureType.creature);
                   	EntityList.entityEggs.put(Integer.valueOf(75), new EntityEggInfo(75, 0xffd63a, 0xf6dc76));
					ModLoader.addLocalization("entity.Kalphite queen.name", "Kalphite Queen"); 					
 
 }


  
 
}