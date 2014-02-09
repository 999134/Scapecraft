package net.minecraft.src;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemAddyaxe extends ItemTool
{
        private static Block blocksEffectiveAgainst[];

        protected ItemAddyaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
        {
                super(par1, 3, par2EnumToolMaterial, blocksEffectiveAgainst);
        }

        public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
        {
                if (par2Block != null && par2Block.blockMaterial == Material.wood)
                {
                        return efficiencyOnProperMaterial;
                }
                else
                {
                        return super.getStrVsBlock(par1ItemStack, par2Block);
                }
        }

        static
        {
                blocksEffectiveAgainst = (new Block[]
                                {
                                        Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.pumpkin, Block.pumpkinLantern
                                });
        }
        
        
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister ir)
        {
              //  if(itemID == mod_BlocksGalore.Addyaxe.itemID)
                {
                this.itemIcon = ir.registerIcon("Addyaxe");
                }
        }
}