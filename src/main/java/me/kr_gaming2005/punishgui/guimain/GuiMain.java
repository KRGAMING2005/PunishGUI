package me.kr_gaming2005.punishgui.guimain;

import me.kr_gaming2005.punishgui.guimain.Listeners.GUIClick;
import me.kr_gaming2005.punishgui.guimain.commands.PunishCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GuiMain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getConfig().set("prefix", "&2&l90DeQ >> ");
        getConfig().set("invalidArg", "&cArgs: /punish <Namn>");

        Bukkit.getPluginManager().registerEvents(new GUIClick(), this);

        getCommand("punish").setExecutor(new PunishCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
