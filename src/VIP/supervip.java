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

public class supervip {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void SuperVIP(Player p) {
		GUICreatorAPI sprvp = new GUICreatorAPI("&6&lSuper&a&lVIP", 54, p);
		new Tasker() { 
			public void run() {
	    
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.ORANGE_STAINED_GLASS);
	    czk.setDisplayName("&6&lSuper&a&lVIP pro Česko:");
	    czk.addLore("&6&lC&f&lena: &399kč");
	    czk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 99 SUPERVIP NICK");
	    czk.addLore("&6&lNa &f&lčíslo: &390733.");
	    czk.addLore("&6Super&aVIP je na &631 dní.");
	    czk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    sprvp.setItem(20, new ItemGUI(czk.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.RED_STAINED_GLASS);
	    svk.setDisplayName("&6&lSuper&a&lVIP pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &34€");
	    svk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 4 SUPERVIP NICK");
	    svk.addLore("&6&lNa &f&lčíslo: &38866.");
	    svk.addLore("&6Super&aVIP je na &631 dní.");
	    svk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    sprvp.setItem(29, new ItemGUI(svk.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
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
	    sprvp.setItem(23, new ItemGUI(vyhody.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
	    ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
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
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		sprvp.setItem(49, new ItemGUI(back.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
}
