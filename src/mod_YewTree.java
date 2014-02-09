package net.minecraft.src;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

                public class mod_YewTree extends BaseMod
                {
                	public static final String modid = "mod_YewTree";
                	
                	public static final Block Yewlog = (new BlockYewlog(210, 23).setHardness(20.0F).setUnlocalizedName("yewlog").setStepSound(Block.soundWoodFootstep));
                	public static final Block Yewleaf = (new BlockYewleaf(211, 22).setHardness(0.2F).setUnlocalizedName("yewleaf").setStepSound(Block.soundGrassFootstep));
                	public static final Block Yewsapling = (new BlockYewsapling(212, 21).setHardness(0.0F).setUnlocalizedName("yewsapling").setStepSound(Block.soundGrassFootstep));
                	public static final Item Yewstick = new ItemYewstick(17107).setUnlocalizedName("mod_YewTree:yewstick");
                	public static final Block Yewplank = (new BlockYewplank(213, 19).setHardness(50.0F).setUnlocalizedName("yewplank").setStepSound(Block.soundWoodFootstep));
                	public static final Block Yewstairs = (new BlockYewstairs(215, mod_YewTree.Yewplank, 0).setHardness(50.0F).setUnlocalizedName("yewstairs").setStepSound(Block.soundWoodFootstep));
                	
                	
                                public static int blocktop;
               
                                
                           

                       

                            
                                
                                
                                
 public void load()
                                {
                                        ModLoader.registerBlock(Yewlog);
                                        ModLoader.registerBlock(Yewleaf);
                                        ModLoader.registerBlock(Yewsapling);
                                        ModLoader.registerBlock(Yewplank);
                                        ModLoader.registerBlock(Yewstairs);
                                        
                                        ModLoader.addName(Yewlog, "Yew Log");
                                        ModLoader.addName(Yewstick, "Yew Stick");
                                        ModLoader.addName(Yewplank, "Yew Plank");
                                        ModLoader.addName(Yewleaf, "Yew Leaf");
                                        ModLoader.addName(Yewsapling, "Yew Sapling");
                                        ModLoader.addName(Yewstairs, "Yew Stairs");
                              ;
                                     
                                      
                              
                              
                      		GameRegistry.addRecipe(new ItemStack(mod_YewTree.Yewplank, 2),
                    				new Object[] { "X", 
                    						Character.valueOf('X'),mod_YewTree.Yewlog });
                    		
                    		GameRegistry.addRecipe(new ItemStack(mod_YewTree.Yewstick, 1),
                    				new Object[] { "X","X", 
                    						Character.valueOf('X'),mod_YewTree.Yewplank });
                                    
                    		GameRegistry.addRecipe(new ItemStack(mod_YewTree.Yewstairs, 4),
                    				new Object[] { "  X"," XX","XXX", 
                    						Character.valueOf('X'),mod_YewTree.Yewplank });
                    		
                                }

public String getVersion()
{
	return "1.5.2";
}
                                
public void generateSurface(World world, Random rand, int chunkx, int chunkz)
{
	BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkx, chunkz);
	WorldGenYewtree tree = new WorldGenYewtree();
	if(biome instanceof BiomeGenForest)
                                                
 {
  for(int x = 0; x < 1; x++)
 {
	  int Xcoord = chunkx + rand.nextInt(16);
	  int Zcoord = chunkz + rand.nextInt(16);
	  int i = world.getHeightValue(Xcoord, Zcoord);
tree.generate(world, rand, Xcoord, i, Zcoord);
                                        }
                                }       
                                }
                                
                                
                                
      public int addFuel(int i, int j)
                                {
                                if(i == mod_YewTree.Yewlog.blockID)
                                {
                                return 2000;
                                }
                                return 0;
                                }
                                
                                 
                }