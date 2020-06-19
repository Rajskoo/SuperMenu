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
public class helperteam {

	static String p1 = "&0[&6Msg&0] ";
	static String p2 = "&0[&6Mail&0] ";
	//dal si to dodělej :P

	public static void helpert(Player p) {
			GUICreatorAPI b = TheAPI.getGUICreatorAPI(p);
			b.setSize(54);
			b.setTitle("&5&lHelper Tým");
			b.open();
			//díky runasync můžeme odstranit laggs při načítání -> pokud se to nějak laggne či když to trvá dlouho tak se menu otevře hned a ten určitý item/y načítají postupně
			new Tasker() { //viz Prison, top menu, oka
			public void run() {
			HashMap<Options, Object> ops = new HashMap<Options, Object>();
			ops.put(Options.CANT_BE_TAKEN, true);
			ItemCreatorAPI tomm = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
			tomm.setSkullType("PLAYER");
			tomm.setOwner("Tomm99");
			tomm.setDisplayName("&e&lTomm99");
			tomm.addLore("&aPozice: &5Zk.Helper");
			Player s = Bukkit.getPlayer("Tomm99");
			tomm.addLore("&aStatus: " + (s!=null && s.getName().equals("Tomm99") ? "Online" : "Offline"));
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					new UserAT("Tomm99",p);
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			b.setItem(20, tomm.create(), ops);
			
			ops.remove(Options.RUNNABLE);
			ItemCreatorAPI Pernik = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
			Pernik.setSkullType("PLAYER");
			Pernik.setOwner("PRAZSKYpernik");
			Pernik.setDisplayName("&e&lPRAZSKYpernik");
			Pernik.addLore("&aPozice: &5Zk.Helper");
			s = Bukkit.getPlayer("PRAZSKYpernik");
			Pernik.addLore("&aStatus: " + (s!=null && s.getName().equals("PRAZSKYpernik") ? "Online" : "Offline"));
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					new UserAT("PRAZSKYpernik",p);
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			b.setItem(22, Pernik.create(), ops);
			
			ops.remove(Options.RUNNABLE);
			
			ItemCreatorAPI drakovix = TheAPI.getItemCreatorAPI(Material.LEGACY_SKULL_ITEM);
			drakovix.setSkullType("PLAYER");
			drakovix.setOwner("drakovix");
			drakovix.setDisplayName("&e&ldrakovix");
			drakovix.addLore("&aPozice: &5Zk.Helper");
			s = Bukkit.getPlayer("drakovix");
			drakovix.addLore("&aStatus: " + (s!=null && s.getName().equals("drakovix") ? "Online" : "Offline"));
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					new UserAT("drakovix",p);
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				}
			});
			b.setItem(24, drakovix.create(), ops);
			
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
			b.setItem(46, okraj.create(), ops);
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
