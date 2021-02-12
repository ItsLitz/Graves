package me.litz.Graves;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import me.litz.Graves.events.GravesEvents;

public class Graves extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GravesEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Graves]: Plugin enabled on startup");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Graves]: Plugin disabled on shutdown");
    }
}
