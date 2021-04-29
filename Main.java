package ru.fucktmgc.vOpGuard;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ru.fucktmgc.vOpGuard.Cmd.Check;

import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Logger;

public class Main extends JavaPlugin{
    public ArrayList<UUID> uuid = new ArrayList<>();
    public Main() {
    }
    private static Main instance;
    public static Main getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;
        this.getConfig();
        this.saveDefaultConfig();

        Bukkit.getServer().getPluginManager().registerEvents(new Check(this), this);
        Logger log = Logger.getLogger("");
        getCommand("check").setExecutor(new Check(this));
        log.info("§a| §fПлагин §dvCheck §7& §fВерсия плагина - §a1.0");
        log.info("§a| §fРазработчик - §e§nvk.com/fucktmgc");
    }
    public void onDisable() {
    }
    }

