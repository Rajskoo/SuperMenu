package AT;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import Utils.Groups;
import Utils.Utils;
import me.devtec.theapi.apis.ItemCreatorAPI;
import me.devtec.theapi.guiapi.GUI;
import me.devtec.theapi.guiapi.ItemGUI;
import sm.AllGuis;

public class helperteam {
    public static void helpert(Player p) {
		GUI g = new GUI("!#6F18A3&lHelper Team!#B808C2", 54, p);
	
		Utils.metoda(g, 20,"LeaftyCz", Groups.HELPER);
		Utils.metoda(g, 22,"123456", Groups.HELPER);
		Utils.metoda(g, 24,"YfrosT", Groups.ZKHELPER);
	ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.PURPLE_STAINED_GLASS_PANE, 1, "")){
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
