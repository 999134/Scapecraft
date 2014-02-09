package net.minecraft.src;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenBarrows extends WorldGenerator
{


	

	public WorldGenBarrows() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		

		world.setBlock(i + 0, j + 0, k + 0, Block.stone.blockID);
		
		
		return true;
	}
}