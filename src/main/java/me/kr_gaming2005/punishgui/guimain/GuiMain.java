package me.kr_gaming2005.punishgui.guimain;

import me.kr_gaming2005.punishgui.guimain.Listeners.GUIClick;
import me.kr_gaming2005.punishgui.guimain.commands.PunishCommand;
import me.kr_gaming2005.punishgui.guimain.commands.WhitelistCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GuiMain extends JavaPlugin {

    public static String prefix;
    public static String invargs;
    public static String noperm;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();

        getConfig().set("prefix", "&2&lTheDeQ >> ");
        getConfig().set("invalidArg", "&cArgs: /punish <Namn>");
        getConfig().set("invalidWhitelistArg", "&cArgs: /punishwhitelist <add/remove> <name>");
        getConfig().set("noperm", "&cDu har inte tillgång till detta kommandot");
        prefix = getConfig().getString("prefix");
        invargs = getConfig().getString("inalidArg");
        noperm = getConfig().getString("noperm");

        Bukkit.getPluginManager().registerEvents(new GUIClick(), this);

        getCommand("punish").setExecutor(new PunishCommand());
        getCommand("punishwhitelist").setExecutor(new WhitelistCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
