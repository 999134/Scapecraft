package net.minecraft.src;
 
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
 
public class RenderKaril extends RenderLiving
{
    private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/Karil.png");
    
    protected ResourceLocation func_110779_a(EntityKaril par1EntityAbbyDemon)
    {
             return textureLocation;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
    return textureLocation;
    }
    
    
    
	 protected void preRenderScale(EntityKaril par1EntityNameHere , float par2)
     {
                     // These values are x,y,z scale. Where 1.0F = 100% (original size)
		 GL11.glScalef(1.0F, 1.0F, 1.0F);
     }
     
	  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	    {
	        this.preRenderScale((EntityKaril)par1EntityLivingBase, par2);
	    }
    public RenderKaril(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
 
    public void renderKaril(EntityKaril par1EntityKaril, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityKaril, par2, par4, par6, par8, par9);
    }
 
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderKaril((EntityKaril)par1EntityLiving, par2, par4, par6, par8, par9);
    }
   
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderKaril((EntityKaril)par1Entity, par2, par4, par6, par8, par9);
    }
}