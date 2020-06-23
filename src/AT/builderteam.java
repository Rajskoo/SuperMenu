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
public class builderteam {

	public static void buildert(Player p) {
		GUICreatorAPI b = TheAPI.getGUICreatorAPI(p);
		b.setSize(54);
		b.setTitle("&2&lBuilder Tým");
		b.open();

		new Tasker() {
		public void run() {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
		ops.put(Options.CANT_BE_TAKEN, true);
		ItemCreatorAPI mat = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		mat.setSkullType("PLAYER");
		mat.setOwner("_Matesak_");
		mat.setDisplayName("&e&l_Matesak_");
		mat.addLore("&aPozice: &2Zk.Builder");
		Player s = Bukkit.getPlayer("_Matesak_");
		mat.addLore("&aStatus: " + (s!=null && s.getName().equals("_Matesak_") ? "&2&lONLINE" : "&4&lOFFLINE"));
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new UserAT("_Matesak_",p);
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
		}}.runAsync();
	}
}
