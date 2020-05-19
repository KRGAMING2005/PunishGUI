package me.kr_gaming2005.punishgui.guimain.messages;

import me.kr_gaming2005.punishgui.guimain.GuiMain;
import org.bukkit.entity.Player;

public class MessagesManager {

    private static GuiMain plugin = GuiMain.getPlugin(GuiMain.class);


public static void ReturnUsage(Player p){

    p.sendMessage(ChatUtill.format(GuiMain.prefix + ));


}


}
