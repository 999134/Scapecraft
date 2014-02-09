package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGuthan extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer RightHorn;
    ModelRenderer LeftHorn;
    ModelRenderer RightHornTip;
    ModelRenderer LeftHornTip;
    ModelRenderer Handle;
    ModelRenderer BottomRung;
    ModelRenderer TopRung;
    ModelRenderer BottomSilver;
    ModelRenderer FrontSilver;
    ModelRenderer BackSilver1;
    ModelRenderer BackSilver2;
    ModelRenderer BackSilver3;
    ModelRenderer Green1;
    ModelRenderer Green2;
    ModelRenderer Green3;
    ModelRenderer Green4;
    ModelRenderer Green5;
    ModelRenderer Green6;
  
  public ModelGuthan()
  {
	    textureWidth = 128;
	    textureHeight = 128;
	    
	      head = new ModelRenderer(this, 39, 25);
	      head.addBox(-6F, -12F, -6F, 12, 12, 12);
	      head.setRotationPoint(0F, -8F, 2F);
	      head.setTextureSize(128, 128);
	      head.mirror = true;
	      setRotation(head, 0F, 0F, 0F);
	      body = new ModelRenderer(this, 43, 63);
	      body.addBox(-6F, -8F, -4F, 12, 16, 8);
	      body.setRotationPoint(0F, 0F, 2F);
	      body.setTextureSize(128, 128);
	      body.mirror = true;
	      setRotation(body, 0F, 0F, 0F);
	      rightarm = new ModelRenderer(this, 7, 55);
	      rightarm.addBox(-5F, -2F, -4F, 6, 16, 8);
	      rightarm.setRotationPoint(-7F, -6F, 2F);
	      rightarm.setTextureSize(128, 128);
	      rightarm.mirror = true;
	      setRotation(rightarm, -0.837758F, 0F, 0F);
	      leftarm = new ModelRenderer(this, 88, 55);
	      leftarm.addBox(-1F, -2F, -4F, 6, 16, 8);
	      leftarm.setRotationPoint(7F, -6F, 2F);
	      leftarm.setTextureSize(128, 128);
	      leftarm.mirror = true;
	      setRotation(leftarm, 0F, 0F, 0F);
	      rightleg = new ModelRenderer(this, 33, 91);
	      rightleg.addBox(-3F, 0F, -4F, 6, 16, 8);
	      rightleg.setRotationPoint(-3F, 8F, 2F);
	      rightleg.setTextureSize(128, 128);
	      rightleg.mirror = true;
	      setRotation(rightleg, 0F, 0F, 0F);
	      leftleg = new ModelRenderer(this, 72, 91);
	      leftleg.addBox(-3F, 0F, -4F, 6, 16, 8);
	      leftleg.setRotationPoint(3F, 8F, 2F);
	      leftleg.setTextureSize(128, 128);
	      leftleg.mirror = true;
	      setRotation(leftleg, 0F, 0F, 0F);
	      RightHorn = new ModelRenderer(this, 89, 32);
	      RightHorn.addBox(-14F, -6F, -3F, 8, 2, 2);
	      RightHorn.setRotationPoint(0F, -8F, 2F);
	      RightHorn.setTextureSize(128, 128);
	      RightHorn.mirror = true;
	      setRotation(RightHorn, 0F, 0F, 0F);
	      LeftHorn = new ModelRenderer(this, 89, 38);
	      LeftHorn.addBox(6F, -6F, -3F, 8, 2, 2);
	      LeftHorn.setRotationPoint(0F, -8F, 2F);
	      LeftHorn.setTextureSize(128, 128);
	      LeftHorn.mirror = true;
	      setRotation(LeftHorn, 0F, 0F, 0F);
	      RightHornTip = new ModelRenderer(this, 111, 26);
	      RightHornTip.addBox(-16.5F, 5.4F, -3F, 4, 2, 2);
	      RightHornTip.setRotationPoint(0F, -8F, 2F);
	      RightHornTip.setTextureSize(128, 128);
	      RightHornTip.mirror = true;
	      setRotation(RightHornTip, 0F, 0F, 0.8179294F);
	      LeftHornTip = new ModelRenderer(this, 111, 32);
	      LeftHornTip.addBox(12.5F, 5.4F, -3F, 4, 2, 2);
	      LeftHornTip.setRotationPoint(0F, -8F, 2F);
	      LeftHornTip.setTextureSize(128, 128);
	      LeftHornTip.mirror = true;
	      setRotation(LeftHornTip, 0F, 0F, -0.8179294F);
	      Handle = new ModelRenderer(this, 1, 1);
	      Handle.addBox(-3F, -16F, -13.9F, 2, 40, 2);
	      Handle.setRotationPoint(-7F, -6F, 2F);
	      Handle.setTextureSize(128, 128);
	      Handle.mirror = true;
	      setRotation(Handle, 0.7330383F, 0F, 0F);
	      BottomRung = new ModelRenderer(this, 10, 1);
	      BottomRung.addBox(-3.5F, 11F, 23F, 3, 4, 2);
	      BottomRung.setRotationPoint(-7F, -6F, 2F);
	      BottomRung.setTextureSize(128, 128);
	      BottomRung.mirror = true;
	      setRotation(BottomRung, -0.837758F, 0F, 0F);
	      TopRung = new ModelRenderer(this, 10, 8);
	      TopRung.addBox(-3.5F, -13F, -14.5F, 3, 1, 3);
	      TopRung.setRotationPoint(-7F, -6F, 2F);
	      TopRung.setTextureSize(128, 128);
	      TopRung.mirror = true;
	      setRotation(TopRung, 0.7330383F, 0F, 0F);
	      BottomSilver = new ModelRenderer(this, 10, 14);
	      BottomSilver.addBox(-3.5F, -17F, -14.5F, 3, 1, 3);
	      BottomSilver.setRotationPoint(-7F, -6F, 2F);
	      BottomSilver.setTextureSize(128, 128);
	      BottomSilver.mirror = true;
	      setRotation(BottomSilver, 0.7330383F, 0F, 0F);
	      FrontSilver = new ModelRenderer(this, 10, 20);
	      FrontSilver.addBox(-3.5F, -24.3F, -7.3F, 3, 4, 1);
	      FrontSilver.setRotationPoint(-7F, -6F, 2F);
	      FrontSilver.setTextureSize(128, 128);
	      FrontSilver.mirror = true;
	      setRotation(FrontSilver, 1.125737F, 0F, 0F);
	      BackSilver1 = new ModelRenderer(this, 10, 27);
	      BackSilver1.addBox(-3.5F, -14.4F, -17.7F, 3, 4, 1);
	      BackSilver1.setRotationPoint(-7F, -6F, 2F);
	      BackSilver1.setTextureSize(128, 128);
	      BackSilver1.mirror = true;
	      setRotation(BackSilver1, 0.3403392F, 0F, 0F);
	      BackSilver2 = new ModelRenderer(this, 10, 34);
	      BackSilver2.addBox(-3.5F, -24.6F, -11F, 3, 5, 1);
	      BackSilver2.setRotationPoint(-7F, -6F, 2F);
	      BackSilver2.setTextureSize(128, 128);
	      BackSilver2.mirror = true;
	      setRotation(BackSilver2, 0.7330383F, 0F, 0F);
	      BackSilver3 = new ModelRenderer(this, 10, 42);
	      BackSilver3.addBox(-3.5F, -29.3F, -3.9F, 3, 3, 1);
	      BackSilver3.setRotationPoint(-7F, -6F, 2F);
	      BackSilver3.setTextureSize(128, 128);
	      BackSilver3.mirror = true;
	      setRotation(BackSilver3, 1.012291F, 0F, 0F);
	      Green1 = new ModelRenderer(this, 23, 1);
	      Green1.addBox(-3F, -2.5F, -24.5F, 2, 4, 2);
	      Green1.setRotationPoint(-7F, -6F, 2F);
	      Green1.setTextureSize(128, 128);
	      Green1.mirror = true;
	      setRotation(Green1, -0.2336056F, 0F, 0F);
	      Green2 = new ModelRenderer(this, 23, 9);
	      Green2.addBox(-3F, -19.3F, -14.5F, 2, 3, 3);
	      Green2.setRotationPoint(-7F, -6F, 2F);
	      Green2.setTextureSize(128, 128);
	      Green2.mirror = true;
	      setRotation(Green2, 0.7330383F, 0F, 0F);
	      Green3 = new ModelRenderer(this, 23, 17);
	      Green3.addBox(-3F, -20.7F, -21F, 2, 5, 1);
	      Green3.setRotationPoint(-7F, -6F, 2F);
	      Green3.setTextureSize(128, 128);
	      Green3.mirror = true;
	      setRotation(Green3, 0.3490659F, 0F, 0F);
	      Green4 = new ModelRenderer(this, 23, 25);
	      Green4.addBox(-3F, -18F, -20F, 2, 6, 2);
	      Green4.setRotationPoint(-7F, -6F, 2F);
	      Green4.setTextureSize(128, 128);
	      Green4.mirror = true;
	      setRotation(Green4, 0.3612522F, 0F, 0F);
	      Green5 = new ModelRenderer(this, 23, 35);
	      Green5.addBox(-3F, -24.2F, -12.6F, 2, 6, 2);
	      Green5.setRotationPoint(-7F, -6F, 2F);
	      Green5.setTextureSize(128, 128);
	      Green5.mirror = true;
	      setRotation(Green5, 0.7330383F, 0F, 0F);
	      Green6 = new ModelRenderer(this, 23, 45);
	      Green6.addBox(-3F, -25.6F, -12F, 2, 2, 1);
	      Green6.setRotationPoint(-7F, -6F, 2F);
	      Green6.setTextureSize(128, 128);
	      Green6.mirror = true;
	      setRotation(Green6, 0.7330383F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.renderWithRotation(f5);
    body.renderWithRotation(f5);
    rightarm.renderWithRotation(f5);
    leftarm.renderWithRotation(f5);
    rightleg.renderWithRotation(f5);
    leftleg.renderWithRotation(f5);
    RightHorn.renderWithRotation(f5);
    LeftHorn.renderWithRotation(f5);
    RightHornTip.renderWithRotation(f5);
    LeftHornTip.renderWithRotation(f5);
    Handle.renderWithRotation(f5);
    BottomRung.renderWithRotation(f5);
    TopRung.renderWithRotation(f5);
    BottomSilver.renderWithRotation(f5);
    FrontSilver.renderWithRotation(f5);
    BackSilver1.renderWithRotation(f5);
    BackSilver2.renderWithRotation(f5);
    BackSilver3.renderWithRotation(f5);
    Green1.renderWithRotation(f5);
    Green2.renderWithRotation(f5);
    Green3.renderWithRotation(f5);
    Green4.renderWithRotation(f5);
    Green5.renderWithRotation(f5);
    Green6.renderWithRotation(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	leftarm.rotateAngleX = MathHelper.cos(f * .5F) * 0.7F * f1;
	rightarm.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + -0.837758041F;
	rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
	leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
	Handle.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.733038286F;
	BottomRung.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + -0.837758041F;
	TopRung.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.733038286F;
	BottomSilver.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.733038286F;
	FrontSilver.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.125737368F;
	BackSilver1.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.340339204F;
	BackSilver2.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.733038286F;
	BackSilver3.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.012290966F;
	Green1.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + -0.23361232F;
	Green2.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.733038286F;
	Green3.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.34906585F;
	Green4.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.361248249F;
	Green5.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.733038286F;
	Green6.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.733038286F;
	
  }

}
