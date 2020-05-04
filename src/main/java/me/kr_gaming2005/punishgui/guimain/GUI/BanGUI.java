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

        //Xray

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

        //Griefing

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

        //Stöld

        ItemStack cat3 = new ItemStack(Material.GOLD_INGOT);
        ItemMeta cat3m = cat3.getItemMeta();
        cat3m.setDisplayName(ChatUtill.format("&a&lStöld"));
        cat3.setItemMeta(cat3m);
        Ban.setItem(2, cat3);
        p.openInventory(Ban);

        ItemStack cat3niv1 = new ItemStack(Material.PAPER);
        ItemMeta cat3niv1m = cat3niv1.getItemMeta();
        cat3niv1m.setDisplayName(ChatUtill.format("&2&lStöld-Första"));
        ArrayList<String> cat3niv1l = new ArrayList<>();
        cat3niv1l.add(ChatUtill.format("&a3d"));
        cat3niv1m.setLore(cat3niv1l);
        cat3niv1.setItemMeta(cat3niv1m);
        Ban.setItem(11, cat3niv1);

        ItemStack cat3niv2 = new ItemStack(Material.PAPER);
        ItemMeta cat3niv2m = cat3niv2.getItemMeta();
        cat3niv2m.setDisplayName(ChatUtill.format("&2&lStöld-Andra"));
        ArrayList<String> cat3niv2l = new ArrayList<>();
        cat3niv2l.add(ChatUtill.format("&a14d"));
        cat3niv2m.setLore(cat3niv2l);
        cat3niv2.setItemMeta(cat3niv2m);
        Ban.setItem(20, cat3niv2);

        ItemStack cat3niv3 = new ItemStack(Material.PAPER);
        ItemMeta cat3niv3m = cat3niv3.getItemMeta();
        cat3niv3m.setDisplayName(ChatUtill.format("&2&lStöld-Tredje"));
        ArrayList<String> cat3niv3l = new ArrayList<>();
        cat3niv3l.add(ChatUtill.format("&a30d"));
        cat3niv3m.setLore(cat3niv3l);
        cat3niv3.setItemMeta(cat3niv3m);
        Ban.setItem(29, cat3niv3);

        ItemStack cat3niv4 = new ItemStack(Material.PAPER);
        ItemMeta cat3niv4m = cat3niv4.getItemMeta();
        cat3niv4m.setDisplayName(ChatUtill.format("&2&lStöld-Fjärde"));
        ArrayList<String> cat3niv4l = new ArrayList<>();
        cat3niv4l.add(ChatUtill.format("&a60d"));
        cat3niv4m.setLore(cat3niv4l);
        cat3niv4.setItemMeta(cat3niv4m);
        Ban.setItem(38, cat3niv4);

        ItemStack cat3niv5 = new ItemStack(Material.PAPER);
        ItemMeta cat3niv5m = cat3niv5.getItemMeta();
        cat3niv5m.setDisplayName(ChatUtill.format("&2&lStöld-Femte"));
        ArrayList<String> cat3niv5l = new ArrayList<>();
        cat3niv5l.add(ChatUtill.format("&aPermban"));
        cat3niv5m.setLore(cat3niv5l);
        cat3niv5.setItemMeta(cat3niv5m);
        Ban.setItem(47, cat3niv5);

        //Mord

        ItemStack cat4 = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta cat4m = cat4.getItemMeta();
        cat4m.setDisplayName(ChatUtill.format("&a&lMord"));
        cat4.setItemMeta(cat4m);
        Ban.setItem(3, cat4);

        ItemStack cat4niv1 = new ItemStack(Material.PAPER);
        ItemMeta cat4niv1m = cat4niv1.getItemMeta();
        cat4niv1m.setDisplayName(ChatUtill.format("&2&lMord-Första"));
        ArrayList<String> cat4niv1l = new ArrayList<>();
        cat4niv1l.add(ChatUtill.format("&a1d"));
        cat4niv1m.setLore(cat4niv1l);
        cat3niv1.setItemMeta(cat4niv1m);
        Ban.setItem(12, cat3niv1);

        ItemStack cat4niv2 = new ItemStack(Material.PAPER);
        ItemMeta cat4niv2m = cat4niv2.getItemMeta();
        cat4niv2m.setDisplayName(ChatUtill.format("&2&lMord-Andra"));
        ArrayList<String> cat4niv2l = new ArrayList<>();
        cat4niv2l.add(ChatUtill.format("&a7d"));
        cat4niv2m.setLore(cat4niv2l);
        cat4niv2.setItemMeta(cat4niv2m);
        Ban.setItem(21, cat4niv2);

        ItemStack cat4niv3 = new ItemStack(Material.PAPER);
        ItemMeta cat4niv3m = cat4niv3.getItemMeta();
        cat4niv3m.setDisplayName(ChatUtill.format("&2&lMord-Tredje"));
        ArrayList<String> cat4niv3l = new ArrayList<>();
        cat4niv3l.add(ChatUtill.format("&a14d"));
        cat4niv3m.setLore(cat4niv3l);
        cat4niv3.setItemMeta(cat4niv3m);
        Ban.setItem(30, cat4niv3);

        ItemStack cat4niv4 = new ItemStack(Material.PAPER);
        ItemMeta cat4niv4m = cat4niv4.getItemMeta();
        cat4niv4m.setDisplayName(ChatUtill.format("&2&lMord-Fjärde"));
        ArrayList<String> cat4niv4l = new ArrayList<>();
        cat4niv4l.add(ChatUtill.format("&a30d"));
        cat4niv4m.setLore(cat4niv4l);
        cat4niv4.setItemMeta(cat4niv4m);
        Ban.setItem(39, cat4niv4);

        //Skin

        ItemStack cat5 = new ItemStack(Material.RED_MUSHROOM);
        ItemMeta cat5m = cat5.getItemMeta();
        cat5m.setDisplayName(ChatUtill.format("&a&lOlämpliga Skins"));
        cat5.setItemMeta(cat5m);
        Ban.setItem(4, cat5);

        ItemStack cat5niv1 = new ItemStack(Material.PAPER);
        ItemMeta cat5niv1m = cat5niv1.getItemMeta();
        cat5niv1m.setDisplayName(ChatUtill.format("&2&lSkin-1"));
        ArrayList<String> cat5niv1l = new ArrayList<>();
        cat5niv1l.add(ChatUtill.format("&aKick"));
        cat5niv1m.setLore(cat5niv1l);
        cat5niv1.setItemMeta(cat5niv1m);
        Ban.setItem(13, cat5niv1);

        ItemStack cat5niv2 = new ItemStack(Material.PAPER);
        ItemMeta cat5niv2m = cat5niv2.getItemMeta();
        cat5niv2m.setDisplayName(ChatUtill.format("&2&lSkin-2"));
        ArrayList<String> cat5niv2l = new ArrayList<>();
        cat5niv2l.add(ChatUtill.format("&a30d"));
        cat5niv2m.setLore(cat5niv2l);
        cat5niv2.setItemMeta(cat5niv2m);
        Ban.setItem(22, cat5niv2);

        //Hacks

        ItemStack cat6 = new ItemStack(Material.FEATHER);
        ItemMeta cat6m = cat6.getItemMeta();
        cat6m.setDisplayName(ChatUtill.format("&a&lHacks"));
        cat6.setItemMeta(cat6m);
        Ban.setItem(5, cat6);

        ItemStack cat6niv1 = new ItemStack(Material.PAPER);
        ItemMeta cat6niv1m = cat6niv1.getItemMeta();
        cat6niv1m.setDisplayName(ChatUtill.format("&2&lHacks-Första"));
        ArrayList<String> cat6niv1l = new ArrayList<>();
        cat6niv1l.add(ChatUtill.format("&a14d"));
        cat6niv1m.setLore(cat6niv1l);
        cat5niv1.setItemMeta(cat6niv1m);
        Ban.setItem(14, cat5niv1);

        ItemStack cat6niv2 = new ItemStack(Material.PAPER);
        ItemMeta cat6niv2m = cat6niv2.getItemMeta();
        cat6niv2m.setDisplayName(ChatUtill.format("&2&lHacks-Andra"));
        ArrayList<String> cat6niv2l = new ArrayList<>();
        cat6niv2l.add(ChatUtill.format("&a30d"));
        cat6niv2m.setLore(cat6niv2l);
        cat6niv2.setItemMeta(cat6niv2m);
        Ban.setItem(23, cat6niv2);

        ItemStack cat6niv3 = new ItemStack(Material.PAPER);
        ItemMeta cat6niv3m = cat6niv3.getItemMeta();
        cat6niv3m.setDisplayName(ChatUtill.format("&2&lHacks-Tredje"));
        ArrayList<String> cat6niv3l = new ArrayList<>();
        cat6niv3l.add(ChatUtill.format("&a60d"));
        cat6niv3m.setLore(cat6niv3l);
        cat6niv3.setItemMeta(cat6niv3m);
        Ban.setItem(32, cat6niv3);

        ItemStack cat6niv4 = new ItemStack(Material.PAPER);
        ItemMeta cat6niv4m = cat6niv4.getItemMeta();
        cat6niv4m.setDisplayName(ChatUtill.format("&2&lHacks-Fjärde"));
        ArrayList<String> cat6niv4l = new ArrayList<>();
        cat6niv4l.add(ChatUtill.format("90d"));
        cat6niv4m.setLore(cat6niv4l);
        cat6niv4.setItemMeta(cat6niv4m);
        Ban.setItem(41, cat6niv4);

        ItemStack cat6niv5 = new ItemStack(Material.PAPER);
        ItemMeta cat6niv5m = cat6niv4.getItemMeta();
        cat6niv5m.setDisplayName(ChatUtill.format("&2&lHacks-Femte"));
        ArrayList<String> cat6niv5l = new ArrayList<>();
        cat6niv5l.add(ChatUtill.format("&aPermban"));
        cat6niv5m.setLore(cat6niv5l);
        cat6niv5.setItemMeta(cat6niv5m);
        Ban.setItem(50 , cat6niv5);



    }
}
