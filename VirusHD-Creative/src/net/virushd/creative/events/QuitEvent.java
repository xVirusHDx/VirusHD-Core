package net.virushd.creative.events;

import net.virushd.creative.main.PlayerManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitEvent implements Listener{

	@EventHandler
	public void onQuit (PlayerQuitEvent e) {
		PlayerManager.leave(e.getPlayer());
	}
}
