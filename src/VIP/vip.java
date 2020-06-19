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

public class vip {

	public static void VIP(Player p) {
		GUICreatorAPI vp = TheAPI.getGUICreatorAPI(p);
		vp.setSize(54);
		vp.setTitle("&a&lVIP");
		vp.open();
		new Tasker() {
			public void run() {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	    
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.LIME_STAINED_GLASS);
	    czk.setDisplayName("&a&lVIP pro Česko:");
	    czk.addLore("&6&lC&f&lena: &350kč");
	    czk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 50 VIP NICK");
	    czk.addLore("&6&lNa &f&lčíslo: &390733.");
	    czk.addLore("&aVIP je na &631 dní.");
	    czk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    vp.setItem(20, czk.create(), ops);
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.GREEN_STAINED_GLASS);
	    svk.setDisplayName("&a&lVIP pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &32€");
	    svk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 2 VIP NICK");
	    svk.addLore("&6&lNa &f&lčíslo: &38866.");
	    svk.addLore("&aVIP je na &631 dní.");
	    svk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    vp.setItem(29, svk.create(), ops);
	    
	    ItemCreatorAPI vyhody = TheAPI.getItemCreatorAPI(Material.DIAMOND);
	    vyhody.setDisplayName("&a&lVIP Výhody:");
	    vyhody.addLore("&9&l• &ePrefix v Chatu a TABu &aVIP");
	    vyhody.addLore("&9&l• &ePri koupě dostanete &62500$");
	    vyhody.addLore("&9&l• &eMožnost teleportovat se na inýho hráče &7(&6/tp&7).");
	    vyhody.addLore("&9&l• &eMožnost nasadit si na hlavu jakýkoliv předmět &7(&6/hat&7).");
	    vyhody.addLore("&9&l• &eVIP residence (5 residencí o velikosti 150x150).");
	    vyhody.addLore("&9&l• &eTeleportace na místo smrti/posledního warpu &7(&6/back&7).");
	    vyhody.addLore("&9&l• &6/kit VIP &e(Enchantované železný nástroje).");
	    vyhody.addLore("&9&l• &eAntiAFK kick, (AFK kick na vás nebude působit).");
	    vyhody.addLore("&9&l• &eMožnost psát barevné zprávy na cedulky nebo do chatu.)");
	    vp.setItem(23, vyhody.create(), ops);
	    
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		vp.setItem(0, okraj.create(), ops);
		vp.setItem(1, okraj.create(), ops);
		vp.setItem(7, okraj.create(), ops);
		vp.setItem(8, okraj.create(), ops);
		vp.setItem(17, okraj.create(), ops);
		vp.setItem(44, okraj.create(), ops);
		vp.setItem(53, okraj.create(), ops);
		vp.setItem(52, okraj.create(), ops);
		vp.setItem(46, okraj.create(), ops);
		vp.setItem(45, okraj.create(), ops);
		vp.setItem(36, okraj.create(), ops);
		vp.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		vp.setItem(49, back.create(), ops);
			}}.runAsync();
	}
	
}
