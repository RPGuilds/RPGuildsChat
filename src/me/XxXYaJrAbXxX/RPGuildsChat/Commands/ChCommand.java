package me.XxXYaJrAbXxX.RPGuildsChat.Commands;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import me.XxXYaJrAbXxX.RPGuildsChat.DataManipulation.GetData;

public class ChCommand {
	private static JavaPlugin thisPlugin;
	private static JavaPlugin RPGuildsAPI;
	private static GetData GetData = new GetData(thisPlugin, RPGuildsAPI);
	
	public ChCommand(JavaPlugin thisPlugin, JavaPlugin RPGuildsAPI, GetData GetData) {
		ChCommand.thisPlugin = thisPlugin;
		ChCommand.RPGuildsAPI = RPGuildsAPI;
		ChCommand.GetData = GetData;
	}
	
	public static void Channels(CommandSender sender, String[] args) {
		
	}

}
