package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDD extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Hilt;
    ModelRenderer Spike_1;
    ModelRenderer Spike_2;
    ModelRenderer Spike_3;
    ModelRenderer Hilt_2;

  public ModelDD()
  {
    textureWidth = 64;
    textureHeight = 64;

      Base = new ModelRenderer(this, 20, 0);
      Base.addBox(0F, 0F, 0F, 1, 12, 2);
      Base.setRotationPoint(0F, -2.1F, 0F);
      Base.setTextureSize(64, 64);
      Base.mirror = true;
      setRotation(Base, 0.4712389F, 0F, 0F);
      Hilt = new ModelRenderer(this, 0, 18);
      Hilt.addBox(0F, 0F, -3.5F, 1, 2, 7);
      Hilt.setRotationPoint(0F, 0F, 2F);
      Hilt.setTextureSize(64, 64);
      Hilt.mirror = true;
      setRotation(Hilt, 0.4363323F, 0F, 0F);
      Spike_1 = new ModelRenderer(this, 10, 0);
      Spike_1.addBox(0F, 0F, -1F, 1, 4, 3);
      Spike_1.setRotationPoint(0F, 4F, 3F);
      Spike_1.setTextureSize(64, 64);
      Spike_1.mirror = true;
      setRotation(Spike_1, 0.4537856F, 0F, 0F);
      Spike_2 = new ModelRenderer(this, 14, 9);
      Spike_2.addBox(0F, 0F, 0F, 1, 2, 1);
      Spike_2.setRotationPoint(0F, 6F, 2F);
      Spike_2.setTextureSize(64, 64);
      Spike_2.mirror = true;
      setRotation(Spike_2, 0.4363323F, 0F, 0F);
      Spike_3 = new ModelRenderer(this, 0, 9);
      Spike_3.addBox(0F, 0F, -1F, 1, 3, 2);
      Spike_3.setRotationPoint(0F, 6F, 6F);
      Spike_3.setTextureSize(64, 64);
      Spike_3.mirror = true;
      setRotation(Spike_3, 0.4363323F, 0F, 0F);
      Hilt_2 = new ModelRenderer(this, 0, 0);
      Hilt_2.addBox(0F, -1F, -2F, 1, 1, 4);
      Hilt_2.setRotationPoint(0F, -1.8F, 1.4F);
      Hilt_2.setTextureSize(64, 64);
      Hilt_2.mirror = true;
      setRotation(Hilt_2, 0.4363323F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Hilt.render(f5);
    Spike_1.render(f5);
    Spike_2.render(f5);
    Spike_3.render(f5);
    Hilt_2.render(f5);
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