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

public class supervip {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void SuperVIP(Player p) {
		GUI g = new GUI("&6&lSuper&a&lVIP", 54, p);
		new Tasker() { 
			public void run() {
				Utils.metoda2(g, Material.ORANGE_STAINED_GLASS, "&6&lSuper&a&lVIP pro Česko:", 1, 20, Arrays.asList("&6&lC&f&lena: &399kč",
	    		"&6&lS&f&lM&6&lS Tvar: &3PM PARADISEHOST V31534 99 SUPERVIP NICK",
	    		"&6&lNa &f&lčíslo: &390733",
	    		"&6Super&aVIP je na &631 dní.",
	    		"&cMísto 'NICK' napište své herní jméno."));	    
				Utils.metoda2(g, Material.RED_STAINED_GLASS, "&6&lSuper&a&lVIP pro Slovensko &cPŘIPRAVUJEME", 1, 29);
				Utils.metoda2(g, Material.DIAMOND, "&6&lSuper&a&lVIP Výhody:", 1, 23, Arrays.asList("&9&l• &ePrefix v Chatu a TABu &6S&aVIP",
	    		"&9&l• &ePri koupě dostanete &65000$",
	    		"&9&l• &eStejná práva jako &aVIP.",
	    		"&9&l• &eMožnost měnit počasí &7(&6/sun, /rain, /thunder&7).",
	    		"&9&l• &eSuperVIP residence (6 residencí o velikosti 200x200).",
	    		"&9&l• &eMožnost měnit den a noc &7(&6/day, /night&7).",
	    		"&9&l• &6/kit SVIP &e(Enchantované železný nástroje).",
	    		"&9&l• &eVirtuální crafting table &7(&6/craft&7).",
	    		"&9&l• &eOkamžité vyléčení &7(&6/heal, /feed&7)."));
	    
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		int[] a = {0,1,7,8,17,44,53,52,46,45,36,9};
		for(int i : a) {
			Utils.metoda2(g, Material.BLACK_STAINED_GLASS, "", 1, i);
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
