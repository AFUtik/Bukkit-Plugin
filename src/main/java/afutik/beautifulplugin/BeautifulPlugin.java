package afutik.beautifulplugin;

import afutik.beautifulplugin.commands.RollCommand;
import afutik.beautifulplugin.listeners.BlockBreak;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class BeautifulPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("roll").setExecutor(new RollCommand());
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new BlockBreak(), this);

        TabExtended.unable(this, 100);
    }
}
