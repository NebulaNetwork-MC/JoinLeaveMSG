package de.devilapi.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {
    @EventHandler
    void onPlayerLeave(PlayerQuitEvent e) {

        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.GRAY + " left.");
    }
}

