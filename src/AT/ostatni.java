package AT;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import Utils.Groups;
import Utils.Utils;
import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;
import sm.AllGuis;

public class ostatni {
	public static void ostatnit(Player p) {
		GUI g = new GUI("!#D3941D&lOstatní členové Teamu!#B5C208", 54, p);
		new Tasker() {
		public void run() {
			Utils.metoda(g, 24,"Snixolinka", Groups.EVENTERKA);
			Utils.metoda(g, 20,"TheOrsy", Groups.ZAKLADATEL);
			Utils.metoda(g, 22,"Hoff", Groups.ZAKLADATEL);
			ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.ORANGE_STAINED_GLASS_PANE, 1, "")){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			};
			int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
			for (int slot : slots) {
				g.setItem(slot, okraj);
			}
		
		g.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")) {
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				AllGuis.ATGUI(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});		
		}}.runTaskSync();
	}
}
