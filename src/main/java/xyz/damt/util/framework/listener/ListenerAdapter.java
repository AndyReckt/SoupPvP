package xyz.damt.util.framework.listener;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.damt.Soup;

public abstract class ListenerAdapter implements Listener {

    public final Soup soup = JavaPlugin.getPlugin(Soup.class);

    public ListenerAdapter() {
        soup.getServer().getPluginManager().registerEvents(this, soup);
    }

}