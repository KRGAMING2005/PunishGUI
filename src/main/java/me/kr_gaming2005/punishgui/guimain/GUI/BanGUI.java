package me.kr_gaming2005.punishgui.guimain.GUI;

import me.kr_gaming2005.punishgui.guimain.commands.PunishCommand;
import me.kr_gaming2005.punishgui.guimain.messages.ChatUtill;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class BanGUI {
    public static void openBanGui(Player p){
        //Ban GUI
        Inventory Ban = Bukkit.createInventory(null, 54, ChatUtill.format("&4&lBan &6") + PunishCommand.baning);

        ItemStack Cat1 = new ItemStack(Material.DIAMOND_ORE);
        ItemMeta Cat1m = Cat1.getItemMeta();
        Cat1m.setDisplayName(ChatUtill.format("&a&lXray"));
        Cat1.setItemMeta(Cat1m);
        Ban.setItem(0, Cat1);

        ItemStack niv1 = new ItemStack(Material.PAPER);
        ItemMeta niv1m = niv1.getItemMeta();
        niv1m.setDisplayName(ChatUtill.format("&2&lXray-Första"));
        ArrayList<String> cat1niv1 = new ArrayList<>();
        cat1niv1.add(ChatUtill.format("&a14d"));
        niv1m.setLore(cat1niv1);
        niv1.setItemMeta(niv1m);
        Ban.setItem(9, niv1);

        ItemStack niv2 = new ItemStack(Material.PAPER);
        ItemMeta niv2m = niv2.getItemMeta();
        niv2m.setDisplayName(ChatUtill.format("&2&lXray-Andra"));
        ArrayList<String> cat1niv2 = new ArrayList<>();
        cat1niv2.add(ChatUtill.format("&a30d"));
        niv2m.setLore(cat1niv2);
        niv2.setItemMeta(niv2m);
        Ban.setItem(18, niv2);

        ItemStack niv3 = new ItemStack(Material.PAPER);
        ItemMeta niv3m = niv3.getItemMeta();
        niv3m.setDisplayName(ChatUtill.format("&2&lXray-Tredje"));
        ArrayList<String> cat1niv3 = new ArrayList<>();
        cat1niv3.add(ChatUtill.format("&a60d"));
        niv3m.setLore(cat1niv3);
        niv3.setItemMeta(niv3m);
        Ban.setItem(27, niv3);

        ItemStack niv4 = new ItemStack(Material.PAPER);
        ItemMeta niv4m = niv4.getItemMeta();
        niv4m.setDisplayName(ChatUtill.format("&2&lXray-Fjärde"));
        ArrayList<String> cat1niv4 = new ArrayList<>();
        cat1niv4.add(ChatUtill.format("&a90d"));
        niv4m.setLore(cat1niv4);
        niv4.setItemMeta(niv4m);
        Ban.setItem(36, niv4);

        ItemStack niv5 = new ItemStack(Material.PAPER);
        ItemMeta niv5m = niv5.getItemMeta();
        niv5m.setDisplayName(ChatUtill.format("&2&lXray-Femte"));
        ArrayList<String> cat1niv5 = new ArrayList<>();
        cat1niv5.add(ChatUtill.format("&aPermban"));
        niv5m.setLore(cat1niv5);
        niv5.setItemMeta(niv5m);
        Ban.setItem(45, niv5);

        ItemStack cat2 = new ItemStack(Material.TNT);
        ItemMeta cat2m = cat2.getItemMeta();
        cat2m.setDisplayName(ChatUtill.format("&a&lGreifing"));
        cat2.setItemMeta(cat2m);
        Ban.setItem(1, cat2);


        ItemStack cat2niv1 = new ItemStack(Material.PAPER);
        ItemMeta cat2niv1m = cat2niv1.getItemMeta();
        cat2niv1m.setDisplayName(ChatUtill.format("&2&lGreif-Första"));
        ArrayList<String> cat2niv1l = new ArrayList<>();
        cat2niv1l.add(ChatUtill.format("&a30d"));
        cat2niv1m.setLore(cat2niv1l);
        cat2niv1.setItemMeta(cat2niv1m);
        Ban.setItem(10, cat2niv1);

        ItemStack cat2niv2 = new ItemStack(Material.PAPER);
        ItemMeta cat2niv2m = cat2niv2.getItemMeta();
        cat2niv2m.setDisplayName(ChatUtill.format("&2&lGreif-Andra"));
        ArrayList<String> cat2niv2l = new ArrayList<>();
        cat2niv2l.add(ChatUtill.format("&a60d"));
        cat2niv2m.setLore(cat2niv2l);
        cat2niv2.setItemMeta(cat2niv2m);
        Ban.setItem(19, cat2niv2);

        ItemStack cat2niv3 = new ItemStack(Material.PAPER);
        ItemMeta cat2niv3m = cat2niv3.getItemMeta();
        cat2niv3m.setDisplayName(ChatUtill.format("&2&lGreif-Tredje"));
        ArrayList<String> cat2niv3l = new ArrayList<>();
        cat2niv3l.add(ChatUtill.format("&a90d"));
        cat2niv3m.setLore(cat2niv3l);
        cat2niv3.setItemMeta(cat2niv3m);
        Ban.setItem(28, cat2niv3);

        ItemStack cat2niv4 = new ItemStack(Material.PAPER);
        ItemMeta cat2niv4m = cat2niv4.getItemMeta();
        cat2niv4m.setDisplayName(ChatUtill.format("&2&lGreif-Fjärde"));
        ArrayList<String> cat2niv4l = new ArrayList<>();
        cat2niv4l.add(ChatUtill.format("&aPermban"));
        cat2niv4m.setLore(cat2niv4l);
        cat2niv4.setItemMeta(cat2niv4m);
        Ban.setItem(37, cat2niv4);

        p.openInventory(Ban);
    }

}
