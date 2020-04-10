package AT;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import CleniAT.bobko;
import CleniAT.hoff;
import CleniAT.houska;
import CleniAT.rajskooo;
import me.Straiker123.GUICreatorAPI;
import me.Straiker123.GUICreatorAPI.Options;
import me.Straiker123.ItemCreatorAPI;
import me.Straiker123.TheAPI;
import sm.AllGuis;

@SuppressWarnings("deprecation")
public class vedenit {
	
	public static void vedeni(Player p) {
		GUICreatorAPI v = TheAPI.getGUICreatorAPI(p);
		v.setSize(54);
		v.setTitle("&c&lVedení serveru");
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
		ops.put(Options.CANT_BE_TAKEN, true);
		
		String hoffi = "&7(&4&lOFFLINE&7)";
		String houskaaa = "&7(&4&lOFFLINE&7)";
		String rajsko = "&7(&4&lOFFLINE&7)";
		String bobik = "&7(&4&lOFFLINE&7)";
		String whoff = "&cnull";
		String whouska = "&cnull";
		String wrajsko = "&cnull";
		String wbob = "&cnull";
		
		for (Player ssp: Bukkit.getOnlinePlayers()) {	
        	if(ssp.getName().equals("Hoff")) {
        		hoffi = "&7(&2&lONLINE&7)";
        		whoff = ssp.getWorld().getName();
        	}
        	if(ssp.getName().equals("Houska02")) {
        		houskaaa = "&7(&2&lONLINE&7)";
        		whouska = ssp.getWorld().getName();
        	}
        	if(ssp.getName().equals("_ItsRajsko_")) {
        		rajsko = "&7(&2&lONLINE&7)";
        		wrajsko = ssp.getWorld().getName();
        	}
        	if(ssp.getName().equals("BobaFett")) {
        		bobik = "&7(&2&lONLINE&7)";
        		wbob = ssp.getWorld().getName();
        	}
		}
		
		ItemCreatorAPI hoffo = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		hoffo.setSkullType(SkullType.PLAYER);
		hoffo.setOwner("Hoff");
		hoffo.setDisplayName("&e&lHoff");
		hoffo.addLore("&aPozice: &3Majitel");
		hoffo.addLore("&aStatus: " + hoffi);
		hoffo.addLore("&aSvět: &7" + whoff);
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				hoff.hoffik(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		v.setItem(13, hoffo.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		
		ItemCreatorAPI houskaa = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		houskaa.setSkullType(SkullType.PLAYER);
		houskaa.setOwner("Houska02");
		houskaa.setDisplayName("&e&lHouska02");
		houskaa.addLore("&aPozice: &bDeveloper");
		houskaa.addLore("&aStatus: " + houskaaa);
		houskaa.addLore("&aSvět: &7" + whouska);
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				houska.houskaaaa(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		v.setItem(22, houskaa.create(), ops);
		
		ItemCreatorAPI rajskoo = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		rajskoo.setSkullType(SkullType.PLAYER);
		rajskoo.setOwner("_ItsRajsko_");
		rajskoo.setDisplayName("&e&l_ItsRajsko_");
		rajskoo.addLore("&aPozice: &4Admin");
		rajskoo.addLore("&aStatus: " + rajsko);
		rajskoo.addLore("&aSvět: &7" + wrajsko);
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				rajskooo.rajce(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		v.setItem(29, rajskoo.create(), ops);
		
		ItemCreatorAPI bobo = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		bobo.setSkullType(SkullType.PLAYER);
		bobo.setOwner("BobaFett");
		bobo.setDisplayName("&e&lBobaFett");
		bobo.addLore("&aPozice: &4Admin");
		bobo.addLore("&aStatus: " + bobik);
		bobo.addLore("&aSvět: &7" + wbob);
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				bobko.bobek(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		v.setItem(33, bobo.create(), ops);
		
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
		
		v.open();
	}
	
}
