package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWarhammer extends ModelBase
{
  //fields
ModelRenderer HammerTop;
ModelRenderer Back;
ModelRenderer Front;
ModelRenderer Base;
ModelRenderer Grip;
ModelRenderer End1;
ModelRenderer End2;

  public ModelWarhammer()
  {
textureWidth = 64;
textureHeight = 64;

  HammerTop = new ModelRenderer(this, 0, 0);
  HammerTop.addBox(-5F, -4F, -3F, 10, 4, 5);
  HammerTop.setRotationPoint(5F, 4F, 3F);
  HammerTop.setTextureSize(64, 64);
  HammerTop.mirror = true;
  setRotation(HammerTop, 0F, 0F, 0F);
  Back = new ModelRenderer(this, 32, 0);
  Back.addBox(-2F, -3F, -3.5F, 2, 6, 7);
  Back.setRotationPoint(0F, 2F, 2.5F);
  Back.setTextureSize(64, 64);
  Back.mirror = true;
  setRotation(Back, 0F, 0F, 0F);
  Front = new ModelRenderer(this, 0, 10);
  Front.addBox(0F, -3F, -3.5F, 2, 7, 8);
  Front.setRotationPoint(10F, 1.5F, 2F);
  Front.setTextureSize(64, 64);
  Front.mirror = true;
  setRotation(Front, 0F, 0F, 0F);
  Base = new ModelRenderer(this, 22, 11);
  Base.addBox(0F, 0F, 0F, 2, 18, 2);
  Base.setRotationPoint(4F, 4F, 1.5F);
  Base.setTextureSize(64, 64);
  Base.mirror = true;
  setRotation(Base, 0F, 0F, 0F);
  Grip = new ModelRenderer(this, 0, 26);
  Grip.addBox(0F, 0F, 0F, 3, 5, 3);
  Grip.setRotationPoint(3.5F, 14F, 1F);
  Grip.setTextureSize(64, 64);
  Grip.mirror = true;
  setRotation(Grip, 0F, 0F, 0F);
  End1 = new ModelRenderer(this, 0, 35);
  End1.addBox(0F, 0F, 0F, 3, 1, 3);
  End1.setRotationPoint(3.5F, 22F, 1F);
  End1.setTextureSize(64, 64);
  End1.mirror = true;
  setRotation(End1, 0F, 0F, 0F);
  End2 = new ModelRenderer(this, 0, 40);
  End2.addBox(0F, 0F, 0F, 4, 1, 4);
  End2.setRotationPoint(3F, 23F, 0.5F);
  End2.setTextureSize(64, 64);
  End2.mirror = true;
  setRotation(End2, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
HammerTop.render(f5);
Back.render(f5);
Front.render(f5);
Base.render(f5);
Grip.render(f5);
End1.render(f5);
End2.render(f5);
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