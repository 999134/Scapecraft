package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSaraSword extends ModelBase
{
  //fields
    ModelRenderer HiltTip1;
    ModelRenderer HiltTip2;
    ModelRenderer Handle;
    ModelRenderer Symbol1;
    ModelRenderer Symbol2;
    ModelRenderer Symol3;
    ModelRenderer Blade1;
    ModelRenderer Blade2;
    ModelRenderer Blade3;
    ModelRenderer Blade4;
    ModelRenderer Blade5;
    ModelRenderer Blade6;
    ModelRenderer Blade7;
    ModelRenderer Blade8;

  public ModelSaraSword()
  {
    textureWidth = 64;
    textureHeight = 32;

      HiltTip1 = new ModelRenderer(this, 51, 27);
      HiltTip1.addBox(0F, 0F, 0F, 3, 2, 3);
      HiltTip1.setRotationPoint(0F, 22F, 0F);
      HiltTip1.setTextureSize(64, 32);
      HiltTip1.mirror = true;
      setRotation(HiltTip1, 0F, 0F, 0F);
      HiltTip2 = new ModelRenderer(this, 55, 23);
      HiltTip2.addBox(0F, 0F, 0F, 2, 1, 2);
      HiltTip2.setRotationPoint(0.5F, 21F, 0.5F);
      HiltTip2.setTextureSize(64, 32);
      HiltTip2.mirror = true;
      setRotation(HiltTip2, 0F, 0F, 0F);
      Handle = new ModelRenderer(this, 44, 26);
      Handle.addBox(0F, 0F, 0F, 1, 4, 2);
      Handle.setRotationPoint(1F, 17F, 0.5F);
      Handle.setTextureSize(64, 32);
      Handle.mirror = true;
      setRotation(Handle, 0F, 0F, 0F);
      Symbol1 = new ModelRenderer(this, 53, 15);
      Symbol1.addBox(0F, 0F, 0F, 3, 1, 2);
      Symbol1.setRotationPoint(1.5F, 16F, 0.5F);
      Symbol1.setTextureSize(64, 32);
      Symbol1.mirror = true;
      setRotation(Symbol1, 0F, 0F, 0F);
      Symbol2 = new ModelRenderer(this, 53, 19);
      Symbol2.addBox(0F, 0F, 0F, 3, 1, 2);
      Symbol2.setRotationPoint(-1.5F, 16F, 0.5F);
      Symbol2.setTextureSize(64, 32);
      Symbol2.mirror = true;
      setRotation(Symbol2, 0F, 0F, 0F);
      Symol3 = new ModelRenderer(this, 57, 9);
      Symol3.addBox(0F, 0F, 0F, 1, 3, 2);
      Symol3.setRotationPoint(1F, 13.5F, 0.5F);
      Symol3.setTextureSize(64, 32);
      Symol3.mirror = true;
      setRotation(Symol3, 0F, 0F, 0F);
      Blade1 = new ModelRenderer(this, 0, 28);
      Blade1.addBox(0F, 0F, 0F, 3, 3, 1);
      Blade1.setRotationPoint(0F, 13F, 1F);
      Blade1.setTextureSize(64, 32);
      Blade1.mirror = true;
      setRotation(Blade1, 0F, 0F, 0F);
      Blade2 = new ModelRenderer(this, 0, 11);
      Blade2.addBox(0F, 0F, 0F, 2, 15, 1);
      Blade2.setRotationPoint(1F, -3F, 1F);
      Blade2.setTextureSize(64, 32);
      Blade2.mirror = true;
      setRotation(Blade2, 0F, 0F, 0F);
      Blade3 = new ModelRenderer(this, 0, 8);
      Blade3.addBox(0F, 0F, 0F, 1, 1, 1);
      Blade3.setRotationPoint(1F, 12F, 1F);
      Blade3.setTextureSize(64, 32);
      Blade3.mirror = true;
      setRotation(Blade3, 0F, 0F, 0F);
      Blade4 = new ModelRenderer(this, 0, 5);
      Blade4.addBox(0F, 0F, 0F, 2, 1, 1);
      Blade4.setRotationPoint(0.4F, 10F, 1F);
      Blade4.setTextureSize(64, 32);
      Blade4.mirror = true;
      setRotation(Blade4, 0F, 0F, 0.7435103F);
      Blade5 = new ModelRenderer(this, 0, 5);
      Blade5.addBox(0F, 0F, 0F, 2, 1, 1);
      Blade5.setRotationPoint(0.7F, 8F, 1F);
      Blade5.setTextureSize(64, 32);
      Blade5.mirror = true;
      setRotation(Blade5, 0F, 0F, 0.7435103F);
      Blade6 = new ModelRenderer(this, 0, 5);
      Blade6.addBox(0F, 0F, 0F, 2, 1, 1);
      Blade6.setRotationPoint(0.9F, 6F, 1F);
      Blade6.setTextureSize(64, 32);
      Blade6.mirror = true;
      setRotation(Blade6, 0F, 0F, 0.7435103F);
      Blade7 = new ModelRenderer(this, 0, 2);
      Blade7.addBox(0F, 0F, 0F, 1, 1, 1);
      Blade7.setRotationPoint(1F, -4F, 1F);
      Blade7.setTextureSize(64, 32);
      Blade7.mirror = true;
      setRotation(Blade7, 0F, 0F, 0F);
      Blade8 = new ModelRenderer(this, 0, 2);
      Blade8.addBox(0F, 0F, 0F, 1, 1, 1);
      Blade8.setRotationPoint(2F, -3.5F, 1F);
      Blade8.setTextureSize(64, 32);
      Blade8.mirror = true;
      setRotation(Blade8, 0F, 0F, 0F);
  }

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    HiltTip1.render(f5);
    HiltTip2.render(f5);
    Handle.render(f5);
    Symbol1.render(f5);
    Symbol2.render(f5);
    Symol3.render(f5);
    Blade1.render(f5);
    Blade2.render(f5);
    Blade3.render(f5);
    Blade4.render(f5);
    Blade5.render(f5);
    Blade6.render(f5);
    Blade7.render(f5);
    Blade8.render(f5);
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