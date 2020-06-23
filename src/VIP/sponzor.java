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

public class sponzor {

	public static void Sponzor(Player p) {
		GUICreatorAPI spzr = TheAPI.getGUICreatorAPI(p);
		spzr.setSize(54);
		spzr.setTitle("&b&lSponzor");
		spzr.open();
		new Tasker() {
			public void run() {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	    
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.ORANGE_STAINED_GLASS);
	    czk.setDisplayName("&b&lSponzor pro Česko:");
	    czk.addLore("&6&lC&f&lena: &3500kč");
	    czk.addLore("&6&lP&f&lladba možná pouze přes &6&lPayPal.");
	    czk.addLore("&bSponzor je navždy.");
	    spzr.setItem(20, czk.create(), ops);
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.RED_STAINED_GLASS);
	    svk.setDisplayName("&b&lSponzor pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &320€");
	    svk.addLore("&6&lP&f&lladba možná pouze přes &6&lPayPal.");
	    svk.addLore("&bSponzor je navždy.");
	    spzr.setItem(29, svk.create(), ops);
	    
	    ItemCreatorAPI vyhody = TheAPI.getItemCreatorAPI(Material.DIAMOND);
	    vyhody.setDisplayName("&b&lSponor Výhody:");
	    vyhody.addLore("&9&l• &ePrefix v Chatu a TABu &bSponzor");
	    vyhody.addLore("&9&l• &ePri koupě dostanete &625,000$");
	    vyhody.addLore("&9&l• &eStejná práva jako &aVIP a &6Super&aVIP.");
	    vyhody.addLore("&9&l• &eSponzorské residence (20 residencí o velikosti 350x350).");
	    vyhody.addLore("&9&l• &eNezničitelné nástroje, vlastní názvy a lore &7(&6/item&7).");
	    vyhody.addLore("&9&l• &6/kit Sponzor &e(Enchantované diamantové nástroje).");
	    vyhody.addLore("&9&l• &eMožnost měnit hrení mód mezi Survival, Spectator, Adventure.");
	    vyhody.addLore("&9&l• &cCREATIVE mód není obsažen!");
	    vyhody.addLore("&9&l• &ePráva na &bDiamantovej &7Grappler. &e(/ghmenu)");
	    spzr.setItem(23, vyhody.create(), ops);
	    
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		spzr.setItem(0, okraj.create(), ops);
		spzr.setItem(1, okraj.create(), ops);
		spzr.setItem(7, okraj.create(), ops);
		spzr.setItem(8, okraj.create(), ops);
		spzr.setItem(17, okraj.create(), ops);
		spzr.setItem(44, okraj.create(), ops);
		spzr.setItem(53, okraj.create(), ops);
		spzr.setItem(52, okraj.create(), ops);
		spzr.setItem(46, okraj.create(), ops);
		spzr.setItem(45, okraj.create(), ops);
		spzr.setItem(36, okraj.create(), ops);
		spzr.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		spzr.setItem(49, back.create(), ops);
			}}.runAsync();
	}
	
}
