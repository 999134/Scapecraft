package net.minecraft.src;

import potato.TestCommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
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


@NetworkMod(clientSideRequired=true, serverSideRequired=true, channels = {"tutchannel"}, packetHandler = PackageHandler.class)
public class mod_phat extends BaseMod
{
	
	@SidedProxy(serverSide="potato.TestCommonProxy", clientSide="potato.TestClientProxy")
	public static TestCommonProxy proxy;
	
	
	static EnumArmorMaterial armorSANTA= net.minecraftforge.common.EnumHelper.addArmorMaterial("SANTA", 50000, new int[]{4, 1, 1, 1}, 10);
	public static final Item santaHelmet = new ModItemArmor(5053, armorSANTA, 0, 0,"santa").setUnlocalizedName("santaHelmet");
	public static final Item santaChestplate = new ModItemArmor(5054, armorSANTA,1, 1,"santa").setUnlocalizedName("mod_phat:santaChestplate");
	public static final Item santaLeggings = new ModItemArmor(5055, armorSANTA, 2, 2,"santa").setUnlocalizedName("mod_phat:santaLeggings");
	public static final Item santaBoots = new ModItemArmor(5056, armorSANTA, 3, 3,"santa").setUnlocalizedName("mod_phat:santaBoots");
	
	static EnumArmorMaterial armorPHAT= net.minecraftforge.common.EnumHelper.addArmorMaterial("PHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item phatHelmet = new ModItemArmor(5001, armorPHAT, 0, 0,"phat").setUnlocalizedName("mod_phat:phatHelmet");
	public static final Item phatChestplate = new ModItemArmor(5002, armorPHAT,1, 1,"santa").setUnlocalizedName("mod_phat:phatChestplate");
	public static final Item phatLeggings = new ModItemArmor(5003, armorPHAT, 2, 2,"santa").setUnlocalizedName("mod_phat:phatLeggings");
	public static final Item phatBoots = new ModItemArmor(5004, armorPHAT, 3, 3,"santa").setUnlocalizedName("mod_phat:phatBoots");
	
	static EnumArmorMaterial armorWPHAT= net.minecraftforge.common.EnumHelper.addArmorMaterial("WPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item wphatHelmet = new ModItemArmor(5033, armorWPHAT, 0, 0,"whitephat").setUnlocalizedName("mod_phat:wphatHelmet");
	public static final Item wphatChestplate = new ModItemArmor(5034, armorWPHAT,1, 1,"santa").setUnlocalizedName("mod_phat:wphatChestplate");
	public static final Item wphatLeggings = new ModItemArmor(5035, armorWPHAT, 2, 2,"santa").setUnlocalizedName("mod_phat:wphatLeggings");
	public static final Item wphatBoots = new ModItemArmor(5036, armorWPHAT, 3, 3,"santa").setUnlocalizedName("mod_phat:wphatBoots");
	
	static EnumArmorMaterial armorYPHAT= net.minecraftforge.common.EnumHelper.addArmorMaterial("YPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item yphatHelmet = new ModItemArmor(5037, armorYPHAT, 0, 0,"yellowphat").setUnlocalizedName("mod_phat:yphatHelmet");
	public static final Item yphatChestplate = new ModItemArmor(5038, armorYPHAT,1, 1,"santa").setUnlocalizedName("mod_phat:yphatChestplate");
	public static final Item yphatLeggings = new ModItemArmor(5039, armorYPHAT, 2, 2,"santa").setUnlocalizedName("mod_phat:yphatLeggings");
	public static final Item yphatBoots = new ModItemArmor(5040, armorYPHAT, 3, 3,"santa").setUnlocalizedName("mod_phat:yphatBoots");
	
	static EnumArmorMaterial armorGPHAT= net.minecraftforge.common.EnumHelper.addArmorMaterial("GPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item gphatHelmet = new ModItemArmor(5041, armorGPHAT, 0, 0,"greenphat").setUnlocalizedName("mod_phat:gphatHelmet");
	public static final Item gphatChestplate = new ModItemArmor(5042, armorGPHAT,1, 1,"santa").setUnlocalizedName("mod_phat:gphatChestplate");
	public static final Item gphatLeggings = new ModItemArmor(5043, armorGPHAT, 2, 2,"santa").setUnlocalizedName("mod_phat:gphatLeggings");
	public static final Item gphatBoots = new ModItemArmor(5044, armorGPHAT, 3, 3,"santa").setUnlocalizedName("mod_phat:gphatBoots");
	
	static EnumArmorMaterial armorRPHAT= net.minecraftforge.common.EnumHelper.addArmorMaterial("RPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item rphatHelmet = new ModItemArmor(5045, armorRPHAT, 0, 0,"redphat").setUnlocalizedName("mod_phat:rphatHelmet");
	public static final Item rphatChestplate = new ModItemArmor(5046, armorRPHAT,1, 1,"santa").setUnlocalizedName("mod_phat:rphatChestplate");
	public static final Item rphatLeggings = new ModItemArmor(5047, armorRPHAT, 2, 2,"santa").setUnlocalizedName("mod_phat:rphatLeggings");
	public static final Item rphatBoots = new ModItemArmor(5048, armorRPHAT, 3, 3,"santa").setUnlocalizedName("mod_phat:rphatBoots");
	
	static EnumArmorMaterial armorPPHAT= net.minecraftforge.common.EnumHelper.addArmorMaterial("PPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item pphatHelmet = new ModItemArmor(5049, armorPPHAT, 0, 0,"purplephat").setUnlocalizedName("mod_phat:pphatHelmet");
	public static final Item pphatChestplate = new ModItemArmor(5050, armorPPHAT,1, 1,"santa").setUnlocalizedName("mod_phat:pphatChestplate");
	public static final Item pphatLeggings = new ModItemArmor(5051, armorPPHAT, 2, 2,"santa").setUnlocalizedName("mod_phat:pphatLeggings");
	public static final Item pphatBoots = new ModItemArmor(5052, armorPPHAT, 3, 3,"santa").setUnlocalizedName("mod_phat:pphatBoots");
	
	static EnumArmorMaterial armorDRAGON= net.minecraftforge.common.EnumHelper.addArmorMaterial("DRAGON", 5000, new int[]{3, 9, 6, 3}, 30);
	public static final Item dragonHelmet = new ModItemArmor(5017, armorDRAGON, 0, 0,"dragon").setUnlocalizedName(("mod_phat:dragonHelmet"));
	public static final Item dragonChestplate = new ModItemArmor(5018, armorDRAGON,1, 1,"dragon").setUnlocalizedName(("mod_phat:dragonChestplate"));
	public static final Item dragonLeggings = new ModItemArmor(5019, armorDRAGON, 2, 2,"dragon").setUnlocalizedName(("mod_phat:dragonLeggings"));
	public static final Item dragonBoots = new ModItemArmor(5020, armorDRAGON, 3, 3,"dragon").setUnlocalizedName(("mod_phat:dragonBoots"));
	
	static EnumArmorMaterial armorBLACK= net.minecraftforge.common.EnumHelper.addArmorMaterial("BLACK", 60, new int[]{2, 4, 3, 2}, 10);
	public static final Item blackHelmet = new ModItemArmor(5021, armorBLACK, 0, 0,"black").setUnlocalizedName("mod_phat:blackHelmet");
	public static final Item blackChestplate = new ModItemArmor(5022, armorBLACK,1, 1,"black").setUnlocalizedName("mod_phat:blackChestplate");
	public static final Item blackLeggings = new ModItemArmor(5023, armorBLACK, 2, 2,"black").setUnlocalizedName("mod_phat:blackLeggings");
	public static final Item blackBoots = new ModItemArmor(5024, armorBLACK, 3, 3,"black").setUnlocalizedName("mod_phat:blackBoots");
		
	static EnumArmorMaterial armorWHITE= net.minecraftforge.common.EnumHelper.addArmorMaterial("WHITE", 60, new int[]{2, 4, 3, 2}, 10);
	public static final Item whiteHelmet = new ModItemArmor(5025, armorWHITE, 0, 0,"white").setUnlocalizedName("mod_phat:whiteHelmet");
	public static final Item whiteChestplate = new ModItemArmor(5026, armorWHITE,1, 1,"white").setUnlocalizedName("mod_phat:whiteChestplate");
	public static final Item whiteLeggings = new ModItemArmor(5027, armorWHITE, 2, 2,"white").setUnlocalizedName("mod_phat:whiteLeggings");
	public static final Item whiteBoots = new ModItemArmor(5028, armorWHITE, 3, 3,"white").setUnlocalizedName("mod_phat:whiteBoots");
	
	static EnumArmorMaterial armorGUARD= net.minecraftforge.common.EnumHelper.addArmorMaterial("GUARD", 80, new int[]{2, 3, 5, 2}, 10);
	public static final Item guardHelmet = new ModItemArmor(5029, armorGUARD, 0, 0,"guard").setUnlocalizedName("mod_phat:guardHelmet");
	public static final Item guardChestplate = new ModItemArmor(5030, armorGUARD,1, 1,"guard").setUnlocalizedName("mod_phat:guardChestplate");
	public static final Item guardLeggings = new ModItemArmor(5031, armorGUARD, 2, 2,"guard").setUnlocalizedName("mod_phat:guardLeggings");
	public static final Item guardBoots = new ModItemArmor(5032, armorGUARD, 3, 3,"guard").setUnlocalizedName("mod_phat:guardBoots");
	
	static EnumArmorMaterial armorMITH= net.minecraftforge.common.EnumHelper.addArmorMaterial("MITH",190, new int[]{2, 6, 5, 2}, 10);
	public static final Item mithHelmet = new ModItemArmor(5005, armorMITH, 0, 0,"mith").setUnlocalizedName("mod_phat:mithHelmet");
	public static final Item mithChestplate = new ModItemArmor(5006, armorMITH,1, 1,"mith").setUnlocalizedName("mod_phat:mithChestplate");
	public static final Item mithLeggings = new ModItemArmor(5007, armorMITH, 2, 2,"mith").setUnlocalizedName("mod_phat:mithLeggings");
	public static final Item mithBoots = new ModItemArmor(5008, armorMITH, 3, 3,"mith").setUnlocalizedName("mod_phat:mithBoots");
	
	static EnumArmorMaterial armorADDY= net.minecraftforge.common.EnumHelper.addArmorMaterial("ADDY",250, new int[]{2, 7, 5, 2}, 10);
	public static final Item addyHelmet = new ModItemArmor(5009, armorADDY, 0, 0,"addy").setUnlocalizedName("mod_phat:addyHelmet");
	public static final Item addyChestplate = new ModItemArmor(5010, armorADDY,1, 1,"addy").setUnlocalizedName("mod_phat:addyChestplate");
	public static final Item addyLeggings = new ModItemArmor(5011, armorADDY, 2, 2,"addy").setUnlocalizedName("mod_phat:addyLeggings");
	public static final Item addyBoots = new ModItemArmor(5012, armorADDY, 3, 3,"addy").setUnlocalizedName("mod_phat:addyBoots");
	
	static EnumArmorMaterial armorRUNE= net.minecraftforge.common.EnumHelper.addArmorMaterial("RUNE",290, new int[]{3, 7, 5, 3}, 10);
	public static final Item runeHelmet = new ModItemArmor(5013, armorRUNE, 0, 0,"rune").setUnlocalizedName("mod_phat:runeHelmet");
	public static final Item runeChestplate = new ModItemArmor(5014, armorRUNE,1, 1,"rune").setUnlocalizedName("mod_phat:runeChestplate");
	public static final Item runeLeggings = new ModItemArmor(5015, armorRUNE, 2, 2,"rune").setUnlocalizedName("mod_phat:runeLeggings");
	public static final Item runeBoots = new ModItemArmor(5016, armorRUNE, 3, 3,"rune").setUnlocalizedName("mod_phat:runeBoots");
	
	static EnumArmorMaterial armorRUNEG= net.minecraftforge.common.EnumHelper.addArmorMaterial("RUNEG",330, new int[]{3, 7, 5, 3}, 30);
	public static final Item runegHelmet = new ModItemArmor(5057, armorRUNEG, 0, 0,"runeg").setUnlocalizedName("mod_phat:runegHelmet");
	public static final Item runegChestplate = new ModItemArmor(5058, armorRUNEG,1, 1,"runeg").setUnlocalizedName("mod_phat:runegChestplate");
	public static final Item runegLeggings = new ModItemArmor(5059, armorRUNEG, 2, 2,"runeg").setUnlocalizedName("mod_phat:runegLeggings");
	public static final Item runegBoots = new ModItemArmor(5060, armorRUNEG, 3, 3,"runeg").setUnlocalizedName("mod_phat:runegBoots");
    
	static EnumArmorMaterial armorGRANITE= net.minecraftforge.common.EnumHelper.addArmorMaterial("GRANITE",2000, new int[]{3, 8, 6, 3}, 20);
	public static final Item graniteHelmet = new ModItemArmor(7013, armorGRANITE, 0, 0,"granite").setUnlocalizedName("mod_phat:graniteHelmet");
	public static final Item graniteChestplate = new ModItemArmor(7014, armorGRANITE,1, 1,"granite").setUnlocalizedName("mod_phat:graniteChestplate");
	public static final Item graniteLeggings = new ModItemArmor(7015, armorGRANITE, 2, 2,"granite").setUnlocalizedName("mod_phat:graniteLeggings");
	public static final Item graniteBoots = new ModItemArmor(7016, armorGRANITE, 3, 3,"granite").setUnlocalizedName("mod_phat:graniteBoots");
	
	static EnumArmorMaterial armorBLACKG= net.minecraftforge.common.EnumHelper.addArmorMaterial("BLACKG", 5000, new int[]{3, 7, 5, 2}, 30);
	public static final Item blackgHelmet = new ModItemArmor(5061, armorBLACKG, 0, 0,"blackg").setUnlocalizedName("mod_phat:blackgHelmet");
	public static final Item blackgChestplate = new ModItemArmor(5062, armorBLACKG,1, 1,"blackg").setUnlocalizedName("mod_phat:blackgChestplate");
	public static final Item blackgLeggings = new ModItemArmor(5063, armorBLACKG, 2, 2,"blackg").setUnlocalizedName("mod_phat:blackgLeggings");
	public static final Item blackgBoots = new ModItemArmor(5064, armorBLACKG, 3, 3,"blackg").setUnlocalizedName("mod_phat:blackgBoots");
    
	static EnumArmorMaterial armorTORAG= net.minecraftforge.common.EnumHelper.addArmorMaterial("TORAG", 20000, new int[]{3, 9, 6, 3}, 30);
	public static final Item ToragHelmet = new ModItemArmor(5065, armorTORAG, 0, 0,"Torag").setUnlocalizedName(("mod_phat:ToragHelmet"));
	public static final Item ToragChestplate = new ModItemArmor(5066, armorTORAG,1, 1,"Torag").setUnlocalizedName(("mod_phat:ToragChestplate"));
	public static final Item ToragLeggings = new ModItemArmor(5067, armorTORAG, 2, 2,"Torag").setUnlocalizedName(("mod_phat:ToragLeggings"));
	public static final Item ToragBoots = new ModItemArmor(5068, armorTORAG, 3, 3,"Torag").setUnlocalizedName(("mod_phat:ToragBoots"));
	
	static EnumArmorMaterial armorVERAC= net.minecraftforge.common.EnumHelper.addArmorMaterial("VERAC", 10000, new int[]{3, 7, 6, 3}, 30);
	public static final Item VeracHelmet = new ModItemArmor(5069, armorVERAC, 0, 0,"Verac").setUnlocalizedName(("mod_phat:VeracHelmet"));
	public static final Item VeracChestplate = new ModItemArmor(5070, armorVERAC,1, 1,"Verac").setUnlocalizedName(("mod_phat:VeracChestplate"));
	public static final Item VeracLeggings = new ModItemArmor(5071, armorVERAC, 2, 2,"Verac").setUnlocalizedName(("mod_phat:VeracLeggings"));
	public static final Item VeracBoots = new ModItemArmor(5072, armorVERAC, 3, 3,"Verac").setUnlocalizedName(("mod_phat:VeracBoots"));
	
	static EnumArmorMaterial armorGUTHAN= net.minecraftforge.common.EnumHelper.addArmorMaterial("GUTHAN", 10000, new int[]{3, 9, 6, 3}, 30);
	public static final Item GuthanHelmet = new ModItemArmor(5073, armorGUTHAN, 0, 0,"Guthan").setUnlocalizedName(("mod_phat:GuthanHelmet"));
	public static final Item GuthanChestplate = new ModItemArmor(5074, armorGUTHAN,1, 1,"Guthan").setUnlocalizedName(("mod_phat:GuthanChestplate"));
	public static final Item GuthanLeggings = new ModItemArmor(5075, armorGUTHAN, 2, 2,"Guthan").setUnlocalizedName(("mod_phat:GuthanLeggings"));
	public static final Item GuthanBoots = new ModItemArmor(5076, armorGUTHAN, 3, 3,"Guthan").setUnlocalizedName(("mod_phat:GuthanBoots"));
	
	static EnumArmorMaterial armorDHAROK= net.minecraftforge.common.EnumHelper.addArmorMaterial("DHAROK", 10000, new int[]{3, 9, 6, 3}, 30);
	public static final Item DharokHelmet = new ModItemArmor(5077, armorDHAROK, 0, 0,"Dharok").setUnlocalizedName(("mod_phat:DharokHelmet"));
	public static final Item DharokChestplate = new ModItemArmor(5078, armorDHAROK,1, 1,"Dharok").setUnlocalizedName(("mod_phat:DharokChestplate"));
	public static final Item DharokLeggings = new ModItemArmor(5079, armorDHAROK, 2, 2,"Dharok").setUnlocalizedName(("mod_phat:DharokLeggings"));
	public static final Item DharokBoots = new ModItemArmor(5080, armorDHAROK, 3, 3,"Dharok").setUnlocalizedName(("mod_phat:DharokBoots"));
	
	static EnumArmorMaterial armorKARIL= net.minecraftforge.common.EnumHelper.addArmorMaterial("KARIL", 10000, new int[]{3, 7, 4, 3}, 30);
	public static final Item KarilHelmet = new ModItemArmor(5081, armorKARIL, 0, 0,"Karil").setUnlocalizedName(("mod_phat:KarilHelmet"));
	public static final Item KarilChestplate = new ModItemArmor(5082, armorKARIL,1, 1,"Karil").setUnlocalizedName(("mod_phat:KarilChestplate"));
	public static final Item KarilLeggings = new ModItemArmor(5083, armorKARIL, 2, 2,"Karil").setUnlocalizedName(("mod_phat:KarilLeggings"));
	public static final Item KarilBoots = new ModItemArmor(5084, armorKARIL, 3, 3,"Karil").setUnlocalizedName(("mod_phat:KarilBoots"));
	
	static EnumArmorMaterial armorAHRIM= net.minecraftforge.common.EnumHelper.addArmorMaterial("AHRIM", 10000, new int[]{3, 7, 4, 3}, 30);
	public static final Item AhrimHelmet = new ModItemArmor(5085, armorAHRIM, 0, 0,"Ahrim").setUnlocalizedName(("mod_phat:AhrimHelmet"));
	public static final Item AhrimChestplate = new ModItemArmor(5086, armorAHRIM,1, 1,"Ahrim").setUnlocalizedName(("mod_phat:AhrimChestplate"));
	public static final Item AhrimLeggings = new ModItemArmor(5087, armorAHRIM, 2, 2,"Ahrim").setUnlocalizedName(("mod_phat:AhrimLeggings"));
	public static final Item AhrimBoots = new ModItemArmor(5088, armorAHRIM, 3, 3,"Ahrim").setUnlocalizedName(("mod_phat:AhrimBoots"));
	
	static EnumArmorMaterial armorAKRISAE= net.minecraftforge.common.EnumHelper.addArmorMaterial("AKRISAE", 10000, new int[]{3, 7, 4, 3}, 30);
	public static final Item AkrisaeHelmet = new ModItemArmor(5089, armorAKRISAE, 0, 0,"Akrisae").setUnlocalizedName(("mod_phat:AkrisaeHelmet"));
	public static final Item AkrisaeChestplate = new ModItemArmor(5090, armorAKRISAE,1, 1,"Akrisae").setUnlocalizedName(("mod_phat:AkrisaeChestplate"));
	public static final Item AkrisaeLeggings = new ModItemArmor(5091, armorAKRISAE, 2, 2,"Akrisae").setUnlocalizedName(("mod_phat:AkrisaeLeggings"));
	public static final Item AkrisaeBoots = new ModItemArmor(5092, armorAKRISAE, 3, 3,"Akrisae").setUnlocalizedName(("mod_phat:AkrisaeBoots"));
	
	
	static EnumArmorMaterial armorGREEND= net.minecraftforge.common.EnumHelper.addArmorMaterial("GREEND",60, new int[]{3, 5, 4, 2}, 10);
	public static final Item greendHelmet = new ModItemArmor(6000, armorGREEND, 0, 0,"gdhide").setUnlocalizedName("mod_phat:greendHelmet");
	public static final Item greendChestplate = new ModItemArmor(6001, armorGREEND,1, 1,"gdhide").setUnlocalizedName("mod_phat:greendChestplate");
	public static final Item greendLeggings = new ModItemArmor(6002, armorGREEND, 2, 2,"gdhide").setUnlocalizedName("mod_phat:greendLeggings");
	public static final Item greendBoots = new ModItemArmor(6003, armorGREEND, 3, 3,"gdhide").setUnlocalizedName("mod_phat:greendBoots");
	
	static EnumArmorMaterial armorBLACKD= net.minecraftforge.common.EnumHelper.addArmorMaterial("BLACKD",100, new int[]{3, 6, 5, 2}, 20);
	public static final Item blackdHelmet = new ModItemArmor(9000, armorBLACKD, 0, 0,"bdhide").setUnlocalizedName("mod_phat:blackdHelmet");
	public static final Item blackdChestplate = new ModItemArmor(9001, armorBLACKD,1, 1,"bdhide").setUnlocalizedName("mod_phat:blackdChestplate");
	public static final Item blackdLeggings = new ModItemArmor(9002, armorBLACKD, 2, 2,"bdhide").setUnlocalizedName("mod_phat:blackdLeggings");
	public static final Item blackdBoots = new ModItemArmor(9003, armorBLACKD, 3, 3,"bdhide").setUnlocalizedName("mod_phat:blackdBoots");
	
	
	static EnumArmorMaterial armorDRAGONL= net.minecraftforge.common.EnumHelper.addArmorMaterial("DRAGONLL", 50000, new int[]{3, 8, 7, 3}, 50);
	public static final Item dragonlHelmet = new ModItemArmor(6004, armorDRAGONL, 0, 0,"dragonl").setUnlocalizedName(("mod_phat:dragonlHelmet"));
	public static final Item dragonlChestplate = new ModItemArmor(6005, armorDRAGONL,1, 1,"dragonl").setUnlocalizedName(("mod_phat:dragonlChestplate"));
	public static final Item dragonlLeggings = new ModItemArmor(6006, armorDRAGONL, 2, 2,"dragonl").setUnlocalizedName(("mod_phat:dragonlLeggings"));
	public static final Item dragonlBoots = new ModItemArmor(6007, armorDRAGONL, 3, 3,"dragonl").setUnlocalizedName(("mod_phat:dragonlBoots"));
	
	static EnumArmorMaterial armorBANDOS= net.minecraftforge.common.EnumHelper.addArmorMaterial("BANDOS",10000, new int[]{3, 8, 0, 4}, 10);
	public static final Item  helmet = new CustomArmor(8013, armorBANDOS, 0, 0,"bandos").setUnlocalizedName("mod_phat:Helmet");
	public static final Item  chest = new CustomArmor(8014, armorBANDOS,1, 1,"bandops").setUnlocalizedName("mod_phat:Chestplate");
	public static final Item  legs = new CustomArmor(8015, armorBANDOS, 2, 2,"bandos").setUnlocalizedName("mod_phat:Leggings");
	public static final Item  boots = new CustomArmor(8016, armorBANDOS, 3, 3,"bandos").setUnlocalizedName("mod_phat:Boots");
	
	static EnumArmorMaterial armorSTONE= net.minecraftforge.common.EnumHelper.addArmorMaterial("STONE", 50000000, new int[]{1, 3, 2, 1}, 50);
	public static final Item stoneHelmet = new ModItemArmor(8004, armorSTONE, 0, 0,"stone").setUnlocalizedName(("mod_phat:stoneHelmet"));
	public static final Item stoneChestplate = new ModItemArmor(8005, armorSTONE,1, 1,"stone").setUnlocalizedName(("mod_phat:stoneChestplate"));
	public static final Item stoneLeggings = new ModItemArmor(8006, armorSTONE, 2, 2,"stone").setUnlocalizedName(("mod_phat:stoneLeggings"));
	public static final Item stoneBoots = new ModItemArmor(8007, armorSTONE, 3, 3,"stone").setUnlocalizedName(("mod_phat:stoneBoots"));
	

	static EnumArmorMaterial armorCDRAGON= net.minecraftforge.common.EnumHelper.addArmorMaterial("CDRAGON",90, new int[]{3, 7, 5, 3}, 10);
	public static final Item cdragonHelmet = new ModItemArmor(8008, armorCDRAGON, 0, 0,"cdragon").setUnlocalizedName("mod_phat:cdragonHelmet");
	public static final Item cdragonChestplate = new ModItemArmor(8009, armorCDRAGON,1, 1,"cdragon").setUnlocalizedName("mod_phat:cdragonChestplate");
	public static final Item cdragonLeggings = new ModItemArmor(8010, armorCDRAGON, 2, 2,"cdragon").setUnlocalizedName("mod_phat:cdragonLeggings");
	public static final Item cdragonBoots = new ModItemArmor(8011, armorCDRAGON, 3, 3,"cdragon").setUnlocalizedName("mod_phat:cdragonBoots");
	
	
	 public static final Item Granite = new Item(10030).setUnlocalizedName("Granite").setTextureName("granite").setCreativeTab(CreativeTabs.tabMaterials);
     
	
	
	@EventHandler
	public void load()
        {

		 {
	         MinecraftForge.EVENT_BUS.register(new ModEventHandler());
	         }
	 	     
		LanguageRegistry.addName(helmet, "Berserker Helmet");
		LanguageRegistry.addName(chest, "Bandos Chestplate");
		LanguageRegistry.addName(legs, "Bandos set 'legs'(use for armor set health bonus with berserker helm)");
		LanguageRegistry.addName(boots, "Bandos Tassets (wear on boot slot)");
     
        	ModLoader.addName(phatHelmet, "Blue partyhat");
            //ModLoader.addName(phatChestplate, "Phat Chestplate");
            //ModLoader.addName(phatLeggings, "Phat Legs");
           // ModLoader.addName(phatBoots, "Phat Boots"); 
            
           
        	ModLoader.addName(wphatHelmet, "White partyhat");
        	ModLoader.addName(pphatHelmet, "Purple partyhat");
        	ModLoader.addName(rphatHelmet, "Red partyhat");
        	ModLoader.addName(yphatHelmet, "Yellow partyhat");
        	ModLoader.addName(gphatHelmet, "Green partyhat");
        	ModLoader.addName(santaHelmet, "Santa Hat");
            //ModLoader.addName(wphatChestplate, "Phat Chestplate");
            //ModLoader.addName(wphatLeggings, "Phat Legs");
            //ModLoader.addName(wphatBoots, "Phat Boots"); 
            
            ModLoader.addName(stoneHelmet, "Blue Cobblestone Helm");
            ModLoader.addName(stoneChestplate, "Blue Cobblestone Body");
            ModLoader.addName(stoneLeggings, "Blue Cobblestone Legs");
            ModLoader.addName(stoneBoots, "Blue Cobblestone Boots");
        	
        	ModLoader.addName(dragonHelmet, "Dragon Helm");
            ModLoader.addName(dragonChestplate, "Dragon Chainbody");
            ModLoader.addName(dragonLeggings, "Dragon Legs");
            ModLoader.addName(dragonBoots, "Dragon Boots"); 
            
            ModLoader.addName(dragonlHelmet, "Lava Helm");
            ModLoader.addName(dragonlChestplate, "Lava Chainbody");
            ModLoader.addName(dragonlLeggings, "Lava Legs");
            ModLoader.addName(dragonlBoots, "Lava Boots");
            
            ModLoader.addName(cdragonHelmet, "Corrupt Dragon Helm");
            ModLoader.addName(cdragonChestplate, "Corrupt Dragon Chainbody");
            ModLoader.addName(cdragonLeggings, "Corrupt Dragon Legs");
            ModLoader.addName(cdragonBoots, "Corrupt Dragon Boots");
            
     
        	ModLoader.addName(blackHelmet, "Black Helm");
            ModLoader.addName(blackChestplate, "Black Chestplate");
            ModLoader.addName(blackLeggings, "Black Legs");
            ModLoader.addName(blackBoots, "Black Boots"); 
            
      
        	ModLoader.addName(whiteHelmet, "White Helm");
            ModLoader.addName(whiteChestplate, "White Chestplate");
            ModLoader.addName(whiteLeggings, "White Legs");
            ModLoader.addName(whiteBoots, "White Boots"); 
            

        	ModLoader.addName(guardHelmet, "Bronze Med Helm");
            ModLoader.addName(guardChestplate, "Iron Chain");
          //  ModLoader.addName(guardLeggings, "Guard Legs");
          //  ModLoader.addName(guardBoots, "Guard Boots"); 
 
          
        	ModLoader.addName(mithHelmet, "Mithril Helmet");
            ModLoader.addName(mithChestplate, "Mithril Chestplate");
            ModLoader.addName(mithLeggings, "Mithril Legs");
            ModLoader.addName(mithBoots, "Mithril Boots");  
            
       
        	ModLoader.addName(addyHelmet, "Adamant Helmet");
            ModLoader.addName(addyChestplate, "Adamant Chestplate");
            ModLoader.addName(addyLeggings, "Adamant Legs");
            ModLoader.addName(addyBoots, "Adamant Boots");  
           
           
        	ModLoader.addName(runeHelmet, "Rune Helmet");
            ModLoader.addName(runeChestplate, "Rune Chestplate");
            ModLoader.addName(runeLeggings, "Rune Legs");
            ModLoader.addName(runeBoots, "Rune Boots");  
            
           	ModLoader.addName(runegHelmet, "Rune Helmet(g)");
            ModLoader.addName(runegChestplate, "Rune Chestplate(g)");
            ModLoader.addName(runegLeggings, "Rune Legs(g)");
            ModLoader.addName(runegBoots, "Rune Boots(g)");  
            
         	ModLoader.addName(graniteHelmet, "Granite Helmet");
            ModLoader.addName(graniteChestplate, "Granite Chestplate");
            ModLoader.addName(graniteLeggings, "Granite Legs");
            ModLoader.addName(graniteBoots, "Granite Boots"); 
            
            ModLoader.addName(blackgHelmet, "Black Helm(g)");
            ModLoader.addName(blackgChestplate, "Black Chestplate(g)");
            ModLoader.addName(blackgLeggings, "Black Legs(g)");
            ModLoader.addName(blackgBoots, "Black Boots(g)");
            
            ModLoader.addName(ToragHelmet, "Torag's Helmet");
            ModLoader.addName(ToragChestplate, "Torag's Chestplate");
            ModLoader.addName(ToragLeggings, "Torag's Platelegs");
            ModLoader.addName(ToragBoots, "Torag's Boots");
            
            ModLoader.addName(VeracHelmet, "Verac's Helmet");
            ModLoader.addName(VeracChestplate, "Verac's Chestplate");
            ModLoader.addName(VeracLeggings, "Verac's Platelegs");
            ModLoader.addName(VeracBoots, "Verac's Boots");
            
            ModLoader.addName(GuthanHelmet, "Guthan's Helmet");
            ModLoader.addName(GuthanChestplate, "Guthan's Chestplate");
            ModLoader.addName(GuthanLeggings, "Guthan's Platelegs");
            ModLoader.addName(GuthanBoots, "Guthan's Boots");
            
            ModLoader.addName(DharokHelmet, "Dharok's Helmet");
            ModLoader.addName(DharokChestplate, "Dharok's Chestplate");
            ModLoader.addName(DharokLeggings, "Dharok's Platelegs");
            ModLoader.addName(DharokBoots, "Dharok's Boots");
            
            ModLoader.addName(KarilHelmet, "Karil's Coif");
            ModLoader.addName(KarilChestplate, "Karil's LeatherBody");
            ModLoader.addName(KarilLeggings, "Karil's Skirt");
            ModLoader.addName(KarilBoots, "Karil's Boots");
            
            ModLoader.addName(AhrimHelmet, "Ahrim's Hood");
            ModLoader.addName(AhrimChestplate, "Ahrim's Robe Top");
            ModLoader.addName(AhrimLeggings, "Ahrim's Robe Skirt");
            ModLoader.addName(AhrimBoots, "Ahrim's Boots");
            
            ModLoader.addName(AkrisaeHelmet, "Akrisae's Hood");
            ModLoader.addName(AkrisaeChestplate, "Akrisae's Robe Top");
            ModLoader.addName(AkrisaeLeggings, "Akrisae's Robe Skirt");
            ModLoader.addName(AkrisaeBoots, "Akrisae's Boots");
            
            ModLoader.addName(greendHelmet, "Green D'hide coif");
            ModLoader.addName(greendChestplate, "Green D'hide body");
            ModLoader.addName(greendLeggings, "Green D'hide chaps");
            ModLoader.addName(greendBoots, "Green D'hide Boots");
            
            ModLoader.addName(blackdHelmet, "Black D'hide coif");
            ModLoader.addName(blackdChestplate, "Black D'hide body");
            ModLoader.addName(blackdLeggings, "Black D'hide chaps");
            ModLoader.addName(blackdBoots, "Black D'hide Boots");
            
            ModLoader.addName(Granite, "Granite Lump");
            
      	  GameRegistry.addRecipe (new ItemStack(mod_phat.greendHelmet, 1), new Object[] {
      	  		"XXX", "X X", Character.valueOf('X'), mod_Flower.GreenDleather});
      	         GameRegistry.addRecipe (new ItemStack(mod_phat.greendChestplate, 1), new Object[] {
      	       	"X X","XXX","XXX", Character.valueOf('X'), mod_Flower.GreenDleather});
      	         GameRegistry.addRecipe (new ItemStack(mod_phat.greendLeggings, 1), new Object[] {
      	        "XXX","X X", "X X", Character.valueOf('X'), mod_Flower.GreenDleather});
      	         GameRegistry.addRecipe (new ItemStack(mod_phat.greendBoots, 1), new Object[] {
      	        "X X", "X X", Character.valueOf('X'), mod_Flower.GreenDleather });
      	         
      	 GameRegistry.addRecipe (new ItemStack(mod_phat.blackdHelmet, 1), new Object[] {
         	  		"XXX", "X X", Character.valueOf('X'), mod_Flower.BlackDleather});
         	         GameRegistry.addRecipe (new ItemStack(mod_phat.blackdChestplate, 1), new Object[] {
         	       	"X X","XXX","XXX", Character.valueOf('X'), mod_Flower.BlackDleather});
         	         GameRegistry.addRecipe (new ItemStack(mod_phat.blackdLeggings, 1), new Object[] {
         	        "XXX","X X", "X X", Character.valueOf('X'), mod_Flower.BlackDleather});
         	         GameRegistry.addRecipe (new ItemStack(mod_phat.blackdBoots, 1), new Object[] {
         	        "X X", "X X", Character.valueOf('X'), mod_Flower.BlackDleather });     	         
      	         
         GameRegistry.addRecipe (new ItemStack(mod_phat.mithHelmet, 1), new Object[] {
  		"XXX", "X X", Character.valueOf('X'), mod_BlocksGalore.Mithingot
    });
         GameRegistry.addRecipe (new ItemStack(mod_phat.mithChestplate, 1), new Object[] {
       		"X X","XXX","XXX", Character.valueOf('X'), mod_BlocksGalore.Mithingot
         });
         GameRegistry.addRecipe (new ItemStack(mod_phat.mithLeggings, 1), new Object[] {
        		"XXX","X X", "X X", Character.valueOf('X'), mod_BlocksGalore.Mithingot
        });
         GameRegistry.addRecipe (new ItemStack(mod_phat.mithBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), mod_BlocksGalore.Mithingot });
        
         

         GameRegistry.addRecipe (new ItemStack(mod_phat.runeHelmet, 1), new Object[] {
       		"XXX", "X X", Character.valueOf('X'), mod_BlocksGalore.Runeingot
         });
              GameRegistry.addRecipe (new ItemStack(mod_phat.runeChestplate, 1), new Object[] {
            		"X X","XXX","XXX", Character.valueOf('X'), mod_BlocksGalore.Runeingot
              });
              GameRegistry.addRecipe (new ItemStack(mod_phat.runeLeggings, 1), new Object[] {
             		"XXX","X X", "X X", Character.valueOf('X'), mod_BlocksGalore.Runeingot
             });
              GameRegistry.addRecipe (new ItemStack(mod_phat.runeBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), mod_BlocksGalore.Runeingot });

        
        GameRegistry.addRecipe (new ItemStack(mod_phat.addyHelmet, 1), new Object[] {
      		"XXX", "X X", Character.valueOf('X'), mod_BlocksGalore.Addyingot
        });
             GameRegistry.addRecipe (new ItemStack(mod_phat.addyChestplate, 1), new Object[] {
           		"X X","XXX","XXX", Character.valueOf('X'), mod_BlocksGalore.Addyingot
             });
             GameRegistry.addRecipe (new ItemStack(mod_phat.addyLeggings, 1), new Object[] {
            		"XXX","X X", "X X", Character.valueOf('X'), mod_BlocksGalore.Addyingot
            });
             GameRegistry.addRecipe (new ItemStack(mod_phat.addyBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), mod_BlocksGalore.Addyingot });
            
             GameRegistry.addRecipe (new ItemStack(mod_phat.graniteHelmet, 1), new Object[] {
            		"XXX", "X X", Character.valueOf('X'), mod_phat.Granite
              });
                   GameRegistry.addRecipe (new ItemStack(mod_phat.graniteChestplate, 1), new Object[] {
                 		"X X","XXX","XXX", Character.valueOf('X'), mod_phat.Granite
                   });
                   GameRegistry.addRecipe (new ItemStack(mod_phat.graniteLeggings, 1), new Object[] {
                  		"XXX","X X", "X X", Character.valueOf('X'), mod_phat.Granite
                  });
                   GameRegistry.addRecipe (new ItemStack(mod_phat.graniteBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), mod_phat.Granite });

    GameRegistry.addRecipe (new ItemStack(mod_phat.stoneHelmet, 1), new Object[] {
  		"XXX", "X X", Character.valueOf('X'), mod_BlocksGalore.bluecobblestonec
    });
         GameRegistry.addRecipe (new ItemStack(mod_phat.stoneChestplate, 1), new Object[] {
       		"X X","XXX","XXX", Character.valueOf('X'), mod_BlocksGalore.bluecobblestonec
         });
         GameRegistry.addRecipe (new ItemStack(mod_phat.stoneLeggings, 1), new Object[] {
        		"XXX","X X", "X X", Character.valueOf('X'), mod_BlocksGalore.bluecobblestonec
        });
         GameRegistry.addRecipe (new ItemStack(mod_phat.stoneBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), mod_BlocksGalore.bluecobblestonec });
        }



        public String getVersion()
        {
                return "1.6.4";
        }
}