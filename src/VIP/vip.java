package VIP;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;
import me.DevTec.GUI.GUICreatorAPI;
import me.DevTec.GUI.ItemGUI;
import me.DevTec.Scheduler.Tasker;

public class vip {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void VIP(Player p) {
		GUICreatorAPI vp = new GUICreatorAPI("&a&lVIP", 54, p);
		new Tasker() {
			public void run() {
	    
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.LIME_STAINED_GLASS);
	    czk.setDisplayName("&a&lVIP pro Česko:");
	    czk.addLore("&6&lC&f&lena: &350kč");
	    czk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 50 VIP NICK");
	    czk.addLore("&6&lNa &f&lčíslo: &390733.");
	    czk.addLore("&aVIP je na &631 dní.");
	    czk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    vp.setItem(20, new ItemGUI(czk.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.GREEN_STAINED_GLASS);
	    svk.setDisplayName("&a&lVIP pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &32€");
	    svk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 2 VIP NICK");
	    svk.addLore("&6&lNa &f&lčíslo: &38866.");
	    svk.addLore("&aVIP je na &631 dní.");
	    svk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    vp.setItem(29, new ItemGUI(svk.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
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
	    vyhody.addLore("&9&l• &eMožnost psát barevné zprávy na cedulky nebo do chatu.");
	    vyhody.addLore("&9&l• &ePráva na &6Dřevenej &ea &8Kamennej &7Grappler. &e(/ghmenu)");
	    vp.setItem(23, new ItemGUI(vyhody.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
	    ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
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
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		vp.setItem(49, new ItemGUI(back.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
}
