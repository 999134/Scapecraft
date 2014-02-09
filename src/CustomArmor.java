package net.minecraft.src;

import potato.TestClientProxy;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomArmor extends ItemArmor{

	public CustomArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armornamePrefix)
    {
	super(par1, par2EnumArmorMaterial, par3, par4);
       
    }




@Override
public String getArmorTexture(ItemStack stack, Entity entity, int slot,
String type) {
if (stack.itemID == mod_phat.chest.itemID || stack.itemID == mod_phat.boots.itemID || stack.itemID == mod_phat.helmet.itemID) {
	return "minecraft:" + "bandos" + "_1.png";
}
if (stack.itemID == mod_phat.legs.itemID) {
	 return "minecraft:" + "bandos" + "_2.png";
}
return null; 
}

@Override
public void registerIcons(IconRegister iconReg) 

{
if(itemID == mod_phat.boots.itemID)
{
itemIcon = iconReg.registerIcon("BandosLegs");
}
else if(itemID == mod_phat.legs.itemID)
{
itemIcon = iconReg.registerIcon("BandosLegs");
}
else if(itemID == mod_phat.chest.itemID)
{
itemIcon = iconReg.registerIcon("BandosBody");
}
else if(itemID == mod_phat.helmet.itemID)
{
itemIcon = iconReg.registerIcon("berserker");
}
}



@Override
@SideOnly(Side.CLIENT)
public ModelBiped getArmorModel(EntityLivingBase entityLiving,
ItemStack itemStack, int armorSlot) {
	ModelBiped armorModel = new ModelBiped();
if(itemStack != null){
if(itemStack.getItem() instanceof CustomArmor){
int type = ((ItemArmor)itemStack.getItem()).armorType;

                         if(type == 1 || type == 3){
                                 armorModel = mod_phat.proxy.getArmorModel(0);
                         }else{
                                 armorModel = mod_phat.proxy.getArmorModel(1);
                         }
}
if(armorModel != null){
armorModel.bipedHead.showModel = armorSlot == 0;
armorModel.bipedHeadwear.showModel = armorSlot == 0;
armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
armorModel.bipedRightArm.showModel = armorSlot == 1;
armorModel.bipedLeftArm.showModel = armorSlot == 1;
armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;

armorModel.isSneak = entityLiving.isSneaking();
armorModel.isRiding = entityLiving.isRiding();
armorModel.isChild = entityLiving.isChild();
armorModel.heldItemRight = entityLiving.getCurrentItemOrArmor(0) != null ? 1 :0;
if(entityLiving instanceof EntityPlayer){
armorModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
}
return armorModel;
}
}

return null;
}
}
