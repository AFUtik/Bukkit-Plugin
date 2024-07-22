package afutik.beautifulplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class TabExtended {
    public static void unable(JavaPlugin plugin, int period) {
        new BukkitRunnable() {
            @Override
            public void run() {
                TabExtended.update();
            }
        }.runTaskTimer(plugin, 0, period);
    }

    private static void update() {
        double tps = Bukkit.getServer().getTPS()[0];
        int online = Bukkit.getOnlinePlayers().size();
        for (Player player : Bukkit.getOnlinePlayers()) {
            String tps_str =  "§7TPS: ";
            if (tps > 15) tps_str += "§2";
            else if (tps > 10) tps_str += "§e";
            else tps_str += "§4";

            String online_str = "§7Online: §f";
            player.setPlayerListFooter(online_str + online + "§r§7 | §r" + tps_str + String.format("%.2f", tps));
        }
    }
}
