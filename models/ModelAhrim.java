package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAhrim extends ModelBase
{
        ModelRenderer head;
        ModelRenderer body;
        ModelRenderer rightarm;
        ModelRenderer leftarm;
        ModelRenderer rightleg;
        ModelRenderer leftleg;
        ModelRenderer BottomHandle;
        ModelRenderer TopHandle;
        ModelRenderer StaffBase;
        ModelRenderer BackStaff1;
        ModelRenderer BackStaff2;
        ModelRenderer BackStaff3;
        ModelRenderer FrontStaff1;
        ModelRenderer FrontStaff2;
        ModelRenderer GreenCube;
        ModelRenderer FrontStaff3;
        ModelRenderer FrontStaff4;
        ModelRenderer FrontStaff5;
 
  public ModelAhrim()
  {
        textureWidth = 128;
        textureHeight = 128;
        
          head = new ModelRenderer(this, 39, 25);
          head.addBox(-6F, -12F, -6F, 12, 12, 12);
          head.setRotationPoint(0F, -8F, 0F);
          head.setTextureSize(128, 128);
          head.mirror = true;
          setRotation(head, 0F, 0F, 0F);
          body = new ModelRenderer(this, 43, 63);
          body.addBox(-6F, 0F, -4F, 12, 16, 8);
          body.setRotationPoint(0F, -8F, 0F);
          body.setTextureSize(128, 128);
          body.mirror = true;
          setRotation(body, 0F, 0F, 0F);
          rightarm = new ModelRenderer(this, 7, 55);
          rightarm.addBox(-5F, -2F, -4F, 6, 16, 8);
          rightarm.setRotationPoint(-7F, -6F, 0F);
          rightarm.setTextureSize(128, 128);
          rightarm.mirror = true;
          setRotation(rightarm, -0.2617994F, 0F, 0F);
          leftarm = new ModelRenderer(this, 88, 55);
          leftarm.addBox(-1F, -2F, -4F, 6, 16, 8);
          leftarm.setRotationPoint(7F, -6F, 0F);
          leftarm.setTextureSize(128, 128);
          leftarm.mirror = true;
          setRotation(leftarm, 0F, 0F, 0F);
          rightleg = new ModelRenderer(this, 33, 91);
          rightleg.addBox(-3F, 0F, -4F, 6, 16, 8);
          rightleg.setRotationPoint(-3F, 8F, 0F);
          rightleg.setTextureSize(128, 128);
          rightleg.mirror = true;
          setRotation(rightleg, 0F, 0F, 0F);
          leftleg = new ModelRenderer(this, 72, 91);
          leftleg.addBox(-3F, 0F, -4F, 6, 16, 8);
          leftleg.setRotationPoint(3F, 8F, 0F);
          leftleg.setTextureSize(128, 128);
          leftleg.mirror = true;
          setRotation(leftleg, 0F, 0F, 0F);
          BottomHandle = new ModelRenderer(this, 1, 33);
          BottomHandle.addBox(-3F, -8F, -13.9F, 2, 15, 2);
          BottomHandle.setRotationPoint(-7F, -6F, 0F);
          BottomHandle.setTextureSize(128, 128);
          BottomHandle.mirror = true;
          setRotation(BottomHandle, 1.308997F, 0F, 0F);
          TopHandle = new ModelRenderer(this, 11, 40);
          TopHandle.addBox(-3F, -6.9F, -16F, 2, 8, 2);
          TopHandle.setRotationPoint(-7F, -6F, 0F);
          TopHandle.setTextureSize(128, 128);
          TopHandle.mirror = true;
          setRotation(TopHandle, 0.715585F, 0F, 0F);
          StaffBase = new ModelRenderer(this, 21, 43);
          StaffBase.addBox(-3.5F, -9.9F, -16.5F, 3, 5, 3);
          StaffBase.setRotationPoint(-7F, -6F, 0F);
          StaffBase.setTextureSize(128, 128);
          StaffBase.mirror = true;
          setRotation(StaffBase, 0.715585F, 0F, 0F);
          BackStaff1 = new ModelRenderer(this, 1, 24);
          BackStaff1.addBox(-3F, -15F, -10F, 2, 2, 5);
          BackStaff1.setRotationPoint(-7F, -6F, 0F);
          BackStaff1.setTextureSize(128, 128);
          BackStaff1.mirror = true;
          setRotation(BackStaff1, 1.151917F, 0F, 0F);
          BackStaff2 = new ModelRenderer(this, 1, 16);
          BackStaff2.addBox(-3F, -6.5F, -15.7F, 2, 4, 2);
          BackStaff2.setRotationPoint(-7F, -6F, 0F);
          BackStaff2.setTextureSize(128, 128);
          BackStaff2.mirror = true;
          setRotation(BackStaff2, 0.122173F, 0F, 0F);
          BackStaff3 = new ModelRenderer(this, 1, 8);
          BackStaff3.addBox(-3F, -15.3F, -12.1F, 2, 4, 2);
          BackStaff3.setRotationPoint(-7F, -6F, 0F);
          BackStaff3.setTextureSize(128, 128);
          BackStaff3.mirror = true;
          setRotation(BackStaff3, 0.5235988F, 0F, 0F);
          FrontStaff1 = new ModelRenderer(this, 17, 18);
          FrontStaff1.addBox(-3F, -21.6F, -9.7F, 2, 7, 2);
          FrontStaff1.setRotationPoint(-7F, -6F, 0F);
          FrontStaff1.setTextureSize(128, 128);
          FrontStaff1.mirror = true;
          setRotation(FrontStaff1, 1.303627F, 0F, 0F);
          FrontStaff2 = new ModelRenderer(this, 17, 9);
          FrontStaff2.addBox(-3F, -17.5F, -12.5F, 2, 2, 5);
          FrontStaff2.setRotationPoint(-7F, -6F, 0F);
          FrontStaff2.setTextureSize(128, 128);
          FrontStaff2.mirror = true;
          setRotation(FrontStaff2, 1.099557F, 0F, 0F);
          GreenCube = new ModelRenderer(this, 16, 29);
          GreenCube.addBox(-4.5F, -22.5F, -11F, 5, 5, 5);
          GreenCube.setRotationPoint(-7F, -6F, 0F);
          GreenCube.setTextureSize(128, 128);
          GreenCube.mirror = true;
          setRotation(GreenCube, 1.012291F, 0F, 0F);
          FrontStaff3 = new ModelRenderer(this, 33, 8);
          FrontStaff3.addBox(-3F, -21.9F, -13.7F, 2, 6, 2);
          FrontStaff3.setRotationPoint(-7F, -6F, 0F);
          FrontStaff3.setTextureSize(128, 128);
          FrontStaff3.mirror = true;
          setRotation(FrontStaff3, 1.047198F, 0F, 0F);
          FrontStaff4 = new ModelRenderer(this, 17, 1);
          FrontStaff4.addBox(-3F, -21.9F, -17.7F, 2, 3, 4);
          FrontStaff4.setRotationPoint(-7F, -6F, 0F);
          FrontStaff4.setTextureSize(128, 128);
          FrontStaff4.mirror = true;
          setRotation(FrontStaff4, 1.047198F, 0F, 0F);
          FrontStaff5 = new ModelRenderer(this, 1, 1);
          FrontStaff5.addBox(-3F, -24F, -5.3F, 2, 3, 2);
          FrontStaff5.setRotationPoint(-7F, -6F, 0F);
          FrontStaff5.setTextureSize(128, 128);
          FrontStaff5.mirror = true;
          setRotation(FrontStaff5, 1.518436F, 0F, 0F);
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
        BottomHandle.renderWithRotation(f5);
        TopHandle.renderWithRotation(f5);
        StaffBase.renderWithRotation(f5);
        BackStaff1.renderWithRotation(f5);
        BackStaff2.renderWithRotation(f5);
        BackStaff3.renderWithRotation(f5);
        FrontStaff1.renderWithRotation(f5);
        FrontStaff2.renderWithRotation(f5);
        GreenCube.renderWithRotation(f5);
        FrontStaff3.renderWithRotation(f5);
        FrontStaff4.renderWithRotation(f5);
        FrontStaff5.renderWithRotation(f5);
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
        rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
        leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
        rightarm.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + -0.261799388F;
        BottomHandle.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.308996939F;
        TopHandle.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.715584993F;
        StaffBase.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.715584993F;
        BackStaff1.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.151917306F;
        BackStaff2.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.122173048F;
        BackStaff3.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 0.523598776F;
        FrontStaff1.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.303621325F;
        FrontStaff2.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.099557429F;
        GreenCube.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.012290966F;
        FrontStaff3.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.047197551F;
        FrontStaff4.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.047197551F;
        FrontStaff5.rotateAngleX = MathHelper.cos(f * .5F + (float)Math.PI) * 0.7F * f1 + 1.518436449F;
  }

}