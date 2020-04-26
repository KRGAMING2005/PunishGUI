package me.kr_gaming2005.punishgui.guimain.Listeners;

import me.kr_gaming2005.punishgui.guimain.GUI.BanGUI;
import me.kr_gaming2005.punishgui.guimain.commands.PunishCommand;
import me.kr_gaming2005.punishgui.guimain.messages.ChatUtill;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIClick implements Listener {
    @EventHandler
    public void onInvClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getView().getTitle().equals(ChatUtill.format("&bVälj Typ"))){
            if(e.getCurrentItem().getType().equals(Material.BARRIER)){
                BanGUI.openBanGui(p);
            }
            e.setCancelled(true);
        }
    }




}
