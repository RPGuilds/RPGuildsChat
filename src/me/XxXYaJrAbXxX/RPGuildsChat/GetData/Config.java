package me.XxXYaJrAbXxX.RPGuildsChat.GetData;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Config extends YamlConfiguration {

	private JavaPlugin plugin;
	private JavaPlugin RPGuildsAPI;
	private JavaPlugin thisPlugin;
	private String fileName;
	private String fileLocation;

	public Config(JavaPlugin thisPlugin, JavaPlugin RPGuildsAPI) {
		this.thisPlugin = thisPlugin;
		this.RPGuildsAPI = RPGuildsAPI;
	}

	public Config(JavaPlugin plugin, String fileName) {
		this.plugin = plugin;
		this.fileName = fileName + (fileName.endsWith(".yml") ? "" : ".yml");
		if (plugin == RPGuildsAPI) {
			fileLocation = plugin.getDataFolder() + File.separator + "PlayerData";
		} else if (plugin == thisPlugin) {
			fileLocation = plugin.getDataFolder() + File.separator + "Data";
		}
		createFile();
	}

	public void createFile() {
		try {
			File file = new File(fileLocation, fileName);
			if (!file.exists()) {
				if (plugin.getResource(fileName) != null) {
					plugin.saveResource(fileName, false);
				} else {
					save(file);
				}
			} else {
				load(file);
				save(file);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void save() {
		try {
			save(new File(fileLocation, fileName));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
