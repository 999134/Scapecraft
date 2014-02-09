package potato;
 


import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.network.IGuiHandler;

public class TestCommonProxy implements IGuiHandler
{
	/** Used to store IExtendedEntityProperties data temporarily between player death and respawn */
	private static final Map<String, NBTTagCompound> extendedEntityData = new HashMap<String, NBTTagCompound>();
/**
 * Client side only register stuff...
 */
	public void registerRenderThings()
    {

    }

@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
  {
  // TODO Auto-generated method stub
  return null;
  }

@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
  {
  // TODO Auto-generated method stub
  return null;
  }

public Object getServerGuiElement1(int ID,
		net.minecraft.entity.player.EntityPlayer player,
		net.minecraft.world.World world, int x, int y, int z) {
	// TODO Auto-generated method stub
	return null;
}

public Object getClientGuiElement1(int ID,
		net.minecraft.entity.player.EntityPlayer player,
		net.minecraft.world.World world, int x, int y, int z) {
	// TODO Auto-generated method stub
	return null;
}



public ModelBiped getArmorModel(int id){
return null;
}

/**
* Adds an entity's custom data to the map for temporary storage
* @param compound An NBT Tag Compound that stores the IExtendedEntityProperties data only
*/
public static void storeEntityData(String name, NBTTagCompound compound)
{
extendedEntityData.put(name, compound);
}

/**
* Removes the compound from the map and returns the NBT tag stored for name or null if none exists
*/
public static NBTTagCompound getEntityData(String name)
{
return extendedEntityData.remove(name);
}


}