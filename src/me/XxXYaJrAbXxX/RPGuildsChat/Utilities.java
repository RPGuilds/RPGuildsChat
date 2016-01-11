package me.XxXYaJrAbXxX.RPGuildsChat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import me.XxXYaJrAbXxX.RPGuildsChat.GetData.*;

public class Utilities extends JavaPlugin {
	private me.XxXYaJrAbXxX.Characters.Utilities pluginRPGuildsAPI;
	private JavaPlugin RPGuildsAPI = pluginRPGuildsAPI.RPGuildsAPI;
	private GetData GetData = new GetData(RPGuildsAPI, this);
	
	//This will error until another method has been added (Command method)
	@Override
	public void OnEnable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
	}

}
