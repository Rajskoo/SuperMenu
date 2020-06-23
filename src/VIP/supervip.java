package VIP;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;
import me.DevTec.GUI.GUICreatorAPI;
import me.DevTec.GUI.GUICreatorAPI.Options;
import me.DevTec.Scheduler.Tasker;

public class supervip {

	public static void SuperVIP(Player p) {
		GUICreatorAPI sprvp = TheAPI.getGUICreatorAPI(p);
		sprvp.setSize(54);
		sprvp.setTitle("&a&lVIP");
		sprvp.open();
		new Tasker() { 
			public void run() {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	    
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.ORANGE_STAINED_GLASS);
	    czk.setDisplayName("&6&lSuper&a&lVIP pro Česko:");
	    czk.addLore("&6&lC&f&lena: &399kč");
	    czk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 99 SUPERVIP NICK");
	    czk.addLore("&6&lNa &f&lčíslo: &390733.");
	    czk.addLore("&6Super&aVIP je na &631 dní.");
	    czk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    sprvp.setItem(20, czk.create(), ops);
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.RED_STAINED_GLASS);
	    svk.setDisplayName("&6&lSuper&a&lVIP pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &34€");
	    svk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 4 SUPERVIP NICK");
	    svk.addLore("&6&lNa &f&lčíslo: &38866.");
	    svk.addLore("&6Super&aVIP je na &631 dní.");
	    svk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    sprvp.setItem(29, svk.create(), ops);
	    
	    ItemCreatorAPI vyhody = TheAPI.getItemCreatorAPI(Material.DIAMOND);
	    vyhody.setDisplayName("&a&lVIP Výhody:");
	    vyhody.addLore("&9&l• &ePrefix v Chatu a TABu &6S&aVIP");
	    vyhody.addLore("&9&l• &ePri koupě dostanete &65000$");
	    vyhody.addLore("&9&l• &eStejná práva jako &aVIP.");
	    vyhody.addLore("&9&l• &eMožnost měnit počasí &7(&6/sun, /rain, /thunder&7).");
	    vyhody.addLore("&9&l• &eSuperVIP residence (6 residencí o velikosti 200x200).");
	    vyhody.addLore("&9&l• &eMožnost měnit den a noc &7(&6/day, /night&7).");
	    vyhody.addLore("&9&l• &6/kit VIP &e(Enchantované železný nástroje).");
	    vyhody.addLore("&9&l• &eVirtuální crafting table &7(&6/craft&7).");
	    vyhody.addLore("&9&l• &eOkamžité vyléčení &7(&6/heal, /feed&7).");
	    vyhody.addLore("&9&l• &ePráva na &7Železnej &ea Zlatej &7Grappler. &e(/ghmenu)");
	    sprvp.setItem(23, vyhody.create(), ops);
	    
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		sprvp.setItem(0, okraj.create(), ops);
		sprvp.setItem(1, okraj.create(), ops);
		sprvp.setItem(7, okraj.create(), ops);
		sprvp.setItem(8, okraj.create(), ops);
		sprvp.setItem(17, okraj.create(), ops);
		sprvp.setItem(44, okraj.create(), ops);
		sprvp.setItem(53, okraj.create(), ops);
		sprvp.setItem(52, okraj.create(), ops);
		sprvp.setItem(46, okraj.create(), ops);
		sprvp.setItem(45, okraj.create(), ops);
		sprvp.setItem(36, okraj.create(), ops);
		sprvp.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		sprvp.setItem(49, back.create(), ops);
			}}.runAsync();
	}
	
}
