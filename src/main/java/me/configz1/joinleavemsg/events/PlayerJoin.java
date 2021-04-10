package me.configz1.joinleavemsg.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.GREEN + "Welcome to <servername>!" +ChatColor.RED + player.getDisplayName());

    }
}
