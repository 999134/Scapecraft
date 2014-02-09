package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBandosArm extends ModelBiped
{
  //fields
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
  
    public ModelBandosArm(float f)
    {
  	  super(f, 0, 128,64);
      textureWidth = 128;
      textureHeight = 64;
    
      Shape6 = new ModelRenderer(this, 44, 42);
      Shape6.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape6.setRotationPoint(-7F, -8F, -1F);
      Shape6.setTextureSize(128, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 35, 54);
      Shape7.addBox(0F, 0F, 0F, 2, 4, 2);
      Shape7.setRotationPoint(-8F, -12F, -1F);
      Shape7.setTextureSize(128, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 35, 48);
      Shape8.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape8.setRotationPoint(-9F, -14F, -1F);
      Shape8.setTextureSize(128, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 0);
      Shape9.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape9.setRotationPoint(0F, 0F, 0F);
      Shape9.setTextureSize(128, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 44, 36);
      Shape10.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape10.setRotationPoint(4F, -8F, -1F);
      Shape10.setTextureSize(128, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 35, 34);
      Shape11.addBox(0F, 0F, 0F, 2, 4, 2);
      Shape11.setRotationPoint(6F, -12F, -1F);
      Shape11.setTextureSize(128, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 35, 42);
      Shape12.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape12.setRotationPoint(7F, -14F, -1F);
      Shape12.setTextureSize(128, 64);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 14, 42);
      Shape1.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape1.setRotationPoint(8F, 1F, 0F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 43);
      Shape2.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape2.setRotationPoint(8F, 1F, -2F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 39);
      Shape3.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape3.setRotationPoint(8F, 0F, 0F);
      Shape3.setTextureSize(128, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, -0.3346075F);
      Shape4 = new ModelRenderer(this, 0, 33);
      Shape4.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape4.setRotationPoint(8F, 0F, -2F);
      Shape4.setTextureSize(128, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, -0.3346075F);
      Shape5 = new ModelRenderer(this, 0, 35);
      Shape5.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape5.setRotationPoint(7F, 0F, -1F);
      Shape5.setTextureSize(128, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, -0.7063936F);
      Shape13 = new ModelRenderer(this, 17, 33);
      Shape13.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape13.setRotationPoint(8F, 3F, 0F);
      Shape13.setTextureSize(128, 64);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0.3717861F);
      Shape14 = new ModelRenderer(this, 15, 37);
      Shape14.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape14.setRotationPoint(8F, 3F, -2F);
      Shape14.setTextureSize(128, 64);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0.3717861F);
      
      
      this.bipedHead.addChild(Shape6);
      this.bipedHead.addChild(Shape7);
      this.bipedHead.addChild(Shape8);
      this.bipedHead.addChild(Shape10);
      this.bipedHead.addChild(Shape11);
      this.bipedHead.addChild(Shape12);
       
      this.bipedBody.addChild(Shape1);
      this.bipedBody.addChild(Shape2);
      this.bipedBody.addChild(Shape3);
      this.bipedBody.addChild(Shape4);
      this.bipedBody.addChild(Shape5);
      this.bipedBody.addChild(Shape13);
      this.bipedBody.addChild(Shape14);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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
