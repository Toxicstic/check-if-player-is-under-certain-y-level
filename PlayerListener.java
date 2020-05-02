package me.toy.SpeedBridgeTrainer;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener {
	
	@EventHandler
	public boolean onMove(PlayerMoveEvent event) {
		Location loc = new Location (Bukkit.getWorld("world"), 0, 100, 0, 0, 0);
		if (event.getTo().getY() < 59) {
			event.getPlayer().teleport(loc);
			return true;
		}
		return false;
	}
}
