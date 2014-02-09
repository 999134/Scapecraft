package net.minecraft.src;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
public class WorldGenDragon extends WorldGenerator
{
public WorldGenDragon()
{
}
public boolean generate(World world, Random random, int i, int j, int k)
{

	if(world.getBlockId(i, j - 1, k) == Block.grass.blockID && world.getBlockId(i, j, k) == 0){
	


	int stone = Block.stone.blockID;
	int DragonSpawner = mod_BlocksGalore.GreenDragonSpawn.blockID;
	int BotSpawner = mod_BlocksGalore.BotSpawn.blockID;
	int Runeore = mod_BlocksGalore.Runeore.blockID;

	
//layer 1
world.setBlock(i, j, k, DragonSpawner);
world.setBlock(i+1, j, k, stone);
world.setBlock(i, j, k+1, stone);
world.setBlock(i, j, k-1, stone);
world.setBlock(i-1, j, k, stone);
world.setBlock(i-1, j, k-1, stone);
world.setBlock(i+1, j, k-1, stone);
world.setBlock(i+1, j, k+1, stone);
world.setBlock(i-1, j, k+1, stone);
world.setBlock(i+2, j, k, stone);
world.setBlock(i, j, k+2, stone);
world.setBlock(i, j, k-2, stone);
world.setBlock(i-2, j, k, stone);
world.setBlock(i-2, j, k-2, stone);
world.setBlock(i+2, j, k-2, stone);
world.setBlock(i+2, j, k+2, stone);
world.setBlock(i-2, j, k+2, stone);
world.setBlock(i+2, j, k+1, stone);
world.setBlock(i+2, j, k-1, stone);
world.setBlock(i-2, j, k+1, stone);
world.setBlock(i-2, j, k-1, stone);
world.setBlock(i+1, j, k+2, stone);
world.setBlock(i+1, j, k-2, stone);
world.setBlock(i-1, j, k+2, BotSpawner);
world.setBlock(i-1, j, k-2, stone);
world.setBlock(i+3, j, k, stone);
world.setBlock(i+3, j, k, stone);
world.setBlock(i+3, j, k+1, stone);
world.setBlock(i+3, j, k-1, stone);
world.setBlock(i+3, j, k+2, stone);
world.setBlock(i+3, j, k-2, stone);
world.setBlock(i+3, j, k+3, stone);
world.setBlock(i+3, j, k-3, stone);
world.setBlock(i-3, j, k, stone);
world.setBlock(i-3, j, k+1, stone);
world.setBlock(i-3, j, k-1, stone);
world.setBlock(i-3, j, k+2, stone);
world.setBlock(i-3, j, k-2, stone);
world.setBlock(i-3, j, k-3, stone);
world.setBlock(i-3, j, k+3, stone);
world.setBlock(i, j, k+3, stone);
world.setBlock(i+1, j, k+3, stone);
world.setBlock(i-1, j, k+3, stone);
world.setBlock(i+2, j, k+3, stone);
world.setBlock(i-2, j, k+3, stone);
world.setBlock(i, j, k-3, stone);
world.setBlock(i+1, j, k-3, stone);
world.setBlock(i-1, j, k-3, stone);
world.setBlock(i+2, j, k-3, stone);
world.setBlock(i-2, j, k-3, stone);


world.setBlock(i+4, j, k, stone);
world.setBlock(i+4, j, k+1, stone);
world.setBlock(i+4, j, k-1, stone);
world.setBlock(i+4, j, k+2, stone);
world.setBlock(i+4, j, k-2, stone);
world.setBlock(i+4, j, k+3, BotSpawner);
world.setBlock(i+4, j, k-3, stone);
world.setBlock(i-4, j, k, stone);
world.setBlock(i-4, j, k+1, stone);
world.setBlock(i-4, j, k-1, stone);
world.setBlock(i-4, j, k+2, stone);
world.setBlock(i-4, j, k-2, stone);
world.setBlock(i-4, j, k-3, stone);
world.setBlock(i-4, j, k+3, stone);
world.setBlock(i, j, k+4, stone);
world.setBlock(i+1, j, k+4, stone);
world.setBlock(i-1, j, k+4, BotSpawner);
world.setBlock(i+2, j, k+4, stone);
world.setBlock(i-2, j, k+4, stone);
world.setBlock(i, j, k-4, stone);
world.setBlock(i+1, j, k-4, stone);
world.setBlock(i-1, j, k-4, stone);
world.setBlock(i+2, j, k-4, stone);
world.setBlock(i-2, j, k-4, stone);

world.setBlock(i+1, j+1, k+1, Runeore);
world.setBlock(i+2, j+1, k+3, Runeore);
world.setBlock(i-1, j+1, k-3, Runeore);
world.setBlock(i, j+1, k-2, Runeore);

return true;


}
	return false;}
}