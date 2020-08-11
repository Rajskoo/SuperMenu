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
public class ostatni {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
		public static void ostatnit(Player p) {
				GUICreatorAPI b = new GUICreatorAPI("&6&lOstatní členové Teamu", 54, p);
				new Tasker() {
				public void run() {
				ItemCreatorAPI seal = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
				seal.setSkullType("PLAYER");
				seal.setOwner("Saelo");
				seal.setDisplayName("&e&lSaelo");
				seal.addLore("&aPozice: &6Eventer");
				Player s = Bukkit.getPlayer("Saelo");
				seal.addLore("&aStatus: " + (s!=null && s.getName().equals("Saelo") ? "&2&lONLINE" : "&4&lOFFLINE"));
				b.setItem(22, new ItemGUI(seal.create()){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
						new UserAT("Saelo", p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				
				ItemCreatorAPI orsy = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
				orsy.setSkullType("PLAYER");
				orsy.setOwner("TheOrsy");
				orsy.setDisplayName("&e&lTheOrsy");
				orsy.addLore("&aPozice: &cZakladatel");
				s = Bukkit.getPlayer("TheOrsy");
				orsy.addLore("&aStatus: " + (s!=null && s.getName().equals("TheOrsy") ? "&2&lONLINE" : "&4&lOFFLINE"));
				b.setItem(24, new ItemGUI(orsy.create()){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
						new UserAT("TheOrsy", p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				
				ItemCreatorAPI hoff = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
				hoff.setSkullType("PLAYER");
				hoff.setOwner("Hoff");
				hoff.setDisplayName("&e&lHoff");
				hoff.addLore("&aPozice: &cZakladatel");
				s = Bukkit.getPlayer("Hoff");
				hoff.addLore("&aStatus: " + (s!=null && s.getName().equals("Hoff") ? "&2&lONLINE" : "&4&lOFFLINE"));
				b.setItem(20, new ItemGUI(hoff.create()){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
						new UserAT("Hoff", p);
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
