package AT;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import CleniAT.palko;
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
			
			String palino = "&4&lOFFLINE";
			String wolf = "&4&lOFFLINE";
			String wwolf = "&cnull";
			String wpalko = "&cnull";
			
			for (Player ssp: Bukkit.getOnlinePlayers()) {	
	        	if(ssp.getName().equals("Wolfik135")) {
	        		wolf = "&2&lONLINE";
	        		wwolf = ssp.getWorld().getName();
	        		continue;
	        	}
	        	if(ssp.getName().equals("P4LKO")) {
	        		palino = "&2&lONLINE";
	        		wpalko = ssp.getWorld().getName();
	        		continue;
	        	}
			}

			ItemCreatorAPI wolfs = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
			wolfs.setSkullType(SkullType.PLAYER);
			wolfs.setOwner("Wolfik135");
			wolfs.setDisplayName("&e&lWolfik135");
			wolfs.addLore("&aPozice: &5Helper");
			wolfs.addLore("&aStatus: " + wolf);
			wolfs.addLore("&aSvět: &7" + wwolf);
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					wolfik.wolff(p);
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			b.setItem(21, wolfs.create(), ops);
			
			ops.remove(Options.RUNNABLE);
			
			ItemCreatorAPI palec = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
			palec.setSkullType(SkullType.PLAYER);
			palec.setOwner("P4LKO");
			palec.setDisplayName("&e&lP4LKO");
			palec.addLore("&aPozice: &5Helper");
			palec.addLore("&aStatus: " + palino);
			palec.addLore("&aSvět: &7" + wpalko);
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					palko.p4lko(p);
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			b.setItem(33, palec.create(), ops);
			
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
