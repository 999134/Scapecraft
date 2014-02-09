package net.minecraft.src;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class CustomConnectionHandler implements IConnectionHandler
{


@Override
public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager){}

@Override
public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager){return null;}

@Override
public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager){}

@Override
public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager){}




@Override
public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login)
{

{
ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\u00a76You are running [1.6.4]Scapecraft V14.0, make sure to check out the massive official server running this mod and the runescape map, details are on the offical download page");

}
}

@Override
public void connectionClosed(INetworkManager manager) {

	
}
}