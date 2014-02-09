package net.minecraft.src;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.StepSound;
import net.minecraft.client.Minecraft;

public class You_Must_Update_Scapecraft extends BaseMod {
	public static final String modid = "mod_lightning";
	public static final StepSound soundStoneFootstep = new StepSound("stone",
			1.0F, 1.0F);
public static final Block LightningRod = (new BlockLightningRod(177, 0)	.setHardness(3.0F).setResistance(5.0F)	.setStepSound(soundStoneFootstep).setUnlocalizedName("LightningRod"));
//public static final Item iphone = new ItemIphone(11111).setUnlocalizedName("mod_lightning:boomstick");
//public static final Item potato = new Itempotato(11112).setUnlocalizedName("mod_lightning:rocket");
//public static final Item boomstick = new ItemBoomstick(1337).setUnlocalizedName("mod_lightning:pwnstick");


	public void registerRenderers() {
	

	}

	public void load()

	{
		
		ModLoader.registerBlock(LightningRod);ModLoader.addName(LightningRod, "Lightning Rod");

	//	ModLoader.addName(iphone, "Boomstick");
		//ModLoader.addName(boomstick, "Pwnstick");
		//ModLoader.addName(potato, "Rocket Pack");


		GameRegistry.addRecipe(new ItemStack(You_Must_Update_Scapecraft.LightningRod, 1),new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Item.ingotIron,Character.valueOf('Y'), Item.ingotGold });
	//	GameRegistry.addRecipe(new ItemStack(mod_lightning.iphone, 1),new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'),Block.bedrock, Character.valueOf('Y'), Item.blazeRod });
	//	GameRegistry.addRecipe(new ItemStack(mod_lightning.boomstick, 1),new Object[] { "X", Character.valueOf('X'), Block.bedrock });
		//GameRegistry.addRecipe(new ItemStack(mod_lightning.potato),new Object[] { "XX", 'X', Block.bedrock });
	}


	

	

	public String getVersion() {
		return ("1.6.4");
	}
}