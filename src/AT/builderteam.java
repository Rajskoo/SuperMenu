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
public class builderteam {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void buildert(Player p) {
		GUICreatorAPI b = new GUICreatorAPI("&2&lBuilder Team", 54, p);

		new Tasker() {
		public void run() {
		ItemCreatorAPI mat = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		mat.setSkullType("PLAYER");
		mat.setOwnerFromWeb("http://textures.minecraft.net/texture/1035c528036b384c53c9c8a1a125685e16bfb369c197cc9f03dfa3b835b1aa55");
		mat.setDisplayName("&e&lHLEDÁME!");
		mat.addLore("&aJestli jsi myslíš, že umíš stavět.");
		mat.addLore("&aUrčite se nám ozvi!");
		b.setItem(13, new ItemGUI(mat.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		});
		
		ItemCreatorAPI cirik = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		cirik.setSkullType("PLAYER");
		cirik.setOwner("CirikCZ");
		cirik.setDisplayName("&e&lCirikCZ");
		cirik.addLore("&aPozice: &2Builder");
	    Player s = Bukkit.getPlayer("CirikCZ");
		cirik.addLore("&aStatus: " + (s!=null && s.getName().equals("CirikCZ") ? "&2&lONLINE" : "&4&lOFFLINE"));
		b.setItem(31, new ItemGUI(cirik.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				new UserAT("CirikCZ", p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
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
