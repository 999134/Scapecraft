package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelRat extends ModelBase
{
  //fields
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Nose;
    ModelRenderer right_side_nose;
    ModelRenderer left_side_nose;
    ModelRenderer rat_body;
    ModelRenderer tail_1;
    ModelRenderer tail_2;
    ModelRenderer tail_3;
    ModelRenderer tail_4;
    ModelRenderer tail_5;
    ModelRenderer right_ear;
    ModelRenderer left_ear;
    ModelRenderer tail_6;
    ModelRenderer tail_7;
    ModelRenderer tail_8;
    ModelRenderer tail_9;

  public ModelRat()
  {
    textureWidth = 64;
    textureHeight = 32;

      WolfHead = new ModelRenderer(this, 0, 0);
      WolfHead.addBox(-3F, -3F, -2F, 6, 6, 4);
      WolfHead.setRotationPoint(-1F, 13.5F, -7F);
      WolfHead.setTextureSize(64, 32);
      WolfHead.mirror = true;
      setRotation(WolfHead, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 18, 14);
      Body.addBox(-4F, -2F, -3F, 6, 9, 6);
      Body.setRotationPoint(0F, 14F, 2F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      Mane = new ModelRenderer(this, 21, 0);
      Mane.addBox(-4F, -3F, -3F, 8, 7, 7);
      Mane.setRotationPoint(-1F, 14F, -3F);
      Mane.setTextureSize(64, 32);
      Mane.mirror = true;
      setRotation(Mane, 1.570796F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 18);
      Leg1.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg1.setRotationPoint(-2.5F, 16F, 7F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 18);
      Leg2.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg2.setRotationPoint(0.5F, 16F, 7F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 18);
      Leg3.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg3.setRotationPoint(-2.5F, 16F, -4F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 0, 18);
      Leg4.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg4.setRotationPoint(0.5F, 16F, -4F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 10);
      Nose.addBox(-2F, 0F, -5F, 3, 2, 3);
      Nose.setRotationPoint(-0.5F, 13.5F, -7F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      right_side_nose = new ModelRenderer(this, 0, 0);
      right_side_nose.addBox(-1F, 2F, -1F, 1, 1, 1);
      right_side_nose.setRotationPoint(0F, 12F, -12F);
      right_side_nose.setTextureSize(64, 32);
      right_side_nose.mirror = true;
      setRotation(right_side_nose, 0F, 0F, 0F);
      left_side_nose = new ModelRenderer(this, 0, 0);
      left_side_nose.addBox(0F, 0F, 0F, 1, 1, 1);
      left_side_nose.setRotationPoint(-2F, 14F, -13F);
      left_side_nose.setTextureSize(64, 32);
      left_side_nose.mirror = true;
      setRotation(left_side_nose, 0F, 0F, 0F);
      rat_body = new ModelRenderer(this, 21, 0);
      rat_body.addBox(0F, -1F, -1F, 10, 9, 9);
      rat_body.setRotationPoint(-6F, 17F, 0F);
      rat_body.setTextureSize(64, 32);
      rat_body.mirror = true;
      setRotation(rat_body, 1.570796F, 0F, 0F);
      tail_1 = new ModelRenderer(this, 0, 0);
      tail_1.addBox(0F, 0F, 0F, 1, 1, 1);
      tail_1.setRotationPoint(-1F, 13F, 9F);
      tail_1.setTextureSize(64, 32);
      tail_1.mirror = true;
      setRotation(tail_1, 0F, 0F, 0F);
      tail_2 = new ModelRenderer(this, 0, 0);
      tail_2.addBox(0F, 0F, 0F, 1, 1, 1);
      tail_2.setRotationPoint(0F, 14F, 10F);
      tail_2.setTextureSize(64, 32);
      tail_2.mirror = true;
      setRotation(tail_2, 0F, 0F, 0F);
      tail_3 = new ModelRenderer(this, 0, 0);
      tail_3.addBox(0F, 0F, 0F, 1, 1, 1);
      tail_3.setRotationPoint(0F, 14F, 11F);
      tail_3.setTextureSize(64, 32);
      tail_3.mirror = true;
      setRotation(tail_3, 0F, 0F, 0F);
      tail_4 = new ModelRenderer(this, 0, 0);
      tail_4.addBox(0F, 0F, 0F, 1, 1, 1);
      tail_4.setRotationPoint(-1F, 14.5F, 12F);
      tail_4.setTextureSize(64, 32);
      tail_4.mirror = true;
      setRotation(tail_4, 0F, 0F, 0F);
      tail_5 = new ModelRenderer(this, 0, 0);
      tail_5.addBox(0F, 0F, 0F, 1, 1, 1);
      tail_5.setRotationPoint(-2F, 15F, 12.5F);
      tail_5.setTextureSize(64, 32);
      tail_5.mirror = true;
      setRotation(tail_5, 0F, 0F, 0F);
      right_ear = new ModelRenderer(this, 0, 0);
      right_ear.addBox(0F, -2F, 0F, 2, 2, 1);
      right_ear.setRotationPoint(1.5F, 12F, -8F);
      right_ear.setTextureSize(64, 32);
      right_ear.mirror = true;
      setRotation(right_ear, 0F, 0F, -0.6981317F);
      left_ear = new ModelRenderer(this, 0, 0);
      left_ear.addBox(0F, 0F, 0F, 2, 2, 1);
      left_ear.setRotationPoint(-5.5F, 10.5F, -8F);
      left_ear.setTextureSize(64, 32);
      left_ear.mirror = true;
      setRotation(left_ear, 0F, 0F, -0.7853982F);
      tail_6 = new ModelRenderer(this, 0, 0);
      tail_6.addBox(0F, 0F, 0F, 1, 1, 3);
      tail_6.setRotationPoint(-3F, 16F, 13F);
      tail_6.setTextureSize(64, 32);
      tail_6.mirror = true;
      setRotation(tail_6, 0F, 0F, 0F);
      tail_7 = new ModelRenderer(this, 0, 0);
      tail_7.addBox(0F, 0F, 0F, 1, 1, 1);
      tail_7.setRotationPoint(-1F, 16.5F, 17F);
      tail_7.setTextureSize(64, 32);
      tail_7.mirror = true;
      setRotation(tail_7, 0F, 0F, 0F);
      tail_8 = new ModelRenderer(this, 0, 0);
      tail_8.addBox(0F, 0F, 0F, 1, 1, 1);
      tail_8.setRotationPoint(-2F, 16.5F, 16F);
      tail_8.setTextureSize(64, 32);
      tail_8.mirror = true;
      setRotation(tail_8, 0F, 0F, 0F);
      tail_9 = new ModelRenderer(this, 0, 0);
      tail_9.addBox(0F, 0F, 0F, 1, 1, 4);
      tail_9.setRotationPoint(0F, 17F, 18F);
      tail_9.setTextureSize(64, 32);
      tail_9.mirror = true;
      setRotation(tail_9, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    WolfHead.render(f5);
    Body.render(f5);
    Mane.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Nose.render(f5);
    right_side_nose.render(f5);
    left_side_nose.render(f5);
    rat_body.render(f5);
    tail_1.render(f5);
    tail_2.render(f5);
    tail_3.render(f5);
    tail_4.render(f5);
    tail_5.render(f5);
    right_ear.render(f5);
    left_ear.render(f5);
    tail_6.render(f5);
    tail_7.render(f5);
    tail_8.render(f5);
    tail_9.render(f5);
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