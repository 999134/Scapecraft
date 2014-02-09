package net.minecraft.src;

import java.util.Random;
import net.minecraft.block.Block;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class mod_MagicTree extends BaseMod {
	public static final String modid = "mod_MagicTree";
	public static final Block Magiclog = (new BlockMagiclog(200, 19).setHardness(50.0F).setUnlocalizedName("magiclog").setStepSound(Block.soundWoodFootstep));
	public static final Block Magicleaf = (new BlockMagicleaf(201, 18).setHardness(0.2F).setUnlocalizedName("magicleaf").setStepSound(Block.soundGrassFootstep));
	public static final Block Magicsapling = (new BlockMagicsapling(202, 17).setHardness(0.0F).setUnlocalizedName("magicsapling").setStepSound(Block.soundGrassFootstep));
	public static final Item Magicfruit = new ItemFood(17105, 20, true).setUnlocalizedName("mod_MagicTree:magicfruit").setTextureName("magicfruit");
	public static final Item Magicstick = new ItemMagicstick(17106).setUnlocalizedName("mod_MagicTree:magicstick");
	public static final Item Magicboat = new ItemMagicBoat(17117).setUnlocalizedName("mod_MagicTree:magicboat");
	public static final Block Magicplank = (new BlockMagicplank(203, 19).setHardness(5.0F).setUnlocalizedName("magicplank").setStepSound(Block.soundWoodFootstep));
	public static final Block Magicstairs = (new BlockMagicstairs(214, mod_MagicTree.Magicplank, 0).setHardness(5.0F).setUnlocalizedName("magicstairs").setStepSound(Block.soundWoodFootstep));
	
	public static int blocktop;

	public void registerRenderers() {
	
	}

	public void load() {
		ModLoader.registerBlock(Magiclog);
		ModLoader.registerBlock(Magicleaf);
		ModLoader.registerBlock(Magicsapling);
		ModLoader.registerBlock(Magicplank);
		ModLoader.registerBlock(Magicstairs);

		ModLoader.addName(Magiclog, "Magic Log");
		ModLoader.addName(Magicleaf, "Magic Leaf");
		ModLoader.addName(Magicsapling, "Magic Sapling");
		ModLoader.addName(Magicplank, "Magic Plank");
		ModLoader.addName(Magicfruit, "Magic Fruit");
		ModLoader.addName(Magicstick, "Magic Stick");
		ModLoader.addName(Magicstairs, "Magic Stairs");
		ModLoader.addName(Magicboat, "Magic Boat");

	
	

		//blocktop = ModLoader
		//		.addOverride("/terrain.png", "/mods/magicwood2.png");

		GameRegistry.addRecipe(new ItemStack(mod_MagicTree.Magicsapling, 1),
						new Object[] { "XXX", "XYX","XXX", Character.valueOf('Y'),
								Item.diamond,Character.valueOf('X'),mod_YewTree.Yewsapling });

		GameRegistry.addRecipe(new ItemStack(mod_MagicTree.Magicplank, 2),
				new Object[] { "X", 
						Character.valueOf('X'),mod_MagicTree.Magiclog });
		
		GameRegistry.addRecipe(new ItemStack(mod_MagicTree.Magicstick, 1),
				new Object[] { "X","X", 
						Character.valueOf('X'),mod_MagicTree.Magicplank });
		
		GameRegistry.addRecipe(new ItemStack(mod_MagicTree.Magicstairs, 4),
				new Object[] { "  X"," XX","XXX", 
						Character.valueOf('X'),mod_MagicTree.Magicplank });
		
		GameRegistry.addRecipe(new ItemStack(mod_MagicTree.Magicboat, 1),
				new Object[] { "X X","XXX", 
						Character.valueOf('X'),mod_MagicTree.Magicplank });
		
	}

	public String getVersion() {
		return "1.6.4";
	}

	public void generateSurface(World world, Random rand, int chunkx, int chunkz) {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkx,
				chunkz);
		WorldGenMagictree tree = new WorldGenMagictree();
		if (biome instanceof BiomeGenDesert)

		{
			for (int x = 0; x < 0; x++) {
				int Xcoord = chunkx + rand.nextInt(16);
				int Zcoord = chunkz + rand.nextInt(16);
				int i = world.getHeightValue(Xcoord, Zcoord);
				tree.generate(world, rand, Xcoord, i, Zcoord);
			}
		}
	}

	public int addFuel(int i, int j) {
		if (i == mod_MagicTree.Magiclog.blockID) {
			return 4000;
		}
		return 0;
	}

}