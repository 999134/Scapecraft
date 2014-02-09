package net.minecraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVeracFlail extends ModelBase
{
  //fields
    ModelRenderer GreenBall;
    ModelRenderer VertTopCase;
    ModelRenderer VertBotCase;
    ModelRenderer VertLeftCase;
    ModelRenderer VertRightCase;
    ModelRenderer HorizFrontCase;
    ModelRenderer HorizRightCase;
    ModelRenderer HorizLeftCase;
    ModelRenderer HorizBackCase;
    ModelRenderer FrontLink2;
    ModelRenderer RightLink2;
    ModelRenderer FrontLink1;
    ModelRenderer RightLink1;
    ModelRenderer TopLink;
    ModelRenderer LinkHolder;
    ModelRenderer Handle;
    ModelRenderer HorizFrontSpike;
    ModelRenderer HorizRightSpike;
    ModelRenderer HorizBackSpike;
    ModelRenderer HorizLeftSpike;
    ModelRenderer VertBotSpike;
    ModelRenderer LeftLink1;
    ModelRenderer LeftLink2;
    ModelRenderer BackLink1;
    ModelRenderer BackLink2;
  
  public ModelVeracFlail()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      GreenBall = new ModelRenderer(this, 1, 1);
      GreenBall.addBox(0F, 0F, 0F, 3, 3, 3);
      GreenBall.setRotationPoint(0F, 15F, 0F);
      GreenBall.setTextureSize(64, 32);
      GreenBall.mirror = true;
      setRotation(GreenBall, 0F, 0F, 0F);
      VertTopCase = new ModelRenderer(this, 2, 8);
      VertTopCase.addBox(0F, 0F, 0F, 4, 1, 1);
      VertTopCase.setRotationPoint(-0.5F, 13.8F, 1F);
      VertTopCase.setTextureSize(64, 32);
      VertTopCase.mirror = true;
      setRotation(VertTopCase, 0F, 0F, 0F);
      VertBotCase = new ModelRenderer(this, 2, 8);
      VertBotCase.addBox(0F, 0F, 0F, 4, 1, 1);
      VertBotCase.setRotationPoint(-0.5F, 18.2F, 1F);
      VertBotCase.setTextureSize(64, 32);
      VertBotCase.mirror = true;
      setRotation(VertBotCase, 0F, 0F, 0F);
      VertLeftCase = new ModelRenderer(this, 5, 11);
      VertLeftCase.addBox(0F, 0F, 0F, 1, 4, 1);
      VertLeftCase.setRotationPoint(3.2F, 14.5F, 1F);
      VertLeftCase.setTextureSize(64, 32);
      VertLeftCase.mirror = true;
      setRotation(VertLeftCase, 0F, 0F, 0F);
      VertRightCase = new ModelRenderer(this, 5, 11);
      VertRightCase.addBox(0F, 0F, 0F, 1, 4, 1);
      VertRightCase.setRotationPoint(-1.2F, 14.5F, 1F);
      VertRightCase.setTextureSize(64, 32);
      VertRightCase.mirror = true;
      setRotation(VertRightCase, 0F, 0F, 0F);
      HorizFrontCase = new ModelRenderer(this, 2, 8);
      HorizFrontCase.addBox(0F, 0F, 0F, 4, 1, 1);
      HorizFrontCase.setRotationPoint(-0.5F, 16F, -1.2F);
      HorizFrontCase.setTextureSize(64, 32);
      HorizFrontCase.mirror = true;
      setRotation(HorizFrontCase, 0F, 0F, 0F);
      HorizRightCase = new ModelRenderer(this, 3, 17);
      HorizRightCase.addBox(0F, 0F, 0F, 1, 1, 4);
      HorizRightCase.setRotationPoint(-1.2F, 16F, -0.5F);
      HorizRightCase.setTextureSize(64, 32);
      HorizRightCase.mirror = true;
      setRotation(HorizRightCase, 0F, 0F, 0F);
      HorizLeftCase = new ModelRenderer(this, 3, 17);
      HorizLeftCase.addBox(0F, 0F, 0F, 1, 1, 4);
      HorizLeftCase.setRotationPoint(3.2F, 16F, -0.5F);
      HorizLeftCase.setTextureSize(64, 32);
      HorizLeftCase.mirror = true;
      setRotation(HorizLeftCase, 0F, 0F, 0F);
      HorizBackCase = new ModelRenderer(this, 2, 8);
      HorizBackCase.addBox(0F, 0F, 0F, 4, 1, 1);
      HorizBackCase.setRotationPoint(-0.5F, 16F, 3.2F);
      HorizBackCase.setTextureSize(64, 32);
      HorizBackCase.mirror = true;
      setRotation(HorizBackCase, 0F, 0F, 0F);
      FrontLink2 = new ModelRenderer(this, 4, 26);
      FrontLink2.addBox(0F, 0F, 0F, 1, 2, 1);
      FrontLink2.setRotationPoint(1F, 12F, 0.3F);
      FrontLink2.setTextureSize(64, 32);
      FrontLink2.mirror = true;
      setRotation(FrontLink2, 0F, 0F, 0F);
      RightLink2 = new ModelRenderer(this, 4, 26);
      RightLink2.addBox(0F, 0F, 0F, 1, 2, 1);
      RightLink2.setRotationPoint(0.3F, 10F, 1F);
      RightLink2.setTextureSize(64, 32);
      RightLink2.mirror = true;
      setRotation(RightLink2, 0F, 0F, 0F);
      FrontLink1 = new ModelRenderer(this, 4, 25);
      FrontLink1.addBox(0F, 0F, 0F, 1, 2, 1);
      FrontLink1.setRotationPoint(1F, 8F, 0.2F);
      FrontLink1.setTextureSize(64, 32);
      FrontLink1.mirror = true;
      setRotation(FrontLink1, 0F, 0F, 0F);
      RightLink1 = new ModelRenderer(this, 4, 25);
      RightLink1.addBox(0F, 0F, 0F, 1, 2, 1);
      RightLink1.setRotationPoint(0.3F, 6F, 1F);
      RightLink1.setTextureSize(64, 32);
      RightLink1.mirror = true;
      setRotation(RightLink1, 0F, 0F, 0F);
      TopLink = new ModelRenderer(this, 4, 25);
      TopLink.addBox(0F, 0F, 0F, 1, 2, 1);
      TopLink.setRotationPoint(1F, 4F, 1F);
      TopLink.setTextureSize(64, 32);
      TopLink.mirror = true;
      setRotation(TopLink, 0F, 0F, 0F);
      LinkHolder = new ModelRenderer(this, 14, 2);
      LinkHolder.addBox(0F, 0F, 0F, 2, 1, 2);
      LinkHolder.setRotationPoint(0.5F, 5F, 1F);
      LinkHolder.setTextureSize(64, 32);
      LinkHolder.mirror = true;
      setRotation(LinkHolder, 0.8179294F, 0F, 0F);
      Handle = new ModelRenderer(this, 18, 13);
      Handle.addBox(-0.5F, -1F, -0.5F, 1, 17, 1);
      Handle.setRotationPoint(1.5F, 5F, 2.5F);
      Handle.setTextureSize(64, 32);
      Handle.mirror = true;
      setRotation(Handle, 0.8179294F, 0F, 0F);
      HorizFrontSpike = new ModelRenderer(this, 16, 7);
      HorizFrontSpike.addBox(0F, 0F, -1F, 1, 1, 2);
      HorizFrontSpike.setRotationPoint(1F, 16F, -2F);
      HorizFrontSpike.setTextureSize(64, 32);
      HorizFrontSpike.mirror = true;
      setRotation(HorizFrontSpike, 0F, 0F, 0F);
      HorizRightSpike = new ModelRenderer(this, 10, 13);
      HorizRightSpike.addBox(-1F, 0F, 0F, 2, 1, 1);
      HorizRightSpike.setRotationPoint(-2F, 16F, 1F);
      HorizRightSpike.setTextureSize(64, 32);
      HorizRightSpike.mirror = true;
      setRotation(HorizRightSpike, 0F, 0F, 0F);
      HorizBackSpike = new ModelRenderer(this, 16, 7);
      HorizBackSpike.addBox(0F, 0F, -1F, 1, 1, 2);
      HorizBackSpike.setRotationPoint(1F, 16F, 5F);
      HorizBackSpike.setTextureSize(64, 32);
      HorizBackSpike.mirror = true;
      setRotation(HorizBackSpike, 0F, 0F, 0F);
      HorizLeftSpike = new ModelRenderer(this, 10, 13);
      HorizLeftSpike.addBox(0F, 0F, 0F, 2, 1, 1);
      HorizLeftSpike.setRotationPoint(4F, 16F, 1F);
      HorizLeftSpike.setTextureSize(64, 32);
      HorizLeftSpike.mirror = true;
      setRotation(HorizLeftSpike, 0F, 0F, 0F);
      VertBotSpike = new ModelRenderer(this, 23, 10);
      VertBotSpike.addBox(0F, 0F, 0F, 1, 2, 1);
      VertBotSpike.setRotationPoint(1F, 19F, 1F);
      VertBotSpike.setTextureSize(64, 32);
      VertBotSpike.mirror = true;
      setRotation(VertBotSpike, 0F, 0F, 0F);
      LeftLink1 = new ModelRenderer(this, 4, 25);
      LeftLink1.addBox(0F, 0F, 0F, 1, 2, 1);
      LeftLink1.setRotationPoint(1.6F, 6F, 1F);
      LeftLink1.setTextureSize(64, 32);
      LeftLink1.mirror = true;
      setRotation(LeftLink1, 0F, 0F, 0F);
      LeftLink2 = new ModelRenderer(this, 4, 25);
      LeftLink2.addBox(0F, 0F, 0F, 1, 2, 1);
      LeftLink2.setRotationPoint(1.6F, 10F, 1F);
      LeftLink2.setTextureSize(64, 32);
      LeftLink2.mirror = true;
      setRotation(LeftLink2, 0F, 0F, 0F);
      BackLink1 = new ModelRenderer(this, 4, 25);
      BackLink1.addBox(0F, 0F, 0F, 1, 2, 1);
      BackLink1.setRotationPoint(1F, 8F, 1.6F);
      BackLink1.setTextureSize(64, 32);
      BackLink1.mirror = true;
      setRotation(BackLink1, 0F, 0F, 0F);
      BackLink2 = new ModelRenderer(this, 4, 26);
      BackLink2.addBox(0F, 0F, 0F, 1, 2, 1);
      BackLink2.setRotationPoint(1F, 12F, 1.6F);
      BackLink2.setTextureSize(64, 32);
      BackLink2.mirror = true;
      setRotation(BackLink2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    GreenBall.render(f5);
    VertTopCase.render(f5);
    VertBotCase.render(f5);
    VertLeftCase.render(f5);
    VertRightCase.render(f5);
    HorizFrontCase.render(f5);
    HorizRightCase.render(f5);
    HorizLeftCase.render(f5);
    HorizBackCase.render(f5);
    FrontLink2.render(f5);
    RightLink2.render(f5);
    FrontLink1.render(f5);
    RightLink1.render(f5);
    TopLink.render(f5);
    LinkHolder.render(f5);
    Handle.render(f5);
    HorizFrontSpike.render(f5);
    HorizRightSpike.render(f5);
    HorizBackSpike.render(f5);
    HorizLeftSpike.render(f5);
    VertBotSpike.render(f5);
    LeftLink1.render(f5);
    LeftLink2.render(f5);
    BackLink1.render(f5);
    BackLink2.render(f5);
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
