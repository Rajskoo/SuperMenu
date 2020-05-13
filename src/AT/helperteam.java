package AT;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import CleniAT.bayis;
import CleniAT.endiman;
import CleniAT.wolfik;
import me.Straiker123.GUICreatorAPI;
import me.Straiker123.GUICreatorAPI.Options;
import me.Straiker123.ItemCreatorAPI;
import me.Straiker123.TheAPI;
import sm.AllGuis;

@SuppressWarnings("deprecation")
public class helperteam {

	static String p1 = "&0[&6Msg&0] ";
	static String p2 = "&0[&6Mail&0] ";
	

	public static void helpert(Player p) {
			GUICreatorAPI b = TheAPI.getGUICreatorAPI(p);
			b.setSize(54);
			b.setTitle("&5&lHelper Tým");
			HashMap<Options, Object> ops = new HashMap<Options, Object>();
			ops.put(Options.CANT_BE_TAKEN, true);
			
			String bay = "&7(&4&lOFFLINE&7)";
			String endi = "&7(&4&lOFFLINE&7)";
			String wolf = "&7(&4&lOFFLINE&7)";
			String wwolf = "&cnull";
			String wbay = "&cnull";
			String wendi = "&cnull";
			
			for (Player ssp: Bukkit.getOnlinePlayers()) {	
	        	if(ssp.getName().equals("BaySirak")) {
	        		bay = "&7(&2&lONLINE&7)";
	        		wbay = ssp.getWorld().getName();
	        		continue;
	        	}
	        	if(ssp.getName().equals("EndivMan594")) {
	        		endi = "&7(&2&lONLINE&7)";
	        		wendi = ssp.getWorld().getName();
	        		continue;
	        	}
	        	
	        	if(ssp.getName().equals("Wolfik135")) {
	        		wolf = "&7(&2&lONLINE&7)";
	        		wwolf = ssp.getWorld().getName();
	        		continue;
	        	}
			}
			
			ItemCreatorAPI free = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
			free.setSkullType(SkullType.PLAYER);
			free.setOwner("Booperr");
			free.setDisplayName("&a&lVolná pozice");
			free.addLore("&6Hledáme..");
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			b.setItem(20, free.create(), ops);
			
			ops.remove(Options.RUNNABLE);
			
			ItemCreatorAPI wolfs = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
			wolfs.setSkullType(SkullType.PLAYER);
			wolfs.setOwner("Wolfik135");
			wolfs.setDisplayName("&e&lWolfik135");
			wolfs.addLore("&aPozice: &5.Helper");
			wolfs.addLore("&aStatus: " + wolf);
			wolfs.addLore("&aSvět: &7" + wwolf);
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					wolfik.wolff(p);
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			b.setItem(22, wolfs.create(), ops);
			
			ops.remove(Options.RUNNABLE);
			
			ItemCreatorAPI end = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
			end.setSkullType(SkullType.PLAYER);
			end.setOwner("EndivMan694");
			end.setDisplayName("&e&lEndivMan594");
			end.addLore("&aPozice: &5Helper");
			end.addLore("&aStatus: " + endi);
			end.addLore("&aSvět: &7" + wendi);
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					endiman.endo(p);
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			b.setItem(24, end.create(), ops);
			
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
