package net.minecraft.src;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
public class WorldGenStructure extends WorldGenerator
{
public WorldGenStructure()
{
}
public boolean generate(World world, Random random, int i, int j, int k)
{

	
	
	int smallSpawner = mod_BlocksGalore.KQ2Spawn.blockID;
	int bigSpawner = mod_BlocksGalore.KQSpawn.blockID;
	int Gold = Block.blockGold.blockID;
	int TheifSpawner = mod_BlocksGalore.THEIFSpawn.blockID;
	int GuardSpawner = mod_BlocksGalore.GUARDSpawn.blockID;
	int WhiteSpawner = mod_BlocksGalore.WHITESpawn.blockID;
	int BlackSpawner = mod_BlocksGalore.BLKSpawn.blockID;
	int HellhoundSpawner = mod_BlocksGalore.HellhoundSpawn.blockID;
	
world.setBlock(i, j, k, bigSpawner);
world.setBlock(i, j, k+5, HellhoundSpawner);
world.setBlock(i, j-1, k, Gold);
world.setBlock(i-1, j-1, k, GuardSpawner);
world.setBlock(i+1, j-1, k, TheifSpawner);
world.setBlock(i, j-1, k+1, WhiteSpawner);
world.setBlock(i, j-1, k-1, BlackSpawner);
world.setBlock(i+1, j, k, smallSpawner);
world.setBlock(i, j, k+1, smallSpawner);
world.setBlock(i, j, k-1, smallSpawner);
world.setBlock(i-1, j, k, smallSpawner);
world.setBlock(i-1, j, k-1, smallSpawner);
world.setBlock(i+1, j, k-1, smallSpawner);
world.setBlock(i+1, j, k+1, smallSpawner);
world.setBlock(i-1, j, k+1, smallSpawner);
world.setBlock(i+2, j, k, smallSpawner);
world.setBlock(i, j, k+2, smallSpawner);
world.setBlock(i, j, k-2, smallSpawner);
world.setBlock(i-2, j, k, smallSpawner);
world.setBlock(i-2, j, k-2, smallSpawner);
world.setBlock(i+2, j, k-2, smallSpawner);
world.setBlock(i+2, j, k+2, smallSpawner);
world.setBlock(i-2, j, k+2, smallSpawner);
world.setBlock(i+2, j, k+1, smallSpawner);
world.setBlock(i+2, j, k-1, smallSpawner);
world.setBlock(i-2, j, k+1, smallSpawner);
world.setBlock(i-2, j, k-1, smallSpawner);
world.setBlock(i+1, j, k+2, smallSpawner);
world.setBlock(i+1, j, k-2, smallSpawner);
world.setBlock(i-1, j, k+2, smallSpawner);
world.setBlock(i-1, j, k-2, smallSpawner);




//world.setBlockAndMetadataWithNotify(i, j + 1, k, stoneBrick, 1);
return true;


}
}