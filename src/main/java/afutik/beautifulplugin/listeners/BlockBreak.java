package afutik.beautifulplugin.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {
    @EventHandler
    private void playerBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();

        if (player.getInventory().getItemInMainHand().getType().equals(Material.WOODEN_SWORD)) {
            e.setCancelled(true);
        }
    }

}
