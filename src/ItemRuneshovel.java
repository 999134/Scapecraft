package net.minecraft.src;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class ItemRuneshovel extends ItemTool
{
        private static Block blocksEffectiveAgainst[];

        public ItemRuneshovel(int par1, EnumToolMaterial par2EnumToolMaterial)
        {
                super(par1, 1, par2EnumToolMaterial, blocksEffectiveAgainst);
        }

        public boolean canHarvestBlock(Block par1Block)
        {
                if (par1Block == Block.snow)
                {
                        return true;
                }

                return par1Block == Block.blockSnow;
        }

        static
        {
                blocksEffectiveAgainst = (new Block[]
                                {
                                        Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium
                                });
        }
        
        @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister ir)
	    {
	            {
	            this.itemIcon = ir.registerIcon("Runeshovel");
	            }
	    }
}
