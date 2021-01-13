package VIP;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import Utils.Utils;
import me.devtec.theapi.apis.ItemCreatorAPI;
import me.devtec.theapi.guiapi.GUI;
import me.devtec.theapi.guiapi.ItemGUI;
import me.devtec.theapi.scheduler.Tasker;

public class vip {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});d
	 */
	
	public static void VIP(Player p) {
		GUI g = new GUI("&a&lVIP", 54, p);
		new Tasker() {
			public void run() {
				Utils.metoda2(g, Material.RED_STAINED_GLASS, "&a&lVIP pro Česko:", 1, 20, Arrays.asList("&6&lC&f&lena: &350kč",
						"&6&lS&f&lM&6&lS Tvar: &3PM PARADISEHOST s77 50 &e"+p.getName(),
						"&6&lNa &f&lčíslo: &390733.",
			    		"&aVIP je na &631 dní."));
				Utils.metoda2(g, Material.DIAMOND, "&a&lVIP Výhody:", 1, 23, Arrays.asList(
			    		"&9&l• &ePrefix v Chatu a TABu &aVIP",
			    		"&9&l• &ePri koupě dostanete &62500$",
			    		"&9&l• &eMožnost teleportovat se na inýho hráče &7(&6/tp&7).",
			    		"&9&l• &eMožnost nasadit si na hlavu jakýkoliv předmět &7(&6/hat&7).",
			    		"&9&l• &eVIP residence (5 residencí o velikosti 150x150).",
			    		"&9&l• &eTeleportace na místo smrti/posledního warpu &7(&6/back&7).",
			    		"&9&l• &6/kit VIP &e(Enchantované železný nástroje).",
			    		"&9&l• &eAntiAFK kick, (AFK kick na vás nebude působit).",
			    		"&9&l• &eMožnost psát barevné zprávy na cedulky nebo do chatu."));				

	    
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		int[] ints = {0,1,7,8,17,44,53,52,46,36,9};
		for(int a : ints) {
			Utils.metoda2(g, Material.BLACK_STAINED_GLASS_PANE, "", 1, a);
		}
		g.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")) {
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				//sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);				
			}
		});
			}}.runTaskSync();
	}
	
}
