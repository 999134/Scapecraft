package net.minecraft.models;



import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelGreenDragon extends ModelBase
{
  //fields
        ModelRenderer Body;
        ModelRenderer BackLeftFoot;
        ModelRenderer BackLeftTopLeg;
        ModelRenderer BackLeftBottomLeg;
        ModelRenderer BackRightTopLeg;
        ModelRenderer BackRightBottomLeg;
        ModelRenderer BackRightFoot;
        ModelRenderer FrontRightTopLeg;
        ModelRenderer FrontRightBottomLeg;
        ModelRenderer FrontRightFoot;
        ModelRenderer FrontLeftTopLeg;
        ModelRenderer FrontLeftBottomLeg;
        ModelRenderer FrontLeftFoot;
        ModelRenderer BaseNeck;
        ModelRenderer LongNeck;
        ModelRenderer TopHead;
        ModelRenderer Jaw;
        ModelRenderer Tail1;
        ModelRenderer Tail2;
        ModelRenderer Tail3;
        ModelRenderer Tail4;
        ModelRenderer Tail5;
        ModelRenderer Tail6;
        ModelRenderer LeftHorn;
        ModelRenderer RightHorn;
        ModelRenderer RightWingSkin;
        ModelRenderer LeftWingSkin;
 
  public ModelGreenDragon()
  {
        textureWidth = 256;
        textureHeight = 256;
        
          Body = new ModelRenderer(this, 1, 224);
          Body.addBox(-5F, -4F, -12.5F, 10, 8, 23);
          Body.setRotationPoint(0F, 10F, 0F);
          Body.setTextureSize(256, 256);
          Body.mirror = true;
          setRotation(Body, 0.0743572F, 0F, 0F);
          BackLeftFoot = new ModelRenderer(this, 1, 145);
          BackLeftFoot.addBox(-2.5F, 6F, -3.5F, 5, 2, 5);
          BackLeftFoot.setRotationPoint(-6.5F, 16F, 9F);
          BackLeftFoot.setTextureSize(256, 256);
          BackLeftFoot.mirror = true;
          setRotation(BackLeftFoot, 0F, 0F, 0F);
          BackLeftTopLeg = new ModelRenderer(this, 1, 169);
          BackLeftTopLeg.addBox(-3F, 0F, -2F, 3, 10, 4);
          BackLeftTopLeg.setRotationPoint(-5F, 8F, 5F);
          BackLeftTopLeg.setTextureSize(256, 256);
          BackLeftTopLeg.mirror = true;
          setRotation(BackLeftTopLeg, 0.5235988F, 0F, 0F);
          BackLeftBottomLeg = new ModelRenderer(this, 1, 156);
          BackLeftBottomLeg.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
          BackLeftBottomLeg.setRotationPoint(-6.5F, 16F, 9F);
          BackLeftBottomLeg.setTextureSize(256, 256);
          BackLeftBottomLeg.mirror = true;
          setRotation(BackLeftBottomLeg, -0.1745329F, 0F, 0F);
          BackRightTopLeg = new ModelRenderer(this, 90, 169);
          BackRightTopLeg.addBox(0F, 0F, -2F, 3, 10, 4);
          BackRightTopLeg.setRotationPoint(5F, 8F, 5F);
          BackRightTopLeg.setTextureSize(256, 256);
          BackRightTopLeg.mirror = true;
          setRotation(BackRightTopLeg, 0.5235988F, 0F, 0F);
          BackRightBottomLeg = new ModelRenderer(this, 90, 156);
          BackRightBottomLeg.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
          BackRightBottomLeg.setRotationPoint(6.5F, 16F, 9F);
          BackRightBottomLeg.setTextureSize(256, 256);
          BackRightBottomLeg.mirror = true;
          setRotation(BackRightBottomLeg, -0.1745329F, 0F, 0F);
          BackRightFoot = new ModelRenderer(this, 90, 145);
          BackRightFoot.addBox(-2.5F, 6F, -3.5F, 5, 2, 5);
          BackRightFoot.setRotationPoint(6.5F, 16F, 9F);
          BackRightFoot.setTextureSize(256, 256);
          BackRightFoot.mirror = true;
          setRotation(BackRightFoot, 0F, 0F, 0F);
          FrontRightTopLeg = new ModelRenderer(this, 60, 169);
          FrontRightTopLeg.addBox(0F, 0F, -2F, 3, 9, 4);
          FrontRightTopLeg.setRotationPoint(5F, 9F, -10F);
          FrontRightTopLeg.setTextureSize(256, 256);
          FrontRightTopLeg.mirror = true;
          setRotation(FrontRightTopLeg, 0.3490659F, 0F, 0F);
          FrontRightBottomLeg = new ModelRenderer(this, 60, 156);
          FrontRightBottomLeg.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
          FrontRightBottomLeg.setRotationPoint(6.5F, 16F, -7F);
          FrontRightBottomLeg.setTextureSize(256, 256);
          FrontRightBottomLeg.mirror = true;
          setRotation(FrontRightBottomLeg, -0.1745329F, 0F, 0F);
          FrontRightFoot = new ModelRenderer(this, 60, 145);
          FrontRightFoot.addBox(-2.5F, 6F, -3.5F, 5, 2, 5);
          FrontRightFoot.setRotationPoint(6.5F, 16F, -7F);
          FrontRightFoot.setTextureSize(256, 256);
          FrontRightFoot.mirror = true;
          setRotation(FrontRightFoot, 0F, 0F, 0F);
          FrontLeftTopLeg = new ModelRenderer(this, 30, 169);
          FrontLeftTopLeg.addBox(-3F, 0F, -2F, 3, 9, 4);
          FrontLeftTopLeg.setRotationPoint(-5F, 9F, -10F);
          FrontLeftTopLeg.setTextureSize(256, 256);
          FrontLeftTopLeg.mirror = true;
          setRotation(FrontLeftTopLeg, 0.3490659F, 0F, 0F);
          FrontLeftBottomLeg = new ModelRenderer(this, 30, 156);
          FrontLeftBottomLeg.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
          FrontLeftBottomLeg.setRotationPoint(-6.5F, 16F, -7F);
          FrontLeftBottomLeg.setTextureSize(256, 256);
          FrontLeftBottomLeg.mirror = true;
          setRotation(FrontLeftBottomLeg, -0.1745329F, 0F, 0F);
          FrontLeftFoot = new ModelRenderer(this, 30, 145);
          FrontLeftFoot.addBox(-2.5F, 6F, -3.5F, 5, 2, 5);
          FrontLeftFoot.setRotationPoint(-6.5F, 16F, -7F);
          FrontLeftFoot.setTextureSize(256, 256);
          FrontLeftFoot.mirror = true;
          setRotation(FrontLeftFoot, 0F, 0F, 0F);
          BaseNeck = new ModelRenderer(this, 130, 169);
          BaseNeck.addBox(0F, 0F, 0F, 6, 8, 6);
          BaseNeck.setRotationPoint(-3F, 6F, -16F);
          BaseNeck.setTextureSize(256, 256);
          BaseNeck.mirror = true;
          setRotation(BaseNeck, -0.1745329F, 0F, 0F);
          LongNeck = new ModelRenderer(this, 130, 152);
          LongNeck.addBox(0F, 0F, 0F, 5, 7, 6);
          LongNeck.setRotationPoint(-2.5F, 5.5F, -22F);
          LongNeck.setTextureSize(256, 256);
          LongNeck.mirror = true;
          setRotation(LongNeck, -0.1745329F, 0F, 0F);
          TopHead = new ModelRenderer(this, 130, 134);
          TopHead.addBox(0F, 0F, 0F, 6, 4, 10);
          TopHead.setRotationPoint(-3F, 6F, -32F);
          TopHead.setTextureSize(256, 256);
          TopHead.mirror = true;
          setRotation(TopHead, 0.0698132F, 0F, 0F);
          Jaw = new ModelRenderer(this, 130, 122);
          Jaw.addBox(-2F, 0F, -6F, 6, 2, 7);
          Jaw.setRotationPoint(-1F, 10F, -23.5F);
          Jaw.setTextureSize(256, 256);
          Jaw.mirror = true;
          setRotation(Jaw, 0.4363323F, 0F, 0F);
          Tail1 = new ModelRenderer(this, 220, 240);
          Tail1.addBox(0F, 0F, 0F, 6, 6, 7);
          Tail1.setRotationPoint(-3F, 6F, 8F);
          Tail1.setTextureSize(256, 256);
          Tail1.mirror = true;
          setRotation(Tail1, 0F, -0.4363323F, 0F);
          Tail2 = new ModelRenderer(this, 220, 224);
          Tail2.addBox(0F, 0F, 0F, 5, 5, 7);
          Tail2.setRotationPoint(-4F, 6.5F, 13F);
          Tail2.setTextureSize(256, 256);
          Tail2.mirror = true;
          setRotation(Tail2, 0F, -0.7853982F, 0F);
          Tail3 = new ModelRenderer(this, 220, 210);
          Tail3.addBox(0F, 0F, 0F, 4, 4, 7);
          Tail3.setRotationPoint(-7F, 7F, 17.5F);
          Tail3.setTextureSize(256, 256);
          Tail3.mirror = true;
          setRotation(Tail3, 0F, -1.134464F, 0F);
          Tail4 = new ModelRenderer(this, 220, 197);
          Tail4.addBox(0F, 0F, 0F, 3, 3, 7);
          Tail4.setRotationPoint(-12F, 7.5F, 21F);
          Tail4.setTextureSize(256, 256);
          Tail4.mirror = true;
          setRotation(Tail4, 0F, -1.48353F, 0F);
          Tail5 = new ModelRenderer(this, 220, 185);
          Tail5.addBox(0F, 0F, 0F, 2, 2, 7);
          Tail5.setRotationPoint(-17F, 8F, 22.5F);
          Tail5.setTextureSize(256, 256);
          Tail5.mirror = true;
          setRotation(Tail5, 0F, -1.745329F, 0F);
          Tail6 = new ModelRenderer(this, 220, 174);
          Tail6.addBox(0F, 0F, 0F, 1, 1, 7);
          Tail6.setRotationPoint(-24F, 8.5F, 22F);
          Tail6.setTextureSize(256, 256);
          Tail6.mirror = true;
          setRotation(Tail6, 0F, -1.919862F, 0F);
          LeftHorn = new ModelRenderer(this, 130, 113);
          LeftHorn.addBox(-1F, 0F, 0F, 1, 6, 1);
          LeftHorn.setRotationPoint(-2F, 2F, -19F);
          LeftHorn.setTextureSize(256, 256);
          LeftHorn.mirror = true;
          setRotation(LeftHorn, -0.8552113F, 0F, -0.1396263F);
          RightHorn = new ModelRenderer(this, 140, 113);
          RightHorn.addBox(0F, 0F, 0F, 1, 6, 1);
          RightHorn.setRotationPoint(2F, 2F, -19F);
          RightHorn.setTextureSize(256, 256);
          RightHorn.mirror = true;
          setRotation(RightHorn, -0.8552113F, 0F, 0.1396263F);
          RightWingSkin = new ModelRenderer(this, 2, 186);
          RightWingSkin.addBox(-0.5F, -21F, -7.5F, 1, 21, 15);
          RightWingSkin.setRotationPoint(5F, 7F, -5F);
          RightWingSkin.setTextureSize(256, 256);
          RightWingSkin.mirror = true;
          setRotation(RightWingSkin, 0F, 0F, 0.9599311F);
          LeftWingSkin = new ModelRenderer(this, 38, 186);
          LeftWingSkin.addBox(-0.5F, -21F, -7.5F, 1, 21, 15);
          LeftWingSkin.setRotationPoint(-5F, 7F, -5F);
          LeftWingSkin.setTextureSize(256, 256);
          LeftWingSkin.mirror = true;
          setRotation(LeftWingSkin, 0F, 0F, -0.9599311F);
  }
 
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Body.render(f5);
        BackLeftFoot.renderWithRotation(f5);
        BackLeftTopLeg.renderWithRotation(f5);
        BackLeftBottomLeg.renderWithRotation(f5);
        BackRightTopLeg.renderWithRotation(f5);
        BackRightBottomLeg.renderWithRotation(f5);
        BackRightFoot.renderWithRotation(f5);
        FrontRightTopLeg.renderWithRotation(f5);
        FrontRightBottomLeg.renderWithRotation(f5);
        FrontRightFoot.renderWithRotation(f5);
        FrontLeftTopLeg.renderWithRotation(f5);
        FrontLeftBottomLeg.renderWithRotation(f5);
        FrontLeftFoot.renderWithRotation(f5);
        BaseNeck.renderWithRotation(f5);
        LongNeck.renderWithRotation(f5);
        TopHead.renderWithRotation(f5);
        Jaw.renderWithRotation(f5);
        Tail1.renderWithRotation(f5);
        Tail2.renderWithRotation(f5);
        Tail3.renderWithRotation(f5);
        Tail4.renderWithRotation(f5);
        Tail5.renderWithRotation(f5);
        Tail6.renderWithRotation(f5);
        LeftHorn.renderWithRotation(f5);
        RightHorn.renderWithRotation(f5);
        RightWingSkin.renderWithRotation(f5);
        LeftWingSkin.renderWithRotation(f5);
  }
 
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
  }
 
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
                  FrontRightFoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
                  FrontRightBottomLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
                  
                  FrontLeftFoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
                  FrontLeftBottomLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
                  
                  BackRightFoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
                  BackRightBottomLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
                  
                  BackLeftFoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
                  BackLeftBottomLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;

  }

}