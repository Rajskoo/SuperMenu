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

public class vedenit {
	public static void vedeni(Player p) {
		GUI g= new GUI("!#A63524&lVedení serveru!#75290B", 54, p);

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
			
			if (TheAPI.hasVanish("Houska02")) {
				g.setItem(13, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lHouska02", "Houska02", Arrays.asList("&aPozice: !#2CDD86&lMAJITEL!#0E7B8C", "&aStatus: &c&lOFFLINE &7" + API.getSeen("Houska02", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(13, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lHouska02", "Houska02", Arrays.asList("&aPozice: !#2CDD86&lMAJITEL!#0E7B8C", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("Houska02") ? "&a&lONLINE &7" + API.getSeen("Houska02", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("Houska02", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
			
			if (TheAPI.hasVanish("StraikerinaCZ")) {
				g.setItem(33, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lStraikerinaCZ", "StraikerinaCZ", Arrays.asList("&aPozice: !#13A1A1&lDEVELOPER!#5CE7E8", "&aStatus: &c&lOFFLINE &7" + API.getSeen("StraikerinaCZ", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(33, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lStraikerinaCZ", "StraikerinaCZ", Arrays.asList("&aPozice: !#13A1A1&lDEVELOPER!#5CE7E8", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("StraikerinaCZ") ? "&a&lONLINE &7" + API.getSeen("StraikerinaCZ", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("StraikerinaCZ", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
			
			if (TheAPI.hasVanish("_ItsRajsko_")) {
				g.setItem(29, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l_ItsRajsko_", "_ItsRajsko_", Arrays.asList("&aPozice: !#DA0C1F&lADMIN!#FB430D", "&aStatus: &c&lOFFLINE &7" + API.getSeen("_ItsRajsko_", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			} else {
				g.setItem(29, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l_ItsRajsko_", "_ItsRajsko_", Arrays.asList("&aPozice: !#DA0C1F&lADMIN!#FB430D", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("_ItsRajsko_") ? "&a&lONLINE &7" + API.getSeen("_ItsRajsko_", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("_ItsRajsko_", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});
			}
			if (TheAPI.hasVanish("petulikan1")) {
				g.setItem(31, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lpetulikan1", "petulikan1", Arrays.asList("&aPozice: !#DA0C1F&lADMIN!#FB430D", "&aStatus: " + "&c&lOFFLINE &7" + API.getSeen("petulikan1", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
						}
					});	
			} else {
				g.setItem(31, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lpetulikan1", "petulikan1", Arrays.asList("&aPozice: !#DA0C1F&lADMIN!#FB430D", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("petulikan1") ? "&a&lONLINE &7" + API.getSeen("petulikan1", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("petulikan1", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
						}
					});	
			}
		}}.runTaskSync();
	}

}
