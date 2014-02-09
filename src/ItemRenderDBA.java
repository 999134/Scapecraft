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

import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderDBA implements IItemRenderer {

	protected DBA DBAModel ;
	
	public ItemRenderDBA(){
		DBAModel = new DBA();
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
        
        float scale = 2.0F;
        GL11.glScalef(scale,scale,scale);

        Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_DBA);
        
        GL11.glRotatef(90F, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(180F, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(45F, 0.0f, 0.0f, 1.0f);
        
    GL11.glTranslatef( -0.2F, 0F, 0.3F);

        DBAModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
       // FMLClientHandler.instance().getClient().renderEngine.resetBoundTexture();
        
        GL11.glPopMatrix();
    }
    break;
	case EQUIPPED_FIRST_PERSON:
	{
		GL11.glPushMatrix();
		
	       Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_DBA);
	       
		float scale = 1.05F;
		
		GL11.glScalef(scale, scale, scale);
		
		GL11.glRotatef(100.0F, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(270.0F, 0.0F, 0.0F, 1.0F);
		
		boolean isFirstPerson = false;
		
		if(data[1] != null && data[1] instanceof EntityPlayer){
		
		if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 90.0F)))
		
			
			{
				GL11.glTranslatef(0.00F, -0.35F, -0.50F);
			}
			else
			{
				isFirstPerson = true;
			}
		}
		else
		{
		
		GL11.glTranslatef(0.00F, -0.35F, -0.50F);
		}
	
	
		DBAModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		

				
		GL11.glPopMatrix();
		
		
	}
	case EQUIPPED:
	{
		GL11.glPushMatrix();
		
	       Minecraft.getMinecraft().renderEngine.bindTexture(Resources.TEXTURE_DBA);
	       
		float scale = 1.05F;
		
		GL11.glScalef(scale, scale, scale);
		
		GL11.glRotatef(100.0F, 1.0F, 0.0F, 0.0F);
		GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(270.0F, 0.0F, 0.0F, 1.0F);
		
		boolean isFirstPerson = false;
		
		if(data[1] != null && data[1] instanceof EntityPlayer){
		
		if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 90.0F)))
		
			
			{
				GL11.glTranslatef(0.00F, -0.35F, -0.50F);
			}
			else
			{
				isFirstPerson = true;
			}
		}
		else
		{
		
		GL11.glTranslatef(0.00F, -0.35F, -0.50F);
		}
	
	
		DBAModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		

				
		GL11.glPopMatrix();
		
		
	}
	default:
		break;
	}
	}
	
	

	}


