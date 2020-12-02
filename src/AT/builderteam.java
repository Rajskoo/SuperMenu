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
import sm.AllGuis;

public class builderteam {
	public static void buildert(Player p) {
		GUI g = new GUI("!#0D560A&lBuilder Team!#18A336", 54, p);
		Utils.metoda(g, 20,"CirikCZ", Groups.BUILDER);
		Utils.metoda(g, 22,"_Matesak_", Groups.BUILDER);
		Utils.metoda(g, 24,"Wint3CZ", Groups.ZKBUILDER);
		ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.GREEN_STAINED_GLASS_PANE, 1, "")){
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
	}	
			
}
	
