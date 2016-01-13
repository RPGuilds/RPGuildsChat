package me.XxXYaJrAbXxX.RPGuildsChat.Commands;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import me.XxXYaJrAbXxX.RPGuildsChat.DataManipulation.GetData;

public class ChannelCommand {
	private static JavaPlugin thisPlugin;
	private static JavaPlugin RPGuildsAPI;
	private static GetData GetData = new GetData(thisPlugin, RPGuildsAPI);
	
	public ChannelCommand(JavaPlugin thisPlugin, JavaPlugin RPGuildsAPI, GetData GetData) {
		ChannelCommand.thisPlugin = thisPlugin;
		ChannelCommand.RPGuildsAPI = RPGuildsAPI;
		ChannelCommand.GetData = GetData;
	}
	
	public static void Channels(CommandSender sender, String[] args) {
		
	}

}
