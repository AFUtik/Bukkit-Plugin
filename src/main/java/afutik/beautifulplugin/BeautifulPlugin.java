package afutik.beautifulplugin;

import afutik.beautifulplugin.commands.RollCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeautifulPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("roll").setExecutor(new RollCommand());
    }
}
