package net.minecraft.src;
 
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
 
public class RenderLavaBlock extends RenderLiving
{
	
	

	protected void preRenderScale(EntityLavaBlock par1EntityNameHere , float par2)
    {
                    // These values are x,y,z scale. Where 1.0F = 100% (original size)
		 GL11.glScalef(0.2F, 0.2F, 0.2F);
    }
	  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	    {
	        this.preRenderScale((EntityLavaBlock)par1EntityLivingBase, par2);
	    }
	  
    public RenderLavaBlock(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
 
    public void renderLavaBlock(EntityLavaBlock par1EntityLavaBlock, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityLavaBlock, par2, par4, par6, par8, par9);
    }
 
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderLavaBlock((EntityLavaBlock)par1EntityLiving, par2, par4, par6, par8, par9);
    }
   
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderLavaBlock((EntityLavaBlock)par1Entity, par2, par4, par6, par8, par9);
    }

    private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/LavaBlock.png");
    
    protected ResourceLocation func_110779_a(EntityLavaBlock par1EntityLavaBlock)
    {
             return textureLocation;
    }
     
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
    return textureLocation;
    }
}