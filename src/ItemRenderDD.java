package net.minecraft.src;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.models.DBA;
import net.minecraft.models.ModelDD;

import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderDD implements IItemRenderer {

	protected ModelDD RAPIERModel ;
	
	public ItemRenderDD(){
		RAPIERModel = new ModelDD();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		
		switch(type)
		{
		case EQUIPPED: return true;
		 case ENTITY: return true;
		 case EQUIPPED_FIRST_PERSON: return true;
		default: return false;
		}
	
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
	switch(type)
	{
	case  ENTITY:
    {
        GL11.glPushMatrix();
        
        float scale = 1.20F;
        GL11.glScalef(scale,scale,scale);
        Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_DD);
        
        GL11.glRotatef(90F, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(180F, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(45F, 0.0f, 0.0f, 1.0f);
        
    GL11.glTranslatef( -0.2F, 0F, 0.3F);

        RAPIERModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        //FMLClientHandler.instance().getClient().renderEngine.resetBoundTexture();
        
        GL11.glPopMatrix();
    }
    break;
	case EQUIPPED_FIRST_PERSON:
	{
		GL11.glPushMatrix();
		
	       Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_DD);
		
		 float scale = 1.00F;
			
			GL11.glScalef(scale, scale, scale);
			
			GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
			//GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(230.0F, 0.0F, 0.0F, 1.0F);
			

			
			GL11.glTranslatef(-1.2F, -0.0F, -0.15F);
		
			

	
		RAPIERModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		
		//ForgeHooksClient.unbindTexture();
				
		GL11.glPopMatrix();
		
	}
	case EQUIPPED:
	{
		GL11.glPushMatrix();
		
	       Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_DD);
		
		 float scale = 0.60F;
			
			GL11.glScalef(scale, scale, scale);
			
			GL11.glRotatef(100.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(270.0F, 0.0F, 0.0F, 1.0F);
		

	
			
				GL11.glTranslatef(0.00F, 1.30F, -0.2F);
		
			
			

		
	
		
		
		
	
		RAPIERModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		
		//ForgeHooksClient.unbindTexture();
				
		GL11.glPopMatrix();
		
		
	}
	default:
		break;
	}
	}
	
	

	}


