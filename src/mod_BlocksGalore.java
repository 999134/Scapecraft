package net.minecraft.src;

import java.beans.EventHandler;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;


@NetworkMod(clientSideRequired=true, serverSideRequired=true)
public class mod_BlocksGalore extends BaseMod {
	public static final String modid = "mod_BlocksGalore";
	 public static EnumToolMaterial ADDY = EnumHelper.addToolMaterial("ADDY", 2, 700, 7.5F, 3.0F, 10);
	 public static EnumToolMaterial MITH = EnumHelper.addToolMaterial("MITH", 2, 400, 6.5F, 2.0F, 10);
	 public static EnumToolMaterial RUNE = EnumHelper.addToolMaterial("RUNE", 3, 2000, 10.5F, 4.0F, 10);
	 public static EnumToolMaterial CHAOTIC = EnumHelper.addToolMaterial("CHAOTIC", 3, 5000, 15.0F, 7.0F, 30);
	 public static EnumToolMaterial GALOREG = EnumHelper.addToolMaterial("GALOREG", 3, 500, 100.0F, 7.0F, 30);
	 public static EnumToolMaterial KORASIS = EnumHelper.addToolMaterial("KORASIS", 3, 20, 5.0F, 8.0F, 10);
	 public static EnumToolMaterial DRAGON = EnumHelper.addToolMaterial("DRAGON", 3, 2500, 15.0F, 5.0F, 30);
	 public static EnumToolMaterial DRAGONC = EnumHelper.addToolMaterial("DRAGONC", 3, 250, 15.0F, 7.0F, 30);	 
	 public static EnumToolMaterial BLACK = EnumHelper.addToolMaterial("BLACK", 2, 300, 6.0F, 2.0F, 15);
	 public static EnumToolMaterial BLACKH = EnumHelper.addToolMaterial("BLACKH", 2, 1500, 6.0F, 3.0F, 15);
	 	 
	 public static EnumToolMaterial AGSM = EnumHelper.addToolMaterial("AGS", 3, 30000, 15.0F, 15.0F, 30);
	 public static EnumToolMaterial BGSM = EnumHelper.addToolMaterial("BGS", 3, 30000, 15.0F, 13.0F, 30);
	 public static EnumToolMaterial SGSM = EnumHelper.addToolMaterial("SGS", 3, 30000, 15.0F, 12.0F, 30);
	 public static EnumToolMaterial ZGSM = EnumHelper.addToolMaterial("ZGS", 3, 30000, 15.0F, 12.0F, 30);
	 public static EnumToolMaterial SSM = EnumHelper.addToolMaterial("SS", 3, 30000, 15.0F, 10.0F, 30);
	 
	 public static EnumToolMaterial CHICKEN = EnumHelper.addToolMaterial("Chicken", 3, 15000000, 15.0F, -4.0F, 100);
	 public static EnumToolMaterial KERISM = EnumHelper.addToolMaterial("Keris", 3, 15000000, 15.0F, 6.0F, 40);
	 public static EnumToolMaterial STAKEM = EnumHelper.addToolMaterial("Stake", 3, 150, 15.0F, 1.0F, 40);
	 public static EnumToolMaterial PITCHFORK = EnumHelper.addToolMaterial("PitchFork", 1, 5000, 3.0F, 1.0F, 100);
	 public static EnumToolMaterial RAPIERM = EnumHelper.addToolMaterial("RAPIER", 3, 30000, 15.0F, 14.0F, 30);
	 public static EnumToolMaterial DRAGOND = EnumHelper.addToolMaterial("DRAGOND", 3, 2500, 15.0F, 3.0F, 30);
	 public static EnumToolMaterial DRAGONB = EnumHelper.addToolMaterial("DRAGONB", 3, 2500, 15.0F, 8.0F, 30);
	 public static EnumToolMaterial DRAGONS = EnumHelper.addToolMaterial("DRAGONS", 3, 2500, 15.0F, 7.0F, 30);
	 public static EnumToolMaterial WHIP = EnumHelper.addToolMaterial("WHIP", 3, 30000, 15.0F, 9.0F, 30);
	 public static EnumToolMaterial FREMM = EnumHelper.addToolMaterial("FREM", 3, 1000, 15.0F, 8.0F, 5);
	 public static EnumToolMaterial FREMFM = EnumHelper.addToolMaterial("FREMF", 3, 30000, 15.0F, 14.0F, 5);
	 public static EnumToolMaterial VESTA = EnumHelper.addToolMaterial("VESTA", 3, 100, 15.0F, 12.0F, 1);
	 public static EnumToolMaterial AGILITY = EnumHelper.addToolMaterial("AGILITY", 3, 500, 15.0F, 4.0F, 10);
	 
	 public static EnumToolMaterial STEELH = EnumHelper.addToolMaterial("STEEL", 2, 200, 5.5F, 2.0F, 10);
	 public static EnumToolMaterial ADDYH = EnumHelper.addToolMaterial("ADDY", 2, 700, 7.5F, 4.0F, 10);
	 public static EnumToolMaterial MITHH = EnumHelper.addToolMaterial("MITH", 2, 400, 6.5F, 3.0F, 10);
	 public static EnumToolMaterial RUNEH = EnumHelper.addToolMaterial("RUNE", 3, 2000, 10.5F, 5.0F, 10);
	 
	 public static EnumToolMaterial TORAG = EnumHelper.addToolMaterial("TORAG", 3, 10000, 15.0F, 11.0F, 8);
	 public static EnumToolMaterial VERAC = EnumHelper.addToolMaterial("VERAC", 3, 10000, 15.0F, 7.0F, 8);
	 public static EnumToolMaterial GUTHAN = EnumHelper.addToolMaterial("GUTHAN", 3, 10000, 15.0F, 8.0F, 8);
	 public static EnumToolMaterial DHAROK = EnumHelper.addToolMaterial("DHAROK", 3, 10000, 15.0F, 9.0F, 8);
	 public static EnumToolMaterial AHRIM = EnumHelper.addToolMaterial("AHRIM", 3, 10000, 15.0F, 8.0F, 8);
	 public static EnumToolMaterial AKRISAE = EnumHelper.addToolMaterial("AKRISAE", 3, 10000, 15.0F, 9.0F, 8);
	 
