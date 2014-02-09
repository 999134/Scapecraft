package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDharokAxe extends ModelBase
{
  //fields
    ModelRenderer Handle;
    ModelRenderer Bottom;
    ModelRenderer AxeHeadBase;
    ModelRenderer TopRung;
    ModelRenderer BottomRung;
    ModelRenderer AxeHeadTop1;
    ModelRenderer AxeHeadTop2;
    ModelRenderer BackAxe1;
    ModelRenderer BackAxe2;
    ModelRenderer FrontAxe1;
    ModelRenderer FrontAxe2;
    ModelRenderer FrontAxe3;
    ModelRenderer FrontAxe4;
    ModelRenderer FrontAxe5;
    ModelRenderer FrontAxe6;
    ModelRenderer FrontAxe7;
    ModelRenderer FrontAxe8;
    ModelRenderer FrontAxe9;
    ModelRenderer FrontAxe10;
    ModelRenderer FrontAxe11;
    ModelRenderer FrontAxe12;
    ModelRenderer FrontAxe13;
  
  public ModelDharokAxe()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Handle = new ModelRenderer(this, 1, 36);
      Handle.addBox(0F, 0F, 0F, 2, 25, 2);
      Handle.setRotationPoint(-1F, -4F, -1F);
      Handle.setTextureSize(64, 64);
      Handle.mirror = true;
      setRotation(Handle, 0F, 0F, 0F);
      Bottom = new ModelRenderer(this, 10, 58);
      Bottom.addBox(0F, 0F, 0F, 3, 2, 3);
      Bottom.setRotationPoint(-1.5F, 21F, -1.5F);
      Bottom.setTextureSize(64, 64);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      AxeHeadBase = new ModelRenderer(this, 10, 48);
      AxeHeadBase.addBox(0F, 0F, 0F, 3, 6, 3);
      AxeHeadBase.setRotationPoint(-1.5F, -9F, -1.5F);
      AxeHeadBase.setTextureSize(64, 64);
      AxeHeadBase.mirror = true;
      setRotation(AxeHeadBase, 0F, 0F, 0F);
      TopRung = new ModelRenderer(this, 10, 42);
      TopRung.addBox(0F, 0F, 0F, 4, 1, 4);
      TopRung.setRotationPoint(-2F, -1F, -2F);
      TopRung.setTextureSize(64, 64);
      TopRung.mirror = true;
      setRotation(TopRung, 0F, 0F, 0F);
      BottomRung = new ModelRenderer(this, 10, 37);
      BottomRung.addBox(0F, 0F, 0F, 3, 1, 3);
      BottomRung.setRotationPoint(-1.5F, 1F, -1.5F);
      BottomRung.setTextureSize(64, 64);
      BottomRung.mirror = true;
      setRotation(BottomRung, 0F, 0F, 0F);
      AxeHeadTop1 = new ModelRenderer(this, 1, 32);
      AxeHeadTop1.addBox(0F, 0F, 0F, 2, 1, 2);
      AxeHeadTop1.setRotationPoint(-1F, -10F, -1F);
      AxeHeadTop1.setTextureSize(64, 64);
      AxeHeadTop1.mirror = true;
      setRotation(AxeHeadTop1, 0F, 0F, 0F);
      AxeHeadTop2 = new ModelRenderer(this, 3, 28);
      AxeHeadTop2.addBox(0F, 0F, 0F, 1, 2, 1);
      AxeHeadTop2.setRotationPoint(-0.5F, -12F, -0.5F);
      AxeHeadTop2.setTextureSize(64, 64);
      AxeHeadTop2.mirror = true;
      setRotation(AxeHeadTop2, 0F, 0F, 0F);
      BackAxe1 = new ModelRenderer(this, 1, 23);
      BackAxe1.addBox(-1F, -0.5F, 0F, 2, 2, 2);
      BackAxe1.setRotationPoint(0F, -7F, 1F);
      BackAxe1.setTextureSize(64, 64);
      BackAxe1.mirror = true;
      setRotation(BackAxe1, 0F, 0F, 0F);
      BackAxe2 = new ModelRenderer(this, 1, 14);
      BackAxe2.addBox(-1F, 0F, 0F, 2, 4, 4);
      BackAxe2.setRotationPoint(0F, -6.5F, 1F);
      BackAxe2.setTextureSize(64, 64);
      BackAxe2.mirror = true;
      setRotation(BackAxe2, 0.7853982F, 0F, 0F);
      FrontAxe1 = new ModelRenderer(this, 30, 58);
      FrontAxe1.addBox(-1F, -0.5F, -2F, 2, 2, 3);
      FrontAxe1.setRotationPoint(0F, -7F, -2F);
      FrontAxe1.setTextureSize(64, 64);
      FrontAxe1.mirror = true;
      setRotation(FrontAxe1, 0F, 0F, 0F);
      FrontAxe2 = new ModelRenderer(this, 30, 51);
      FrontAxe2.addBox(-1F, -4F, 0F, 2, 5, 1);
      FrontAxe2.setRotationPoint(0F, -5F, -1.7F);
      FrontAxe2.setTextureSize(64, 64);
      FrontAxe2.mirror = true;
      setRotation(FrontAxe2, 0.3103381F, 0F, 0F);
      FrontAxe3 = new ModelRenderer(this, 30, 47);
      FrontAxe3.addBox(-1F, 0F, -0.5F, 2, 2, 1);
      FrontAxe3.setRotationPoint(0F, -6F, -4F);
      FrontAxe3.setTextureSize(64, 64);
      FrontAxe3.mirror = true;
      setRotation(FrontAxe3, -0.5235988F, 0F, 0F);
      FrontAxe4 = new ModelRenderer(this, 30, 40);
      FrontAxe4.addBox(-1F, -3F, -1F, 2, 5, 1);
      FrontAxe4.setRotationPoint(0F, -2.7F, -4.9F);
      FrontAxe4.setTextureSize(64, 64);
      FrontAxe4.mirror = true;
      setRotation(FrontAxe4, 0.5009095F, 0F, 0F);
      FrontAxe5 = new ModelRenderer(this, 30, 36);
      FrontAxe5.addBox(-1F, 0F, -1F, 2, 2, 1);
      FrontAxe5.setRotationPoint(0F, -2F, -3.2F);
      FrontAxe5.setTextureSize(64, 64);
      FrontAxe5.mirror = true;
      setRotation(FrontAxe5, -0.3490659F, 0F, 0F);
      FrontAxe6 = new ModelRenderer(this, 30, 31);
      FrontAxe6.addBox(-1F, -1F, -1F, 2, 3, 1);
      FrontAxe6.setRotationPoint(0F, -6.8F, -6.2F);
      FrontAxe6.setTextureSize(64, 64);
      FrontAxe6.mirror = true;
      setRotation(FrontAxe6, 0F, 0F, 0F);
      FrontAxe7 = new ModelRenderer(this, 30, 27);
      FrontAxe7.addBox(-1F, 0F, -1F, 2, 2, 1);
      FrontAxe7.setRotationPoint(0F, -3.7F, -4.2F);
      FrontAxe7.setTextureSize(64, 64);
      FrontAxe7.mirror = true;
      setRotation(FrontAxe7, 0.5235988F, 0F, 0F);
      FrontAxe8 = new ModelRenderer(this, 42, 59);
      FrontAxe8.addBox(-1F, 0F, -1F, 2, 3, 1);
      FrontAxe8.setRotationPoint(0F, -4.7F, -4.2F);
      FrontAxe8.setTextureSize(64, 64);
      FrontAxe8.mirror = true;
      setRotation(FrontAxe8, 0F, 0F, 0F);
      FrontAxe9 = new ModelRenderer(this, 42, 54);
      FrontAxe9.addBox(-1F, -0.5F, -3F, 2, 1, 3);
      FrontAxe9.setRotationPoint(0F, -6.7F, -4F);
      FrontAxe9.setTextureSize(64, 64);
      FrontAxe9.mirror = true;
      setRotation(FrontAxe9, -1.19555F, 0F, 0F);
      FrontAxe10 = new ModelRenderer(this, 42, 49);
      FrontAxe10.addBox(-1F, -3F, -0.5F, 2, 3, 1);
      FrontAxe10.setRotationPoint(0F, -7.5F, -6.8F);
      FrontAxe10.setTextureSize(64, 64);
      FrontAxe10.mirror = true;
      setRotation(FrontAxe10, -0.6320364F, 0F, 0F);
      FrontAxe11 = new ModelRenderer(this, 42, 42);
      FrontAxe11.addBox(-1F, 0F, 0F, 2, 4, 2);
      FrontAxe11.setRotationPoint(0F, -8.8F, -6.4F);
      FrontAxe11.setTextureSize(64, 64);
      FrontAxe11.mirror = true;
      setRotation(FrontAxe11, 0F, 0F, 0F);
      FrontAxe12 = new ModelRenderer(this, 42, 39);
      FrontAxe12.addBox(-1F, 0F, 0F, 2, 1, 1);
      FrontAxe12.setRotationPoint(0F, -6.8F, -4.7F);
      FrontAxe12.setTextureSize(64, 64);
      FrontAxe12.mirror = true;
      setRotation(FrontAxe12, 0F, 0F, 0F);
      FrontAxe13 = new ModelRenderer(this, 42, 34);
      FrontAxe13.addBox(-1F, -3F, -1F, 2, 3, 1);
      FrontAxe13.setRotationPoint(0F, -2.7F, -3.9F);
      FrontAxe13.setTextureSize(64, 64);
      FrontAxe13.mirror = true;
      setRotation(FrontAxe13, 0.5061455F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle.render(f5);
    Bottom.render(f5);
    AxeHeadBase.render(f5);
    TopRung.render(f5);
    BottomRung.render(f5);
    AxeHeadTop1.render(f5);
    AxeHeadTop2.render(f5);
    BackAxe1.render(f5);
    BackAxe2.render(f5);
    FrontAxe1.render(f5);
    FrontAxe2.render(f5);
    FrontAxe3.render(f5);
    FrontAxe4.render(f5);
    FrontAxe5.render(f5);
    FrontAxe6.render(f5);
    FrontAxe7.render(f5);
    FrontAxe8.render(f5);
    FrontAxe9.render(f5);
    FrontAxe10.render(f5);
    FrontAxe11.render(f5);
    FrontAxe12.render(f5);
    FrontAxe13.render(f5);
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
