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

public class vip {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void VIP(Player p) {
		GUI vp = new GUI("&a&lVIP", 54, p);
		new Tasker() {
			public void run() {
	    
				vp.setItem(20, new ItemGUI(ItemCreatorAPI.create(Material.RED_STAINED_GLASS, 1, "&a&lVIP pro Česko:", Arrays.asList(
						"&6&lC&f&lena: &350kč",
						"&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 50 VIP NICK",
						"&6&lNa &f&lčíslo: &390733.",
			    		"&aVIP je na &631 dní.",
			    		"&cMísto 'NICK' napište své herní jméno."))){
					@Override
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
					}
				});	
	    
	    vp.setItem(29, new ItemGUI(ItemCreatorAPI.create(Material.RED_STAINED_GLASS, 1, "&a&lVIP pro Slovensko:", Arrays.asList(
	    		"&6&lC&f&lena: &32€",
	    		"&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 2 VIP NICK",
	    		"&6&lNa &f&lčíslo: &38866.",
	    		"&aVIP je na &631 dní.",
	    		"&cMísto 'NICK' napište své herní jméno."))){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	    
	    vp.setItem(23, new ItemGUI(ItemCreatorAPI.create(Material.DIAMOND, 1, "&a&lVIP Výhody:", Arrays.asList(
	    		"&9&l• &ePrefix v Chatu a TABu &aVIP",
	    		"&9&l• &ePri koupě dostanete &62500$",
	    		"&9&l• &eMožnost teleportovat se na inýho hráče &7(&6/tp&7).",
	    		"&9&l• &eMožnost nasadit si na hlavu jakýkoliv předmět &7(&6/hat&7).",
	    		"&9&l• &eVIP residence (5 residencí o velikosti 150x150).",
	    		"&9&l• &eTeleportace na místo smrti/posledního warpu &7(&6/back&7).",
	    		"&9&l• &6/kit VIP &e(Enchantované železný nástroje).",
	    		"&9&l• &eAntiAFK kick, (AFK kick na vás nebude působit).",
	    		"&9&l• &eMožnost psát barevné zprávy na cedulky nebo do chatu."))){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	    
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		vp.setItem(0, item);
		vp.setItem(1, item);
		vp.setItem(7, item);
		vp.setItem(8, item);
		vp.setItem(17, item);
		vp.setItem(44, item);
		vp.setItem(53, item);
		vp.setItem(52, item);
		vp.setItem(46, item);
		vp.setItem(45, item);
		vp.setItem(36, item);
		vp.setItem(9, item);
		vp.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runTaskSync();
	}
	
}
