package AT;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import me.DevTec.ServerControlReloaded.SCR.API;
import me.DevTec.ServerControlReloaded.SCR.API.SeenType;
import me.DevTec.TheAPI.TheAPI;
import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;
import sm.AllGuis;

public class ostatni {
	public static void ostatnit(Player p) {
		GUI g = new GUI("!#D3941D&lOstatní členové Teamu!#B5C208", 54, p);
		new Tasker() {
		public void run() {
			
			if (TheAPI.hasVanish("Snixolinka")) {
				g.setItem(31, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lSnixolinka", "Snixolinka", Arrays.asList("&aPozice: !#E6A417&lEVENTERKA!#E25A07", "&aStatus: &c&lOFFLINE &7" + API.getSeen("Snixolinka", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(31, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lSnixolinka", "Snixolinka", Arrays.asList("&aPozice: !#E6A417&lEVENTERKA!#E25A07", "&aStatus: "+ (TheAPI.getOnlinePlayers().toString().contains("Snixolinka") ? "&a&lONLINE &7" + API.getSeen("Snixolinka", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("Snixolinka", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
				
			if (TheAPI.hasVanish("TheOrsy")) {
				g.setItem(20, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lTheOrsy", "TheOrsy", Arrays.asList("&aPozice: !#186B13&lZAKLADATEL!#2A5831", "&aStatus: &c&lOFFLINE &7" + API.getSeen("TheOrsy", SeenType.Offline)))){
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(20, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lTheOrsy", "TheOrsy", Arrays.asList("&aPozice: !#186B13&lZAKLADATEL!#2A5831", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("TheOrsy") ? "&a&lONLINE &7" + API.getSeen("TheOrsy", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("TheOrsy", SeenType.Offline))))){
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
			
			if (TheAPI.hasVanish("Hoff")) {
				g.setItem(24, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lHoff", "Hoff", Arrays.asList("&aPozice: !#186B13&lZAKLADATEL!#2A5831", "&aStatus: &c&lOFFLINE &7" + API.getSeen("Hoff", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(24, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lHoff", "Hoff", Arrays.asList("&aPozice: !#186B13&lZAKLADATEL!#2A5831", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("Hoff") ? "&a&lONLINE &7" + API.getSeen("Hoff", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("Hoff", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
		
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
		}}.runTaskSync();
	}
}
