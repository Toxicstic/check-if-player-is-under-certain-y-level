package me.toy.SpeedBridgeTrainer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin { 

	@Override
	public void onEnable(){
		
		getLogger().info("SpeedBridgeTrainer is turned on!");
		this.saveDefaultConfig();
		this.getConfig();
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
	}		
	
	public void onDisable(){ 
	}
}

