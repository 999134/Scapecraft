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
import net.minecraft.models.ModelRapier;
import net.minecraft.models.ModelGuthixstaff;

import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderGUTHIXSTAFF implements IItemRenderer {

	protected ModelGuthixstaff GuthixstaffModel ;
	
	public ItemRenderGUTHIXSTAFF(){
		 GuthixstaffModel = new ModelGuthixstaff();
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
	
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
	switch(type)
	{
	case  ENTITY:
    {
        GL11.glPushMatrix();
        
        float scale = 0.75F;
        GL11.glScalef(scale,scale,scale);
        Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_GUTHIXSTAFF);
        
        GL11.glRotatef(90F, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(0F, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(90F, 0.0f, 0.0f, 1.0f);
        
    GL11.glTranslatef( -0.2F, 1F, 0F);

        GuthixstaffModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
       // FMLClientHandler.instance().getClient().renderEngine.resetBoundTexture();
        
        GL11.glPopMatrix();
    }
    break;
	case EQUIPPED_FIRST_PERSON:
	{
		GL11.glPushMatrix();
		
	     Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_GUTHIXSTAFF);
		
		float scale = 0.45F;
		
		GL11.glScalef(scale, scale, scale);
		
		GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(320.0F, 0.0F, 0.0F, 1.0F);
		

		
		GL11.glTranslatef(1.50F, 0.70F, 0.0F);
		
	
		
		
		
	
		 GuthixstaffModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		
		//ForgeHooksClient.unbindTexture();
				
		GL11.glPopMatrix();
		
		
	}
	case EQUIPPED:
	{
		GL11.glPushMatrix();
		
	     Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_GUTHIXSTAFF);
		
		float scale = 0.45F;
		
		GL11.glScalef(scale, scale, scale);
		
		GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(320.0F, 0.0F, 0.0F, 1.0F);
		

		
		GL11.glTranslatef(1.50F, 0.70F, 0.0F);
		
	
		
		
		
	
		 GuthixstaffModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		
		//ForgeHooksClient.unbindTexture();
				
		GL11.glPopMatrix();
		
		
	}
	default:
		break;
	}
	
	}
	
	

	}


