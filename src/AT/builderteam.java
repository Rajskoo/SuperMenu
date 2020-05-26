package AT;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import CleniAT.kiti;
import CleniAT.murreder;
import CleniAT.tramic;
import me.Straiker123.GUICreatorAPI;
import me.Straiker123.GUICreatorAPI.Options;
import me.Straiker123.ItemCreatorAPI;
import me.Straiker123.TheAPI;
import sm.AllGuis;

@SuppressWarnings("deprecation")
public class builderteam {

	public static void buildert(Player p) {
		GUICreatorAPI b = TheAPI.getGUICreatorAPI(p);
		b.setSize(54);
		b.setTitle("&2&lBuilder Tým");
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
		ops.put(Options.CANT_BE_TAKEN, true);
		//u koho jsem
		//houskad :D hezky on :D nmz dík :D teď se budu dívat jak to děláš :)))))
		//jistě XD ale ještě to musí někdo udělat rajčeti :D
		String trami = "&4&lOFFLINE";
		String kitini = "&4&lOFFLINE";
		String blood = "&4&lOFFLINE";
		String wkit = "&cnull";
		String wtrami = "&cnull";
		String wblood = "&cnull";
		
		for (Player ssp: Bukkit.getOnlinePlayers()) {	
        	if(ssp.getName().equals("Tramicful")) {
        		trami = "&2&lONLINE";
        		wtrami = ssp.getWorld().getName();
        		continue;
        	}
        	if(ssp.getName().equals("Kethanee")) {
        		kitini = "&2&lONLINE";
        		wkit = ssp.getWorld().getName();
        		continue;
        	}
        	if(ssp.getName().equals("Bloodmmureder")) {
        		blood = "&2&lONLINE";
        		wblood = ssp.getWorld().getName();
        		continue;
        	}
		}
		
		ItemCreatorAPI tram = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		tram.setSkullType(SkullType.PLAYER);
		tram.setOwner("Tramicful");
		tram.setDisplayName("&e&lTramicful");
		tram.addLore("&aPozice: &2Hl. Builder");
		tram.addLore("&aStatus: " + trami);
		tram.addLore("&aSvět: &7" + wtrami);
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				tramic.tramo(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		b.setItem(13, tram.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		
		ItemCreatorAPI kit = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		kit.setSkullType(SkullType.PLAYER);
		kit.setOwner("Kethanee");
		kit.setDisplayName("&e&lKethanee");
		kit.addLore("&aPozice: &2Builderka");
		kit.addLore("&aStatus: " + kitini);
		kit.addLore("&aSvět: &7" + wkit);
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				kiti.kitina(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		b.setItem(33, kit.create(), ops);
		
		ItemCreatorAPI bloody = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		bloody.setSkullType(SkullType.PLAYER);
		bloody.setOwner("Bloodmmureder");
		bloody.setDisplayName("&e&lBloodmmureder");
		bloody.addLore("&aPozice: &2Builder");
		bloody.addLore("&aStatus: " + blood);
		bloody.addLore("&aSvět: &7" + wblood);
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				murreder.murdi(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		b.setItem(29, bloody.create(), ops);
		
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
