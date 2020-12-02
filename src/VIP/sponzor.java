package VIP;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import Utils.Utils;
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
		GUI g = new GUI("&b&lSponzor", 54, p);
		new Tasker() {
			public void run() {
		
				Utils.metoda2(g, Material.ORANGE_STAINED_GLASS, "&b&lSponzor pro Česko:", 1, 20, Arrays.asList("&6&lC&f&lena: &3500kč",
				"&6&lP&f&llatba možná pouze přes &6&lPayPal.",
				"&bSponzor je navždy."));
				Utils.metoda2(g, Material.RED_STAINED_GLASS, "&b&lSponzor pro Slovensko:",1,29, Arrays.asList("&6&lC&f&lena: &320€",
	    		"&6&lP&f&llatba možná pouze přes &6&lPayPal.",
				"&bSponzor je navždy."));
				Utils.metoda2(g, Material.DIAMOND, "&b&lVýhody Sponzora:",1,23,Arrays.asList("&9&l• &ePrefix v Chatu a TABu &bSponzor",
        		"&9&l• &ePři koupi dostanete &625,000$ &ejako dárek",
        		"&9&l• &eStejná práva jako &6Super&aVIP.",
        		"&9&l• &eSponzorské residence (20 residencí o velikosti 350x350).",
        		"&9&l• &eNezničitelné nástroje, vlastní názvy a lore &7(&6/item&7).",
        		"&9&l• &6/kit Sponzor &e(Enchantované diamantové nástroje).",
        		"&9&l• &eMožnost měnit herní mód mezi Survivalem, Spectatorem a Adventurem.",
        		"&9&l• &cKreativní mód není obsažen!"));	    
        
	    
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		int[] slots = {0,1,7,8,17,44,53,52,46,45,36,9,49};
		for(int i : slots) {
			Utils.metoda2(g,Material.BLACK_STAINED_GLASS_PANE, "",1, i);
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
