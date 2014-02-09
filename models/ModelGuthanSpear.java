package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGuthanSpear extends ModelBase
{
  //fields
    ModelRenderer Shaft;
    ModelRenderer BottomSilver;
    ModelRenderer BBackSilver;
    ModelRenderer BFrontSilver;
    ModelRenderer MBackSilver;
    ModelRenderer TBackSilver;
    ModelRenderer Green1;
    ModelRenderer Green2;
    ModelRenderer Green3;
    ModelRenderer Green4;
    ModelRenderer Green5;
    ModelRenderer TopRung;
    ModelRenderer BottomRung;
  
  public ModelGuthanSpear()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shaft = new ModelRenderer(this, 1, 13);
      Shaft.addBox(0F, 0F, 0F, 1, 17, 1);
      Shaft.setRotationPoint(0F, 5F, -0.5F);
      Shaft.setTextureSize(64, 32);
      Shaft.mirror = true;
      setRotation(Shaft, 0F, 0F, 0F);
      BottomSilver = new ModelRenderer(this, 11, 28);
      BottomSilver.addBox(-0.5F, 0F, -1F, 2, 1, 2);
      BottomSilver.setRotationPoint(0F, 4F, 0F);
      BottomSilver.setTextureSize(64, 32);
      BottomSilver.mirror = true;
      setRotation(BottomSilver, 0F, 0F, 0F);
      BBackSilver = new ModelRenderer(this, 14, 22);
      BBackSilver.addBox(-0.5F, -3F, 0F, 2, 3, 1);
      BBackSilver.setRotationPoint(0F, 4.6F, 0.1F);
      BBackSilver.setTextureSize(64, 32);
      BBackSilver.mirror = true;
      setRotation(BBackSilver, -0.3926991F, 0F, 0F);
      BFrontSilver = new ModelRenderer(this, 7, 22);
      BFrontSilver.addBox(-0.5F, -3F, -1F, 2, 3, 1);
      BFrontSilver.setRotationPoint(0F, 4.6F, -0.1F);
      BFrontSilver.setTextureSize(64, 32);
      BFrontSilver.mirror = true;
      setRotation(BFrontSilver, 0.3926991F, 0F, 0F);
      MBackSilver = new ModelRenderer(this, 16, 16);
      MBackSilver.addBox(-0.5F, -4F, 0F, 2, 4, 1);
      MBackSilver.setRotationPoint(0F, 2.2F, 1.2F);
      MBackSilver.setTextureSize(64, 32);
      MBackSilver.mirror = true;
      setRotation(MBackSilver, 0F, 0F, 0F);
      TBackSilver = new ModelRenderer(this, 16, 12);
      TBackSilver.addBox(-0.5F, -2.2F, 0.1F, 2, 2, 1);
      TBackSilver.setRotationPoint(0F, -1.3F, 1.2F);
      TBackSilver.setTextureSize(64, 32);
      TBackSilver.mirror = true;
      setRotation(TBackSilver, 0.2792527F, 0F, 0F);
      Green1 = new ModelRenderer(this, 7, 15);
      Green1.addBox(0F, 0F, 0F, 1, 2, 2);
      Green1.setRotationPoint(0F, 2.9F, -1F);
      Green1.setTextureSize(64, 32);
      Green1.mirror = true;
      setRotation(Green1, 0F, 0F, 0F);
      Green2 = new ModelRenderer(this, 7, 15);
      Green2.addBox(0F, -2F, -1F, 1, 2, 2);
      Green2.setRotationPoint(0F, 3.2F, -0.6F);
      Green2.setTextureSize(64, 32);
      Green2.mirror = true;
      setRotation(Green2, -0.6806784F, 0F, 0F);
      Green3 = new ModelRenderer(this, 8, 14);
      Green3.addBox(0F, 0F, 0F, 1, 4, 1);
      Green3.setRotationPoint(0F, -3.4F, 0.7F);
      Green3.setTextureSize(64, 32);
      Green3.mirror = true;
      setRotation(Green3, -0.3717861F, 0F, 0F);
      Green4 = new ModelRenderer(this, 7, 14);
      Green4.addBox(0F, -1F, 0F, 1, 4, 2);
      Green4.setRotationPoint(0F, 0.1F, -0.2F);
      Green4.setTextureSize(64, 32);
      Green4.mirror = true;
      setRotation(Green4, -0.0349066F, 0F, 0F);
      Green5 = new ModelRenderer(this, 8, 16);
      Green5.addBox(0F, 0F, 0F, 1, 2, 1);
      Green5.setRotationPoint(0F, -2F, 0.3F);
      Green5.setTextureSize(64, 32);
      Green5.mirror = true;
      setRotation(Green5, 0F, 0F, 0F);
      TopRung = new ModelRenderer(this, 24, 17);
      TopRung.addBox(-0.5F, 0F, -1F, 2, 1, 2);
      TopRung.setRotationPoint(0F, 7F, 0F);
      TopRung.setTextureSize(64, 32);
      TopRung.mirror = true;
      setRotation(TopRung, 0F, 0F, 0F);
      BottomRung = new ModelRenderer(this, 24, 24);
      BottomRung.addBox(-1F, 0F, -1.5F, 2, 1, 3);
      BottomRung.setRotationPoint(0.5F, 22F, 0F);
      BottomRung.setTextureSize(64, 32);
      BottomRung.mirror = true;
      setRotation(BottomRung, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shaft.render(f5);
    BottomSilver.render(f5);
    BBackSilver.render(f5);
    BFrontSilver.render(f5);
    MBackSilver.render(f5);
    TBackSilver.render(f5);
    Green1.render(f5);
    Green2.render(f5);
    Green3.render(f5);
    Green4.render(f5);
    Green5.render(f5);
    TopRung.render(f5);
    BottomRung.render(f5);
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
