package me.XxXYaJrAbXxX.RPGuildsChat.GetData;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class GetData {
	private static JavaPlugin plugin;
	private static JavaPlugin RPGuildsChat;
	
	public GetData(JavaPlugin plugin, JavaPlugin RPGuildsChat) {
		GetData.plugin = plugin;
		GetData.RPGuildsChat = RPGuildsChat;
	}
	
	public Object getFromAPI(String player, String path) {
		Config PlayerData = new Config(plugin, File.separator + player);
		return PlayerData.get(path);
	}
	
	public String getChannels(String data) {
		Config ChannelData = new Config(RPGuildsChat, File.separator + "Channels");
		return ChannelData.getString(data);
	}
}