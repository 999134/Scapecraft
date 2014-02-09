package net.minecraft.src;

import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderTNTPrimed;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class mod_Botter extends BaseMod {

	@Override
	public String getVersion() {
		return "1.6.4";
	}

	

	@Override
	public void load() {
	     
		NetworkRegistry.instance().registerConnectionHandler(new CustomConnectionHandler());
		
		
		
         EntityRegistry.registerGlobalEntityID(EntityBot.class, "Bot", 76);
		ModLoader.addSpawn(EntityBot.class, 0, 4, 10, EnumCreatureType.creature);
		EntityList.entityEggs.put(Integer.valueOf(76), new EntityEggInfo(76, 0x6d4d00, 0xf6dc76));
		ModLoader.addLocalization("entity.Bot.name", "Yew Tree Bot");
		
		 EntityRegistry.registerGlobalEntityID(EntityTNTXPrimed.class, "EntityTNTXPrimed", 77);
		   
	     EntityRegistry.registerGlobalEntityID(EntityBot2.class, "Bot2", 78);
		ModLoader.addSpawn(EntityBot2.class, 0, 4, 10, EnumCreatureType.creature);
		EntityList.entityEggs.put(Integer.valueOf(78), new EntityEggInfo(78, 0x6d4d00, 0xf6dc76));
		ModLoader.addLocalization("entity.Bot2.name", "Magic Tree Bot");
		
	     EntityRegistry.registerGlobalEntityID(EntityBot3.class, "Bot3", 70);
			ModLoader.addSpawn(EntityBot3.class, 0, 4, 10, EnumCreatureType.creature);
			EntityList.entityEggs.put(Integer.valueOf(70), new EntityEggInfo(70, 0x6d4d00, 0xf6dc76));
			ModLoader.addLocalization("entity.Bot3.name", "Green Dragon Bot");
			

		
	     EntityRegistry.registerGlobalEntityID(EntityTheif.class, "Thief", 79);
			ModLoader.addSpawn(EntityTheif.class, 20, 15, 15, EnumCreatureType.monster);
			EntityList.entityEggs.put(Integer.valueOf(79), new EntityEggInfo(79, 0x000000, 0xf6dc76));
			ModLoader.addLocalization("entity.Thief.name", "Thief");
			
		 EntityRegistry.registerGlobalEntityID(EntityGuard.class, "Guard", 80);
				ModLoader.addSpawn(EntityGuard.class, 20, 15, 15, EnumCreatureType.monster);
				ModLoader.addSpawn(EntityGuard.class, 5, 5, 10, EnumCreatureType.creature);
				EntityList.entityEggs.put(Integer.valueOf(80), new EntityEggInfo(80, 0xeeeeee, 0xf6dc76));
				ModLoader.addLocalization("entity.Guard.name", "Guard");
			
		 EntityRegistry.registerGlobalEntityID(EntityBlackKnight.class, "BlackKnight", 81);
				ModLoader.addSpawn(EntityBlackKnight.class, 10, 10, 10, EnumCreatureType.monster);
				EntityList.entityEggs.put(Integer.valueOf(81), new EntityEggInfo(81, 0x000000, 0xf6dc76));
				ModLoader.addLocalization("entity.BlackKnight.name", "Black Knight");
				
		 EntityRegistry.registerGlobalEntityID(EntityWhiteKnight.class, "WhiteKnight", 82);
					ModLoader.addSpawn(EntityWhiteKnight.class, 5, 5, 10, EnumCreatureType.creature);
					ModLoader.addSpawn(EntityWhiteKnight.class, 10, 5, 10, EnumCreatureType.monster);
					EntityList.entityEggs.put(Integer.valueOf(82), new EntityEggInfo(82, 0xeeeeee, 0xf6dc76));
					ModLoader.addLocalization("entity.WhiteKnight.name", "White Knight");
					
		EntityRegistry.registerGlobalEntityID(EntityHeroKnight.class, "HeroKnight", 107);
		ModLoader.addSpawn(EntityHeroKnight.class, 1, 1, 1, EnumCreatureType.monster);
		EntityList.entityEggs.put(Integer.valueOf(107), new EntityEggInfo(107, 0xeeeeee, 0xf6dc76));
		ModLoader.addLocalization("entity.HeroKnight.name", "Hero Knight");
		
		EntityRegistry.registerGlobalEntityID(EntityKing.class, "King", 108);
		ModLoader.addSpawn(EntityKing.class, 0, 0, 0, EnumCreatureType.monster);
		EntityList.entityEggs.put(Integer.valueOf(108), new EntityEggInfo(108, 0xeeeeee, 0xf6dc76));
		ModLoader.addLocalization("entity.King.name", "King");
		
		EntityRegistry.registerGlobalEntityID(EntityKingsGuard.class, "KingGuard", 109);
		ModLoader.addSpawn(EntityKingsGuard.class, 0, 0, 0, EnumCreatureType.monster);
		EntityList.entityEggs.put(Integer.valueOf(109), new EntityEggInfo(109, 0xeeeeee, 0xf6dc76));
		ModLoader.addLocalization("entity.KingGuard.name", "King's Guard");
		
		EntityRegistry.registerGlobalEntityID(EntityEliteBlackKnight.class, "EliteBlackKnight", 114);
		ModLoader.addSpawn(EntityEliteBlackKnight.class, 0, 0, 0, EnumCreatureType.monster);
		EntityList.entityEggs.put(Integer.valueOf(114), new EntityEggInfo(114, 0x000000, 0xf6dc76));
		ModLoader.addLocalization("entity.EliteBlackKnight.name", "Elite Black Knight");
		
		

				
		
	     EntityRegistry.registerGlobalEntityID(EntityWizard.class, "Wizard", 83);
						ModLoader.addSpawn(EntityWizard.class, 1, 1, 1, EnumCreatureType.monster);		
						EntityList.entityEggs.put(Integer.valueOf(83), new EntityEggInfo(83, 0xeeeeee, 0xf6dc76));
						ModLoader.addLocalization("entity.Wizard.name", "Wizard");
						
		EntityRegistry.registerGlobalEntityID(EntityDarkwizard.class, "Darkwizard", 85);
							ModLoader.addSpawn(EntityDarkwizard.class, 1, 1, 1, EnumCreatureType.monster);
							EntityList.entityEggs.put(Integer.valueOf(85), new EntityEggInfo(85, 0x000000, 0xf6dc76));
							ModLoader.addLocalization("entity.Darkwizard.name", "Dark Wizard");
					
		EntityRegistry.registerGlobalEntityID(EntityGoblin.class, "Goblin", 86);					
								ModLoader.addSpawn(EntityGoblin.class, 10, 5, 10, EnumCreatureType.creature);
								EntityList.entityEggs.put(Integer.valueOf(86), new EntityEggInfo(86, 0x2cff3b, 0xf6dc76));
								ModLoader.addLocalization("entity.Goblin.name", "Goblin");
		
	    EntityRegistry.registerGlobalEntityID(EntityDwarf.class, "Dwarf", 73);					
								ModLoader.addSpawn(EntityDwarf.class, 7, 5, 10, EnumCreatureType.creature);							
								EntityList.entityEggs.put(Integer.valueOf(73), new EntityEggInfo(73, 0xffd63a, 0xf6dc76));
								ModLoader.addLocalization("entity.Dwarf.name", "Dwarf");
								
		EntityRegistry.registerGlobalEntityID(EntityScorpion.class, "Scorpion", 87);					
								ModLoader.addSpawn(EntityScorpion.class,  4, 4, 7, EnumCreatureType.creature);
								EntityList.entityEggs.put(Integer.valueOf(87), new EntityEggInfo(87, 0xffd63a, 0xf6dc76));
								ModLoader.addLocalization("entity.Scorpion.name", "Scorpion");
								
		EntityRegistry.registerGlobalEntityID(EntityAbbyDemon.class, "Abby Demon", 88);					
								ModLoader.addSpawn(EntityAbbyDemon.class, 1, 2, 2, EnumCreatureType.monster);	
								EntityList.entityEggs.put(Integer.valueOf(88), new EntityEggInfo(88, 0x000000, 0xf6dc76));
								ModLoader.addLocalization("entity.Abby Demon.name", "Abyssal demon");
								
	EntityRegistry.registerGlobalEntityID(EntityGreenDragon.class, "Green Dragon", 89);					
								ModLoader.addSpawn(EntityGreenDragon.class, 0, 0, 0, EnumCreatureType.monster);	
								EntityList.entityEggs.put(Integer.valueOf(89), new EntityEggInfo(89, 0x85ff2c, 0xf6dc76));
								ModLoader.addLocalization("entity.Green Dragon.name", "Green Dragon");
								
	EntityRegistry.registerGlobalEntityID(EntityIronDragon.class, "Iron Dragon", 101);					
								ModLoader.addSpawn(EntityIronDragon.class, 0, 0, 0, EnumCreatureType.monster);							
								EntityList.entityEggs.put(Integer.valueOf(101), new EntityEggInfo(101, 0xddcfe1, 0xf6dc76));
								ModLoader.addLocalization("entity.Iron Dragon.name", "Iron Dragon");
								
	EntityRegistry.registerGlobalEntityID(EntityIceGiant.class, "Ice Giant", 102);					
								ModLoader.addSpawn(EntityIceGiant.class, 2, 2, 2, EnumCreatureType.monster);	
								EntityList.entityEggs.put(Integer.valueOf(102), new EntityEggInfo(102, 0xddcfe1, 0xf6dc76));
								ModLoader.addLocalization("entity.Ice Giant.name", "Ice Giant");
								
	EntityRegistry.registerGlobalEntityID(EntityHighMage.class, "High Mage", 103);
									ModLoader.addSpawn(EntityHighMage.class, 0, 0, 0, EnumCreatureType.monster);
									EntityList.entityEggs.put(Integer.valueOf(103), new EntityEggInfo(103, 0x000000, 0xf6dc76));
									ModLoader.addLocalization("entity.High Mage.name", "High Mage");
							
	EntityRegistry.registerGlobalEntityID(EntityHellhound.class, "Hellhound", 84);					
	ModLoader.addSpawn(EntityHellhound.class, 0, 0, 0, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});						
	EntityList.entityEggs.put(Integer.valueOf(84), new EntityEggInfo(84, 0x000000, 0xf6dc76));
	ModLoader.addLocalization("entity.Hellhound.name", "Hellhound");
	
	EntityRegistry.registerGlobalEntityID(EntityLesserDemon.class, "LesserDemonOld", 105);
					ModLoader.addSpawn(EntityLesserDemon.class, 1, 1, 1, EnumCreatureType.monster);
					ModLoader.addSpawn(EntityLesserDemon.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
	
	EntityRegistry.registerGlobalEntityID(EntityLesserDemon2.class, "LesserDemon", 106);
					ModLoader.addSpawn(EntityLesserDemon2.class, 1, 1, 1, EnumCreatureType.monster);
					ModLoader.addSpawn(EntityLesserDemon2.class, 20, 3, 3, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
					EntityList.entityEggs.put(Integer.valueOf(106), new EntityEggInfo(106, 0x000000, 0xf6dc76));
					ModLoader.addLocalization("entity.LesserDemon.name", "Lesser Demon");
					
					EntityRegistry.registerGlobalEntityID(EntityGeneralGraardor.class, "GeneralGraardor", 110);
					ModLoader.addSpawn(EntityGeneralGraardor.class, 0, 0, 0, EnumCreatureType.monster);	
					EntityList.entityEggs.put(Integer.valueOf(110), new EntityEggInfo(110, 0x2cff3b, 0xf6dc76));
					ModLoader.addLocalization("entity.GeneralGraardor.name", "General Graardor");
					
					EntityRegistry.registerGlobalEntityID(EntitySergeantGrimspike.class, "SergeantGrimspike", 111);
					ModLoader.addSpawn(EntitySergeantGrimspike.class, 0, 0, 0, EnumCreatureType.monster);
					EntityList.entityEggs.put(Integer.valueOf(111), new EntityEggInfo(111, 0x2cff3b, 0xf6dc76));
					ModLoader.addLocalization("entity.SergeantGrimspike.name", "Sergeant Grimspike");

					EntityRegistry.registerGlobalEntityID(EntitySergeantSteelwill.class, "SergeantSteelwill", 112);
					ModLoader.addSpawn(EntitySergeantSteelwill.class, 0, 0, 0, EnumCreatureType.monster);
					EntityList.entityEggs.put(Integer.valueOf(112), new EntityEggInfo(112, 0x2cff3b, 0xf6dc76));
					ModLoader.addLocalization("entity.SergeantSteelwill.name", "Sergeant Steelwill");
					
					EntityRegistry.registerGlobalEntityID(EntitySergeantStrongstack.class, "SergeantStrongstack", 113);
					ModLoader.addSpawn(EntitySergeantStrongstack.class, 0, 0, 0, EnumCreatureType.monster);
					EntityList.entityEggs.put(Integer.valueOf(113), new EntityEggInfo(113, 0x2cff3b, 0xf6dc76));
					ModLoader.addLocalization("entity.SergeantStrongstack.name", "Sergeant Strongstack");
			
	EntityRegistry.registerGlobalEntityID(EntityDharok.class, "Dharok", 115);
	ModLoader.addSpawn(EntityDharok.class, 0, 0, 0, EnumCreatureType.monster);
	EntityList.entityEggs.put(Integer.valueOf(115), new EntityEggInfo(115, 0x0d5800, 0xf6dc76));
	ModLoader.addLocalization("entity.Dharok.name", "Dharok");
	
	EntityRegistry.registerGlobalEntityID(EntityTorag.class, "Torag", 116);
	ModLoader.addSpawn(EntityTorag.class, 0, 0, 0, EnumCreatureType.monster);
	EntityList.entityEggs.put(Integer.valueOf(116), new EntityEggInfo(116, 0x0d5800, 0xf6dc76));
	ModLoader.addLocalization("entity.Torag.name", "Torag");
	
	EntityRegistry.registerGlobalEntityID(EntityVerac.class, "Verac", 117);
	ModLoader.addSpawn(EntityVerac.class, 0, 0, 0, EnumCreatureType.monster);
	EntityList.entityEggs.put(Integer.valueOf(117), new EntityEggInfo(117, 0x0d5800, 0xf6dc76));
	ModLoader.addLocalization("entity.Verac.name", "Verac");		
	
	EntityRegistry.registerGlobalEntityID(EntityGuthan.class, "Guthan", 118);
	ModLoader.addSpawn(EntityGuthan.class, 0, 0, 0, EnumCreatureType.monster);
	EntityList.entityEggs.put(Integer.valueOf(118), new EntityEggInfo(118, 0x0d5800, 0xf6dc76));
	ModLoader.addLocalization("entity.Guthan.name", "Guthan");
	
	EntityRegistry.registerGlobalEntityID(EntityKaril.class, "Karil", 119);
	ModLoader.addSpawn(EntityKaril.class, 0, 0, 0, EnumCreatureType.monster);
	EntityList.entityEggs.put(Integer.valueOf(119), new EntityEggInfo(119, 0x0d5800, 0xf6dc76));
	ModLoader.addLocalization("entity.Karil.name", "Karil");
	
	EntityRegistry.registerGlobalEntityID(EntityAkrisae.class, "Akrisae", 122);
	ModLoader.addSpawn(EntityAkrisae.class, 0, 0, 0, EnumCreatureType.monster);
	EntityList.entityEggs.put(Integer.valueOf(122), new EntityEggInfo(122, 0x0d5800, 0xf6dc76));
	ModLoader.addLocalization("entity.Akrisae.name", "Akrisae");
	
	EntityRegistry.registerGlobalEntityID(EntityAhrim.class, "Ahrim", 121);
	ModLoader.addSpawn(EntityAhrim.class, 0, 0, 0, EnumCreatureType.monster);
	EntityList.entityEggs.put(Integer.valueOf(121), new EntityEggInfo(121, 0x0d5800, 0xf6dc76));
	ModLoader.addLocalization("entity.Ahrim.name", "Ahrim");
	
	  EntityRegistry.registerGlobalEntityID(EntityFarmer.class, "Farmer", 123);
			ModLoader.addSpawn(EntityFarmer.class, 1, 1, 1, EnumCreatureType.creature);
			EntityList.entityEggs.put(Integer.valueOf(123), new EntityEggInfo(123, 0x6d4d00, 0xf6dc76));
			ModLoader.addLocalization("entity.Farmer.name", "Farmer");
			
			 EntityRegistry.registerGlobalEntityID(EntityBarbarian.class, "Barbarian", 124);
				ModLoader.addSpawn(EntityBarbarian.class, 1, 1, 1, EnumCreatureType.creature);	
				EntityList.entityEggs.put(Integer.valueOf(124), new EntityEggInfo(124, 0xeeeeee, 0xf6dc76));
				ModLoader.addLocalization("entity.Barbarian.name", "Barbarian");
				
				 EntityRegistry.registerGlobalEntityID(EntityShopKeeper.class, "ShopKeeper", 125);
					ModLoader.addSpawn(EntityShopKeeper.class, 0, 0, 0, EnumCreatureType.creature);	
					EntityList.entityEggs.put(Integer.valueOf(125), new EntityEggInfo(125, 0xeeeeee, 0xf6dc76));
					ModLoader.addLocalization("entity.ShopKeeper.name", "ShopKeeper");
					
EntityRegistry.registerGlobalEntityID(EntityRat.class, "Rat", 126);
ModLoader.addSpawn(EntityRat.class, 3, 3, 3, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(126), new EntityEggInfo(126, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Rat.name", "Rat");
						
EntityRegistry.registerGlobalEntityID(EntityRatSmall.class, "RatSmall", 127);
ModLoader.addSpawn(EntityRatSmall.class, 3, 3, 3, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(127), new EntityEggInfo(127, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.RatSmall.name", "RatSmall");

EntityRegistry.registerGlobalEntityID(EntityVampire.class, "Vampire", 23);
ModLoader.addSpawn(EntityVampire.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(23), new EntityEggInfo(23, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Vampire.name", "Vampire");

EntityRegistry.registerGlobalEntityID(EntityDoctor.class, "Doctor", 24);
ModLoader.addSpawn(EntityDoctor.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(24), new EntityEggInfo(24, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Doctor.name", "Doctor");
	

EntityRegistry.registerGlobalEntityID(EntityMan.class, "Man", 25);
ModLoader.addSpawn(EntityMan.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(25), new EntityEggInfo(25, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Man.name", "Man");

EntityRegistry.registerGlobalEntityID(EntityMorgan.class, "Morgan", 26);
ModLoader.addSpawn(EntityMorgan.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(26), new EntityEggInfo(26, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Morgan.name", "Morgan");

EntityRegistry.registerGlobalEntityID(EntityTD.class, "TD", 27);
ModLoader.addSpawn(EntityTD.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(27), new EntityEggInfo(27, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.TD.name", "TD");

EntityRegistry.registerGlobalEntityID(EntityKos1.class, "Kos1", 28);
ModLoader.addSpawn(EntityKos1.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(28), new EntityEggInfo(28, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Kos1.name", "Koschei the Deathless");

EntityRegistry.registerGlobalEntityID(EntityKos4.class, "Kos4", 29);
ModLoader.addSpawn(EntityKos4.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(29), new EntityEggInfo(29, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Kos4.name", "Koschei the Deathless shadow");

EntityRegistry.registerGlobalEntityID(EntityFremGuard.class, "FremGuard", 30);
ModLoader.addSpawn(EntityFremGuard.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(30), new EntityEggInfo(30, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.FremGuard.name", "Fremmick Guard");

EntityRegistry.registerGlobalEntityID(EntityKos2.class, "Kos2", 31);
ModLoader.addSpawn(EntityKos2.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(31), new EntityEggInfo(31, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Kos2.name", "Koschei the Deathless2");

EntityRegistry.registerGlobalEntityID(EntityKos3.class, "Kos3", 32);
ModLoader.addSpawn(EntityKos3.class, 0, 0, 0, EnumCreatureType.creature);	
EntityList.entityEggs.put(Integer.valueOf(32), new EntityEggInfo(32, 0xeeeeee, 0xf6dc76));
ModLoader.addLocalization("entity.Kos3.name", "Koschei the Deathless3");



EntityRegistry.registerGlobalEntityID(EntityLavaBlock.class, "LavaBlock", EntityRegistry.findGlobalUniqueEntityId());
EntityRegistry.registerModEntity(EntityLavaBlock.class, "LavaBlock", 0, this, 129, 1, true);
LanguageRegistry.instance().addStringLocalization("entity.LavaBlock.mod_mobs.name", "Lava Block");
	}

}
