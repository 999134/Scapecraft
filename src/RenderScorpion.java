package net.minecraft.src;
 
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
 
public class RenderScorpion extends RenderLiving
{
	private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/scorpion.png");
	
    protected ResourceLocation func_110779_a(EntityScorpion par1EntityArrow)
    {
             return textureLocation;
    }
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
    return textureLocation;
    }
	protected void scale()
    {
            GL11.glScalef(1.0F, 1.0F, 1.0F);
    }

    protected void preRenderCallback(EntityLiving entityliving, float f)
    {
            scale();
}
    public RenderScorpion(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
 
    public void renderScorpion(EntityScorpion par1EntityScorpion, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityScorpion, par2, par4, par6, par8, par9);
    }
 
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderScorpion((EntityScorpion)par1EntityLiving, par2, par4, par6, par8, par9);
    }
   
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderScorpion((EntityScorpion)par1Entity, par2, par4, par6, par8, par9);
    }


	}
