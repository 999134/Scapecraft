package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelHalberd extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
  
  public ModelHalberd()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 29);
      Shape1.addBox(0F, 0F, 0F, 4, 66, 4);
      Shape1.setRotationPoint(0F, -42F, 0F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 3, 2);
      Shape2.setRotationPoint(-2F, -33F, 1F);
      Shape2.setTextureSize(64, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 1, 5, 4);
      Shape3.setRotationPoint(-3F, -34F, 0F);
      Shape3.setTextureSize(64, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 7, 4);
      Shape4.setRotationPoint(-4F, -35F, 0F);
      Shape4.setTextureSize(64, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 1, 11, 4);
      Shape5.setRotationPoint(-5F, -37F, 0F);
      Shape5.setTextureSize(64, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 0F, 1, 15, 4);
      Shape6.setRotationPoint(-6F, -39F, 0F);
      Shape6.setTextureSize(64, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 1, 22, 4);
      Shape7.setRotationPoint(-7F, -41F, 0F);
      Shape7.setTextureSize(64, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(0F, 0F, 0F, 1, 15, 4);
      Shape8.setRotationPoint(-8F, -39F, 0F);
      Shape8.setTextureSize(64, 128);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 0);
      Shape9.addBox(0F, 0F, 0F, 1, 11, 4);
      Shape9.setRotationPoint(-9F, -37F, 0F);
      Shape9.setTextureSize(64, 128);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 0);
      Shape10.addBox(0F, 0F, 0F, 1, 7, 4);
      Shape10.setRotationPoint(-10F, -35F, 0F);
      Shape10.setTextureSize(64, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 0, 0);
      Shape11.addBox(0F, 0F, 0F, 1, 5, 4);
      Shape11.setRotationPoint(-11F, -34F, 0F);
      Shape11.setTextureSize(64, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 0);
      Shape12.addBox(0F, 0F, 0F, 2, 3, 2);
      Shape12.setRotationPoint(-13F, -33F, 1F);
      Shape12.setTextureSize(64, 128);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 11, 0);
      Shape13.addBox(0F, 0F, 0F, 6, 3, 6);
      Shape13.setRotationPoint(-1F, -45F, -1F);
      Shape13.setTextureSize(64, 128);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 13, 15);
      Shape14.addBox(0F, 0F, 0F, 2, 4, 2);
      Shape14.setRotationPoint(1F, -49F, 1F);
      Shape14.setTextureSize(64, 128);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
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
