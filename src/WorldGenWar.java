package net.minecraft.src;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
public class WorldGenWar extends WorldGenerator
{
public WorldGenWar()
{
}
public boolean generate(World world, Random random, int i, int j, int k)
{

	if(world.getBlockId(i, j - 1, k) == Block.grass.blockID && world.getBlockId(i, j, k) == 0){
	
	int WhiteBlock = mod_BlocksGalore.WHITEBlock.blockID;
	int WhiteSpawner = mod_BlocksGalore.WHITESpawn.blockID;
	int BlackBlock = mod_BlocksGalore.BLKBlock.blockID;
	int BlackSpawner = mod_BlocksGalore.BLKSpawn.blockID;
	int Anvil = Block.anvil.blockID;
	int Bench = Block.workbench.blockID;
	int TheifSpawner = mod_BlocksGalore.THEIFSpawn.blockID;
	int GuardSpawner = mod_BlocksGalore.GUARDSpawn.blockID;
	int gold = Block.oreGold.blockID;
	int stone = Block.stone.blockID;
	int Wizardspawner = mod_BlocksGalore.WIZARDSpawn.blockID;
	int HellhoundSpawner = mod_BlocksGalore.HellhoundSpawn.blockID;
//layer 1
world.setBlock(i, j, k, WhiteSpawner);
world.setBlock(i-4, j, k+4, HellhoundSpawner);
world.setBlock(i+1, j, k, WhiteBlock);
world.setBlock(i, j, k+1, WhiteBlock);
world.setBlock(i, j, k-1, WhiteBlock);
world.setBlock(i-1, j, k, WhiteBlock);
world.setBlock(i-1, j, k-1, WhiteBlock);
world.setBlock(i+1, j, k-1, WhiteBlock);
world.setBlock(i+1, j, k+1, WhiteBlock);
world.setBlock(i-1, j, k+1, WhiteBlock);
world.setBlock(i+2, j, k, WhiteBlock);
world.setBlock(i, j, k+2, WhiteBlock);
world.setBlock(i, j, k-2, WhiteBlock);
world.setBlock(i-2, j, k, WhiteBlock);
world.setBlock(i-2, j, k-2, WhiteBlock);
world.setBlock(i+2, j, k-2, WhiteBlock);
world.setBlock(i+2, j, k+2, WhiteBlock);
world.setBlock(i-2, j, k+2, WhiteBlock);
world.setBlock(i+2, j, k+1, WhiteBlock);
world.setBlock(i+2, j, k-1, WhiteBlock);
world.setBlock(i-2, j, k+1, WhiteBlock);
world.setBlock(i-2, j, k-1, WhiteBlock);
world.setBlock(i+1, j, k+2, WhiteBlock);
world.setBlock(i+1, j, k-2, WhiteBlock);
world.setBlock(i-1, j, k+2, WhiteBlock);
world.setBlock(i-1, j, k-2, WhiteBlock);

//land between
world.setBlock(i, j, k+3, WhiteBlock);
world.setBlock(i, j, k+4, WhiteBlock);
world.setBlock(i, j, k+5, gold);
world.setBlock(i, j, k+6, BlackBlock);
world.setBlock(i, j, k+7, BlackBlock);
world.setBlock(i+1, j, k+3, WhiteBlock);
world.setBlock(i+1, j, k+4, WhiteBlock);
world.setBlock(i+1, j, k+5, stone);
world.setBlock(i+1, j, k+6, BlackBlock);
world.setBlock(i+1, j, k+7, BlackBlock);
world.setBlock(i-1, j, k+3, WhiteBlock);
world.setBlock(i-1, j, k+4, WhiteBlock);
world.setBlock(i-1, j, k+5, stone);
world.setBlock(i-1, j, k+6, BlackBlock);
world.setBlock(i-1, j, k+7, BlackBlock);


//layer 2
world.setBlock(i+2, j+1, k, WhiteBlock);
//world.setBlock(i, j+1, k+2, WhiteBlock);
world.setBlock(i, j+1, k-2, WhiteBlock);
world.setBlock(i-2, j+1, k, WhiteBlock);
world.setBlock(i-2, j+1, k-2, WhiteBlock);
world.setBlock(i+2, j+1, k-2, WhiteBlock);
world.setBlock(i+2, j+1, k+2, WhiteBlock);
world.setBlock(i-2, j+1, k+2, WhiteBlock);
world.setBlock(i+2, j+1, k+1, WhiteBlock);
world.setBlock(i+2, j+1, k-1, WhiteBlock);
world.setBlock(i-2, j+1, k+1, WhiteBlock);
world.setBlock(i-2, j+1, k-1, WhiteBlock);
world.setBlock(i+1, j+1, k+2, WhiteBlock);
world.setBlock(i+1, j+1, k-2, WhiteBlock);
world.setBlock(i-1, j+1, k+2, WhiteBlock);
world.setBlock(i-1, j+1, k-2, WhiteBlock);

//layer3
world.setBlock(i+2, j+2, k, WhiteBlock);
//world.setBlock(i, j+2, k+2, WhiteBlock);
world.setBlock(i, j+2, k-2, WhiteBlock);
world.setBlock(i-2, j+2, k, WhiteBlock);
world.setBlock(i-2, j+2, k-2, WhiteBlock);
world.setBlock(i+2, j+2, k-2, WhiteBlock);
world.setBlock(i+2, j+2, k+2, WhiteBlock);
world.setBlock(i-2, j+2, k+2, WhiteBlock);
world.setBlock(i+2, j+2, k+1, WhiteBlock);
world.setBlock(i+2, j+2, k-1, WhiteBlock);
world.setBlock(i-2, j+2, k+1, WhiteBlock);
world.setBlock(i-2, j+2, k-1, WhiteBlock);
world.setBlock(i+1, j+2, k+2, WhiteBlock);
world.setBlock(i+1, j+2, k-2, WhiteBlock);
world.setBlock(i-1, j+2, k+2, WhiteBlock);
world.setBlock(i-1, j+2, k-2, WhiteBlock);

//layer 4
world.setBlock(i+2, j+3, k, WhiteBlock);
world.setBlock(i, j+3, k+2, WhiteBlock);
world.setBlock(i, j+3, k-2, WhiteBlock);
world.setBlock(i-2, j+3, k, WhiteBlock);
world.setBlock(i-2, j+3, k-2, WhiteBlock);
world.setBlock(i+2, j+3, k-2, WhiteBlock);
world.setBlock(i+2, j+3, k+2, WhiteBlock);
world.setBlock(i-2, j+3, k+2, WhiteBlock);
world.setBlock(i+2, j+3, k+1, WhiteBlock);
world.setBlock(i+2, j+3, k-1, WhiteBlock);
world.setBlock(i-2, j+3, k+1, WhiteBlock);
world.setBlock(i-2, j+3, k-1, WhiteBlock);
world.setBlock(i+1, j+3, k+2, WhiteBlock);
world.setBlock(i+1, j+3, k-2, WhiteBlock);
world.setBlock(i-1, j+3, k+2, WhiteBlock);
world.setBlock(i-1, j+3, k-2, WhiteBlock);

//layer 5
world.setBlock(i, j+4, k, WhiteSpawner);
world.setBlock(i+1, j+4, k, WhiteSpawner);
world.setBlock(i, j+4, k+1, WhiteSpawner);
world.setBlock(i, j+4, k-1, WhiteSpawner);
world.setBlock(i-1, j+4, k, GuardSpawner);
world.setBlock(i-1, j+4, k-1, GuardSpawner);
world.setBlock(i+1, j+4, k-1, WhiteBlock);
world.setBlock(i+1, j+4, k+1, WhiteBlock);
world.setBlock(i-1, j+4, k+1, WhiteBlock);
world.setBlock(i+2, j+4, k, WhiteBlock);
world.setBlock(i, j+4, k+2, WhiteBlock);
world.setBlock(i, j+4, k-2, WhiteBlock);
world.setBlock(i-2, j+4, k, WhiteBlock);
world.setBlock(i-2, j+4, k-2, WhiteBlock);
world.setBlock(i+2, j+4, k-2, WhiteBlock);
world.setBlock(i+2, j+4, k+2, WhiteBlock);
world.setBlock(i-2, j+4, k+2, WhiteBlock);
world.setBlock(i+2, j+4, k+1, WhiteBlock);
world.setBlock(i+2, j+4, k-1, WhiteBlock);
world.setBlock(i-2, j+4, k+1, WhiteBlock);
world.setBlock(i-2, j+4, k-1, WhiteBlock);
world.setBlock(i+1, j+4, k+2, WhiteBlock);
world.setBlock(i+1, j+4, k-2, WhiteBlock);
world.setBlock(i-1, j+4, k+2, WhiteBlock);
world.setBlock(i-1, j+4, k-2, WhiteBlock);

//layer 6
world.setBlock(i, j+5, k, Anvil);
world.setBlock(i, j+5, k+1, Bench);
world.setBlock(i-2, j+5, k-2, WhiteBlock);
world.setBlock(i-2, j+5, k+2, WhiteBlock);
world.setBlock(i+2, j+5, k-2, WhiteBlock);
world.setBlock(i+2, j+5, k+2, Wizardspawner);










//Layer 1
world.setBlock(i, j, k+10, BlackSpawner);
world.setBlock(i+1, j, k+10, BlackBlock);
world.setBlock(i, j, k+11, BlackBlock);
world.setBlock(i, j, k+9, BlackBlock);
world.setBlock(i-1, j, k+10, BlackBlock);
world.setBlock(i-1, j, k+9, BlackBlock);
world.setBlock(i+1, j, k+9, BlackBlock);
world.setBlock(i+1, j, k+11, BlackBlock);
world.setBlock(i-1, j, k+11, BlackBlock);
world.setBlock(i+2, j, k+10, BlackBlock);
world.setBlock(i, j, k+12, BlackBlock);
world.setBlock(i, j, k+8, BlackBlock);
world.setBlock(i-2, j, k+10, BlackBlock);
world.setBlock(i-2, j, k+8, BlackBlock);
world.setBlock(i+2, j, k+8, BlackBlock);
world.setBlock(i+2, j, k+12, BlackBlock);
world.setBlock(i-2, j, k+12, BlackBlock);
world.setBlock(i+2, j, k+11, BlackBlock);
world.setBlock(i+2, j, k+9, BlackBlock);
world.setBlock(i-2, j, k+11, BlackBlock);
world.setBlock(i-2, j, k+9, BlackBlock);
world.setBlock(i+1, j, k+12, BlackBlock);
world.setBlock(i+1, j, k+8, BlackBlock);
world.setBlock(i-1, j, k+12, BlackBlock);
world.setBlock(i-1, j, k+8, BlackBlock);

//layer 2
world.setBlock(i+2, j+1, k+10, BlackBlock);
world.setBlock(i, j+1, k+12, BlackBlock);
//world.setBlock(i, j+1, k+8, BlackBlock);
world.setBlock(i-2, j+1, k+10, BlackBlock);
world.setBlock(i-2, j+1, k+8, BlackBlock);
world.setBlock(i+2, j+1, k+8, BlackBlock);
world.setBlock(i+2, j+1, k+12, BlackBlock);
world.setBlock(i-2, j+1, k+12, BlackBlock);
world.setBlock(i+2, j+1, k+11, BlackBlock);
world.setBlock(i+2, j+1, k+9, BlackBlock);
world.setBlock(i-2, j+1, k+11, BlackBlock);
world.setBlock(i-2, j+1, k+9, BlackBlock);
world.setBlock(i+1, j+1, k+12, BlackBlock);
world.setBlock(i+1, j+1, k+8, BlackBlock);
world.setBlock(i-1, j+1, k+12, BlackBlock);
world.setBlock(i-1, j+1, k+8, BlackBlock);

//layer3
world.setBlock(i+2, j+2, k+10, BlackBlock);
world.setBlock(i, j+2, k+12, BlackBlock);
//world.setBlock(i, j+2, k+8, BlackBlock);
world.setBlock(i-2, j+2, k+10, BlackBlock);
world.setBlock(i-2, j+2, k+8, BlackBlock);
world.setBlock(i+2, j+2, k+8, BlackBlock);
world.setBlock(i+2, j+2, k+12, BlackBlock);
world.setBlock(i-2, j+2, k+12, BlackBlock);
world.setBlock(i+2, j+2, k+11, BlackBlock);
world.setBlock(i+2, j+2, k+9, BlackBlock);
world.setBlock(i-2, j+2, k+11, BlackBlock);
world.setBlock(i-2, j+2, k+9, BlackBlock);
world.setBlock(i+1, j+2, k+12, BlackBlock);
world.setBlock(i+1, j+2, k+8, BlackBlock);
world.setBlock(i-1, j+2, k+12, BlackBlock);
world.setBlock(i-1, j+2, k+8, BlackBlock);

//layer 4
world.setBlock(i+2, j+3, k+10, BlackBlock);
world.setBlock(i, j+3, k+12, BlackBlock);
world.setBlock(i, j+3, k+8, BlackBlock);
world.setBlock(i-2, j+3, k+10, BlackBlock);
world.setBlock(i-2, j+3, k+8, BlackBlock);
world.setBlock(i+2, j+3, k+8, BlackBlock);
world.setBlock(i+2, j+3, k+12, BlackBlock);
world.setBlock(i-2, j+3, k+12, BlackBlock);
world.setBlock(i+2, j+3, k+11, BlackBlock);
world.setBlock(i+2, j+3, k+9, BlackBlock);
world.setBlock(i-2, j+3, k+11, BlackBlock);
world.setBlock(i-2, j+3, k+9, BlackBlock);
world.setBlock(i+1, j+3, k+12, BlackBlock);
world.setBlock(i+1, j+3, k+8, BlackBlock);
world.setBlock(i-1, j+3, k+12, BlackBlock);
world.setBlock(i-1, j+3, k+8, BlackBlock);

//layer 5
world.setBlock(i, j+4, k+10, BlackSpawner);
world.setBlock(i+1, j+4, k+10, BlackSpawner);
world.setBlock(i, j+4, k+11, BlackSpawner);
world.setBlock(i, j+4, k+9, BlackBlock);
world.setBlock(i-1, j+4, k+10, TheifSpawner);
world.setBlock(i-1, j+4, k+9, BlackBlock);
world.setBlock(i+1, j+4, k+9, BlackBlock);
world.setBlock(i+1, j+4, k+11, BlackBlock);
world.setBlock(i-1, j+4, k+11, BlackBlock);
world.setBlock(i+2, j+4, k+10, BlackBlock);
world.setBlock(i, j+4, k+12, BlackBlock);
world.setBlock(i, j+4, k+8, BlackBlock);
world.setBlock(i-2, j+4, k+10, BlackBlock);
world.setBlock(i-2, j+4, k+8, BlackBlock);
world.setBlock(i+2, j+4, k+8, BlackBlock);
world.setBlock(i+2, j+4, k+12, BlackBlock);
world.setBlock(i-2, j+4, k+12, BlackBlock);
world.setBlock(i+2, j+4, k+11, BlackBlock);
world.setBlock(i+2, j+4, k+9, BlackBlock);
world.setBlock(i-2, j+4, k+11, BlackBlock);
world.setBlock(i-2, j+4, k+9, BlackBlock);
world.setBlock(i+1, j+4, k+12, BlackBlock);
world.setBlock(i+1, j+4, k+8, BlackBlock);
world.setBlock(i-1, j+4, k+12, BlackBlock);
world.setBlock(i-1, j+4, k+8, BlackBlock);

//layer 6
world.setBlock(i, j+5, k+10, Anvil);
world.setBlock(i, j+5, k+11, Bench);
world.setBlock(i-2, j+5, k+8, BlackBlock);
world.setBlock(i-2, j+5, k+12, BlackBlock);
world.setBlock(i+2, j+5, k+8, BlackBlock);
world.setBlock(i+2, j+5, k+12, BlackBlock);



return true;


}
	return false;}
}