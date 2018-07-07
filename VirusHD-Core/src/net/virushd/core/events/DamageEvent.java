package net.virushd.core.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import net.virushd.core.main.CoreMain;

public class DamageEvent implements Listener{

	@EventHandler
	public void onDamage (EntityDamageEvent e) {
		if (e.getEntity() instanceof Player) {
			Player p = (Player) e.getEntity();
			if (CoreMain.players.contains(p)) {
				e.setCancelled(true);
			}
		}
	}
}