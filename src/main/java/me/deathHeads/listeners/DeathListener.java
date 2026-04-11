package me.deathHeads.listeners;

import me.deathHeads.DeathHeads;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Random;

public class DeathListener implements Listener {

    private final DeathHeads plugin;

    public DeathListener(DeathHeads plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {

        Player player = event.getEntity();

        // 💀 save head collection
        plugin.getHeadManager().addHead(player.getUniqueId(), player.getName());

        // ⚔️ drop head
        if (!plugin.getConfig().getBoolean("head-drop.enabled")) return;

        if (new Random().nextDouble() * 100 > plugin.getConfig().getDouble("head-drop.chance")) return;

        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) head.getItemMeta();

        meta.setOwningPlayer(player);
        meta.setDisplayName("§cTête de " + player.getName());

        head.setItemMeta(meta);

        player.getWorld().dropItemNaturally(player.getLocation(), head);
    }
}