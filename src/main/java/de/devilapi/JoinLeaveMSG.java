package de.devilapi;

import de.devilapi.events.PlayerJoin;
import de.devilapi.events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeaveMSG extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
    }

    @Override
    public void onDisable() {
    }
}
