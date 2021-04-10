package me.configz1.joinleavemsg;

import me.configz1.joinleavemsg.events.PlayerJoin;
import me.configz1.joinleavemsg.events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeaveMSG extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
