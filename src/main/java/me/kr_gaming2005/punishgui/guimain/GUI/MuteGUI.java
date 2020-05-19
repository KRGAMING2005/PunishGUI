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

public class MuteGUI {
    public static void openMuteGUI(Player p){
        Inventory Mute = Bukkit.createInventory(null, 54, ChatUtill.format("&a&lMute &2" + PunishCommand.baning));

        ItemStack Cat1 = new ItemStack(Material.OAK_SIGN);
        ItemMeta SCM1 = Cat1.getItemMeta();
        SCM1.setDisplayName(ChatUtill.format("&2&lSpam"));
        Cat1.setItemMeta(SCM1);
        Mute.setItem(0, Cat1);

        ItemStack Cat2 = new ItemStack(Material.OAK_SIGN);
        ItemMeta SCM2 = Cat2.getItemMeta();
        SCM2.setDisplayName(ChatUtill.format("&2&lGroft språk"));
        Cat2.setItemMeta(SCM2);
        Mute.setItem(1, Cat2);

        ItemStack Cat1Niv1 = new ItemStack(Material.PAPER);
        ItemMeta C1N1 = Cat1Niv1.getItemMeta();
        C1N1.setDisplayName(ChatUtill.format("&2&lTillsägelse &c(Gör Manuellt)"));
        ArrayList<String> C1N1L = new ArrayList<>();
        C1N1L.add(ChatUtill.format(ChatUtill.format("&aLäs ovan")));
        C1N1.setLore(C1N1L);
        Cat1Niv1.setItemMeta(C1N1);
        Mute.setItem(9, Cat1Niv1);

        ItemStack Cat1Niv2 = new ItemStack(Material.PAPER);
        ItemMeta C1N2 = Cat1Niv2.getItemMeta();
        C1N2.setDisplayName(ChatUtill.format("&2&lAndra"));
        ArrayList<String> C1N2L = new ArrayList<>();
        C1N2L.add(ChatUtill.format("&a15 min"));
        C1N2.setLore(C1N2L);
        Cat1Niv2.setItemMeta(C1N2);
        Mute.setItem(18, Cat1Niv2);

        ItemStack Cat1Niv3 = new ItemStack(Material.PAPER);
        ItemMeta C1N3 = Cat1Niv3.getItemMeta();
        C1N3.setDisplayName(ChatUtill.format("&2&lTredje"));
        ArrayList<String> C1N3L = new ArrayList<>();
        C1N3L.add(ChatUtill.format("&a1 h"));
        C1N3.setLore(C1N3L);
        Cat1Niv3.setItemMeta(C1N3);
        Mute.setItem(27, Cat1Niv3);

        ItemStack Cat1Niv4 = new ItemStack(Material.PAPER);
        ItemMeta C1N4 = Cat1Niv4.getItemMeta();
        C1N4.setDisplayName(ChatUtill.format("&2&lFjärde"));
        ArrayList<String> C1N4L = new ArrayList<>();
        C1N4L.add(ChatUtill.format("&a3 h"));
        C1N4.setLore(C1N4L);
        Cat1Niv4.setItemMeta(C1N4);
        Mute.setItem(36, Cat1Niv4);

        ItemStack Cat1Niv5 = new ItemStack(Material.PAPER);
        ItemMeta C1N5 = Cat1Niv5.getItemMeta();
        C1N5.setDisplayName(ChatUtill.format("&2&lFemte"));
        ArrayList<String> C1N5L = new ArrayList<>();
        C1N5L.add(ChatUtill.format("&aPermmute"));
        C1N5.setLore(C1N5L);
        Cat1Niv5.setItemMeta(C1N5);
        Mute.setItem(45, Cat1Niv5);

        ItemStack Cat2Niv1 = new ItemStack(Material.PAPER);
        ItemMeta C2N1M = Cat2Niv1.getItemMeta();
        C2N1M.setDisplayName(ChatUtill.format("&2&lRasism"));
        ArrayList<String> C2N1L = new ArrayList<>();
        C2N1L.add(ChatUtill.format("&aPermmute"));
        C2N1M.setLore(C2N1L);
        Cat2Niv1.setItemMeta(C2N1M);
        Mute.setItem(10, Cat2Niv1);
        p.openInventory(Mute);
    }


}
