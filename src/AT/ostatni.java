package AT;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import CleniAT.UserAT;
import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;
import me.DevTec.GUI.GUICreatorAPI;
import me.DevTec.GUI.GUICreatorAPI.Options;
import me.DevTec.Scheduler.Tasker;
import sm.AllGuis;

@SuppressWarnings("deprecation")
public class ostatni {

		static String p2 = "&0[&6Mail&0] ";
		
		public static void ostatnit(Player p) {
				GUICreatorAPI b = TheAPI.getGUICreatorAPI(p);
				b.setSize(54);
				b.setTitle("&6&lOstatní členové AT");
				b.open();
				new Tasker() {
				public void run() {
				HashMap<Options, Object> ops = new HashMap<Options, Object>();
				ops.put(Options.CANT_BE_TAKEN, true);
				ItemCreatorAPI seal = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
				seal.setSkullType("PLAYER");
				seal.setOwner("Saelo");
				seal.setDisplayName("&e&lSaelo");
				seal.addLore("&aPozice: &6Eventer");
				Player s = Bukkit.getPlayer("Saelo");
				seal.addLore("&aStatus: " + (s!=null && s.getName().equals("Saelo") ? "Online" : "Offline"));
				ops.put(Options.RUNNABLE, new Runnable() {
					public void run() {
						new UserAT("Saelo", p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				b.setItem(22, seal.create(), ops);
				
				ops.remove(Options.RUNNABLE);
				
				ItemCreatorAPI orsy = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
				orsy.setSkullType("PLAYER");
				orsy.setOwner("TheOrsy");
				orsy.setDisplayName("&e&lTheOrsy");
				orsy.addLore("&aPozice: &cZakladatel");
				s = Bukkit.getPlayer("TheOrsy");
				orsy.addLore("&aStatus: " + (s!=null && s.getName().equals("TheOrsy") ? "Online" : "Offline"));
				ops.put(Options.RUNNABLE, new Runnable() {
					public void run() {
						new UserAT("TheOrsy", p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				b.setItem(24, orsy.create(), ops);
				
				ops.remove(Options.RUNNABLE);
				
				ItemCreatorAPI hoffo = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
				hoffo.setSkullType("PLAYER");
				hoffo.setOwner("Hoff");
				hoffo.setDisplayName("&e&lHoff");
				hoffo.addLore("&aPozice: &6Zakladatel");
				s = Bukkit.getPlayer("Hoff");
				hoffo.addLore("&aStatus: " + (s!=null && s.getName().equals("Hoff") ? "Online" : "Offline"));
				ops.put(Options.RUNNABLE, new Runnable() {
					public void run() {
						new UserAT("Hoff", p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				b.setItem(20, hoffo.create(), ops);
				
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
				}}.runAsync();
			}
	
}
