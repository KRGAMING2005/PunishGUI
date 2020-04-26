package me.kr_gaming2005.punishgui.guimain.commands;

import me.kr_gaming2005.punishgui.guimain.GuiMain;
import me.kr_gaming2005.punishgui.guimain.messages.ChatUtill;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.UUID;

public class PunishCommand implements CommandExecutor {

    public static GuiMain plugin = GuiMain.getPlugin(GuiMain.class);

    public static String prefix = plugin.getConfig().getString("prefix");
    public static String noperm = plugin.getConfig().getString("noperm");
    public static String invalidArg = plugin.getConfig().getString("invalidArg");

    public static String baning;


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("punish")){
            if(sender.hasPermission("punish.use")){
                if(sender instanceof Player){
                    Player p = (Player) sender;
                    if(args.length < 1){
                    Arg(p);
                    }else {
                       String target = args[0];
                        baning = target;
                        //Type GUI
                       Inventory type = Bukkit.createInventory(null, InventoryType.HOPPER, ChatUtill.format("&bVälj Typ"));

                        ItemStack BanItem = new ItemStack(Material.BARRIER);
                        ItemMeta BIM = BanItem.getItemMeta();
                        BIM.setDisplayName(ChatUtill.format("&4Ban"));
                        BanItem.setItemMeta(BIM);
                        type.setItem(0, BanItem);

                        ItemStack KickItem = new ItemStack(Material.IRON_DOOR);
                        ItemMeta KIM = KickItem.getItemMeta();
                        KIM.setDisplayName(ChatUtill.format("&eKick"));
                        KickItem.setItemMeta(KIM);
                        type.setItem(1, KickItem);


                        ItemStack MuteItem = new ItemStack(Material.GOLDEN_SWORD);
                        ItemMeta MIM = MuteItem.getItemMeta();
                        MIM.setDisplayName(ChatUtill.format("&aMute"));
                        MuteItem.setItemMeta(MIM);
                        type.setItem(2, MuteItem);

                        ItemStack HistItem = new ItemStack(Material.SCAFFOLDING);
                        ItemMeta HIM = HistItem.getItemMeta();
                        HIM.setDisplayName(ChatUtill.format("&7History"));
                        HistItem.setItemMeta(HIM);
                        type.setItem(3, HistItem);

                        ItemStack BanlistItem = new ItemStack(Material.FILLED_MAP);
                        ItemMeta BLM = BanlistItem.getItemMeta();
                        BLM.setDisplayName(ChatUtill.format("&3Banlist"));
                        BanlistItem.setItemMeta(BLM);
                        type.setItem(4, BanlistItem);

                        p.openInventory(type);

                    }


                }
            }
        }
        return true;
    }

    public void Arg(Player p){
        p.sendMessage(ChatUtill.format(prefix + invalidArg));
        return;
    }

}
