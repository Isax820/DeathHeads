package me.deathHeads.listeners;

import me.deathHeads.DeathHeads;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillListener implements Listener {

    private final DeathHeads plugin;

    public KillListener(DeathHeads plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onKill(PlayerDeathEvent event) {

        Player killer = event.getEntity().getKiller();
        if (killer == null) return;

        plugin.getKillManager().addKill(killer.getUniqueId());
    }
}