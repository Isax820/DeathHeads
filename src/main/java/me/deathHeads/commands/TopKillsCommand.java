package me.deathHeads.commands;

import me.deathHeads.DeathHeads;
import org.bukkit.Bukkit;
import org.bukkit.command.*;

import java.util.*;

public class TopKillsCommand implements CommandExecutor {

    private final DeathHeads plugin;

    public TopKillsCommand(DeathHeads plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("§6🏆 Top Kills :");

        plugin.getKillManager().getAllKills()
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(10)
                .forEach(entry -> {

                    String name = Bukkit.getOfflinePlayer(entry.getKey()).getName();

                    sender.sendMessage("§e" + name + " §7- §c" + entry.getValue());
                });

        return true;
    }
}