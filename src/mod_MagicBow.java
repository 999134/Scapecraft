package net.minecraft.src;

import java.util.Random;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class mod_MagicBow extends BaseMod {

	
	public static final String modid = "mod_MagicBow";
		public static final Item Magicbow = new ItemMagicbow(1001).setUnlocalizedName("mod_MagicBow:Magicbow");
		public static final Item Yewbow = new ItemYewbow(1002).setUnlocalizedName("mod_MagicBow:Yewbow");
		public static final Item Crystalbow = new ItemCrystalBow(10020).setUnlocalizedName("mod_MagicBow:Crystalbow");
		public static final Item KarilBow = new ItemKarilBow(10021).setUnlocalizedName("mod_MagicBow:KarilCbowInv").setFull3D();
		public static final Item BoltRack = new ItemBoltRack(10022).setUnlocalizedName("mod_MagicBow:BoltRack");
		public static final Item DarkBow = new ItemDarkBow(11020).setUnlocalizedName("mod_MagicBow:DarkBow").setFull3D();;

	

	//	public static int Magicbow1 = ModLoader.addOverride("/gui/items.png",
	//		"/mods/magicbow1.png");
	//public static int Magicbow2 = ModLoader.addOverride("/gui/items.png",
	//		"/mods/magicbow2.png");
	//public static int Magicbow3 = ModLoader.addOverride("/gui/items.png",
	//		"/mods/magicbow3.png");
//	public static int Magicbow4 = ModLoader.addOverride("/gui/items.png",
	//		"/mods/magicbow4.png");

	//static {
	//	Magicbow = (new ItemMagicbow(1001)).setItemName("Magicbow");
	//}

	

	public void load() {
		ModLoader.addName(Magicbow, "Magic Shortbow");
		ModLoader.setInGameHook(this, true, false);
		ModLoader.addName(Yewbow, "Yew Shortbow");
		ModLoader.setInGameHook(this, true, false);
		ModLoader.addName(Crystalbow, "Crystal Bow");   
		ModLoader.addName(KarilBow, "Karil's Crossbow");   
		ModLoader.addName(BoltRack, "Bolt Rack");      
		ModLoader.addName(DarkBow, "Dark Bow"); 
		     
		    GameRegistry.addRecipe(new ItemStack(Magicbow, 1), new Object[] { " XY",
				"X Y", " XY", Character.valueOf('X'), mod_MagicTree.Magicstick,
				Character.valueOf('Y'), Item.silk });
		    GameRegistry.addRecipe(new ItemStack(Yewbow, 1), new Object[] { " XY",
				"X Y", " XY", Character.valueOf('X'), mod_YewTree.Yewstick,
				Character.valueOf('Y'), Item.silk });
		    GameRegistry.addRecipe(new ItemStack(mod_MagicBow.BoltRack, 3), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_MagicTree.Magicplank, Character.valueOf('Y'),Item.arrow,});
		
		//GameRegistry.addRecipe(new ItemStack(Magicbow, 1), new Object[] { " XY",
		//	"X", ('X'), Block.dirt});
//
	}
	
	
	
	
	
	public String getVersion() {

		return "1.6.2";
	}
}
