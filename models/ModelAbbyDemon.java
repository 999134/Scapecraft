package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;



public class ModelAbbyDemon extends ModelBase
{
//fields
ModelRenderer Leg1;
ModelRenderer Thigh1;
ModelRenderer Leg2;
ModelRenderer Thigh2;
ModelRenderer Leg3;
ModelRenderer Thigh3;
ModelRenderer Leg4;
ModelRenderer Thigh4;
ModelRenderer Head;
ModelRenderer Neck;
ModelRenderer Top_Body;
ModelRenderer Middle_Body;
ModelRenderer Bottom_Body;
ModelRenderer Elbow1;
ModelRenderer Arm1;
ModelRenderer Elbow2;
ModelRenderer Arm2;

public ModelAbbyDemon()
{
textureWidth = 64;
textureHeight = 64;

Leg1 = new ModelRenderer(this, 55, 2);
Leg1.addBox(-1F, 0F, -1F, 2, 17, 2);
Leg1.setRotationPoint(-11F, 7F, -12F);
Leg1.setTextureSize(64, 64);
Leg1.mirror = true;
setRotation(Leg1, 0F, 0F, 0F);
Thigh1 = new ModelRenderer(this, 55, 22);
Thigh1.addBox(-1F, 0F, -1F, 2, 12, 2);
Thigh1.setRotationPoint(-4F, 13F, -5F);
Thigh1.setTextureSize(64, 64);
Thigh1.mirror = true;
setRotation(Thigh1, 0F, -0.7853982F, 2.059489F);
Leg2 = new ModelRenderer(this, 55, 2);
Leg2.addBox(-1F, 0F, -1F, 2, 17, 2);
Leg2.setRotationPoint(-11F, 7F, 12F);
Leg2.setTextureSize(64, 64);
Leg2.mirror = true;
setRotation(Leg2, 0F, 0F, 0F);
Thigh2 = new ModelRenderer(this, 55, 22);
Thigh2.addBox(-1F, 0F, -1F, 2, 12, 2);
Thigh2.setRotationPoint(-4F, 13F, 5F);
Thigh2.setTextureSize(64, 64);
Thigh2.mirror = true;
setRotation(Thigh2, 0F, 0.7853982F, 2.059489F);
Leg3 = new ModelRenderer(this, 55, 2);
Leg3.addBox(-1F, 0F, -1F, 2, 17, 2);
Leg3.setRotationPoint(11F, 7F, 11F);
Leg3.setTextureSize(64, 64);
Leg3.mirror = true;
setRotation(Leg3, 0F, 0F, 0F);
Thigh3 = new ModelRenderer(this, 55, 22);
Thigh3.addBox(-1F, 0F, -1F, 2, 12, 2);
Thigh3.setRotationPoint(4F, 13F, 4F);
Thigh3.setTextureSize(64, 64);
Thigh3.mirror = true;
setRotation(Thigh3, 0F, -0.7853982F, -2.059489F);
Leg4 = new ModelRenderer(this, 55, 2);
Leg4.addBox(-1F, 0F, -1F, 2, 17, 2);
Leg4.setRotationPoint(11F, 7F, -12F);
Leg4.setTextureSize(64, 64);
Leg4.mirror = true;
setRotation(Leg4, 0F, 0F, 0F);
Thigh4 = new ModelRenderer(this, 55, 22);
Thigh4.addBox(-1F, 0F, -1F, 2, 12, 2);
Thigh4.setRotationPoint(4F, 13F, -5F);
Thigh4.setTextureSize(64, 64);
Thigh4.mirror = true;
setRotation(Thigh4, 0F, 0.7853982F, -2.059489F);
Head = new ModelRenderer(this, 1, 19);
Head.addBox(-3F, -5F, -6F, 6, 5, 17);
Head.setRotationPoint(0F, -2F, 1F);
Head.setTextureSize(64, 64);
Head.mirror = true;
setRotation(Head, 0.0872665F, 0F, 0F);
Neck = new ModelRenderer(this, 55, 57);
Neck.addBox(-1F, -2F, -1F, 2, 4, 2);
Neck.setRotationPoint(0F, 0F, 1F);
Neck.setTextureSize(64, 64);
Neck.mirror = true;
setRotation(Neck, 0F, 0F, 0F);
Top_Body = new ModelRenderer(this, 23, 4);
Top_Body.addBox(-1F, -2F, -2F, 8, 6, 7);
Top_Body.setRotationPoint(-3F, 4F, 0F);
Top_Body.setTextureSize(64, 64);
Top_Body.mirror = true;
setRotation(Top_Body, 0F, 0F, 0F);
Middle_Body = new ModelRenderer(this, 3, 5);
Middle_Body.addBox(-1F, -3F, -1F, 4, 4, 5);
Middle_Body.setRotationPoint(-1F, 11F, 0F);
Middle_Body.setTextureSize(64, 64);
Middle_Body.mirror = true;
setRotation(Middle_Body, 0F, 0F, 0F);
Bottom_Body = new ModelRenderer(this, 1, 43);
Bottom_Body.addBox(-5F, -4F, -6F, 10, 8, 12);
Bottom_Body.setRotationPoint(0F, 16F, 0F);
Bottom_Body.setTextureSize(64, 64);
Bottom_Body.mirror = true;
setRotation(Bottom_Body, 0F, 0F, 0F);
Elbow1 = new ModelRenderer(this, 55, 37);
Elbow1.addBox(-1F, 0F, -1F, 2, 10, 2);
Elbow1.setRotationPoint(-3F, 3F, 0F);
Elbow1.setTextureSize(64, 64);
Elbow1.mirror = true;
setRotation(Elbow1, 0F, 0.5235988F, 1.570796F);
Arm1 = new ModelRenderer(this, 46, 46);
Arm1.addBox(-1F, 0F, -1F, 2, 15, 2);
Arm1.setRotationPoint(-11F, 3F, 4F);
Arm1.setTextureSize(64, 64);
Arm1.mirror = true;
setRotation(Arm1, 0F, -1.570796F, 1.570796F);
Elbow2 = new ModelRenderer(this, 55, 37);
Elbow2.addBox(-1F, 0F, -1F, 2, 10, 2);
Elbow2.setRotationPoint(3F, 3F, 0F);
Elbow2.setTextureSize(64, 64);
Elbow2.mirror = true;
setRotation(Elbow2, 0F, -0.5235988F, -1.570796F);
Arm2 = new ModelRenderer(this, 46, 46);
Arm2.addBox(-1F, 0F, -1F, 2, 15, 2);
Arm2.setRotationPoint(11F, 3F, 4F);
Arm2.setTextureSize(64, 64);
Arm2.mirror = true;
setRotation(Arm2, 0F, -1.570796F, 1.570796F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
super.render(entity, f, f1, f2, f3, f4, f5);
setRotationAngles(f, f1, f2, f3, f4, f5);
Leg1.renderWithRotation(f5);
Thigh1.renderWithRotation(f5);
Leg2.renderWithRotation(f5);
Thigh2.renderWithRotation(f5);
Leg3.renderWithRotation(f5);
Thigh3.renderWithRotation(f5);
Leg4.renderWithRotation(f5);
Thigh4.renderWithRotation(f5);
Head.renderWithRotation(f5);
Neck.renderWithRotation(f5);
Top_Body.renderWithRotation(f5);
Middle_Body.renderWithRotation(f5);
Bottom_Body.renderWithRotation(f5);
Elbow1.renderWithRotation(f5);
Arm1.renderWithRotation(f5);
Elbow2.renderWithRotation(f5);
Arm2.renderWithRotation(f5);

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
Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
}

}