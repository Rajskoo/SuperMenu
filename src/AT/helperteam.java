package AT;

import java.util.Arrays;

import org.bukkit.Bukkit;
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

public class helperteam {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void helpert(Player p) {
			GUI b = new GUI("&5&lHelper Team", 54, p);
			new Tasker() {
			public void run() {
			Player s = Bukkit.getPlayer("petulikan1");
			ItemStack petulikan = ItemCreatorAPI.createHead(1, "&e&lpetulikan1", "petulikan1", Arrays.asList("&aPozice: &5Zk.Helper", "&aStatus: " + (s!=null && s.getName().equals("petulikan1") ? "&2&lONLINE" : "&4&lOFFLINE")));
			b.setItem(20, new ItemGUI(petulikan){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			});
			
			s = Bukkit.getPlayer("Rhys");
			ItemStack rhys = ItemCreatorAPI.createHead(1, "&e&lRhys", "Rhys", Arrays.asList("&aPozice: &5Zk.Helper", "&aStatus: " + (s!=null && s.getName().equals("Rhys") ? "&2&lONLINE" : "&4&lOFFLINE")));
			b.setItem(24, new ItemGUI(rhys){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			});
			
			ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
				}
			};
			b.setItem(0, okraj);
			b.setItem(1, okraj);
			b.setItem(7, okraj);
			b.setItem(8, okraj);
			b.setItem(17, okraj);
			b.setItem(44, okraj);
			b.setItem(53, okraj);
			b.setItem(52, okraj);
			b.setItem(45, okraj);
			b.setItem(46, okraj);
			b.setItem(36, okraj);
			b.setItem(9, okraj);
			ItemStack back = ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack");
			b.setItem(49, new ItemGUI(back){
				@Override
				public void onClick(Player p, GUI gui, ClickType c) {
					AllGuis.ATGUI(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
			}}.runAsync();
	}
	
}
