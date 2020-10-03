package AT;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.DevTec.TheAPI.TheAPI;
import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;
import sm.AllGuis;

public class helperteam {
    public static void helpert(Player p) {
		GUI g = new GUI("&5&lHelper Team", 54, p);
		new Tasker() {
		public void run() {
		
			ItemStack finding = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAzNWM1MjgwMzZiMzg0YzUzYzljOGExYTEyNTY4NWUxNmJmYjM2OWMxOTdjYzlmMDNkZmEzYjgzNWIxYWE1NSJ9fX0="));
			ItemMeta meta = finding.getItemMeta();
			meta.setLore(Arrays.asList(TheAPI.colorize("&aJestli si myslíš, že umíš s příkazy, a máš schopnosti řešit problémy."), TheAPI.colorize("&aUrčitě se nám ozvi!")));
			meta.setDisplayName(TheAPI.colorize("&e&lHLEDÁME!"));			
			finding.setItemMeta(meta);
			g.setItem(13, new ItemGUI(finding) {
				public void onClick(Player arg0, GUI arg1, ClickType arg2) {	
				}
			});
		//"&aJestli si myslíš, že umíš s příkazy, a máš schopnost řešit problémy."
		//"&aUrčitě se nám ozvi!"
		
		g.setItem(31,  new ItemGUI(ItemCreatorAPI.createHead(1, "&e&lRhys", "Rhys", Arrays.asList("&aPozice: &5Helper", "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains("Rhys") ? "&a&lONLINE" : "&c&lOFFLINE")))) {
				public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});	
		
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
		}}.runAsync();
}
	
}
