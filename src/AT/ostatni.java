package AT;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import me.DevTec.TheAPI.TheAPI;
import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;
import sm.AllGuis;

public class ostatni {
	public static void ostatnit(Player p) {
		GUI g = new GUI("&6&lOstatní členové Teamu", 54, p);
		new Tasker() {
		public void run() {
			
			
			g.setItem(20, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lSaelo", "Saelo", Arrays.asList("&aPozice: &6Eventer", "&aStatus: "+ (TheAPI.getOnlinePlayers().toString().contains("Saelo") ? "&a&lONLINE" : "&c&lOFFLINE")))) {
				public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});
				
			
			g.setItem(22, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lTheOrsy", "TheOrsy", Arrays.asList("&aPozice: &2Zakldatatel", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("TheOrsy") ? "&a&lONLINE" : "&c&lOFFLINE")))){
				public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});
			
			g.setItem(24, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lHoff", "Hoff", Arrays.asList("&aPozice: &2Zakladatel", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("Hoff") ? "&a&lONLINE" : "&c&lOFFLINE")))) {
				public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});
				
		
			ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.ORANGE_STAINED_GLASS_PANE, 1, " ")){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			};
			int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
			for (int slot : slots) {
				g.setItem(slot, okraj);
			}
		
		g.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")) {
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				AllGuis.ATGUI(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});		
		}}.runAsync();
	}
}
