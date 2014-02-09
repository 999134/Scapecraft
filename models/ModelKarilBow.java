package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKarilBow extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer RLimb1;
    ModelRenderer LLimb1;
    ModelRenderer RLimb2;
    ModelRenderer LLimb2;
    ModelRenderer RLimb3;
    ModelRenderer LLimb3;
    ModelRenderer BackTail1;
    ModelRenderer BackTail2;
    ModelRenderer BackTailCover1;
    ModelRenderer BackTailCover2;
    ModelRenderer Handle;
    ModelRenderer RBolt;
    ModelRenderer LBolt;
    ModelRenderer Stabilizer;
    ModelRenderer RBar;
    ModelRenderer LBar;
    ModelRenderer RSight;
    ModelRenderer LSight;
    ModelRenderer MiddleSight;
    ModelRenderer BackSight;
    ModelRenderer RBolt1;
    ModelRenderer LBolt1;
    ModelRenderer RBolt2;
    ModelRenderer LBolt2;
  
  public ModelKarilBow()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 1, 43);
      Base.addBox(0F, 0F, 0F, 5, 3, 17);
      Base.setRotationPoint(0F, 0F, 1F);
      Base.setTextureSize(128, 64);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      RLimb1 = new ModelRenderer(this, 1, 30);
      RLimb1.addBox(-1F, 0F, -9F, 2, 2, 9);
      RLimb1.setRotationPoint(1F, 0.5F, 8F);
      RLimb1.setTextureSize(128, 64);
      RLimb1.mirror = true;
      setRotation(RLimb1, 0F, 0.5235988F, 0F);
      LLimb1 = new ModelRenderer(this, 25, 30);
      LLimb1.addBox(-1F, 0F, -9F, 2, 2, 9);
      LLimb1.setRotationPoint(4F, 0.5F, 8F);
      LLimb1.setTextureSize(128, 64);
      LLimb1.mirror = true;
      setRotation(LLimb1, 0F, -0.5235988F, 0F);
      RLimb2 = new ModelRenderer(this, 1, 24);
      RLimb2.addBox(-4F, 0F, -0.9F, 4, 2, 2);
      RLimb2.setRotationPoint(-3F, 0.5F, 1F);
      RLimb2.setTextureSize(128, 64);
      RLimb2.mirror = true;
      setRotation(RLimb2, 0F, 0.4886922F, 0F);
      LLimb2 = new ModelRenderer(this, 25, 24);
      LLimb2.addBox(0F, 0F, -0.9F, 4, 2, 2);
      LLimb2.setRotationPoint(8F, 0.5F, 1F);
      LLimb2.setTextureSize(128, 64);
      LLimb2.mirror = true;
      setRotation(LLimb2, 0F, -0.4886922F, 0F);
      RLimb3 = new ModelRenderer(this, 1, 18);
      RLimb3.addBox(-5.1F, 0F, -1F, 5, 2, 2);
      RLimb3.setRotationPoint(-6F, 0.5F, 2.4F);
      RLimb3.setTextureSize(128, 64);
      RLimb3.mirror = true;
      setRotation(RLimb3, 0F, 1.151917F, 0F);
      LLimb3 = new ModelRenderer(this, 25, 18);
      LLimb3.addBox(0.1F, 0F, -1F, 5, 2, 2);
      LLimb3.setRotationPoint(11F, 0.5F, 2.4F);
      LLimb3.setTextureSize(128, 64);
      LLimb3.mirror = true;
      setRotation(LLimb3, 0F, -1.151917F, 0F);
      BackTail1 = new ModelRenderer(this, 60, 58);
      BackTail1.addBox(0F, 0F, 0F, 3, 2, 3);
      BackTail1.setRotationPoint(1F, 0.5F, 18F);
      BackTail1.setTextureSize(128, 64);
      BackTail1.mirror = true;
      setRotation(BackTail1, 0F, 0F, 0F);
      BackTail2 = new ModelRenderer(this, 59, 48);
      BackTail2.addBox(0F, 0F, 0F, 3, 4, 4);
      BackTail2.setRotationPoint(1F, -0.5F, 21F);
      BackTail2.setTextureSize(128, 64);
      BackTail2.mirror = true;
      setRotation(BackTail2, 0F, 0F, 0F);
      BackTailCover1 = new ModelRenderer(this, 61, 42);
      BackTailCover1.addBox(-2F, 0F, -0.5F, 4, 3, 1);
      BackTailCover1.setRotationPoint(2.5F, -1.5F, 24.6F);
      BackTailCover1.setTextureSize(128, 64);
      BackTailCover1.mirror = true;
      setRotation(BackTailCover1, 0.0174533F, 0F, 0F);
      BackTailCover2 = new ModelRenderer(this, 60, 36);
      BackTailCover2.addBox(-2F, -0.5F, 0F, 4, 1, 3);
      BackTailCover2.setRotationPoint(2.5F, 1.2F, 24.6F);
      BackTailCover2.setTextureSize(128, 64);
      BackTailCover2.mirror = true;
      setRotation(BackTailCover2, -1.301251F, 0F, 0F);
      Handle = new ModelRenderer(this, 10, 6);
      Handle.addBox(0F, 0F, 0F, 3, 3, 7);
      Handle.setRotationPoint(1F, 0.1F, 11F);
      Handle.setTextureSize(128, 64);
      Handle.mirror = true;
      setRotation(Handle, -0.2230717F, 0F, 0F);
      RBolt = new ModelRenderer(this, 80, 59);
      RBolt.addBox(-1F, -1F, -1F, 2, 2, 2);
      RBolt.setRotationPoint(0.5F, 1.5F, 12.5F);
      RBolt.setTextureSize(128, 64);
      RBolt.mirror = true;
      setRotation(RBolt, 0F, 0F, 0F);
      LBolt = new ModelRenderer(this, 91, 59);
      LBolt.addBox(-1F, -1F, -1F, 2, 2, 2);
      LBolt.setRotationPoint(4.5F, 1.5F, 12.5F);
      LBolt.setTextureSize(128, 64);
      LBolt.mirror = true;
      setRotation(LBolt, 0F, 0F, 0F);
      Stabilizer = new ModelRenderer(this, 81, 53);
      Stabilizer.addBox(0F, 0F, 0F, 6, 2, 2);
      Stabilizer.setRotationPoint(-0.5F, -4F, 17F);
      Stabilizer.setTextureSize(128, 64);
      Stabilizer.mirror = true;
      setRotation(Stabilizer, 0F, 0F, 0F);
      RBar = new ModelRenderer(this, 82, 43);
      RBar.addBox(0F, -0.5F, 0F, 0, 1, 7);
      RBar.setRotationPoint(-0.6F, 1.5F, 12.5F);
      RBar.setTextureSize(128, 64);
      RBar.mirror = true;
      setRotation(RBar, 0.6806784F, 0F, 0F);
      LBar = new ModelRenderer(this, 82, 33);
      LBar.addBox(0F, -0.5F, 0F, 0, 1, 7);
      LBar.setRotationPoint(5.6F, 1.5F, 12.5F);
      LBar.setTextureSize(128, 64);
      LBar.mirror = true;
      setRotation(LBar, 0.6806784F, 0F, 0F);
      RSight = new ModelRenderer(this, 50, 21);
      RSight.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
      RSight.setRotationPoint(1F, 1F, 2F);
      RSight.setTextureSize(128, 64);
      RSight.mirror = true;
      setRotation(RSight, 0.2617994F, 0F, -0.2617994F);
      LSight = new ModelRenderer(this, 57, 21);
      LSight.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
      LSight.setRotationPoint(4F, 1F, 2F);
      LSight.setTextureSize(128, 64);
      LSight.mirror = true;
      setRotation(LSight, 0.2617994F, 0F, 0.2617994F);
      MiddleSight = new ModelRenderer(this, 52, 17);
      MiddleSight.addBox(-1.5F, 0F, 0F, 3, 1, 0);
      MiddleSight.setRotationPoint(2.5F, -1F, 4F);
      MiddleSight.setTextureSize(128, 64);
      MiddleSight.mirror = true;
      setRotation(MiddleSight, 0F, 0F, 0F);
      BackSight = new ModelRenderer(this, 53, 14);
      BackSight.addBox(-1F, 0F, 0F, 2, 1, 0);
      BackSight.setRotationPoint(2.5F, -1F, 8F);
      BackSight.setTextureSize(128, 64);
      BackSight.mirror = true;
      setRotation(BackSight, 0F, 0F, 0F);
      RBolt1 = new ModelRenderer(this, 65, 31);
      RBolt1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
      RBolt1.setRotationPoint(-0.2F, 1.5F, 12.5F);
      RBolt1.setTextureSize(128, 64);
      RBolt1.mirror = true;
      setRotation(RBolt1, 0F, 0F, 0F);
      LBolt1 = new ModelRenderer(this, 65, 31);
      LBolt1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
      LBolt1.setRotationPoint(5.2F, 1.5F, 12.5F);
      LBolt1.setTextureSize(128, 64);
      LBolt1.mirror = true;
      setRotation(LBolt1, 0F, 0F, 0F);
      RBolt2 = new ModelRenderer(this, 65, 31);
      RBolt2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
      RBolt2.setRotationPoint(-0.2F, -3F, 18F);
      RBolt2.setTextureSize(128, 64);
      RBolt2.mirror = true;
      setRotation(RBolt2, 0F, 0F, 0F);
      LBolt2 = new ModelRenderer(this, 65, 31);
      LBolt2.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
      LBolt2.setRotationPoint(5.2F, -3F, 18F);
      LBolt2.setTextureSize(128, 64);
      LBolt2.mirror = true;
      setRotation(LBolt2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    RLimb1.render(f5);
    LLimb1.render(f5);
    RLimb2.render(f5);
    LLimb2.render(f5);
    RLimb3.render(f5);
    LLimb3.render(f5);
    BackTail1.render(f5);
    BackTail2.render(f5);
    BackTailCover1.render(f5);
    BackTailCover2.render(f5);
    Handle.render(f5);
    RBolt.render(f5);
    LBolt.render(f5);
    Stabilizer.render(f5);
    RBar.render(f5);
    LBar.render(f5);
    RSight.render(f5);
    LSight.render(f5);
    MiddleSight.render(f5);
    BackSight.render(f5);
    RBolt1.render(f5);
    LBolt1.render(f5);
    RBolt2.render(f5);
    LBolt2.render(f5);
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
