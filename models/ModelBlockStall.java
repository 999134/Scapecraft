package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelBlockStall extends ModelBase
{
  //fields
    ModelRenderer LeftFrontBottomLeg;
    ModelRenderer RightBottomLegFront;
    ModelRenderer LeftBottomLegBack;
    ModelRenderer RightBottomLegBack;
    ModelRenderer Table;
    ModelRenderer LeftStallSupportFront;
    ModelRenderer RightStallSupportFront;
    ModelRenderer LeftStallSupportBack;
    ModelRenderer RightStallSupportBack;
    ModelRenderer UpperCloth;
    ModelRenderer LowerCloth;
    ModelRenderer Shape1;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape2;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape5;
  
  public ModelBlockStall()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      LeftFrontBottomLeg = new ModelRenderer(this, 1, 47);
      LeftFrontBottomLeg.addBox(0F, 0F, 0F, 2, 14, 2);
      LeftFrontBottomLeg.setRotationPoint(-24F, 10F, -8F);
      LeftFrontBottomLeg.setTextureSize(128, 64);
      LeftFrontBottomLeg.mirror = true;
      setRotation(LeftFrontBottomLeg, 0F, 0F, 0F);
      RightBottomLegFront = new ModelRenderer(this, 80, 47);
      RightBottomLegFront.addBox(0F, 0F, 0F, 2, 14, 2);
      RightBottomLegFront.setRotationPoint(6F, 10F, -8F);
      RightBottomLegFront.setTextureSize(128, 64);
      RightBottomLegFront.mirror = true;
      setRotation(RightBottomLegFront, 0F, 0F, 0F);
      LeftBottomLegBack = new ModelRenderer(this, 10, 47);
      LeftBottomLegBack.addBox(0F, 0F, 0F, 2, 14, 2);
      LeftBottomLegBack.setRotationPoint(-24F, 10F, 6F);
      LeftBottomLegBack.setTextureSize(128, 64);
      LeftBottomLegBack.mirror = true;
      setRotation(LeftBottomLegBack, 0F, 0F, 0F);
      RightBottomLegBack = new ModelRenderer(this, 89, 47);
      RightBottomLegBack.addBox(0F, 0F, 0F, 2, 14, 2);
      RightBottomLegBack.setRotationPoint(6F, 10F, 6F);
      RightBottomLegBack.setTextureSize(128, 64);
      RightBottomLegBack.mirror = true;
      setRotation(RightBottomLegBack, 0F, 0F, 0F);
      Table = new ModelRenderer(this, 1, 28);
      Table.addBox(0F, 0F, 0F, 32, 2, 16);
      Table.setRotationPoint(-24F, 8F, -8F);
      Table.setTextureSize(128, 64);
      Table.mirror = true;
      setRotation(Table, 0F, 0F, 0F);
      LeftStallSupportFront = new ModelRenderer(this, 2, 12);
      LeftStallSupportFront.addBox(0F, 0F, 0F, 1, 14, 1);
      LeftStallSupportFront.setRotationPoint(-23F, -6F, -7F);
      LeftStallSupportFront.setTextureSize(128, 64);
      LeftStallSupportFront.mirror = true;
      setRotation(LeftStallSupportFront, 0F, 0F, 0F);
      RightStallSupportFront = new ModelRenderer(this, 89, 12);
      RightStallSupportFront.addBox(0F, 0F, 0F, 1, 14, 1);
      RightStallSupportFront.setRotationPoint(6F, -6F, -7F);
      RightStallSupportFront.setTextureSize(128, 64);
      RightStallSupportFront.mirror = true;
      setRotation(RightStallSupportFront, 0F, 0F, 0F);
      LeftStallSupportBack = new ModelRenderer(this, 7, 16);
      LeftStallSupportBack.addBox(0F, 0F, 0F, 1, 10, 1);
      LeftStallSupportBack.setRotationPoint(-23F, -2F, 6F);
      LeftStallSupportBack.setTextureSize(128, 64);
      LeftStallSupportBack.mirror = true;
      setRotation(LeftStallSupportBack, 0F, 0F, 0F);
      RightStallSupportBack = new ModelRenderer(this, 94, 16);
      RightStallSupportBack.addBox(0F, 0F, 0F, 1, 10, 1);
      RightStallSupportBack.setRotationPoint(6F, -2F, 6F);
      RightStallSupportBack.setTextureSize(128, 64);
      RightStallSupportBack.mirror = true;
      setRotation(RightStallSupportBack, 0F, 0F, 0F);
      UpperCloth = new ModelRenderer(this, 12, 7);
      UpperCloth.addBox(0F, 0F, 0F, 30, 1, 8);
      UpperCloth.setRotationPoint(-23F, -7F, -7F);
      UpperCloth.setTextureSize(128, 64);
      UpperCloth.mirror = true;
      setRotation(UpperCloth, -0.2230717F, 0F, 0F);
      LowerCloth = new ModelRenderer(this, 12, 18);
      LowerCloth.addBox(0F, 0F, 0F, 30, 1, 8);
      LowerCloth.setRotationPoint(-23F, -5F, 0F);
      LowerCloth.setTextureSize(128, 64);
      LowerCloth.mirror = true;
      setRotation(LowerCloth, -0.3346075F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 22, 0);
      Shape1.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape1.setRotationPoint(2F, 6F, 1F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 32, 0);
      Shape6.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape6.setRotationPoint(0F, 6F, 1F);
      Shape6.setTextureSize(128, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 11, 0);
      Shape7.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape7.setRotationPoint(-2F, 6F, 1F);
      Shape7.setTextureSize(128, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 92, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape2.setRotationPoint(0F, 4F, -1F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 73, 0);
      Shape8.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape8.setRotationPoint(2F, 6F, -1F);
      Shape8.setTextureSize(128, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 83, 0);
      Shape9.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape9.setRotationPoint(-2F, 6F, -1F);
      Shape9.setTextureSize(128, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 53, 0);
      Shape10.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape10.setRotationPoint(0F, 6F, -3F);
      Shape10.setTextureSize(128, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 63, 0);
      Shape11.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape11.setRotationPoint(-2F, 6F, -3F);
      Shape11.setTextureSize(128, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 43, 0);
      Shape12.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape12.setRotationPoint(2F, 6F, -3F);
      Shape12.setTextureSize(128, 64);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 101, 0);
      Shape5.addBox(0F, 0F, 0F, 6, 6, 6);
      Shape5.setRotationPoint(-16F, 2F, -3F);
      Shape5.setTextureSize(128, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
  }
  
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    LeftFrontBottomLeg.render(f5);
    RightBottomLegFront.render(f5);
    LeftBottomLegBack.render(f5);
    RightBottomLegBack.render(f5);
    Table.render(f5);
    LeftStallSupportFront.render(f5);
    RightStallSupportFront.render(f5);
    LeftStallSupportBack.render(f5);
    RightStallSupportBack.render(f5);
    UpperCloth.render(f5);
    LowerCloth.render(f5);
    Shape1.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape2.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape5.render(f5);
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
