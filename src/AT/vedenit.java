package AT;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import me.DevTec.TheAPI.TheAPI;
import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;
import sm.AllGuis;

public class vedenit {
	public static void vedeni(Player p) {
		GUI g= new GUI("&c&lVedení serveru", 54, p);

		new Tasker() {
		public void run() {
			
			
			ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.RED_STAINED_GLASS_PANE, 1, " ")){
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
			
			String houska = "Houska02";
			if (TheAPI.isVanished(houska)) {
				g.setItem(13, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lHouska02", "Houska02", Arrays.asList("&aPozice: &3Majitel", "&aStatus: &c&lOFFLINE"))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(13, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lHouska02", "Houska02", Arrays.asList("&aPozice: &3Majitel", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("Houska02") ? "&a&lONLINE" : "&c&lOFFLINE")))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
			
			String straiker = "StraikerinaCZ";
			if (TheAPI.isVanished(straiker)) {
				g.setItem(33, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lStraikerinaCZ", "StraikerinaCZ", Arrays.asList("&aPozice: &9Developer", "&aStatus: &c&lOFFLINE"))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(33, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lStraikerinaCZ", "StraikerinaCZ", Arrays.asList("&aPozice: &9Developer", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("StraikerinaCZ") ? "&a&lONLINE" : "&c&lOFFLINE")))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
			
			String rajsko = "_ItsRajsko_";
			if (TheAPI.isVanished(rajsko)) {
				g.setItem(29, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l_ItsRajsko_", "_ItsRajsko_", Arrays.asList("&aPozice: &4Admin", "&aStatus: &c&lOFFLINE"))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(29, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l_ItsRajsko_", "_ItsRajsko_", Arrays.asList("&aPozice: &4Admin", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("_ItsRajsko_") ? "&a&lONLINE" : "&c&lOFFLINE")))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
			String petulikan = "petulikan1";
			if (TheAPI.isVanished(petulikan)) {
				g.setItem(31, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lpetulikan1", "petulikan1", Arrays.asList("&aPozice: &4Admin", "&aStatus: &c&lOFFLINE"))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
						}
					});	
			} else {
				g.setItem(31, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lpetulikan1", "petulikan1", Arrays.asList("&aPozice: &4Admin", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("petulikan1") ? "&a&lONLINE" : "&c&lOFFLINE")))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
						}
					});	
			}
		}}.runAsync();
	}

}
