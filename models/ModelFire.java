package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFire extends ModelBase
{
  //fields
    ModelRenderer Shape2;
    ModelRenderer Shape1;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape3;
  
  public ModelFire()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 16, 0, 16);
      Shape2.setRotationPoint(-8F, 23.9F, -8F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 56, 21);
      Shape1.addBox(0F, 0F, 0F, 2, 9, 2);
      Shape1.setRotationPoint(-1F, 16F, -1F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, -0.3490659F, 0F, 0.3490659F);
      Shape4 = new ModelRenderer(this, 48, 21);
      Shape4.addBox(0F, 0F, 0F, 2, 9, 2);
      Shape4.setRotationPoint(0F, 18F, -1F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0.3490659F, 0F, -0.3490659F);
      Shape5 = new ModelRenderer(this, 40, 21);
      Shape5.addBox(0F, 0F, 0F, 2, 9, 2);
      Shape5.setRotationPoint(-1F, 18F, -1F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0.3862445F, 0F, 0.7291139F);
      Shape6 = new ModelRenderer(this, 32, 21);
      Shape6.addBox(0F, 0F, 0F, 2, 9, 2);
      Shape6.setRotationPoint(0F, 17F, -1F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, -0.4688636F, 0F, -0.2003514F);
      Shape7 = new ModelRenderer(this, 16, 16);
      Shape7.addBox(0F, 0F, 0F, 8, 16, 0);
      Shape7.setRotationPoint(-4F, 5F, 0F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 16);
      Shape3.addBox(0F, 0F, 0F, 8, 16, 0);
      Shape3.setRotationPoint(0F, 5F, 4F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape2.render(f5);
    Shape1.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape3.render(f5);
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
