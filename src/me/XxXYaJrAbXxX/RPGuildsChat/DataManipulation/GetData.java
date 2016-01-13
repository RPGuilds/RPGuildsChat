package me.XxXYaJrAbXxX.RPGuildsChat.DataManipulation;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class GetData {
	private static JavaPlugin thisPlugin;
	private static JavaPlugin RPGuildsChat;
	
	public GetData(JavaPlugin thisPlugin, JavaPlugin RPGuildsChat) {
		GetData.thisPlugin = thisPlugin;
		GetData.RPGuildsChat = RPGuildsChat;
	}
	
	public Object getFromAPI(String player, String path) {
		Config PlayerData = new Config(thisPlugin, File.separator + player);
		return PlayerData.get(path);
	}
	
	public String getChannels(String data) {
		Config ChannelData = new Config(RPGuildsChat, "Channels");
		return ChannelData.getString(data);
	}
}