
package com.apocalypse.escape;

import org.bukkit.plugin.java.JavaPlugin;

public class ApocalypseEscape extends JavaPlugin {

    public void onEnable(){
        getLogger().info("Apocalypse Escape FULL PACK enabled");
        getServer().getPluginManager().registerEvents(new InfectionSystem(), this);
        getCommand("escape").setExecutor(new EscapeCommand());
    }
}
