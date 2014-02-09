

package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGuthixstaff extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
  
  public ModelGuthixstaff()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 5, 40, 5);
      Shape1.setRotationPoint(0F, -24F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 49);
      Shape6.addBox(0F, 0F, 0F, 5, 5, 5);
      Shape6.setRotationPoint(0F, -29F, 0F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 21, 15);
      Shape7.addBox(0F, 0F, 0F, 3, 1, 3);
      Shape7.setRotationPoint(1F, -30F, 1F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 24, 25);
      Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape8.setRotationPoint(2F, -31F, 2F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
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
