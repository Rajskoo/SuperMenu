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
public class vedenit {
	
	public static void vedeni(Player p) {
		GUICreatorAPI v = TheAPI.getGUICreatorAPI(p);
		v.setSize(54);
		v.setTitle("&c&lVedení serveru");
		v.open();

		new Tasker() {
		public void run() {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
		ops.put(Options.CANT_BE_TAKEN, true);
		ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		v.setItem(0, okraj.create(), ops);
		v.setItem(1, okraj.create(), ops);
		v.setItem(7, okraj.create(), ops);
		v.setItem(8, okraj.create(), ops);
		v.setItem(17, okraj.create(), ops);
		v.setItem(44, okraj.create(), ops);
		v.setItem(53, okraj.create(), ops);
		v.setItem(52, okraj.create(), ops);
		v.setItem(46, okraj.create(), ops);
		v.setItem(45, okraj.create(), ops);
		v.setItem(36, okraj.create(), ops);
		v.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				AllGuis.ATGUI(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		v.setItem(49, back.create(), ops);
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI houskaa = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		houskaa.setSkullType("PLAYER");
		//zkus houskaa.setOwner("Houska02");
		houskaa.setOwnerFromWeb("https://sessionserver.mojang.com/session/minecraft/profile/"+Bukkit.getOfflinePlayer("StraikerinaCZ").getUniqueId().toString());
		houskaa.setDisplayName("&e&lHouska02");
		houskaa.addLore("&aPozice: &3Majitel");
		Player s = Bukkit.getPlayer("Houska02");
		houskaa.addLore("&aStatus: " + (s!=null && s.getName().equals("Houska02") ? "Online" : "Offline"));
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new UserAT("Houska02", p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		v.setItem(13, houskaa.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		
		ItemCreatorAPI rajskoo = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		rajskoo.setSkullType("PLAYER");
		rajskoo.setOwner("_ItsRajsko_");
		rajskoo.setDisplayName("&e&l_ItsRajsko_");
		rajskoo.addLore("&aPozice: &4Admin");
		s = Bukkit.getPlayer("_ItsRajsko_");
		rajskoo.addLore("&aStatus: " + (s!=null && s.getName().equals("_ItsRajsko_") ? "Online" : "Offline"));
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new UserAT("_ItsRajsko_", p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		v.setItem(29, rajskoo.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		
		ItemCreatorAPI bobo = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		bobo.setSkullType("PLAYER");
		bobo.setOwner("BobaFett");
		bobo.setDisplayName("&e&lBobaFett");
		bobo.addLore("&aPozice: &4Admin");
		s = Bukkit.getPlayer("BobaFett");
		bobo.addLore("&aStatus: " + (s!=null && s.getName().equals("BobaFett") ? "Online" : "Offline"));
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new UserAT("BobaFett", p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		v.setItem(33, bobo.create(), ops);
		}}.runAsync();
	}
	
}
