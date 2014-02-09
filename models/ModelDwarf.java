package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;


public class ModelDwarf extends ModelBase
{
  //fields
ModelRenderer head;
ModelRenderer body;
ModelRenderer rightarm;
ModelRenderer leftarm;
ModelRenderer rightleg;
ModelRenderer leftleg;
ModelRenderer Beard;

  public ModelDwarf()
  {
textureWidth = 64;
textureHeight = 32;

  head = new ModelRenderer(this, 0, 0);
  head.addBox(-3F, -6F, -4F, 6, 6, 6);
  head.setRotationPoint(0F, 6F, 1F);
  head.setTextureSize(64, 32);
  head.mirror = true;
  setRotation(head, 0F, 0F, 0F);
  body = new ModelRenderer(this, 16, 16);
  body.addBox(-4F, 0F, -2F, 8, 10, 4);
  body.setRotationPoint(0F, 6F, 0F);
  body.setTextureSize(64, 32);
  body.mirror = true;
  setRotation(body, 0F, 0F, 0F);
  rightarm = new ModelRenderer(this, 40, 16);
  rightarm.addBox(-3F, -2F, -2F, 4, 9, 4);
  rightarm.setRotationPoint(-5F, 8F, 0F);
  rightarm.setTextureSize(64, 32);
  rightarm.mirror = true;
  setRotation(rightarm, 0F, 0F, 0F);
  leftarm = new ModelRenderer(this, 40, 16);
  leftarm.addBox(-1F, -2F, -2F, 4, 9, 4);
  leftarm.setRotationPoint(5F, 8F, 0F);
  leftarm.setTextureSize(64, 32);
  leftarm.mirror = true;
  setRotation(leftarm, 0F, 0F, 0F);
  rightleg = new ModelRenderer(this, 0, 16);
  rightleg.addBox(-2F, 0F, -2F, 4, 10, 4);
  rightleg.setRotationPoint(-2F, 14F, 0F);
  rightleg.setTextureSize(64, 32);
  rightleg.mirror = true;
  setRotation(rightleg, 0F, 0F, 0F);
  leftleg = new ModelRenderer(this, 0, 16);
  leftleg.addBox(-2F, 0F, -2F, 4, 10, 4);
  leftleg.setRotationPoint(2F, 14F, 0F);
  leftleg.setTextureSize(64, 32);
  leftleg.mirror = true;
  setRotation(leftleg, 0F, 0F, 0F);
  Beard = new ModelRenderer(this, 25, 0);
  Beard.addBox(-3F, 0F, -3F, 6, 4, 3);
  Beard.setRotationPoint(0F, 4F, -0.5F);
  Beard.setTextureSize(64, 32);
  Beard.mirror = true;
  setRotation(Beard, 0F, 0F, 0F);
  }

  
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
head.render(f5);
body.render(f5);
rightarm.render(f5);
leftarm.render(f5);
rightleg.render(f5);
leftleg.render(f5);
Beard.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
model.rotateAngleX = x;
model.rotateAngleY = y;
model.rotateAngleZ = z;
  }

  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
 	{
 		
 		 this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
 	        this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
 	  
 	        this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
 	        this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
 	        this.rightarm.rotateAngleZ = 0.0F;
 	        this.leftarm.rotateAngleZ = 0.0F;
 	        this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
 	        this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
 	        this.rightleg.rotateAngleY = 0.0F;
 	        this.leftleg.rotateAngleY = 0.0F;

 	        if (this.isRiding)
 	        {
 	            this.rightarm.rotateAngleX += -((float)Math.PI / 5F);
 	            this.leftarm.rotateAngleX += -((float)Math.PI / 5F);
 	            this.rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
 	            this.leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
 	            this.rightleg.rotateAngleY = ((float)Math.PI / 10F);
 	            this.leftleg.rotateAngleY = -((float)Math.PI / 10F);
 	        }

 	     

 	     

 	        this.rightarm.rotateAngleY = 0.0F;
 	        this.leftarm.rotateAngleY = 0.0F;
 	        float var8;
 	        float var9;

 	        if (this.onGround > -9990.0F)
 	        {
 	            var8 = this.onGround;
 	            this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(var8) * (float)Math.PI * 2.0F) * 0.2F;
 	            this.rightarm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
 	            this.rightarm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
 	            this.leftarm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
 	            this.leftarm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
 	            this.rightarm.rotateAngleY += this.body.rotateAngleY;
 	            this.leftarm.rotateAngleY += this.body.rotateAngleY;
 	            this.leftarm.rotateAngleX += this.body.rotateAngleY;
 	            var8 = 1.0F - this.onGround;
 	            var8 *= var8;
 	            var8 *= var8;
 	            var8 = 1.0F - var8;
 	            var9 = MathHelper.sin(var8 * (float)Math.PI);
 	            float var10 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
 	            this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)var9 * 1.2D + (double)var10));
 	            this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0F;
 	            this.rightarm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
 	        }

 	 
 	        else
 	        {
 	            this.body.rotateAngleX = 0.0F;
 	            this.rightleg.rotationPointZ = 0.1F;
 	            this.leftleg.rotationPointZ = 0.1F;
 	            this.rightleg.rotationPointY = 12.0F;
 	            this.leftleg.rotationPointY = 12.0F;
 	            this.head.rotationPointY = 0.0F;
 	   
 	        }

 	        this.rightarm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
 	        this.leftarm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
 	        this.rightarm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
 	        this.leftarm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;


 }}

