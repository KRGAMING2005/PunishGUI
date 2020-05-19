package me.kr_gaming2005.punishgui.guimain.commands;

import me.kr_gaming2005.punishgui.guimain.GuiMain;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WhitelistCommand implements CommandExecutor {
    private static GuiMain plugin = GuiMain.getPlugin(GuiMain.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("punishwhitelist")){
           if(sender.hasPermission("punish.whitelist")){




           }
        }
        return false;
    }
}
