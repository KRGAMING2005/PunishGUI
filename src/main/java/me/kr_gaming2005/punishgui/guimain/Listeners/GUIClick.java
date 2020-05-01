package me.kr_gaming2005.punishgui.guimain.Listeners;

import me.kr_gaming2005.punishgui.guimain.GUI.BanGUI;
import me.kr_gaming2005.punishgui.guimain.GUI.MuteGUI;
import me.kr_gaming2005.punishgui.guimain.commands.PunishCommand;
import me.kr_gaming2005.punishgui.guimain.messages.ChatUtill;
import org.bukkit.Bukkit;
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
            if(e.getCurrentItem().getType().equals(Material.BARRIER) && e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&4Ban"))){
                BanGUI.openBanGui(p);
            }else if(e.getCurrentItem().getType().equals(Material.GOLDEN_SWORD) && e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&aMute"))){
                MuteGUI.openMuteGUI(p);
            }
            e.setCancelled(true);
        }else if(e.getView().getTitle().equals(ChatUtill.format("&4&lBan &6" + PunishCommand.baning))) {
            if (e.getCurrentItem().getType().equals(Material.PAPER)) {
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lXray-Första"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " 14d Xray -s");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond_ore");
                    p.closeInventory();
                }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lXray-Andra"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " 30d Xray -s");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond_ore");
                    p.closeInventory();
                }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lXray-Tredje"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " 60d Xray -s");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond_ore");
                    p.closeInventory();
                }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lXray-Fjärde"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " 90d Xray -s");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond_ore");
                    p.closeInventory();
                }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lXray-Femte"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " Xray -s");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:clear " + PunishCommand.baning + " minecraft:diamond_ore");
                    p.closeInventory();
                }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lGreif-Första"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " 30d Griefing -s");
                }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lGreif-Andra"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " 60d Griefing -s");
                }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lGreif-Tredje"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " 90d Griefing -s");
                }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatUtill.format("&2&lGreif-Fjärde"))){
                    Bukkit.dispatchCommand(p, "ban " + PunishCommand.baning + " Griefing -s");
                }
            }
            e.setCancelled(true);
        }

    }

}