	public static final StepSound soundStoneFootstep = new StepSound("stone",1.0F, 1.0F);
	public static final Block bluecobblestone = (new BlockBlueCobblestone(167,26).setLightValue(0.6F).setHardness(7.5F).setResistance(10.0F).setUnlocalizedName("bluecobblestone"));
	public static final Block KQSpawn = (new BlockKQSpawn(168, 65).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("KQspawn"));
	public static final Block KQ2Spawn = (new BlockKQ2Spawn(169, 65).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("KQspawn2"));
	public static final Block BLKSpawn = (new BlockBLKSpawn(192, 81).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BlackKnightspawn"));
	public static final Block WHITESpawn = (new BlockWHITESpawn(193, 80).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("WhiteKnightspawn"));
	public static final Block BLKBlock = (new BlockBLKBlock(194, 81).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BlackKnightBlock"));
	public static final Block WHITEBlock = (new BlockWHITEBlock(195, 80).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("WhiteKnightBlock"));
	public static final Block THEIFSpawn = (new BlockTHEIFSpawn(196, 81).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Theifspawn"));
	public static final Block GUARDSpawn = (new BlockGUARDSpawn(197, 80).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Guardspawn"));
	public static final Block LESSERSpawn = (new BlockLesserSpawn(176, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Lesserspawn"));
	public static final Block LESSERSpawn2 = (new BlockLesserSpawn2(198, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Lesserspawn2"));
	public static final Block WIZARDSpawn = (new BlockWizardSpawn(162, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Wizardspawn"));
	public static final Block DARKWIZARDSpawn = (new BlockDarkwizardSpawn(163, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("DarkWizardspawn"));
	public static final Block GOBLINSpawn = (new BlockGoblinSpawn(164, 92).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Goblinspawn"));
	public static final Block SCORPIONSpawn = (new BlockScorpionSpawn(165, 93).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Scorpionspawn"));
	public static final Block ABBYDEMONSpawn = (new BlockAbbyDemonSpawn(166, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("AbbyDemonSpawn"));
	public static final Block GreenDragonSpawn = (new BlockGreenDragonSpawn(183, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("GreenDragonSpawn"));
	public static final Block IronDragonSpawn = (new BlockIronDragonSpawn(188).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("IronDragonSpawn"));
	public static final Block HardIceBlock = (new BlockHardIce(189).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("HardIceBlock"));
	public static final Block IceGiantSpawn = (new BlockIceGiantSpawn(184, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("IceGiantSpawn"));
	public static final Block BotSpawn = (new BlockBotSpawn(185, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BotSpawn"));
	public static final Block DwarfSpawn = (new BlockDwarfSpawn(186, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("DwarfSpawn"));
	public static final Block HighMageSpawn = (new BlockHighMageSpawn(190, 90).setHardness(1500.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("HighMageSpawn"));
	public static final Block HellhoundSpawn = (new BlockHellhoundSpawn(191, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("HellhoundSpawn"));
	public static final Block KingSpawn = (new BlockKingSpawn(223, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("KingSpawn"));
	public static final Block KingGuardSpawn = (new BlockKingGuardSpawn(222, 80).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("KingGuardSpawn"));
	public static final Block HeroKnightSpawn = (new BlockHeroKnightSpawn(221, 80).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("HeroKnightSpawn"));
	public static final Block EliteBlackSpawn = (new BlockEliteBlackKnightSpawn(229, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("EliteBlackKnightSpawn"));
	public static final Block BarbSpawn = (new BlockBarbSpawn(2290, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BarbSpawn"));
	public static final Block ShopKeeperSpawn = (new BlockShopKeeperSpawn(2291, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("ShopKeeperSpawn"));
	public static final Block Coffin = (new BlockCoffin(2292, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Coffin"));
	public static final Block Coffin2 = (new BlockCoffin2(2293, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Coffin2"));
	public static final Block DoctorSpawn = (new BlockDoctorSpawn(2294, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("DoctorSpawn"));
	public static final Block ManSpawn = (new BlockManSpawn(2295, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("ManSpawn"));
	public static final Block MorganSpawn = (new BlockMorganSpawn(2296, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("MorganSpawn"));
	public static final Block TDSpawn = (new BlockTDSpawn(2297, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("TDSpawn"));
	public static final Block RatSpawn = (new BlockRatSpawn(2298, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("RatSpawn"));
	public static final Block SmallRatSpawn = (new BlockSmallRatSpawn(2299, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("SmallRatSpawn"));
	public static final Block FremGuardSpawn = (new BlockFremGuardSpawn(2300, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("FremGuardSpawn"));
	public static final Block KosSpawn = (new BlockKosSpawn(2301, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("KosSpawn"));
	public static final Block KosTele = (new BlockKosTele(2302, 80).setHardness(400000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("KosTele"));
	public static final Block BlackDragonSpawn = (new BlockBlackDragonSpawn(2303, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BlackDragonSpawn"));
	public static final Block bluecobblestonec = (new BlockBlueCobblestoneC(2304,26).setLightValue(0.6F).setHardness(7.5F).setResistance(10.0F).setUnlocalizedName("bluecobblestonec"));
	public static final Block VarzeSpawn = (new BlockVarzeSpawn(3000, 90).setHardness(40.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("VarzeSpawn"));
	public static final Block BlackGuardSpawn = (new BlockBlackGuardpawn(3001, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BlackGuardSpawn"));
	public static final Block BlackGuard2Spawn = (new BlockBlackGuard2Spawn(3002, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BlackGuard2Spawn"));
	public static final Block HillGiantSpawn = (new BlockHillGiantSpawn(3003, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("HillGiantSpawn"));
	public static final Block FireGiantSpawn = (new BlockFireGiantSpawn(3004, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("FireGiantSpawn"));	
	public static final Block MossGiantSpawn = (new BlockMossGiantSpawn(3005, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("MossGiantSpawn"));
	public static final Block CaveCrawlerSpawn = (new BlockCaveCrawlerSpawn(3006, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("CaveCrawlerSpawn"));
	public static final Block GhostSpawn = (new BlockGhostSpawn(3007, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("GhostSpawn"));
	public static final Block BlackDemonSpawn = (new BlockBlackDemonSpawn(3008, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BlackDemonSpawn"));
	public static final Block CookSpawn = (new BlockCookSpawn(3009, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("CookSpawn"));
	public static final Block AgilityBlock = (new BlockAgilityBlock(3010, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("AgilityBlock"));
	public static final Block AgilityBlock2 = (new BlockAgilityBlock2(3011, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("AgilityBlock2"));
	public static final Block AgilityBlock3 = (new BlockAgilityBlock3(3012, 90).setHardness(400.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("AgilityBlock3"));
	
	
	public static final Block BandosMinion1Spawn = (new BlockBandosMinion1(224, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BandosMinion1Spawn"));
	public static final Block BandosMinion2Spawn = (new BlockBandosMinion2(225, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BandosMinion2Spawn"));
	public static final Block BandosMinion3Spawn = (new BlockBandosMinion3(226, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BandosMinion3Spawn"));
	public static final Block BandosBossSpawn = (new BlockBandosBoss(227, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BandosBoss"));
	
	public static final Block KeyBlock = (new BlockKeyBlock(230, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("KeyBlock"));
	public static final Block OpenKeyBlock = (new BlockOpenKeyBlock(231, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("OpenKeyBlock"));
	public static final Block KeyBlock2 = (new BlockKeyBlock2(2305, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("KeyBlock2"));
	public static final Block OpenKeyBlock2 = (new BlockOpenKeyBlock2(2306, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("OpenKeyBlock2"));
	
	
	public static final Block Mithore = (new BlockMithore(178, 29).setHardness(30.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Mithore"));
	public static final Block Addyore = (new BlockAddyore(179, 41).setHardness(60.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Addyore"));
	public static final Block Runeore = (new BlockRuneore(180, 53).setHardness(80.0F).setResistance(50.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Runeore"));
	public static final Block Scapecraft = (new BlockScapecraft(228, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("Scapecraft"));
	//public static final Block gifblock = (new Blockgifblock(220, 200).setHardness(40.0F).setResistance(50.0F).setStepSound(soundStoneFootstep));
	public static final Block FarmerSpawn = (new BlockFarmerSpawner(239, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("FarmerSpawn"));
	public static final Block WoolGate = (new BlockWoolGate(2500, 80).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("WoolGate"));
	
	
	public static final Block MithoreSpawn = (new BlockMithoreSpawn(2600, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("MithoreSpawn"));
	public static final Block RuneoreSpawn = (new BlockRuneoreSpawn(2601, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("RuneoreSpawn"));
	public static final Block AddyoreSpawn = (new BlockAddyoreSpawn(2602, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("AddyoreSpawn"));
	public static final Block CobblestoneSpawn = (new BlockCobblestoneSpawn(2603, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("CobblestoneSpawn"));
	public static final Block CoalSpawn = (new BlockCoalSpawn(2604, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("CoalSpawn"));
	public static final Block RedStoneSpawn = (new BlockRedStoneSpawn(2605, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("RedStoneSpawn"));
	public static final Block DiamondSpawn = (new BlockDiamondSpawn(2606, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("DiamondSpawn"));
	public static final Block BlueCobbleSpawn = (new BlockBlueCobbleSpawn(2607, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("BlueCobbleSpawn"));
	public static final Block GoldSpawn = (new BlockGoldSpawn(2608, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("GoldSpawn"));
	public static final Block EmeraldSpawn = (new BlockEmeraldSpawn(2609, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("EmeraldSpawn"));
	public static final Block IronSpawn = (new BlockIronSpawn(2610, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("IronSpawn"));
	public static final Block SandSpawn = (new BlockSandSpawn(2611, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("SandSpawn"));
	public static final Block DirtSpawn = (new BlockDirtSpawn(2612, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("DirtSpawn"));
	public static final Block SandStoneSpawn = (new BlockStoneSpawn(2613, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("SandstoneSpawn"));
	public static final Block CabbageSpawn = (new BlockCabbageSpawn(2614, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("CabbageSpawn"));
	public static final Block GravelSpawn = (new BlockGravelSpawn(2615, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("GravelSpawn"));
	public static final Block AnvilSpawn = (new BlockAnvilSpawn(2616, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("AnvilSpawn"));
	public static final Block OakTreeSpawn = (new BlockOakTreeSpawn(2617, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("OakTreeAnvilSpawn"));
	public static final Block YewTreeSpawn = (new BlockYewTreeSpawn(2618, 29).setHardness(200000.0F).setResistance(5000.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("YewTreeSpawn"));	
	
	public static final Item pickaxeGalore = new ItemPickaxeGalore(1351, DRAGON).setUnlocalizedName("mod_BlocksGalore:pickaxegalore");
	public static final Item PickaxeGaloreg = new ItemPickaxeGaloreg(1352, GALOREG).setUnlocalizedName("mod_BlocksGalore:pickaxegaloreg");
	public static final Item Mithpickaxe = new ItemMithpickaxe(1540, MITH).setUnlocalizedName("mod_BlocksGalore:Mithpickaxe");
	public static final Item Mithsword = new ItemMithsword(1550, MITH).setUnlocalizedName("mod_BlocksGalore:Mithsword");
	public static final Item Mithhoe = new ItemMithhoe(1560, EnumToolGalore.MITH).setUnlocalizedName("mod_BlocksGalore:MithHoe");
	public static final Item Mithshovel = new ItemMithshovel(1570, MITH).setUnlocalizedName("mod_BlocksGalore:Mithshovel");
	public static final Item Mithaxe = new ItemMithaxe(1580,  MITH).setUnlocalizedName("mod_BlocksGalore:Mithaxe");
	public static final Item Mithlump = new ItemMithlump(1590).setUnlocalizedName("mod_BlocksGalore:mithlump");
	public static final Item Mithingot = new ItemMithingot(1600).setUnlocalizedName("mod_BlocksGalore:mithingot");
	
	public static final Item Addypickaxe = new ItemAddypickaxe(1610,ADDY).setUnlocalizedName("mod_BlocksGalore:Addypickaxe");
	public static final Item Addysword = new ItemAddysword(1620,ADDY).setUnlocalizedName("mod_BlocksGalore:Addysword");
	public static final Item Addyhoe = new ItemAddyhoe(1630,  EnumToolGalore.ADDY).setUnlocalizedName("mod_BlocksGalore:Addyhoe");
	public static final Item Addyshovel = new ItemAddyshovel(1640,ADDY).setUnlocalizedName("mod_BlocksGalore:Addyshovel");
	public static final Item Addyaxe = new ItemAddyaxe(1650, ADDY).setUnlocalizedName("mod_BlocksGalore:Addyaxe");
	public static final Item Addylump = new ItemAddylump(1660).setUnlocalizedName("mod_BlocksGalore:Addylump");
	public static final Item Addyingot = new ItemAddyingot(1670).setUnlocalizedName("mod_BlocksGalore:Addyingot");
	
	public static final Item Runepickaxe = new ItemRunepickaxe(1680, RUNE).setUnlocalizedName("mod_BlocksGalore:Runepickaxe");
	public static final Item Runesword = new ItemRunesword(1690, RUNE).setUnlocalizedName("mod_BlocksGalore:Runesword");
	public static final Item Runehoe = new ItemRunehoe(1700, EnumToolGalore.RUNE).setUnlocalizedName("mod_BlocksGalore:Runehoe");
	public static final Item Runeshovel = new ItemRuneshovel(1710, RUNE).setUnlocalizedName("mod_BlocksGalore:Runeshovel");
	public static final Item Runeaxe = new ItemRuneaxe(1720,  RUNE).setUnlocalizedName("mod_BlocksGalore:Runeaxe");
	public static final Item Runelump = new ItemRunelump(1730).setUnlocalizedName("mod_BlocksGalore:Runelump");
	public static final Item Runeingot = new ItemRuneingot(1740).setUnlocalizedName("mod_BlocksGalore:Runeingot");
	
	public static final Item dlong = new Itemdlong(1350,  DRAGON).setUnlocalizedName("mod_BlocksGalore:dlong");
	public static final Item Blacksword = new ItemBlacksword(1750, BLACK).setUnlocalizedName("mod_BlocksGalore:BlackSword");
	public static final Item Whitesword = new ItemWhitesword(1760, BLACK).setUnlocalizedName("mod_BlocksGalore:WhiteSword");
	public static final Item korasis = new Itemkorasis(15300, KORASIS).setUnlocalizedName("mod_BlocksGalore:Korasisword");
	
	
	public static final Item RAPIER = new ItemRAPIER(20300, RAPIERM).setUnlocalizedName("mod_BlocksGalore:Rapier").setFull3D();
	public static final Item DD = new ItemDD(20201, DRAGOND).setUnlocalizedName("mod_BlocksGalore:DragonDagger").setFull3D();
	public static final Item DDS = new ItemDDS(20202, DRAGOND).setUnlocalizedName("mod_BlocksGalore:DragonDaggerS").setFull3D();
	public static final Item DBA = new ItemDBA(20200, DRAGONB).setUnlocalizedName("mod_BlocksGalore:DragonBattleaxe").setFull3D();
	public static final Item Sarastaff = new ItemSarastaff(13380).setUnlocalizedName("mod_BlocksGalore:Sarastaff").setFull3D();
	public static final Item Zammystaff = new ItemZammystaff(13390).setUnlocalizedName("mod_BlocksGalore:Zammystaff").setFull3D();
	public static final Item Guthixstaff = new ItemGuthixstaff(13400).setUnlocalizedName("mod_BlocksGalore:Guthixstaff").setFull3D();
	public static final Item Armastaff = new ItemArmastaff(13401).setUnlocalizedName("mod_BlocksGalore:Armastaff").setFull3D();
	public static final Item Whip = new ItemWhip(14000, WHIP).setUnlocalizedName("mod_BlocksGalore:Whip").setFull3D();
	public static final Item BGS = new ItemBGS(14100,BGSM).setUnlocalizedName("mod_BlocksGalore:BandosGodsword").setFull3D();
	public static final Item ZGS = new ItemZGS(14101,ZGSM).setUnlocalizedName("mod_BlocksGalore:ZamorakGodsword").setFull3D();
	public static final Item AGS = new ItemAGS(14102,AGSM).setUnlocalizedName("mod_BlocksGalore:ArmadylGodsword").setFull3D();
	public static final Item SGS = new ItemSGS(14103,SGSM).setUnlocalizedName("mod_BlocksGalore:SaradominGodsword").setFull3D();
	public static final Item SteelHammer = new ItemSteelHammer(14104, STEELH).setUnlocalizedName("mod_BlocksGalore:SteelWarhammer").setFull3D();
	public static final Item MithHammer = new ItemMithHammer(14105, MITHH).setUnlocalizedName("mod_BlocksGalore:MithHammer").setFull3D();
	public static final Item AddyHammer = new ItemAddyHammer(14108,ADDYH).setUnlocalizedName("mod_BlocksGalore:AddyHammer").setFull3D();
	public static final Item RuneHammer = new ItemRuneHammer(14109, RUNEH).setUnlocalizedName("mod_BlocksGalore:RuneHammer").setFull3D();
	
	public static final Item Dragonaxe = new ItemDragonaxe(13530,  DRAGONB).setUnlocalizedName("mod_BlocksGalore:Dragonaxe");
	public static final Item DragonScimmy = new ItemDragonScimmy(13531, DRAGONS).setUnlocalizedName("mod_BlocksGalore:DragonScimmy");
	public static final Item chicken = new Itemchicken(13532, CHICKEN).setUnlocalizedName("mod_BlocksGalore:chicken");
	public static final Item keris = new ItemKeris(13533, KERISM).setUnlocalizedName("mod_BlocksGalore:keris");
	public static final Item Stake = new ItemStake(18888, STAKEM).setUnlocalizedName("mod_BlocksGalore:stake");
	public static final Item fremsword = new ItemFremSword(18889, FREMM).setUnlocalizedName("mod_BlocksGalore:fremsword");
	public static final Item fremswordf = new ItemFremSwordf(18890, FREMFM).setUnlocalizedName("mod_BlocksGalore:fremswordf");
	public static final Item VestaSword = new ItemVestaSword(18891, VESTA).setUnlocalizedName("mod_BlocksGalore:VestaSword");
	public static final Item DragonCscimmy = new ItemDragonCscimmy(18892, DRAGONC).setUnlocalizedName("mod_BlocksGalore:DragonCscimmy");
	public static final Item AgilitySword = new ItemAgilitySword(18893, AGILITY).setUnlocalizedName("mod_BlocksGalore:AgilitySword");
	
	
	public static final Item contract = new ItemContract(13402).setUnlocalizedName("mod_BlocksGalore:contract");
	public static final Item contract2 = new ItemContract2(13403).setUnlocalizedName("mod_BlocksGalore:contract2");
	public static final Item contract3 = new ItemContract3(13404).setUnlocalizedName("mod_BlocksGalore:contract3");
	public static final Item contract4 = new ItemContract4(13416).setUnlocalizedName("mod_BlocksGalore:contract4");
	
	public static final Item note1 = new ItemNote1(13405).setUnlocalizedName("mod_BlocksGalore:goldnote1");
	public static final Item note2 = new ItemNote2(13406).setUnlocalizedName("mod_BlocksGalore:goldnote2");
	public static final Item note3 = new ItemNote3(13407).setUnlocalizedName("mod_BlocksGalore:goldnote3");

	public static final Item shard1 = new ItemShard1(13408).setUnlocalizedName("mod_BlocksGalore:shard1");
	public static final Item shard2 = new ItemShard2(13409).setUnlocalizedName("mod_BlocksGalore:shard2");
	public static final Item shard3 = new ItemShard3(13410).setUnlocalizedName("mod_BlocksGalore:shard3");
	public static final Item Hilt = new ItemHilt(13415).setUnlocalizedName("mod_BlocksGalore:hilt");
	
	public static final Item BandosHilt = new ItemBandosHilt(13411).setUnlocalizedName("mod_BlocksGalore:BandosHilt");
	public static final Item ArmadylHilt = new ItemArmadylHilt(13412).setUnlocalizedName("mod_BlocksGalore:ArmadylHilt");
	public static final Item SaradominHilt = new ItemSaradominHilt(13413).setUnlocalizedName("mod_BlocksGalore:SaradominHilt");
	public static final Item ZamorakHilt = new ItemZamorakHilt(13414).setUnlocalizedName("mod_BlocksGalore:ZamorakHilt");

	public static final Item sarasword = new ItemSaraSword(14110, SSM).setUnlocalizedName("mod_BlocksGalore:sarasword").setFull3D();

	public static final Item ToragHammer = new ItemToragHammer(14111, TORAG).setUnlocalizedName("mod_BlocksGalore:ToragHammerinv").setFull3D();
	public static final Item VeracFlail = new ItemVeracFlail(14112, VERAC).setUnlocalizedName("mod_BlocksGalore:VeracFlailinv").setFull3D();
	public static final Item GuthanSpear = new ItemGuthanSpear(14113, GUTHAN).setUnlocalizedName("mod_BlocksGalore:GuthanSpearinv").setFull3D();
	public static final Item DharokAxe = new ItemDharokAxe(14114, DHAROK).setUnlocalizedName("mod_BlocksGalore:DharokAxeinv").setFull3D();
	public static final Item AhrimStaff = new ItemAhrimStaff(14115, AHRIM).setUnlocalizedName("mod_BlocksGalore:AhrimStaffinv").setFull3D();
	public static final Item AkrisaeMace = new ItemAkrisaeMace(14116, AKRISAE).setUnlocalizedName("mod_BlocksGalore:AkrisaeMaceinv").setFull3D();
	public static final Item PitchFork = new ItemPitchFork(14117, PITCHFORK).setUnlocalizedName("mod_BlocksGalore:PitchFork").setFull3D();
	
	public static final Item BlackHalberd = new ItemBlackHalberd(14118, BLACKH).setUnlocalizedName("mod_BlocksGalore:BlackHalberd").setFull3D();
	

	public void load()

	{		    
		ModLoader.registerBlock(bluecobblestone);
		ModLoader.addName(bluecobblestone, "Blue Cobblestone");
		ModLoader.registerBlock(bluecobblestonec);
		ModLoader.addName(bluecobblestonec, "Concentrated Blue Cobblestone");
		ModLoader.registerBlock(KQSpawn);
		ModLoader.addName(KQSpawn, "Kalaphite Queen spawner");
		ModLoader.registerBlock(KQ2Spawn);
		ModLoader.addName(KQ2Spawn, "Kalaphite spawner");
		ModLoader.registerBlock(BLKSpawn);
		ModLoader.addName(BLKSpawn, "Black Knight spawner");
		ModLoader.registerBlock(WHITESpawn);
		ModLoader.addName(WHITESpawn, "White Knight spawner");
		ModLoader.registerBlock(BLKBlock);
		ModLoader.addName(BLKBlock, "Black Block");
		ModLoader.registerBlock(WHITEBlock);
		ModLoader.addName(WHITEBlock, "White Block");
		ModLoader.registerBlock(THEIFSpawn);
		ModLoader.addName(THEIFSpawn, "Thief spawner");
		ModLoader.registerBlock(GUARDSpawn);
		ModLoader.addName(GUARDSpawn, "Guard spawner");
		ModLoader.registerBlock(LESSERSpawn);
		ModLoader.addName(LESSERSpawn, "Old Lesser Demon spawner");
		ModLoader.registerBlock(LESSERSpawn2);
		ModLoader.addName(LESSERSpawn2, "Lesser Demon spawner");
		ModLoader.registerBlock(WIZARDSpawn);
		ModLoader.addName(WIZARDSpawn, "Good Wizard spawner");
		ModLoader.registerBlock(DARKWIZARDSpawn);
		ModLoader.addName(DARKWIZARDSpawn, "Dark Wizard spawner");
		ModLoader.registerBlock(HighMageSpawn);
		ModLoader.addName(HighMageSpawn, "High Mage spawner");
		ModLoader.registerBlock(GOBLINSpawn);
		ModLoader.addName(GOBLINSpawn, "Goblin spawner");
		ModLoader.registerBlock(SCORPIONSpawn);
		ModLoader.addName(SCORPIONSpawn, "Scorpion spawner");
		ModLoader.registerBlock(ABBYDEMONSpawn);
		ModLoader.addName(ABBYDEMONSpawn, "Abyssal Demon spawner");
		ModLoader.registerBlock(GreenDragonSpawn);
		ModLoader.addName(GreenDragonSpawn, "Green Dragon spawner");
		ModLoader.registerBlock(BlackDragonSpawn);
		ModLoader.addName(BlackDragonSpawn, "Black Dragon spawner");
		ModLoader.registerBlock(IronDragonSpawn);
		ModLoader.addName(IronDragonSpawn, "Iron Dragon spawner");
		ModLoader.registerBlock(IceGiantSpawn);
		ModLoader.addName(IceGiantSpawn, "Ice Giant spawner");
		ModLoader.registerBlock(BotSpawn);
		ModLoader.addName(BotSpawn, "Bot spawner");
		ModLoader.registerBlock(DwarfSpawn);
		ModLoader.addName(DwarfSpawn, "Dwarf spawner");
		ModLoader.registerBlock(HardIceBlock);
		ModLoader.addName(HardIceBlock, "Hardened Ice Block");
		ModLoader.registerBlock(HellhoundSpawn);
		ModLoader.addName(HellhoundSpawn, "Hellhound spawner");
		ModLoader.registerBlock(KingSpawn);
		ModLoader.addName(KingSpawn, "King spawner");
		ModLoader.registerBlock(KingGuardSpawn);
		ModLoader.addName(KingGuardSpawn, "King's Guard spawner");
		ModLoader.registerBlock(HeroKnightSpawn);
		ModLoader.addName(HeroKnightSpawn, "Hero Knight Spawner");
		ModLoader.registerBlock(EliteBlackSpawn);
		ModLoader.addName(EliteBlackSpawn, "Elite Black Knight Spawner");
		ModLoader.addName(FarmerSpawn, "Farmer spawner");ModLoader.registerBlock(FarmerSpawn);
		ModLoader.addName(BarbSpawn, "Barbarian spawner");ModLoader.registerBlock(BarbSpawn);
		ModLoader.addName(ShopKeeperSpawn, "ShopKeeper spawner");ModLoader.registerBlock(ShopKeeperSpawn);
		ModLoader.addName(Coffin, "Coffin");ModLoader.registerBlock(Coffin);
		ModLoader.addName(Coffin2, "Coffin");ModLoader.registerBlock(Coffin2);
		ModLoader.addName(DoctorSpawn, "Dr Harlow spawner(quest)");ModLoader.registerBlock(DoctorSpawn);
		ModLoader.addName(ManSpawn, "Normal Man spawner");ModLoader.registerBlock(ManSpawn);
		ModLoader.addName(MorganSpawn, "Morgan spawner (quest)");ModLoader.registerBlock(MorganSpawn);
		ModLoader.addName(TDSpawn, "Tormented Demon Spawner");ModLoader.registerBlock(TDSpawn);
		ModLoader.addName(RatSpawn, "Rat Spawner");ModLoader.registerBlock(RatSpawn);
		ModLoader.addName(SmallRatSpawn, "Small Rat Spawner");ModLoader.registerBlock(SmallRatSpawn);
		ModLoader.addName(FremGuardSpawn, "Fremmick Guard Spawner");ModLoader.registerBlock(FremGuardSpawn);
		ModLoader.addName(KosSpawn, "Kos Spawner");ModLoader.registerBlock(KosSpawn);
		ModLoader.addName(KosTele, "Kos Teleport Block");ModLoader.registerBlock(KosTele);
		ModLoader.registerBlock(VarzeSpawn);ModLoader.addName(VarzeSpawn, "Sir Amik Varze Spawner");
		ModLoader.registerBlock(BlackGuardSpawn);ModLoader.addName(BlackGuardSpawn, "Black Guard Spawner");
		ModLoader.registerBlock(BlackGuard2Spawn);ModLoader.addName(BlackGuard2Spawn, "Black Fortress Guard Spawner");
		ModLoader.registerBlock(HillGiantSpawn);ModLoader.addName(HillGiantSpawn, "Hill Giant Spawner");
		ModLoader.registerBlock(FireGiantSpawn);ModLoader.addName(FireGiantSpawn, "Fire Giant Spawner");		
		ModLoader.registerBlock(MossGiantSpawn);ModLoader.addName(MossGiantSpawn, "Moss Giant Spawner");
		ModLoader.registerBlock(CaveCrawlerSpawn);ModLoader.addName(CaveCrawlerSpawn, "Cave Crawler Spawner");
		ModLoader.registerBlock(GhostSpawn);ModLoader.addName(CaveCrawlerSpawn, "Ghost Spawner");
		ModLoader.registerBlock(BlackDemonSpawn);ModLoader.addName(BlackDemonSpawn, "Black Demon Spawner");
		ModLoader.registerBlock(CookSpawn);ModLoader.addName(CookSpawn, "Cook Spawner");
		ModLoader.registerBlock(AgilityBlock);ModLoader.addName(AgilityBlock, "Agility Block 1xp");
		ModLoader.registerBlock(AgilityBlock2);ModLoader.addName(AgilityBlock2, "Agility Block 5xp");
		ModLoader.registerBlock(AgilityBlock3);ModLoader.addName(AgilityBlock3, "Agility Block 20xp");
		
		
		ModLoader.addName(BandosMinion1Spawn, "Sergeant Grimspike spawner");ModLoader.registerBlock(BandosMinion1Spawn);
		ModLoader.addName(BandosMinion2Spawn, "Sergeant Steelwill spawner");ModLoader.registerBlock(BandosMinion2Spawn);
		ModLoader.addName(BandosMinion3Spawn, "Sergeant Strongstack spawner");ModLoader.registerBlock(BandosMinion3Spawn);
		ModLoader.addName(BandosBossSpawn, "General Graardor spawner");ModLoader.registerBlock(BandosBossSpawn);
		
		ModLoader.registerBlock(MithoreSpawn);ModLoader.addName(MithoreSpawn, "Mithril Ore Spawn");
		ModLoader.registerBlock(AddyoreSpawn);ModLoader.addName(AddyoreSpawn, "Adamant Ore Spawn");
		ModLoader.registerBlock(RuneoreSpawn);ModLoader.addName(RuneoreSpawn, "Rune Ore Spawn");
		ModLoader.registerBlock(CoalSpawn);ModLoader.addName(CoalSpawn, "Coal Ore Spawn");
		ModLoader.registerBlock(CobblestoneSpawn);ModLoader.addName(CobblestoneSpawn, "Cobblestone Spawn");
		ModLoader.registerBlock(DirtSpawn);ModLoader.addName(DirtSpawn, "Dirt Spawn");
		ModLoader.registerBlock(BlueCobbleSpawn);ModLoader.addName(BlueCobbleSpawn, "BlueCobble Spawn");
		ModLoader.registerBlock(SandSpawn);ModLoader.addName(SandSpawn, "Sand Spawn");
		ModLoader.registerBlock(SandStoneSpawn);ModLoader.addName(SandStoneSpawn, "SandStone Spawn");
		ModLoader.registerBlock(DiamondSpawn);ModLoader.addName(DiamondSpawn, "Diamond Spawn");
		ModLoader.registerBlock(EmeraldSpawn);ModLoader.addName(EmeraldSpawn, "Emerald Spawn");
		ModLoader.registerBlock(RedStoneSpawn);ModLoader.addName(RedStoneSpawn, "Redstone Ore Spawn");
		ModLoader.registerBlock(IronSpawn);ModLoader.addName(IronSpawn, "Iron Ore Spawn");
		ModLoader.registerBlock(GoldSpawn);ModLoader.addName(GoldSpawn, "Gold Ore Spawn");
		ModLoader.registerBlock(CabbageSpawn);ModLoader.addName(CabbageSpawn, "Cabbage Spawn");
		ModLoader.registerBlock(GravelSpawn);ModLoader.addName(GravelSpawn, "Gravel Spawn");
		ModLoader.registerBlock(AnvilSpawn);ModLoader.addName(AnvilSpawn, "Anvil Spawn");
		ModLoader.registerBlock(OakTreeSpawn);ModLoader.addName(OakTreeSpawn, "OakTree Spawn");
		ModLoader.registerBlock(YewTreeSpawn);ModLoader.addName(YewTreeSpawn, "YewTree Spawn");
		
		
		
		
		ModLoader.addName(Scapecraft, "Read This Block!");ModLoader.registerBlock(Scapecraft);
		ModLoader.addName(KeyBlock, "Locked Door (Barrows)");ModLoader.registerBlock(KeyBlock);
		ModLoader.addName(OpenKeyBlock, "Open Door(Barrows)");ModLoader.registerBlock(OpenKeyBlock);
		ModLoader.addName(KeyBlock2, "Locked Door (Fortress)");ModLoader.registerBlock(KeyBlock2);
		ModLoader.addName(OpenKeyBlock2, "Open Door(Fortress)");ModLoader.registerBlock(OpenKeyBlock2);
		ModLoader.addName(WoolGate, "20 wool block (Quest)");ModLoader.registerBlock(WoolGate);
		
		
	
		ModLoader.registerBlock(Mithore);
		ModLoader.registerBlock(Addyore);
		ModLoader.registerBlock(Runeore);
		
		ModLoader.addName(Mithpickaxe, "Mithril Pickaxe");
		ModLoader.addName(Mithsword, "Mithril Sword");
		ModLoader.addName(Mithhoe, "Mithril Hoe");
		ModLoader.addName(Mithshovel, "Mithril Shovel");
		ModLoader.addName(Mithaxe, "Mithril Axe");
		ModLoader.addName(Mithore, "Mithril Ore");
		ModLoader.addName(Mithlump, "Mithril Lump");
		ModLoader.addName(Mithingot, "Mithril Ingot");

		
		ModLoader.addName(Addypickaxe, "Adamant Pickaxe");
		ModLoader.addName(Addysword, "Adamant Sword");
		ModLoader.addName(Addyhoe, "Adamant Hoe");
		ModLoader.addName(Addyshovel, "Adamant Shovel");
		ModLoader.addName(Addyaxe, "Adamant Axe");
		ModLoader.addName(Addyore, "Adamant Ore");
		ModLoader.addName(Addylump, "Adamant Lump");
		ModLoader.addName(Addyingot, "Adamant Ingot");
		
		ModLoader.addName(Runepickaxe, "Rune Pickaxe");
		ModLoader.addName(Runesword, "Rune Sword");
		ModLoader.addName(Runehoe, "Rune Hoe");
		ModLoader.addName(Runeshovel, "Rune Shovel");
		ModLoader.addName(Runeaxe, "Rune Axe");
		ModLoader.addName(Runeore, "Rune Ore");
		ModLoader.addName(Runelump, "Rune Lump");
		ModLoader.addName(Runeingot, "Rune Ingot");
		
		ModLoader.addName(pickaxeGalore, "Dragon Pickaxe");
		ModLoader.addName(PickaxeGaloreg, "Dragon Pickaxe(G)");
		ModLoader.addName(dlong, "Dragon Longsword");
		ModLoader.addName(DragonScimmy, "Dragon Scimitar");
		ModLoader.addName(DBA, "Dragon Battleaxe");
		ModLoader.addName(DD, "Dragon Dagger");
		ModLoader.addName(DDS, "Dragon Dagger(s)");
		ModLoader.addName(Blacksword, "Black Sword");
		ModLoader.addName(Whitesword, "White Sword");
		ModLoader.addName(korasis, "Korasi's sword");
		
		ModLoader.addName(BGS, "Bandos Godsword");
		ModLoader.addName(ZGS, "Zamorak Godsword");
		ModLoader.addName(AGS, "Armadyl Godsword");
		ModLoader.addName(SGS, "Saradomin Godsword");
		ModLoader.addName(RAPIER, "Chaotic Rapier");
		ModLoader.addName(Whip, "Abyssal Whip");
		ModLoader.addName(Sarastaff, "Saradomin's Staff");
		ModLoader.addName(Zammystaff, "Zamorak's Staff");
		ModLoader.addName(Guthixstaff, "Guthix's Staff");
		ModLoader.addName(Armastaff, "Armadyl's Staff");
		ModLoader.addName(Dragonaxe, "Dragon Axe");
		ModLoader.addName(chicken, "Rubber Chicken");
		ModLoader.addName(keris, "Keris");
		ModLoader.addName(Stake, "Wooden Stake");
		
		ModLoader.addName(SteelHammer, "Iron Warhammer");
		ModLoader.addName(MithHammer, "Mithril Warhammer");
		ModLoader.addName(AddyHammer, "Adamant Warhammer");
		ModLoader.addName(RuneHammer, "Rune Warhammer");
		
		ModLoader.addName(sarasword, "Saradomin Sword");
		
		
		ModLoader.addName(contract, "White Knight Contract");
		ModLoader.addName(contract2, "Guard Contract");
		ModLoader.addName(contract3, "Wizard Contract");
		ModLoader.addName(contract4, "White Knight Hero Contract");
		
		ModLoader.addName(note1, "Gold Note - Gold Block X9");
		ModLoader.addName(note2, "Gold Contract - Gold Note X9");
		ModLoader.addName(note3, "Donation Token");
		
		ModLoader.addName(shard1, "GodSword Shard 1");
		ModLoader.addName(shard2, "GodSword Shard 2");
		ModLoader.addName(shard3, "GodSword Shard 3");
		ModLoader.addName(Hilt, "Godsword Blade");
		
		ModLoader.addName(BandosHilt, "Bandos Hilt");
		ModLoader.addName(SaradominHilt, "Saradomin Hilt");
		ModLoader.addName(ArmadylHilt, "Armadyl Hilt");
		ModLoader.addName(ZamorakHilt, "Zamorak Hilt");
		
		
		ModLoader.addName(ToragHammer, "Torag's Hammer");
		ModLoader.addName(VeracFlail, "Verac's Flail");
		ModLoader.addName(GuthanSpear, "Guthan's Spear");
		ModLoader.addName(DharokAxe, "Dharok's Axe");
		ModLoader.addName(AhrimStaff, "Ahrim's Staff");
		ModLoader.addName(AkrisaeMace, "Akrisae's Mace");
		
		ModLoader.addName(PitchFork, "PitchFork");
		ModLoader.addName(BlackHalberd, "Black Halberd");
		ModLoader.addName(fremsword, "Fremmick Blade");
		ModLoader.addName(fremswordf, "Blazing Fremmick Blade");
		ModLoader.addName(VestaSword, "Corrupt Vesta Longsword");
		ModLoader.addName(DragonCscimmy, "Corrupt Dragon Scimitar");
		ModLoader.addName(AgilitySword, "Agile Blade");
		

		ModLoader.setInGameHook(this, true, false);

		 MinecraftForge.setBlockHarvestLevel(mod_BlocksGalore.Runeore, 0, "pickaxe", 3);
		 MinecraftForge.setBlockHarvestLevel(mod_BlocksGalore.Addyore, 0, "pickaxe", 2);
		 MinecraftForge.setBlockHarvestLevel(mod_BlocksGalore.Mithore, 0, "pickaxe", 2);
		
		
		

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithpickaxe, 1),	new Object[] { "XXX", " Y ", " Y ", 'X', mod_BlocksGalore.Mithingot, 'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithhoe, 1),	new Object[] { "XX ", " Y ", " Y ", 'X', mod_BlocksGalore.Mithingot,  'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithsword, 1), new Object[] { " X ", " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Mithingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithaxe, 1), new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), mod_BlocksGalore.Mithingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithshovel, 1), new Object[] { " X ", " Y ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Mithingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.MithHammer, 1), new Object[] { "XXX", "XYX", " Y ", Character.valueOf('X'),mod_BlocksGalore.Mithingot, Character.valueOf('Y'), Item.stick });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addypickaxe, 1),	new Object[] { "XXX", " Y ", " Y ", 'X', mod_BlocksGalore.Addyingot, 'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addyhoe, 1),	new Object[] { "XX ", " Y ", " Y ", 'X', mod_BlocksGalore.Addyingot,  'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addysword, 1), new Object[] { " X ", " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Addyingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addyaxe, 1), new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), mod_BlocksGalore.Addyingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addyshovel, 1), new Object[] { " X ", " Y ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Addyingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.AddyHammer, 1), new Object[] { "XXX", "XYX", " Y ", Character.valueOf('X'),mod_BlocksGalore.Addyingot, Character.valueOf('Y'), Item.stick });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runepickaxe, 1),	new Object[] { "XXX", " Y ", " Y ", 'X', mod_BlocksGalore.Runeingot, 'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runehoe, 1),	new Object[] { "XX ", " Y ", " Y ", 'X', mod_BlocksGalore.Runeingot,  'Y', Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runesword, 1), new Object[] { " X ", " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Runeingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runeaxe, 1), new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), mod_BlocksGalore.Runeingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runeshovel, 1), new Object[] { " X ", " Y ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Runeingot, Character.valueOf('Y'), Item.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.RuneHammer, 1), new Object[] { "XXX", "XYX", " Y ", Character.valueOf('X'),mod_BlocksGalore.Runeingot, Character.valueOf('Y'), Item.stick });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.SteelHammer, 1), new Object[] { "XXX", "XYX", " Y ", Character.valueOf('X'),Item.ingotIron, Character.valueOf('Y'), Item.stick });
		
		GameRegistry.addSmelting(Mithlump.itemID, new ItemStack(Mithingot), 1.0F);
		GameRegistry.addSmelting(Addylump.itemID, new ItemStack(Addyingot), 1.0F);
		GameRegistry.addSmelting(Runelump.itemID, new ItemStack(Runeingot), 1.0F);

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithlump, 1),
				new Object[] { "XYX", Character.valueOf('X'), Item.coal,
						Character.valueOf('Y'), mod_BlocksGalore.Mithore });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addylump, 1),
				new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), Item.coal,
						Character.valueOf('Y'), mod_BlocksGalore.Addyore });

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runelump, 1),
				new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Item.coal,
						Character.valueOf('Y'), mod_BlocksGalore.Runeore });
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.KQSpawn, 1),
		//		new Object[] { "X", Character.valueOf('X'), Block.dirt });
		
		//GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.KQ2Spawn, 1),
		//		new Object[] { "X", Character.valueOf('X'), Block.sand });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract, 1),
				new Object[] { "XYX", Character.valueOf('X'), Item.ingotGold,
						Character.valueOf('Y'), Item.paper });
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.WHITESpawn, 1),
	//			new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.contract,
		//				});
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract, 9),
	//			new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.WHITESpawn,
	//					});
	//
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract2, 1),
				new Object[] { "XY", Character.valueOf('X'), Item.ingotGold,
						Character.valueOf('Y'), Item.paper });
		
//		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.GUARDSpawn, 1),
	//			new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.contract2,
	//					});
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract2, 9),
	//			new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.GUARDSpawn,
	//					});
		
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract3, 1),
				new Object[] { " X ","XYX"," X ", Character.valueOf('X'), Item.ingotGold,
						Character.valueOf('Y'), Item.paper });
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.WIZARDSpawn, 1),
	//			new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.contract3,
		//				});
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract3, 9),
	//			new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.WIZARDSpawn,
	//				});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract4, 1),
				new Object[] { "XXX","XYX","XXX", Character.valueOf('X'), Item.diamond,
						Character.valueOf('Y'), Item.paper });
		
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.note1, 1),
				new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), Block.blockGold,
						});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.note2, 1),
				new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.note1,
						});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.note1, 9),
				new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.note2,
						});
		
		GameRegistry.addRecipe(new ItemStack(Block.blockGold, 9),
				new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.note1,
						});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.note3, 1),
				new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.note2,
						});
		

		GameRegistry.addRecipe(
				new ItemStack(mod_BlocksGalore.PickaxeGaloreg, 1),
				new Object[] { "Y", "Y", "X", Character.valueOf('X'),
						mod_BlocksGalore.pickaxeGalore, Character.valueOf('Y'),
						Item.ingotGold});
		
		
		GameRegistry.addRecipe(
				new ItemStack(mod_BlocksGalore.DDS, 1),
				new Object[] { "Y Y", " X ", "Y Y", Character.valueOf('X'),
						mod_BlocksGalore.DD, Character.valueOf('Y'),
						Item.fermentedSpiderEye});

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.bluecobblestonec, 1),
				new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.bluecobblestone,
						});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Hilt, 1), new Object[] { " X ", " Y ", " Z ", Character.valueOf('X'),mod_BlocksGalore.shard1, Character.valueOf('Y'),mod_BlocksGalore.shard2, Character.valueOf('Z'),mod_BlocksGalore.shard3});

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.BGS, 1), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Hilt, Character.valueOf('Y'),mod_BlocksGalore.BandosHilt,});
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.ZGS, 1), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Hilt, Character.valueOf('Y'),mod_BlocksGalore.ZamorakHilt,});
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.AGS, 1), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Hilt, Character.valueOf('Y'),mod_BlocksGalore.ArmadylHilt,});
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.SGS, 1), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Hilt, Character.valueOf('Y'),mod_BlocksGalore.SaradominHilt,});
	
	
	
	}

	
	public void generateSurface(World world, Random random, int i, int j) {
		for (int i4 = 0; i4 < 20; i4++) {
			int j7 = i + random.nextInt(16);
			int k10 = random.nextInt(128);
			int j13 = j + random.nextInt(16);
			(new WorldGenMinable(mod_BlocksGalore.bluecobblestone.blockID, 8))
					.generate(world, random, j7, k10, j13);
		}
		for (int i4 = 0; i4 < 17; i4++) {
			int j7 = i + random.nextInt(16);
			int k10 = random.nextInt(45);
			int j13 = j + random.nextInt(16);
			(new WorldGenMinable(mod_BlocksGalore.Mithore.blockID, 8))
					.generate(world, random, j7, k10, j13);
		}
		for (int i4 = 0; i4 < 9; i4++) {
			int j7 = i + random.nextInt(16);
			int k10 = random.nextInt(23);
			int j13 = j + random.nextInt(16);
			(new WorldGenMinable(mod_BlocksGalore.Addyore.blockID, 8))
					.generate(world, random, j7, k10, j13);
		}
		for (int i4 = 0; i4 < 4; i4++) {
			int j7 = i + random.nextInt(16);
			int k10 = random.nextInt(11);
			int j13 = j + random.nextInt(16);
			(new WorldGenMinable(mod_BlocksGalore.Runeore.blockID, 8))
					.generate(world, random, j7, k10, j13);
		}
	}
	
	
	

	public String getVersion() {
		return ("1.6.4");
	}
}