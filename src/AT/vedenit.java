package AT;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;
import sm.AllGuis;

public class vedenit {
	
	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void vedeni(Player p) {
		GUI v = new GUI("&c&lVedení serveru", 54, p);

		new Tasker() {
		public void run() {
			
			ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			};
			v.setItem(0, okraj);
			v.setItem(1, okraj);
			v.setItem(7, okraj);
			v.setItem(8, okraj);
			v.setItem(17, okraj);
			v.setItem(44, okraj);
			v.setItem(53, okraj);
			v.setItem(52, okraj);
			v.setItem(45, okraj);
			v.setItem(36, okraj);
			v.setItem(46, okraj);
			v.setItem(9, okraj);
			ItemStack back = ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack");
			v.setItem(49, new ItemGUI(back){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
					AllGuis.ATGUI(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
		
			Player s = p;
			ItemStack houska = ItemCreatorAPI.createHead(1, "&e&lHouska02", "Houska02", Arrays.asList("&aPozice: &3Majitel", "&aStatus: " + (s!=null && s.getName().equals("Houska02") ? "&2&lONLINE" : "&4&lOFFLINE")));
			v.setItem(13, new ItemGUI(houska){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			});
		
			ItemStack straiky = ItemCreatorAPI.createHead(1, "&e&lStraikerinaCZ", "StraikerinaCZ", Arrays.asList("&aPozice: &9Developer", "&aStatus: " + (s!=null && s.getName().equals("StraikerinaCZ") ? "&2&lONLINE" : "&4&lOFFLINE")));
			v.setItem(33, new ItemGUI(straiky){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			});
		
			ItemStack rajsko = ItemCreatorAPI.createHead(1, "&e&l_ItsRajsko_", "_ItsRajsko_", Arrays.asList("&aPozice: &4Admin", "&aStatus: " + (s!=null && s.getName().equals("_ItsRajsko_") ? "&2&lONLINE" : "&4&lOFFLINE")));
			v.setItem(29, new ItemGUI(rajsko){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			});
		}}.runAsync();
	}
	
}
