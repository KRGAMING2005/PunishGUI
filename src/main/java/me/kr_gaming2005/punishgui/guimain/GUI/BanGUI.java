package me.kr_gaming2005.punishgui.guimain.GUI;

import me.kr_gaming2005.punishgui.guimain.commands.PunishCommand;
import me.kr_gaming2005.punishgui.guimain.messages.ChatUtill;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BanGUI {
    public static void openBanGui(Player p){
        //Ban GUI
        Inventory Ban = Bukkit.createInventory(null, 54, ChatUtill.format("&4&lBan &6") + PunishCommand.baning);

        ItemStack Cat1 = new ItemStack(Material.PAPER);
        ItemMeta Cat1m = Cat1.getItemMeta();
        Cat1m.setDisplayName(ChatUtill.format("&a&lGrief, Stöld, Mord, Hack, Språk, Spam"));
        Cat1.setItemMeta(Cat1m);
        Ban.setItem(0, Cat1);

        ItemStack niv1 = new ItemStack(Material.LIME_WOOL);
        ItemMeta niv1m = niv1.getItemMeta();
        niv1m.setDisplayName(ChatUtill.format("&2&lFörsta"));
        niv1.setItemMeta(niv1m);
        Ban.setItem(9, niv1);

        p.openInventory(Ban);
    }

}
