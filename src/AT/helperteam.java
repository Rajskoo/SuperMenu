package AT;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import CleniAT.UserAT;
import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;
import me.DevTec.GUI.GUICreatorAPI;
import me.DevTec.GUI.ItemGUI;
import me.DevTec.Scheduler.Tasker;
import sm.AllGuis;

@SuppressWarnings("deprecation")
public class helperteam {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void helpert(Player p) {
			GUICreatorAPI b = new GUICreatorAPI("&5&lHelper Team", 54, p);
			new Tasker() {
			public void run() {
			ItemCreatorAPI lava = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
			lava.setSkullType("PLAYER");
			lava.setOwner("Xlava_horsX");
			lava.setDisplayName("&e&lXlava_horsX");
			lava.addLore("&aPozice: &5Helperka");
			Player s = Bukkit.getPlayer("Xlava_horsX");
			lava.addLore("&aStatus: " + (s!=null && s.getName().equals("Xlava_horsX") ? "&2&lONLINE" : "&4&lOFFLINE"));
			b.setItem(20, new ItemGUI(lava.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					new UserAT("Xlava_horsX",p);
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			
			ItemCreatorAPI helper = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
			helper.setSkullType("PLAYER");
			helper.setOwnerFromWeb("http://textures.minecraft.net/texture/1035c528036b384c53c9c8a1a125685e16bfb369c197cc9f03dfa3b835b1aa55");
			helper.setDisplayName("&e&lHLEDÁME!");
			helper.addLore("&aJestli jsi myslíš, bys by nám mohl pomoct.");
			helper.addLore("&aUrčite se nám ozvi!");
			b.setItem(22, new ItemGUI(helper.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			});
			
			ItemGUI okraj = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
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
			b.setItem(36, okraj);
			b.setItem(9, okraj);
			ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			b.setItem(49, new ItemGUI(back.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					AllGuis.ATGUI(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
			}}.runAsync();
	}
	
}
