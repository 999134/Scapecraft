package net.minecraft.src;
 
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
 
public class RenderDwarf extends RenderLiving
{
    private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/dwarf.png");
    
    protected ResourceLocation func_110779_a(EntityDwarf par1EntityAbbyDemon)
    {
             return textureLocation;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
    return textureLocation;
    }
	protected void scale()
    {
            GL11.glScalef(0.7F, 0.7F, 0.7F);
    }

    protected void preRenderCallback(EntityLiving entityliving, float f)
    {
            scale();
}
    public RenderDwarf(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
 
    public void renderDwarf(EntityDwarf par1EntityDwarf, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityDwarf, par2, par4, par6, par8, par9);
    }
 
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderDwarf((EntityDwarf)par1EntityLiving, par2, par4, par6, par8, par9);
    }
   
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderDwarf((EntityDwarf)par1Entity, par2, par4, par6, par8, par9);
    }
}