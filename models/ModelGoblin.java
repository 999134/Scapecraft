package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGoblin extends ModelBase
{
//fields
ModelRenderer Foot1;
ModelRenderer Foot2;
ModelRenderer Shin2;
ModelRenderer Shin1;
ModelRenderer Leg1;
ModelRenderer Leg2;
ModelRenderer Lower_Body;
ModelRenderer Upper_body;
ModelRenderer Arm1;
ModelRenderer Wrist1;
ModelRenderer Hand1;
ModelRenderer Arm2;
ModelRenderer Wrist2;
ModelRenderer Hand2;
ModelRenderer Neck;
ModelRenderer Head;
ModelRenderer Ear1;
ModelRenderer Ear2;

public ModelGoblin()
{
textureWidth = 128;
textureHeight = 64;

Foot1 = new ModelRenderer(this, 107, 55);
Foot1.addBox(-2F, 7F, -5F, 4, 2, 6);
Foot1.setRotationPoint(-6F, 15F, -4F);
Foot1.setTextureSize(128, 64);
setRotation(Foot1, 0F, 0F, 0F);
Foot2 = new ModelRenderer(this, 107, 55);
Foot2.addBox(-2F, 7F, -5F, 4, 2, 6);
Foot2.setRotationPoint(6F, 15F, -4F);
Foot2.setTextureSize(128, 64);
setRotation(Foot2, 0F, 0F, 0F);
Shin2 = new ModelRenderer(this, 119, 43);
Shin2.addBox(-1F, 0F, -1F, 2, 8, 2);
Shin2.setRotationPoint(6F, 15F, -4F);
Shin2.setTextureSize(128, 64);
setRotation(Shin2, 0.4363323F, 0F, 0F);
Shin1 = new ModelRenderer(this, 119, 43);
Shin1.addBox(-1F, 0F, -1F, 2, 8, 2);
Shin1.setRotationPoint(-6F, 15F, -4F);
Shin1.setTextureSize(128, 64);
setRotation(Shin1, 0.4363323F, 0F, 0F);
Leg1 = new ModelRenderer(this, 119, 31);
Leg1.addBox(-1F, 0F, -1F, 2, 8, 2);
Leg1.setRotationPoint(-5F, 9F, -1F);
Leg1.setTextureSize(128, 64);
setRotation(Leg1, -0.4363323F, 0.4886922F, -0.0698132F);
Leg2 = new ModelRenderer(this, 119, 31);
Leg2.addBox(-1F, 0F, -1F, 2, 8, 2);
Leg2.setRotationPoint(5F, 9F, -1F);
Leg2.setTextureSize(128, 64);
setRotation(Leg2, -0.4363323F, -0.4886922F, 0.0698132F);
Lower_Body = new ModelRenderer(this, 2, 45);
Lower_Body.addBox(-5F, -4F, -3F, 12, 12, 6);
Lower_Body.setRotationPoint(-1F, 2F, 0F);
Lower_Body.setTextureSize(128, 64);
setRotation(Lower_Body, 0.1047198F, 0F, 0F);
Upper_body = new ModelRenderer(this, 2, 28);
Upper_body.addBox(-9F, -3.5F, -3.5F, 18, 7, 7);
Upper_body.setRotationPoint(0F, 0F, 0F);
Upper_body.setTextureSize(128, 64);
setRotation(Upper_body, 0.2617994F, 0F, 0F);
Arm1 = new ModelRenderer(this, 99, 28);
Arm1.addBox(-2F, 0F, -1F, 2, 10, 2);
Arm1.setRotationPoint(-8F, -3F, 0F);
Arm1.setTextureSize(128, 64);
setRotation(Arm1, 0.5061455F, -0.3316126F, 0.5585054F);
Wrist1 = new ModelRenderer(this, 90, 42);
Wrist1.addBox(-1F, 0F, -1F, 2, 10, 2);
Wrist1.setRotationPoint(-14F, 3F, 3F);
Wrist1.setTextureSize(128, 64);
setRotation(Wrist1, -0.6283185F, 0F, 0F);
Hand1 = new ModelRenderer(this, 84, 56);
Hand1.addBox(-2F, 0F, -6F, 4, 1, 6);
Hand1.setRotationPoint(-14F, 10F, -2F);
Hand1.setTextureSize(128, 64);
setRotation(Hand1, 0.6283185F, 0F, 0F);
Arm2 = new ModelRenderer(this, 90, 28);
Arm2.addBox(0F, 0F, -1F, 2, 10, 2);
Arm2.setRotationPoint(8F, -3F, 0F);
Arm2.setTextureSize(128, 64);
setRotation(Arm2, 0.5061455F, 0.3316126F, -0.5585054F);
Wrist2 = new ModelRenderer(this, 90, 42);
Wrist2.addBox(-1F, 0F, -1F, 2, 10, 2);
Wrist2.setRotationPoint(14F, 3F, 3F);
Wrist2.setTextureSize(128, 64);
setRotation(Wrist2, -0.6283185F, 0F, 0F);
Hand2 = new ModelRenderer(this, 84, 56);
Hand2.addBox(-2F, 0F, -6F, 4, 1, 6);
Hand2.setRotationPoint(14F, 10F, -2F);
Hand2.setTextureSize(128, 64);
setRotation(Hand2, 0.6283185F, 0F, 0F);
Neck = new ModelRenderer(this, 42, 55);
Neck.addBox(-2F, -4F, -2F, 6, 4, 4);
Neck.setRotationPoint(-1F, -2F, -2F);
Neck.setTextureSize(128, 64);
setRotation(Neck, 1.247446F, 0F, 0F);
Head = new ModelRenderer(this, 56, 31);
Head.addBox(-4F, -5F, -5F, 8, 11, 5);
Head.setRotationPoint(0F, -3F, -5F);
Head.setTextureSize(128, 64);
setRotation(Head, -0.2230717F, 0F, 0F);
Ear1 = new ModelRenderer(this, 4, 14);
Ear1.addBox(-1.5F, -9F, -0.5F, 3, 9, 1);
Ear1.setRotationPoint(-3F, -3F, -7F);
Ear1.setTextureSize(128, 64);
setRotation(Ear1, -0.296706F, -1.518436F, 0.5934119F);
Ear2 = new ModelRenderer(this, 13, 14);
Ear2.addBox(-1.5F, -9F, -0.5F, 3, 9, 1);
Ear2.setRotationPoint(3F, -3F, -7F);
Ear2.setTextureSize(128, 64);
setRotation(Ear2, 0.296706F, -1.518436F, 0.5934119F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
super.render(entity, f, f1, f2, f3, f4, f5);
setRotationAngles(f, f1, f2, f3, f4, f5);
Foot1.renderWithRotation(f5);
Foot2.renderWithRotation(f5);
Shin2.renderWithRotation(f5);
Shin1.renderWithRotation(f5);
Leg1.renderWithRotation(f5);
Leg2.renderWithRotation(f5);
Lower_Body.renderWithRotation(f5);
Upper_body.renderWithRotation(f5);
Arm1.renderWithRotation(f5);
Wrist1.renderWithRotation(f5);
Hand1.renderWithRotation(f5);
Arm2.renderWithRotation(f5);
Wrist2.renderWithRotation(f5);
Hand2.renderWithRotation(f5);
Neck.renderWithRotation(f5);
Head.renderWithRotation(f5);
Ear1.renderWithRotation(f5);
Ear2.renderWithRotation(f5);
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
Shin2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
Shin1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
Foot2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
Foot1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
}

}