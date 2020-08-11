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

public class sponzor {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void Sponzor(Player p) {
		GUICreatorAPI spzr = new GUICreatorAPI("&b&lSponzor", 54, p);
		new Tasker() {
			public void run() {
		
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.ORANGE_STAINED_GLASS);
	    czk.setDisplayName("&b&lSponzor pro Česko:");
	    czk.addLore("&6&lC&f&lena: &3500kč");
	    czk.addLore("&6&lP&f&lladba možná pouze přes &6&lPayPal.");
	    czk.addLore("&bSponzor je navždy.");
	    spzr.setItem(20, new ItemGUI(czk.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.RED_STAINED_GLASS);
	    svk.setDisplayName("&b&lSponzor pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &320€");
	    svk.addLore("&6&lP&f&lladba možná pouze přes &6&lPayPal.");
	    svk.addLore("&bSponzor je navždy.");
	    spzr.setItem(29, new ItemGUI(svk.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
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
	    spzr.setItem(23, new ItemGUI(vyhody.create()){
			@Override
			public void onClick(Player arg0, GUICreatorAPI arg1, ClickType arg2) {
			}
		});
	    
	    ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
		spzr.setItem(0, item);
		spzr.setItem(1, item);
		spzr.setItem(7, item);
		spzr.setItem(8, item);
		spzr.setItem(17, item);
		spzr.setItem(44, item);
		spzr.setItem(53, item);
		spzr.setItem(52, item);
		spzr.setItem(46, item);
		spzr.setItem(45, item);
		spzr.setItem(36, item);
		spzr.setItem(9, item);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		spzr.setItem(49, new ItemGUI(back.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
}
