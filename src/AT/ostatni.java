package AT;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import CleniAT.orsyy;
import CleniAT.saeloo;
import me.Straiker123.GUICreatorAPI;
import me.Straiker123.ItemCreatorAPI;
import me.Straiker123.TheAPI;
import me.Straiker123.GUICreatorAPI.Options;
import sm.AllGuis;

@SuppressWarnings("deprecation")
public class ostatni {

		static String p2 = "&0[&6Mail&0] ";
		
		public static void ostatnit(Player p) {
				GUICreatorAPI b = TheAPI.getGUICreatorAPI(p);
				b.setSize(54);
				b.setTitle("&6&lOstatní členové AT");
				HashMap<Options, Object> ops = new HashMap<Options, Object>();
				ops.put(Options.CANT_BE_TAKEN, true);
				
				String saelo = "&7(&4&lOFFLINE&7)";
				String theorsy = "&7(&4&lOFFLINE&7)";
				String wsaelo = "&cnull";
				String worsy = "&cnull";
				
				for (Player ssp: Bukkit.getOnlinePlayers()) {	
		        	if(ssp.getName().equals("Saelo")) {
		        		saelo = "&7(&2&lONLINE&7)";
		        		wsaelo = ssp.getWorld().getName();
		        		continue;
		        	}
		        	if(ssp.getName().equals("TheOrsy")) {
		        		theorsy = "&7(&2&lONLINE&7)";
		        		worsy = ssp.getWorld().getName();
		        		continue;
		        	}
				}
				
				ItemCreatorAPI seal = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
				seal.setSkullType(SkullType.PLAYER);
				seal.setOwner("Saelo");
				seal.setDisplayName("&e&lSaelo");
				seal.addLore("&aPozice: &6Eventer");
				seal.addLore("&aStatus: " + saelo);
				seal.addLore("&aSvět: &7" + wsaelo);
				ops.put(Options.RUNNABLE, new Runnable() {
					public void run() {
						saeloo.sealo(p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				b.setItem(20, seal.create(), ops);
				
				ops.remove(Options.RUNNABLE);
				
				ItemCreatorAPI orsy = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
				orsy.setSkullType(SkullType.PLAYER);
				orsy.setOwner("TheOrsy");
				orsy.setDisplayName("&e&lTheOrsy");
				orsy.addLore("&aPozice: &cZakladatel");
				orsy.addLore("&aStatus: " + theorsy);
				orsy.addLore("&aSvět: &7" + worsy);
				ops.put(Options.RUNNABLE, new Runnable() {
					public void run() {
						orsyy.torsy(p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				b.setItem(24, orsy.create(), ops);
				
				ops.remove(Options.RUNNABLE);
				
				ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
				b.setItem(0, okraj.create(), ops);
				b.setItem(1, okraj.create(), ops);
				b.setItem(7, okraj.create(), ops);
				b.setItem(8, okraj.create(), ops);
				b.setItem(17, okraj.create(), ops);
				b.setItem(44, okraj.create(), ops);
				b.setItem(53, okraj.create(), ops);
				b.setItem(52, okraj.create(), ops);
				b.setItem(45, okraj.create(), ops);
				b.setItem(46, okraj.create(), ops);
				b.setItem(36, okraj.create(), ops);
				b.setItem(9, okraj.create(), ops);
				ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
				back.setDisplayName("&4&lBack");
				ops.put(Options.RUNNABLE, new Runnable() {
					public void run() {
						AllGuis.ATGUI(p);
						p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
					}
				});
				b.setItem(49, back.create(), ops);
				
				b.open();
			}
	
}
