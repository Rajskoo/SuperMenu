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

public class helperteam {
    public static void helpert(Player p) {
		GUI g = new GUI("!#6F18A3&lHelper Team!#B808C2", 54, p);
		new Tasker() {
		public void run() {
		
			/*ItemStack finding = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAzNWM1MjgwMzZiMzg0YzUzYzljOGExYTEyNTY4NWUxNmJmYjM2OWMxOTdjYzlmMDNkZmEzYjgzNWIxYWE1NSJ9fX0="));
			ItemMeta meta = finding.getItemMeta();
			meta.setLore(Arrays.asList(TheAPI.colorize("&aJestli si myslíš, že umíš s příkazy, a máš schopnosti řešit problémy."), TheAPI.colorize("&aUrčitě se nám ozvi!")));
			meta.setDisplayName(TheAPI.colorize("&e&lHLEDÁME!"));			
			finding.setItemMeta(meta);
			g.setItem(13, new ItemGUI(finding) {
				public void onClick(Player arg0, GUI arg1, ClickType arg2) {	
				}
			});*/
		
			if (TheAPI.hasVanish("Rhys")) {
				g.setItem(20,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lRhys", "Rhys", Arrays.asList("&aPozice: !#D01E42&lHELPER!#681580", "&aStatus: &c&lOFFLINE &7" + API.getSeen("Rhys", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			} else {
				g.setItem(20,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lRhys", "Rhys", Arrays.asList("&aPozice: !#D01E42&lHELPER!#681580", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("Rhys") ? "&a&lONLINE &7" + API.getSeen("Rhys", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("Rhys", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			}
			
			if (TheAPI.hasVanish("123456")) {
				g.setItem(22,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l123456", "123456", Arrays.asList("&aPozice: !#D01E42&lHELPER!#681580", "&aStatus: &c&lOFFLINE &7" + API.getSeen("123456", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			} else {
				g.setItem(22,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l123456", "123456", Arrays.asList("&aPozice: !#D01E42&lHELPER!#681580", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("123456") ? "&a&lONLINE &7" + API.getSeen("123456", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("123456", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			}
			
			if (TheAPI.hasVanish("SanoSK999")) {
				g.setItem(24,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lSanoSK999", "SanoSK999", Arrays.asList("&aPozice: !#D01E42&lHELPER!#681580", "&aStatus: &c&lOFFLINE &7" + API.getSeen("SanoSK999", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			} else {
				g.setItem(24,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lSanoSK999", "SanoSK999", Arrays.asList("&aPozice: !#D01E42&lHELPER!#681580", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("SanoSK999") ? "&a&lONLINE &7" + API.getSeen("SanoSK999", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("SanoSK999", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			}
			
			if (TheAPI.hasVanish("LeaftyCz")) {
				g.setItem(30,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lLeaftyCz", "LeaftyCz", Arrays.asList("&aPozice: !#D01E42&lHELPER!#681580", "&aStatus: &c&lOFFLINE &7" + API.getSeen("LeaftyCz", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			} else {
				g.setItem(30,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lLeaftyCz", "LeaftyCz", Arrays.asList("&aPozice: !#D01E42&lHELPER!#681580", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("LeaftyCz") ? "&a&lONLINE &7" + API.getSeen("LeaftyCz", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("LeaftyCz", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			}
			
			if (TheAPI.hasVanish("YfrosT")) {
				g.setItem(32,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lYfrosT", "YfrosT", Arrays.asList("&aPozice: !#979797&lZK.HELPER!#681580", "&aStatus: &c&lOFFLINE &7" + API.getSeen("YfrosT", SeenType.Offline)))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			} else {
				g.setItem(32,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lYfrosT", "YfrosT", Arrays.asList("&aPozice: !#979797&lZK.HELPER!#681580", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("YfrosT") ? "&a&lONLINE &7" + API.getSeen("YfrosT", SeenType.Online) : "&c&lOFFLINE &7" + API.getSeen("YfrosT", SeenType.Offline))))) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				}
			});	
			}
		
		ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.PURPLE_STAINED_GLASS_PANE, 1, " ")){
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
