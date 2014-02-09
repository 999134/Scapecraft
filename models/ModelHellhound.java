package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.src.EntityHellhound;
import net.minecraft.util.MathHelper;

public class ModelHellhound extends ModelBase
{
  //fields
    ModelRenderer Leg1Horn;
    ModelRenderer Leg2Horn;
    ModelRenderer Leg3Horn;
    ModelRenderer Leg4Horn;
    ModelRenderer Horn1;
    ModelRenderer Horn2;
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;

  public ModelHellhound()
  {
    textureWidth = 64;
    textureHeight = 32;

      Leg1Horn = new ModelRenderer(this, 9, 24);
      Leg1Horn.addBox(0F, 0F, 0F, 1, 3, 1);
      Leg1Horn.setRotationPoint(-3F, 17.5F, 9.1F);
      Leg1Horn.setTextureSize(64, 32);
      Leg1Horn.mirror = true;
      setRotation(Leg1Horn, -0.730663F, 0F, 0F);
      Leg2Horn = new ModelRenderer(this, 9, 24);
      Leg2Horn.addBox(0F, 0F, 0F, 1, 3, 1);
      Leg2Horn.setRotationPoint(0F, 17.5F, 9.1F);
      Leg2Horn.setTextureSize(64, 32);
      Leg2Horn.mirror = true;
      setRotation(Leg2Horn, -0.715585F, 0F, 0F);
      Leg3Horn = new ModelRenderer(this, 13, 24);
      Leg3Horn.addBox(0F, 0F, 0F, 1, 2, 1);
      Leg3Horn.setRotationPoint(-3.8F, 18F, -4.5F);
      Leg3Horn.setTextureSize(64, 32);
      Leg3Horn.mirror = true;
      setRotation(Leg3Horn, -0.6320364F, -1.570796F, 0F);
      Leg4Horn = new ModelRenderer(this, 13, 24);
      Leg4Horn.addBox(0F, 0F, 0F, 1, 2, 1);
      Leg4Horn.setRotationPoint(1.9F, 18F, -3.5F);
      Leg4Horn.setTextureSize(64, 32);
      Leg4Horn.mirror = true;
      setRotation(Leg4Horn, -0.6320361F, 1.570796F, 0F);
      Horn1 = new ModelRenderer(this, 9, 29);
      Horn1.addBox(0F, 0F, 0F, 1, 2, 1);
      Horn1.setRotationPoint(-3.5F, 9F, -8.7F);
      Horn1.setTextureSize(64, 32);
      Horn1.mirror = true;
      setRotation(Horn1, 0.2617994F, 0F, 0F);
      Horn2 = new ModelRenderer(this, 9, 29);
      Horn2.addBox(0F, 0F, 0F, 1, 2, 1);
      Horn2.setRotationPoint(0.5F, 9F, -8.7F);
      Horn2.setTextureSize(64, 32);
      Horn2.mirror = true;
      setRotation(Horn2, 0.2617994F, 0F, 0F);
      WolfHead = new ModelRenderer(this, 0, 0);
      WolfHead.addBox(-3F, -3F, -2F, 6, 6, 6);
      WolfHead.setRotationPoint(-1F, 13.5F, -9F);
      WolfHead.setTextureSize(64, 32);
      WolfHead.mirror = true;
      setRotation(WolfHead, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 18, 14);
      Body.addBox(-4F, -2F, -3F, 6, 9, 6);
      Body.setRotationPoint(0F, 14F, 2F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      Mane = new ModelRenderer(this, 26, 0);
      Mane.addBox(-4F, -3F, -3F, 8, 6, 7);
      Mane.setRotationPoint(-1F, 14F, -3F);
      Mane.setTextureSize(64, 32);
      Mane.mirror = true;
      setRotation(Mane, 1.570796F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 22);
      Leg1.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg1.setRotationPoint(-2.5F, 16F, 7F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 22);
      Leg2.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg2.setRotationPoint(0.5F, 16F, 7F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 22);
      Leg3.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg3.setRotationPoint(-2.5F, 16F, -4F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 0, 22);
      Leg4.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg4.setRotationPoint(0.5F, 16F, -4F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 43, 14);
      Tail.addBox(-1F, 0F, -1F, 2, 3, 2);
      Tail.setRotationPoint(-1F, 12F, 8F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 2.468499F, 0F, 0F);
      Ear1 = new ModelRenderer(this, 43, 20);
      Ear1.addBox(-3F, -5F, 0F, 2, 2, 1);
      Ear1.setRotationPoint(-1F, 13.5F, -7F);
      Ear1.setTextureSize(64, 32);
      Ear1.mirror = true;
      setRotation(Ear1, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 43, 20);
      Ear2.addBox(1F, -5F, 0F, 2, 2, 1);
      Ear2.setRotationPoint(-1F, 13.5F, -7F);
      Ear2.setTextureSize(64, 32);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 13);
      Nose.addBox(-2F, 0F, -4.5F, 3, 3, 4);
      Nose.setRotationPoint(-0.5F, 13.5F, -9F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Leg1Horn.render(f5);
    Leg2Horn.render(f5);
    Leg3Horn.render(f5);
    Leg4Horn.render(f5);
    Horn1.render(f5);
    Horn2.render(f5);
    WolfHead.render(f5);
    Body.render(f5);
    Mane.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Tail.render(f5);
    Ear1.render(f5);
    Ear2.render(f5);
    Nose.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void setLivingAnimations(EntityLiving par1EntityLiving, float par2, float par3, float par4)
  {
      EntityHellhound entitywolf = (EntityHellhound)par1EntityLiving;

      if (entitywolf.isAngry())
      {
          this.Tail.rotateAngleY = 0.0F;
      }
      else
      {
          this.Tail.rotateAngleY = MathHelper.cos(par2 * 0.6662F) * 1.4F * par3;
      }

      if (entitywolf.isSitting())
      {
          this.Mane.setRotationPoint(-1.0F, 16.0F, -3.0F);
          this.Mane.rotateAngleX = ((float)Math.PI * 2F / 5F);
          this.Mane.rotateAngleY = 0.0F;
          this.Body.setRotationPoint(0.0F, 18.0F, 0.0F);
          this.Body.rotateAngleX = ((float)Math.PI / 4F);
          this.Tail.setRotationPoint(-1.0F, 21.0F, 6.0F);
  
      }
      else
      {
          this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
          this.Body.rotateAngleX = ((float)Math.PI / 2F);
          this.Mane.setRotationPoint(-1.0F, 14.0F, -3.0F);
          this.Mane.rotateAngleX = this.Body.rotateAngleX;
          this.Tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
          this.Leg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
          this.Leg2.setRotationPoint(0.5F, 16.0F, 7.0F);
          this.Leg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
          this.Leg4.setRotationPoint(0.5F, 16.0F, -4.0F);
          this.Leg1.rotateAngleX = MathHelper.cos(par2 * 0.6662F) * 1.4F * par3;
          this.Leg2.rotateAngleX = MathHelper.cos(par2 * 0.6662F + (float)Math.PI) * 1.4F * par3;
          this.Leg3.rotateAngleX = MathHelper.cos(par2 * 0.6662F + (float)Math.PI) * 1.4F * par3;
          this.Leg4.rotateAngleX = MathHelper.cos(par2 * 0.6662F) * 1.4F * par3;
      }

      this.WolfHead.rotateAngleZ = entitywolf.getInterestedAngle(par4) + entitywolf.getShakeAngle(par4, 0.0F);
      this.Mane.rotateAngleZ = entitywolf.getShakeAngle(par4, -0.08F);
      this.Body.rotateAngleZ = entitywolf.getShakeAngle(par4, -0.16F);
      this.Tail.rotateAngleZ = entitywolf.getShakeAngle(par4, -0.2F);
  }

  
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
  
      this.WolfHead.rotateAngleX = f4 / (180F / (float)Math.PI);
      this.WolfHead.rotateAngleY = f3 / (180F / (float)Math.PI);
      this.Body.rotateAngleX = ((float)Math.PI / 2F);
      this.Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
      this.Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	}

}