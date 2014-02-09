package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWhip extends ModelBase
{
  //fields
        ModelRenderer Handle;
        ModelRenderer Whip1;
        ModelRenderer Whip2;
        ModelRenderer Whip3;
        ModelRenderer Whip4;
        ModelRenderer Whip5;
        ModelRenderer Whip6;
        ModelRenderer Whip7;
 
  public ModelWhip()
  {
        textureWidth = 32;
        textureHeight = 32;
        
          Handle = new ModelRenderer(this, 0, 21);
          Handle.addBox(-1F, -1F, -1F, 2, 2, 2);
          Handle.setRotationPoint(-1F, 0F, 0F);
          Handle.setTextureSize(32, 32);
          Handle.mirror = true;
          setRotation(Handle, 0F, 0F, 0F);
          Whip1 = new ModelRenderer(this, 0, 0);
          Whip1.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
          Whip1.setRotationPoint(0F, 0F, 0F);
          Whip1.setTextureSize(32, 32);
          Whip1.mirror = true;
          setRotation(Whip1, 0F, 0F, 0F);
          Whip2 = new ModelRenderer(this, 0, 3);
          Whip2.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
          Whip2.setRotationPoint(2F, 0F, 0F);
          Whip2.setTextureSize(32, 32);
          Whip2.mirror = true;
          setRotation(Whip2, 0F, 0F, 0.3316126F);
          Whip3 = new ModelRenderer(this, 0, 6);
          Whip3.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
          Whip3.setRotationPoint(4F, 0.6F, 0F);
          Whip3.setTextureSize(32, 32);
          Whip3.mirror = true;
          setRotation(Whip3, 0F, 0F, 1.047198F);
          Whip4 = new ModelRenderer(this, 0, 9);
          Whip4.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
          Whip4.setRotationPoint(5F, 2.3F, 0F);
          Whip4.setTextureSize(32, 32);
          Whip4.mirror = true;
          setRotation(Whip4, 0F, 0F, 1.658063F);
          Whip5 = new ModelRenderer(this, 0, 12);
          Whip5.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
          Whip5.setRotationPoint(4.8F, 4.3F, 0F);
          Whip5.setTextureSize(32, 32);
          Whip5.mirror = true;
          setRotation(Whip5, 0F, 0F, 1.821752F);
          Whip6 = new ModelRenderer(this, 0, 15);
          Whip6.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
          Whip6.setRotationPoint(4.2F, 6.3F, 0F);
          Whip6.setTextureSize(32, 32);
          Whip6.mirror = true;
          setRotation(Whip6, 0F, 0F, 1.449966F);
          Whip7 = new ModelRenderer(this, 0, 18);
          Whip7.addBox(0F, -0.5F, -0.5F, 2, 1, 1);
          Whip7.setRotationPoint(4.5F, 8.3F, 0F);
          Whip7.setTextureSize(32, 32);
          Whip7.mirror = true;
          setRotation(Whip7, 0F, 0F, 1.152537F);
  }
 
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Handle.render(f5);
        Whip1.render(f5);
        Whip2.render(f5);
        Whip3.render(f5);
        Whip4.render(f5);
        Whip5.render(f5);
        Whip6.render(f5);
        Whip7.render(f5);
  }
 
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
  }
 
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}

}