package me.deathHeads.managers;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class KillManager {

    private final Map<UUID, Integer> kills = new HashMap<>();
    private final JavaPlugin plugin;

    public KillManager(JavaPlugin plugin) {
        this.plugin = plugin;
        load();
    }

    public void addKill(UUID uuid) {
        kills.put(uuid, getKills(uuid) + 1);
        save();
    }

    public int getKills(UUID uuid) {
        return kills.getOrDefault(uuid, 0);
    }

    public Map<UUID, Integer> getAllKills() {
        return kills;
    }

    public void save() {
        FileConfiguration cfg = plugin.getConfig();

        for (UUID uuid : kills.keySet()) {
            cfg.set("kills." + uuid, kills.get(uuid));
        }

        plugin.saveConfig();
    }

    public void load() {
    FileConfiguration cfg = plugin.getConfig();

    if (cfg.getConfigurationSection("kills") == null) return;

    for (String key : cfg.getConfigurationSection("kills").getKeys(false)) {

        try {
            UUID uuid = UUID.fromString(key);
            kills.put(uuid, cfg.getInt("kills." + key));

        } catch (IllegalArgumentException e) {
            plugin.getLogger().warning("UUID invalide ignoré dans config : " + key);
        }
    }
}
}