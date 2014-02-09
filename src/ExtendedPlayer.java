package net.minecraft.src;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import potato.TestCommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties
{
/*
Here I create a constant EXT_PROP_NAME for this class of properties. You need a unique name for every instance of IExtendedEntityProperties you make, and doing it at the top of each class as a constant makes
it very easy to organize and avoid typos. It's easiest to keep the same constant name in every class, as it will be distinguished by the class name: ExtendedPlayer.EXT_PROP_NAME vs. ExtendedEntity.EXT_PROP_NAME

Note that a single entity can have multiple extended properties, so each property should have a unique name. Try to come up with something more unique than the tutorial example.
*/
public final static String EXT_PROP_NAME = "ExtendedPlayer";
//public static final byte COMBAT = 0, AGILITY = 1;
// I always include the entity to which the properties belong for easy access
// It's final because we won't be changing which player it is
private final EntityPlayer player;

// Declare other variables you want to add here

// We're adding mana to the player, so we'll need current and max mana
private int combatxp;
private int agilityxp;


/*
The default constructor takes no arguments, but I put in the Entity so I can initialize the above variable 'player'

Also, it's best to initialize any other variables you may have added, just like in any constructor.
*/
public ExtendedPlayer(EntityPlayer player)
{
this.player = player;
// Start with 0 xp. Every player starts with the same amount.
this.combatxp = 0;
this.agilityxp = 0;

}

/**
* Used to register these extended properties for the player during EntityConstructing event
* This method is for convenience only; it will make your code look nicer
*/
public static final void register(EntityPlayer player)
{
player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player));
}

/**
* Returns ExtendedPlayer properties for player
* This method is for convenience only; it will make your code look nicer
*/
public static final ExtendedPlayer get(EntityPlayer player)
{
return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
}


// Save any custom data that needs saving here
@Override
public void saveNBTData(NBTTagCompound compound)
{
// We need to create a new tag compound that will save everything for our Extended Properties
NBTTagCompound properties = new NBTTagCompound();

// We only have 2 variables currently; save them both to the new tag
properties.setInteger("combatxp", this.combatxp);
properties.setInteger("agilityxp", this.agilityxp);
/*
Now add our custom tag to the player's tag with a unique name (our property's name). This will allow you to save multiple types of properties and distinguish between them. If you only have one type, it isn't as important, but it will still avoid conflicts between your tag names and vanilla tag names. For instance, if you add some "Items" tag, that will conflict with vanilla. Not good. So just use a unique tag name.
*/
compound.setTag(EXT_PROP_NAME, properties);
}


private static String getSaveKey(EntityPlayer player) {
return player.username + ":" + EXT_PROP_NAME;
}
public static void saveProxyData(EntityPlayer player) {
ExtendedPlayer playerData = ExtendedPlayer.get(player);
NBTTagCompound savedData = new NBTTagCompound();

playerData.saveNBTData(savedData);
// Note that we made the CommonProxy method storeEntityData static,
// so now we don't need an instance of CommonProxy to use it! Great!
TestCommonProxy.storeEntityData(getSaveKey(player), savedData);
}
public static void loadProxyData(EntityPlayer player) {
ExtendedPlayer playerData = ExtendedPlayer.get(player);
NBTTagCompound savedData = TestCommonProxy.getEntityData(getSaveKey(player));

if(savedData != null) {
playerData.loadNBTData(savedData);
}
playerData.sync();
}

// Load whatever data you saved
@Override
public void loadNBTData(NBTTagCompound compound)
{
NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);

this.combatxp = properties.getInteger("combatxp");
this.agilityxp = properties.getInteger("agilityxp");
}

@Override
public void init(Entity entity, World world)
{
}


public boolean checkcombatxp(int amount)
{
boolean sufficient = amount <= this.combatxp;
this.combatxp -= (amount < this.combatxp? amount : this.combatxp);
return sufficient;
}


public boolean checkagilityxp(int amount)
{
boolean sufficient = amount <= this.agilityxp;
this.agilityxp -= (amount < this.agilityxp? amount : this.agilityxp);
return sufficient;
}


public void addXp(int amount) { 
	this.combatxp += amount;
System.out.println(this.combatxp);
}

public void addAXp(int amount) { 
	this.agilityxp += amount;
System.out.println(this.agilityxp);
}



public int getAgilityxp(){

	return agilityxp;
}


public int getCombatxp(){

	return combatxp;
}


public final void sync()
{
ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
DataOutputStream outputStream = new DataOutputStream(bos);

try {
//	outputStream.writeByte(COMBAT);
//	outputStream.writeByte(AGILITY);
outputStream.writeInt(this.combatxp);
outputStream.writeInt(this.agilityxp);
} 
catch (Exception ex) {ex.printStackTrace();}


Packet250CustomPayload packet = new Packet250CustomPayload("tutchannel", bos.toByteArray());
if (FMLCommonHandler.instance().getEffectiveSide().isServer()) {
	EntityPlayerMP player1 = (EntityPlayerMP) player;
	PacketDispatcher.sendPacketToPlayer(packet, (Player)player1);
	}
}



public void setcombatxp(int amount)
{
this.combatxp = amount;	
this.sync();
}

public void setagilityxp(int amount)
{
this.agilityxp = amount;	
this.sync();
}




}