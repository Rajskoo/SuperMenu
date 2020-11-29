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

public class builderteam {
	public static void buildert(Player p) {
		GUI g = new GUI("!#0D560A&lBuilder Team!#18A336", 54, p);
		
		new Tasker() {
		public void run() {
			
			/*ItemStack finding = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAzNWM1MjgwMzZiMzg0YzUzYzljOGExYTEyNTY4NWUxNmJmYjM2OWMxOTdjYzlmMDNkZmEzYjgzNWIxYWE1NSJ9fX0="));
			ItemMeta meta = finding.getItemMeta();
			meta.setLore(Arrays.asList(TheAPI.colorize("&aJestli jsi myslíš, že umíš stavět."), TheAPI.colorize("&aUrčite se nám ozvi!")));
			meta.setDisplayName(TheAPI.colorize("&e&lHLEDÁME!"));			
			finding.setItemMeta(meta);
			g.setItem(13, new ItemGUI(finding) {
				public void onClick(Player arg0, GUI arg1, ClickType arg2) {	
				}
			});*/
			
			if (TheAPI.hasVanish("CirikCZ")) {
				g.setItem(20, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lCirikCZ", "CirikCZ", Arrays.asList("&aPozice: !#62CE0E&lBUILDER!#2B8D17", "&aStatus: &c&lOFFLINE &7" + API.getSeen("CirikCZ", SeenType.Offline) ))) {				
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {					
					}
				});
			} else {
				g.setItem(20, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lCirikCZ", "CirikCZ", Arrays.asList("&aPozice: !#62CE0E&lBUILDER!#2B8D17", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("CirikCZ") ? "&a&lONLINE &7" + API.getSeen("CirikCZ", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("CirikCZ", SeenType.Offline))))) {				
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {					
					}
				});
			}	
			
			if (TheAPI.hasVanish("DeuceDip")) {
				g.setItem(22, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lDeuceDip", "DeuceDip", Arrays.asList("&aPozice: !#62CE0E&lBUILDER!#2B8D17", "&aStatus: &c&lOFFLINE &7" + API.getSeen("DeuceDip", SeenType.Offline) ))) {				
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {					
					}
				});
			} else {
				g.setItem(22, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lDeuceDip", "DeuceDip", Arrays.asList("&aPozice: !#62CE0E&lBUILDER!#2B8D17", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("DeuceDip") ? "&a&lONLINE &7" + API.getSeen("DeuceDip", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("DeuceDip", SeenType.Offline))))) {				
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {					
					}
				});
			}	
			
			if (TheAPI.hasVanish("_Matesak_")) {
				g.setItem(24, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l_Matesak_", "_Matesak_", Arrays.asList("&aPozice: !#979797&lZK.BUILDER!#2B8D17", "&aStatus: &c&lOFFLINE &7" + API.getSeen("_Matesak_", SeenType.Offline) ))) {				
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {					
					}
				});
			} else {
				g.setItem(24, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l_Matesak_", "_Matesak_", Arrays.asList("&aPozice: !#979797&lZK.BUILDER!#2B8D17", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("_Matesak_") ? "&a&lONLINE &7" + API.getSeen("_Matesak_", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("_Matesak_", SeenType.Offline))))) {				
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {					
					}
				});
			}
			
			if (TheAPI.hasVanish("Wint3CZ")) {
				g.setItem(30, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lWint3CZ", "Wint3CZ", Arrays.asList("&aPozice: !#979797&lZK.BUILDER!#2B8D17", "&aStatus: &c&lOFFLINE &7" + API.getSeen("Wint3CZ", SeenType.Offline) ))) {				
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {					
					}
				});
			} else {
				g.setItem(30, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lWint3CZ", "Wint3CZ", Arrays.asList("&aPozice: !#979797&lZK.BUILDER!#2B8D17", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("Wint3CZ") ? "&a&lONLINE &7" + API.getSeen("Wint3CZ", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("Wint3CZ", SeenType.Offline))))) {				
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {					
					}
				});
			}

			ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.GREEN_STAINED_GLASS_PANE, 1, " ")){
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
	
