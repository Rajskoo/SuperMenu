package AT;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import CleniAT.matimat;
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
		
		String matisek = "&4&lOFFLINE";
		String wmat = "&cnull";
		
		for (Player ssp: Bukkit.getOnlinePlayers()) {	
        	if(ssp.getName().equals("Tramicful")) {
        		matisek = "&2&lONLINE";
        		wmat = ssp.getWorld().getName();
        		continue;
        	}
		}
		
		ItemCreatorAPI mat = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		mat.setSkullType(SkullType.PLAYER);
		mat.setOwner("_Matesak_");
		mat.setDisplayName("&e&_Matesak_");
		mat.addLore("&aPozice: &2Zk.Builder");
		mat.addLore("&aStatus: " + matisek);
		mat.addLore("&aSvět: &7" + wmat);
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				matimat.matesak(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		b.setItem(13, mat.create(), ops);
		
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
