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
public class vedenit {
	
	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void vedeni(Player p) {
		GUICreatorAPI v = new GUICreatorAPI("&c&lVedení serveru", 54, p);

		new Tasker() {
		public void run() {
			
			ItemGUI okraj = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
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
			v.setItem(9, okraj);
			ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			v.setItem(49, new ItemGUI(back.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					AllGuis.ATGUI(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
		
		ItemCreatorAPI houskaa = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		houskaa.setSkullType("PLAYER");
		houskaa.setOwner("Houska02");
		houskaa.setDisplayName("&e&lHouska02");
		houskaa.addLore("&aPozice: &bMajitel");
		Player s = Bukkit.getPlayer("Houska02");
		houskaa.addLore("&aStatus: " + (s!=null && s.getName().equals("Houska02") ? "&2&lONLINE" : "&4&lOFFLINE"));
		v.setItem(13, new ItemGUI(houskaa.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				new UserAT("Houska02", p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		
		ItemCreatorAPI straiky = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		straiky.setSkullType("PLAYER");
		straiky.setOwner("StraikerinaCZ");
		straiky.setDisplayName("&e&lStraikerinaCZ");
		straiky.addLore("&aPozice: &3Developer");
	    s = Bukkit.getPlayer("StraikerinaCZ");
		straiky.addLore("&aStatus: " + (s!=null && s.getName().equals("StraikerinaCZ") ? "&2&lONLINE" : "&4&lOFFLINE"));
		v.setItem(31, new ItemGUI(straiky.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				new UserAT("StraikerinaCZ", p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		
		ItemCreatorAPI rajskoo = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		rajskoo.setSkullType("PLAYER");
		rajskoo.setOwner("_ItsRajsko_");
		rajskoo.setDisplayName("&e&l_ItsRajsko_");
		rajskoo.addLore("&aPozice: &4Admin");
		s = Bukkit.getPlayer("_ItsRajsko_");
		rajskoo.addLore("&aStatus: " + (s!=null && s.getName().equals("_ItsRajsko_") ? "&2&lONLINE" : "&4&lOFFLINE"));
		v.setItem(29, new ItemGUI(rajskoo.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				new UserAT("_ItsRajsko_", p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		
		ItemCreatorAPI bobo = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
		bobo.setSkullType("PLAYER");
		bobo.setOwner("BobaFett");
		bobo.setDisplayName("&e&lBobaFett");
		bobo.addLore("&aPozice: &4Admin");
		s = Bukkit.getPlayer("BobaFett");
		bobo.addLore("&aStatus: " + (s!=null && s.getName().equals("BobaFett") ? "&2&lONLINE" : "&4&lOFFLINE"));
		v.setItem(33, new ItemGUI(bobo.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				new UserAT("BobaFett", p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		}}.runAsync();
	}
	
}
