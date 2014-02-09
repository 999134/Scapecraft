package net.minecraft.src;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class mod_WorldGenWhitetower extends BaseMod
{

        public void load()
        {
                
        }
        
    
        
        public void generateSurface(World par1World, Random par2Random, int par3, int par4)
        {
       BiomeGenBase biome = par1World.getWorldChunkManager().getBiomeGenAt(par3, par4);
     //   if(biome instanceof BiomeGenPlains)
                        
        {
        	if (par2Random.nextInt(330) == 0){
    		for (int i4 = 0; i4 < 1; i4++) 
                {
    			  int var5 = par3 + par2Random.nextInt(16) + 8;
    	            int var6 = par4 + par2Random.nextInt(16) + 8;
    	            WorldGenWhitetower var7 = new WorldGenWhitetower();
    	            var7.generate(par1World, par2Random, var5, par1World.getHeightValue(var5, var6), var6);
                }}}
        }       
        
        
        
        
        
        
        public String getVersion()
        {
                return "1.6.4";
        }
}