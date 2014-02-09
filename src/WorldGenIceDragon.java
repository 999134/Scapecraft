package net.minecraft.src;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
public class WorldGenIceDragon extends WorldGenerator
{
public WorldGenIceDragon()
{
}
public boolean generate(World world, Random random, int i, int j, int k)
{

	//if(world.getBlockId(i, j - 1, k) == Block.grass.blockID && world.getBlockId(i, j, k) == 0)
	{
	


	int Ice = mod_BlocksGalore.HardIceBlock.blockID;
	int DragonSpawner = mod_BlocksGalore.IronDragonSpawn.blockID;
	int IceGiantSpawner = mod_BlocksGalore.IceGiantSpawn.blockID;
	
	
world.setBlock(i, j, k-1, Ice);
world.setBlock(i-1, j, k, Ice);
world.setBlock(i, j, k+1, Ice);
world.setBlock(i+1, j, k, Ice);
world.setBlock(i-2, j, k, IceGiantSpawner);
world.setBlock(i, j, k+2, IceGiantSpawner);
world.setBlock(i+2, j, k, IceGiantSpawner);
world.setBlock(i, j, k, Ice);
world.setBlock(i, j+1, k, Ice);
world.setBlock(i, j+2, k, Ice);
world.setBlock(i, j+3, k, Ice);
world.setBlock(i, j+4, k, Ice);
world.setBlock(i, j+5, k, Ice);
world.setBlock(i, j+6, k, Ice);
world.setBlock(i, j+7, k, Ice);
world.setBlock(i, j+8, k, Ice);
world.setBlock(i, j+9, k, Ice);
world.setBlock(i, j+10, k, Ice);
world.setBlock(i, j+11, k, Ice);
world.setBlock(i, j+12, k, Ice);
world.setBlock(i, j+13, k, Ice);
world.setBlock(i, j+14, k, Ice);
world.setBlock(i, j+15, k, Ice);
world.setBlock(i, j+16, k, Ice);
world.setBlock(i, j+17, k, Ice);
world.setBlock(i, j+18, k, Ice);
world.setBlock(i, j+19, k, Ice);
world.setBlock(i, j+20, k, Ice);
world.setBlock(i, j+21, k, Ice);
world.setBlock(i, j+22, k, Ice);
world.setBlock(i, j+23, k, Ice);
world.setBlock(i, j+24, k, Ice);


world.setBlock(i, j+25, k, DragonSpawner);
world.setBlock(i+1, j+25, k, Ice);
world.setBlock(i, j+25, k+1, Ice);
world.setBlock(i, j+25, k-1, Ice);
world.setBlock(i-1, j+25, k, Ice);
world.setBlock(i-1, j+25, k-1, Ice);
world.setBlock(i+1, j+25, k-1, Ice);
world.setBlock(i+1, j+25, k+1, Ice);
world.setBlock(i-1, j+25, k+1, Ice);
world.setBlock(i+2, j+25, k, Ice);
world.setBlock(i, j+25, k+2, Ice);
world.setBlock(i, j+25, k-2, Ice);
world.setBlock(i-2, j+25, k, Ice);
world.setBlock(i-2, j+25, k-2, Ice);
world.setBlock(i+2, j+25, k-2, Ice);
world.setBlock(i+2, j+25, k+2, Ice);
world.setBlock(i-2, j+25, k+2, Ice);
world.setBlock(i+2, j+25, k+1, Ice);
world.setBlock(i+2, j+25, k-1, Ice);
world.setBlock(i-2, j+25, k+1, Ice);
world.setBlock(i-2, j+25, k-1, Ice);
world.setBlock(i+1, j+25, k+2, Ice);
world.setBlock(i+1, j+25, k-2, Ice);
world.setBlock(i-1, j+25, k+2, Ice);
world.setBlock(i-1, j+25, k-2, Ice);
world.setBlock(i+3, j+25, k, Ice);
world.setBlock(i+3, j+25, k, Ice);
world.setBlock(i+3, j+25, k+1, Ice);
world.setBlock(i+3, j+25, k-1, Ice);
world.setBlock(i+3, j+25, k+2, Ice);
world.setBlock(i+3, j+25, k-2, Ice);
world.setBlock(i+3, j+25, k+3, Ice);
world.setBlock(i+3, j+25, k-3, Ice);
world.setBlock(i-3, j+25, k, Ice);
world.setBlock(i-3, j+25, k+1, Ice);
world.setBlock(i-3, j+25, k-1, Ice);
world.setBlock(i-3, j+25, k+2, Ice);
world.setBlock(i-3, j+25, k-2, Ice);
world.setBlock(i-3, j+25, k-3, Ice);
world.setBlock(i-3, j+25, k+3, Ice);
world.setBlock(i, j+25, k+3, Ice);
world.setBlock(i+1, j+25, k+3, Ice);
world.setBlock(i-1, j+25, k+3, Ice);
world.setBlock(i+2, j+25, k+3, Ice);
world.setBlock(i-2, j+25, k+3, Ice);
world.setBlock(i, j+25, k-3, Ice);
world.setBlock(i+1, j+25, k-3, Ice);
world.setBlock(i-1, j+25, k-3, Ice);
world.setBlock(i+2, j+25, k-3, Ice);
world.setBlock(i-2, j+25, k-3, Ice);


world.setBlock(i+4, j+25, k, Ice);
world.setBlock(i+4, j+25, k+1, Ice);
world.setBlock(i+4, j+25, k-1, Ice);
world.setBlock(i+4, j+25, k+2, Ice);
world.setBlock(i+4, j+25, k-2, Ice);
world.setBlock(i+4, j+25, k+3, Ice);
world.setBlock(i+4, j+25, k-3, Ice);
world.setBlock(i-4, j+25, k, Ice);
world.setBlock(i-4, j+25, k+1, Ice);
world.setBlock(i-4, j+25, k-1, Ice);
world.setBlock(i-4, j+25, k+2, Ice);
world.setBlock(i-4, j+25, k-2, Ice);
world.setBlock(i-4, j+25, k-3, Ice);
world.setBlock(i-4, j+25, k+3, Ice);
world.setBlock(i, j+25, k+4, Ice);
world.setBlock(i+1, j+25, k+4, Ice);
world.setBlock(i-1, j+25, k+4, Ice);
world.setBlock(i+2, j+25, k+4, Ice);
world.setBlock(i-2, j+25, k+4, Ice);
world.setBlock(i, j+25, k-4, Ice);
world.setBlock(i+1, j+25, k-4, Ice);
world.setBlock(i-1, j+25, k-4, Ice);
world.setBlock(i+2, j+25, k-4, Ice);
world.setBlock(i-2, j+25, k-4, Ice);

world.setBlock(i+4, j+26, k, Ice);
world.setBlock(i+4, j+26, k+1, Ice);
world.setBlock(i+4, j+26, k-1, Ice);
world.setBlock(i+4, j+26, k+2, Ice);
world.setBlock(i+4, j+26, k-2, Ice);
world.setBlock(i+4, j+26, k+3, Ice);
world.setBlock(i+4, j+26, k-3, Ice);
world.setBlock(i-4, j+26, k, Ice);
world.setBlock(i-4, j+26, k+1, Ice);
world.setBlock(i-4, j+26, k-1, Ice);
world.setBlock(i-4, j+26, k+2, Ice);
world.setBlock(i-4, j+26, k-2, Ice);
world.setBlock(i-4, j+26, k-3, Ice);
world.setBlock(i-4, j+26, k+3, Ice);
world.setBlock(i, j+26, k+4, Ice);
world.setBlock(i+1, j+26, k+4, Ice);
world.setBlock(i-1, j+26, k+4, Ice);
world.setBlock(i+2, j+26, k+4, Ice);
world.setBlock(i-2, j+26, k+4, Ice);
world.setBlock(i, j+26, k-4, Ice);
world.setBlock(i+1, j+26, k-4, Ice);
world.setBlock(i-1, j+26, k-4, Ice);
world.setBlock(i+2, j+26, k-4, Ice);
world.setBlock(i-2, j+26, k-4, Ice);


world.setBlock(i+3, j+26, k-4, Ice);



}
	return false;}}