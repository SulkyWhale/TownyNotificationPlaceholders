package io.github.sulkywhale.townynotificationsplacholders;

import org.bukkit.plugin.java.JavaPlugin;

public class TownyNotificationPlaceholders extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TownyListener(), this);
        getLogger().info("Plugin enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled.");
    }
}
