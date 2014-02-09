package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHillGiant extends ModelBase
{
  //fields
    ModelRenderer LFoot;
    ModelRenderer LLeg;
    ModelRenderer LThigh;
    ModelRenderer RFoot;
    ModelRenderer RLeg;
    ModelRenderer RThigh;
    ModelRenderer BottomBody;
    ModelRenderer UpperBody;
    ModelRenderer LPek;
    ModelRenderer RPek;
    ModelRenderer LShoulder;
    ModelRenderer LArm;
    ModelRenderer LWrist;
    ModelRenderer LHand;
    ModelRenderer Handle;
    ModelRenderer Club;
    ModelRenderer RShoulder;
    ModelRenderer RArm;
    ModelRenderer RWrist;
    ModelRenderer RHand;
    ModelRenderer LNeck;
    ModelRenderer RNeck;
    ModelRenderer MNeck;
    ModelRenderer Head;
    ModelRenderer LoinFront;
    ModelRenderer LoinBack;
    ModelRenderer TopBeard;
    ModelRenderer BottomBeard;
  
  public ModelHillGiant()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      LFoot = new ModelRenderer(this, 1, 52);
      LFoot.addBox(-6.5F, 14F, -6F, 5, 2, 8);
      LFoot.setRotationPoint(0F, 8F, 3F);
      LFoot.setTextureSize(128, 64);
      LFoot.mirror = true;
      setRotation(LFoot, 0F, 0F, 0F);
      LLeg = new ModelRenderer(this, 1, 38);
      LLeg.addBox(-6F, 7F, -2.5F, 4, 8, 4);
      LLeg.setRotationPoint(0F, 8F, 3F);
      LLeg.setTextureSize(128, 64);
      LLeg.mirror = true;
      setRotation(LLeg, 0F, 0F, 0F);
      LThigh = new ModelRenderer(this, 1, 22);
      LThigh.addBox(-6.5F, 0F, -3F, 5, 8, 5);
      LThigh.setRotationPoint(0F, 8F, 3F);
      LThigh.setTextureSize(128, 64);
      LThigh.mirror = true;
      setRotation(LThigh, 0F, 0F, 0F);
      RFoot = new ModelRenderer(this, 30, 52);
      RFoot.addBox(1.5F, 14F, -6F, 5, 2, 8);
      RFoot.setRotationPoint(0F, 8F, 3F);
      RFoot.setTextureSize(128, 64);
      RFoot.mirror = true;
      setRotation(RFoot, 0F, 0F, 0F);
      RLeg = new ModelRenderer(this, 30, 38);
      RLeg.addBox(2F, 7F, -2.5F, 4, 8, 4);
      RLeg.setRotationPoint(0F, 8F, 3F);
      RLeg.setTextureSize(128, 64);
      RLeg.mirror = true;
      setRotation(RLeg, 0F, 0F, 0F);
      RThigh = new ModelRenderer(this, 30, 22);
      RThigh.addBox(1.5F, 0F, -3F, 5, 8, 5);
      RThigh.setRotationPoint(0F, 8F, 3F);
      RThigh.setTextureSize(128, 64);
      RThigh.mirror = true;
      setRotation(RThigh, 0F, 0F, 0F);
      BottomBody = new ModelRenderer(this, 49, 1);
      BottomBody.addBox(0F, 0F, 0F, 13, 8, 7);
      BottomBody.setRotationPoint(-6.5F, 0F, -1F);
      BottomBody.setTextureSize(128, 64);
      BottomBody.mirror = true;
      setRotation(BottomBody, 0F, 0F, 0F);
      UpperBody = new ModelRenderer(this, 1, 1);
      UpperBody.addBox(0F, 0F, 0F, 15, 12, 8);
      UpperBody.setRotationPoint(-7.5F, -12F, -1.5F);
      UpperBody.setTextureSize(128, 64);
      UpperBody.mirror = true;
      setRotation(UpperBody, 0F, 0F, 0F);
      LPek = new ModelRenderer(this, 91, 1);
      LPek.addBox(0F, 0F, 0F, 7, 7, 2);
      LPek.setRotationPoint(-7.4F, -12F, -1.5F);
      LPek.setTextureSize(128, 64);
      LPek.mirror = true;
      setRotation(LPek, -0.0872665F, 0F, 0F);
      RPek = new ModelRenderer(this, 110, 1);
      RPek.addBox(0F, 0F, 0F, 7, 7, 2);
      RPek.setRotationPoint(0.4F, -12F, -1.5F);
      RPek.setTextureSize(128, 64);
      RPek.mirror = true;
      setRotation(RPek, -0.0872665F, 0F, 0F);
      LShoulder = new ModelRenderer(this, 58, 47);
      LShoulder.addBox(-5F, 0F, -2F, 5, 10, 5);
      LShoulder.setRotationPoint(-7.5F, -12F, 2F);
      LShoulder.setTextureSize(128, 64);
      LShoulder.mirror = true;
      setRotation(LShoulder, 0.2617994F, 0F, 0.0872665F);
      LArm = new ModelRenderer(this, 58, 30);
      LArm.addBox(-4.5F, 6F, 4.4F, 4, 11, 4);
      LArm.setRotationPoint(-7.5F, -12F, 2F);
      LArm.setTextureSize(128, 64);
      LArm.mirror = true;
      setRotation(LArm, -0.3839724F, 0F, 0.0872665F);
      LWrist = new ModelRenderer(this, 58, 21);
      LWrist.addBox(-4F, 14F, 4.9F, 3, 4, 3);
      LWrist.setRotationPoint(-7.5F, -12F, 2F);
      LWrist.setTextureSize(128, 64);
      LWrist.mirror = true;
      setRotation(LWrist, -0.3839724F, 0F, 0.0872665F);
      LHand = new ModelRenderer(this, 72, 18);
      LHand.addBox(-4.5F, 18F, 4.4F, 4, 3, 4);
      LHand.setRotationPoint(-7.5F, -12F, 2F);
      LHand.setTextureSize(128, 64);
      LHand.mirror = true;
      setRotation(LHand, -0.3839724F, 0F, 0.0872665F);
      Handle = new ModelRenderer(this, 108, 23);
      Handle.addBox(-4F, 18.5F, 2.4F, 2, 2, 8);
      Handle.setRotationPoint(-7.5F, -12F, 2F);
      Handle.setTextureSize(128, 64);
      Handle.mirror = true;
      setRotation(Handle, -0.3839724F, 0F, 0.0872665F);
      Club = new ModelRenderer(this, 108, 12);
      Club.addBox(-4.5F, 18F, -3.6F, 4, 3, 6);
      Club.setRotationPoint(-7.5F, -12F, 2F);
      Club.setTextureSize(128, 64);
      Club.mirror = true;
      setRotation(Club, -0.3839724F, 0F, 0.0872665F);
      RShoulder = new ModelRenderer(this, 58, 47);
      RShoulder.addBox(0F, 0F, -2F, 5, 10, 5);
      RShoulder.setRotationPoint(7.5F, -12F, 2F);
      RShoulder.setTextureSize(128, 64);
      RShoulder.mirror = true;
      setRotation(RShoulder, 0.1745329F, 0F, -0.0872665F);
      RArm = new ModelRenderer(this, 58, 30);
      RArm.addBox(0.5F, 7.5F, 3F, 4, 11, 4);
      RArm.setRotationPoint(7.5F, -12F, 2F);
      RArm.setTextureSize(128, 64);
      RArm.mirror = true;
      setRotation(RArm, -0.296706F, 0F, -0.0872665F);
      RWrist = new ModelRenderer(this, 58, 21);
      RWrist.addBox(1F, 16.5F, 3.4F, 3, 4, 3);
      RWrist.setRotationPoint(7.5F, -12F, 2F);
      RWrist.setTextureSize(128, 64);
      RWrist.mirror = true;
      setRotation(RWrist, -0.296706F, 0F, -0.0872665F);
      RHand = new ModelRenderer(this, 90, 18);
      RHand.addBox(0.5F, 19.5F, 2.9F, 4, 3, 4);
      RHand.setRotationPoint(7.5F, -12F, 2F);
      RHand.setTextureSize(128, 64);
      RHand.mirror = true;
      setRotation(RHand, -0.296706F, 0F, -0.0872665F);
      LNeck = new ModelRenderer(this, 78, 27);
      LNeck.addBox(0F, 0F, 0F, 7, 4, 5);
      LNeck.setRotationPoint(-6F, -12F, 0F);
      LNeck.setTextureSize(128, 64);
      LNeck.mirror = true;
      setRotation(LNeck, 0F, 0F, -0.6108652F);
      RNeck = new ModelRenderer(this, 78, 27);
      RNeck.addBox(-7F, 0F, 0F, 7, 4, 5);
      RNeck.setRotationPoint(6F, -12F, 0F);
      RNeck.setTextureSize(128, 64);
      RNeck.mirror = true;
      setRotation(RNeck, 0F, 0F, 0.6108652F);
      MNeck = new ModelRenderer(this, 80, 38);
      MNeck.addBox(0F, 0F, 0F, 5, 3, 5);
      MNeck.setRotationPoint(-2.5F, -16F, 0F);
      MNeck.setTextureSize(128, 64);
      MNeck.mirror = true;
      setRotation(MNeck, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 85, 48);
      Head.addBox(0F, 0F, 0F, 6, 7, 7);
      Head.setRotationPoint(-3F, -23F, -1.7F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      LoinFront = new ModelRenderer(this, 102, 37);
      LoinFront.addBox(0F, 0F, 0F, 7, 5, 1);
      LoinFront.setRotationPoint(-3F, 7F, -1.1F);
      LoinFront.setTextureSize(128, 64);
      LoinFront.mirror = true;
      setRotation(LoinFront, 0F, 0F, 0F);
      LoinBack = new ModelRenderer(this, 102, 37);
      LoinBack.addBox(0F, 0F, 0F, 7, 5, 1);
      LoinBack.setRotationPoint(-3F, 7F, 5.1F);
      LoinBack.setTextureSize(128, 64);
      LoinBack.mirror = true;
      setRotation(LoinBack, 0F, 0F, 0F);
      TopBeard = new ModelRenderer(this, 113, 45);
      TopBeard.addBox(0F, 0F, 0F, 6, 3, 1);
      TopBeard.setRotationPoint(-3F, -18F, -2F);
      TopBeard.setTextureSize(128, 64);
      TopBeard.mirror = true;
      setRotation(TopBeard, 0F, 0F, 0F);
      BottomBeard = new ModelRenderer(this, 119, 38);
      BottomBeard.addBox(0F, 0F, 0F, 3, 3, 1);
      BottomBeard.setRotationPoint(-1.5F, -17F, -2F);
      BottomBeard.setTextureSize(128, 64);
      BottomBeard.mirror = true;
      setRotation(BottomBeard, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    LFoot.render(f5);
    LLeg.render(f5);
    LThigh.render(f5);
    RFoot.render(f5);
    RLeg.render(f5);
    RThigh.render(f5);
    BottomBody.render(f5);
    UpperBody.render(f5);
    LPek.render(f5);
    RPek.render(f5);
    LShoulder.renderWithRotation(f5);
    LArm.renderWithRotation(f5);
    LWrist.renderWithRotation(f5);
    LHand.renderWithRotation(f5);
    Handle.renderWithRotation(f5);
    Club.renderWithRotation(f5);
    RShoulder.renderWithRotation(f5);
    RArm.renderWithRotation(f5);
    RWrist.renderWithRotation(f5);
    RHand.renderWithRotation(f5);
    LNeck.render(f5);
    RNeck.render(f5);
    MNeck.render(f5);
    Head.render(f5);
    LoinFront.render(f5);
    LoinBack.render(f5);
    TopBeard.render(f5);
    BottomBeard.render(f5);
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
    LFoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
    LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
    LThigh.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
    
    RFoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
    RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
    RThigh.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
    
    LShoulder.rotateAngleX = MathHelper.cos(f * .5F) * 0.7F * f1 + 0.261799388F;
    LArm.rotateAngleX = MathHelper.cos(f * .5F) * 0.7F * f1 + -0.383972435F;
    LWrist.rotateAngleX = MathHelper.cos(f * .5F) * 0.7F * f1 + -0.383972435F;
    LHand.rotateAngleX = MathHelper.cos(f * .5F) * 0.7F * f1 + -0.383972435F;
    Handle.rotateAngleX = MathHelper.cos(f * .5F) * 0.7F * f1 + -0.383972435F;
    Club.rotateAngleX = MathHelper.cos(f * .5F) * 0.7F * f1 + -0.383972435F;
    
    RShoulder.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.174532925F;
    RArm.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + -0.296705973F;
    RWrist.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + -0.296705973F;
    RHand.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + -0.296705973F;
    
  }

}
