package me.deathHeads;

import me.deathHeads.commands.TopKillsCommand;
import me.deathHeads.listeners.DeathListener;
import me.deathHeads.listeners.KillListener;
import me.deathHeads.managers.HeadManager;
import me.deathHeads.managers.KillManager;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathHeads extends JavaPlugin {

    private KillManager killManager;
    private HeadManager headManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        this.killManager = new KillManager(this);
        this.headManager = new HeadManager();

        getServer().getPluginManager().registerEvents(new DeathListener(this), this);
        getServer().getPluginManager().registerEvents(new KillListener(this), this);

        getCommand("topkills").setExecutor(new TopKillsCommand(this));
    }

    public KillManager getKillManager() {
        return killManager;
    }

    public HeadManager getHeadManager() {
        return headManager;
    }
}