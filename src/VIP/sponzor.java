package VIP;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;

public class sponzor {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void Sponzor(Player p) {
		GUI spzr = new GUI("&b&lSponzor", 54, p);
		new Tasker() {
			public void run() {
		
		ItemStack czk = ItemCreatorAPI.create(Material.ORANGE_STAINED_GLASS, 1, "&b&lSponzor pro Česko:", Arrays.asList(
				"&6&lC&f&lena: &3500kč",
				"&6&lP&f&lladba možná pouze přes &6&lPayPal.",
				"&bSponzor je navždy."));
	    spzr.setItem(20, new ItemGUI(czk){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	    
	    ItemStack svk = ItemCreatorAPI.create(Material.RED_STAINED_GLASS, 1, "&b&lSponzor pro Slovensko:", Arrays.asList(
	    		"&6&lC&f&lena: &320€",
	    		"&6&lP&f&lladba možná pouze přes &6&lPayPal.",
				"&bSponzor je navždy."));
	    spzr.setItem(29, new ItemGUI(svk){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	    
        ItemStack vyhody = ItemCreatorAPI.create(Material.DIAMOND, 1, "&b&lSponor Výhody:", Arrays.asList(
        		"&9&l• &ePrefix v Chatu a TABu &bSponzor",
        		"&9&l• &ePri koupě dostanete &625,000$",
        		"&9&l• &eStejná práva jako &aVIP a &6Super&aVIP.",
        		"&9&l• &eSponzorské residence (20 residencí o velikosti 350x350).",
        		"&9&l• &eNezničitelné nástroje, vlastní názvy a lore &7(&6/item&7).",
        		"&9&l• &6/kit Sponzor &e(Enchantované diamantové nástroje).",
        		"&9&l• &eMožnost měnit hrení mód mezi Survival, Spectator, Adventure.",
        		"&9&l• &cCREATIVE mód není obsažen!"));
	    spzr.setItem(23, new ItemGUI(vyhody){
			@Override
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	    
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
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
		spzr.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				sm.AllGuis.vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runTaskSync();
	}
	
}
