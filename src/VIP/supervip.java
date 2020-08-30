package VIP;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;

public class supervip {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void SuperVIP(Player p) {
		GUI sprvp = new GUI("&6&lSuper&a&lVIP", 54, p);
		new Tasker() { 
			public void run() {
				
	    sprvp.setItem(20, new ItemGUI(ItemCreatorAPI.create(Material.ORANGE_STAINED_GLASS, 1, "&6&lSuper&a&lVIP pro Česko:", Arrays.asList(
	    		"&6&lC&f&lena: &399kč",
	    		"&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 99 SUPERVIP NICK",
	    		"&6&lNa &f&lčíslo: &390733",
	    		"&6Super&aVIP je na &631 dní.",
	    		"&cMísto 'NICK' napište své herní jméno."))){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	    
	    sprvp.setItem(29, new ItemGUI(ItemCreatorAPI.create(Material.RED_STAINED_GLASS, 1, "&6&lSuper&a&lVIP pro Slovensko:", Arrays.asList(
	    		"&6&lC&f&lena: &34€",
	    		"&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 4 SUPERVIP NICK",
	    		"&6&lNa &f&lčíslo: &38866",
	    		"&6Super&aVIP je na &631 dní.",
	    		"&cMísto 'NICK' napište své herní jméno."))){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	    sprvp.setItem(23, new ItemGUI(ItemCreatorAPI.create(Material.DIAMOND, 1, "&6&lSuper&a&lVIP Výhody:", Arrays.asList(
	    		"&9&l• &ePrefix v Chatu a TABu &6S&aVIP",
	    		"&9&l• &ePri koupě dostanete &65000$",
	    		"&9&l• &eStejná práva jako &aVIP.",
	    		"&9&l• &eMožnost měnit počasí &7(&6/sun, /rain, /thunder&7).",
	    		"&9&l• &eSuperVIP residence (6 residencí o velikosti 200x200).",
	    		"&9&l• &eMožnost měnit den a noc &7(&6/day, /night&7).",
	    		"&9&l• &6/kit SVIP &e(Enchantované železný nástroje).",
	    		"&9&l• &eVirtuální crafting table &7(&6/craft&7).",
	    		"&9&l• &eOkamžité vyléčení &7(&6/heal, /feed&7)."))){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	    
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		sprvp.setItem(0, item);
		sprvp.setItem(1, item);
		sprvp.setItem(7, item);
		sprvp.setItem(8, item);
		sprvp.setItem(17, item);
		sprvp.setItem(44, item);
		sprvp.setItem(53, item);
		sprvp.setItem(52, item);
		sprvp.setItem(46, item);
		sprvp.setItem(45, item);
		sprvp.setItem(36, item);
		sprvp.setItem(9, item);
		sprvp.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
}
