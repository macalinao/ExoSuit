/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.celestiusmc.exosuit;

import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ExoSuit main class.
 */
public class ExoSuit extends JavaPlugin {

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "Plugin disabled.");
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ExoSuitListener(), this);
        getLogger().log(Level.INFO, "Plugin enabled.");
    }
    
}
