package GrapplingHook;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;
import me.DevTec.GUI.GUICreatorAPI;
import me.DevTec.GUI.GUICreatorAPI.Options;
import me.DevTec.Scheduler.Tasker;
import sm.AllGuis;

public class GHGUI {

	public static void Wood(Player p) {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	GUICreatorAPI gui = TheAPI.getGUICreatorAPI(p);
	gui.setSize(54);
	gui.setTitle("&6&lDøevenej Grappler");
	gui.open();
	new Tasker() {

		@Override
		public void run() {
		    ItemCreatorAPI glass = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		    ItemCreatorAPI fishingrod = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
		    ItemCreatorAPI wood = TheAPI.getItemCreatorAPI(Material.OAK_LOG);
		    
		    ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a10");
			
		    gui.setItem(0, glass.create(), ops);
		    gui.setItem(1, glass.create(), ops);
		    gui.setItem(2, glass.create(), ops);
		    gui.setItem(3, glass.create(), ops);
		    gui.setItem(4, glass.create(), ops);
		    gui.setItem(5, glass.create(), ops);
		    gui.setItem(6, glass.create(), ops);
		    gui.setItem(7, glass.create(), ops);
		    gui.setItem(8, glass.create(), ops);
		    gui.setItem(9, glass.create(), ops);
		    gui.setItem(11, wood.create(), ops);
		    gui.setItem(12, wood.create(), ops);
		    gui.setItem(21, wood.create(), ops);
		    gui.setItem(20, fishingrod.create(), ops);
		    gui.setItem(13, glass.create(), ops);
		    gui.setItem(24, grappler.create(), ops);
		    gui.setItem(14, glass.create(), ops);
		    gui.setItem(15, glass.create(), ops);
		    gui.setItem(16, glass.create(), ops);
		    gui.setItem(17, glass.create(), ops);
		    gui.setItem(18, glass.create(), ops);
		    gui.setItem(22, glass.create(), ops);
		    gui.setItem(23, glass.create(), ops);
		    gui.setItem(25, glass.create(), ops);
		    gui.setItem(26, glass.create(), ops);
		    gui.setItem(27, glass.create(), ops);
		    gui.setItem(31, glass.create(), ops);
		    gui.setItem(32, glass.create(), ops);
		    gui.setItem(33, glass.create(), ops);
		    gui.setItem(34, glass.create(), ops);
		    gui.setItem(35, glass.create(), ops);
		    gui.setItem(36, glass.create(), ops);
		    gui.setItem(37, glass.create(), ops);
		    gui.setItem(38, glass.create(), ops);
		    gui.setItem(39, glass.create(), ops);
		    gui.setItem(40, glass.create(), ops);
		    gui.setItem(41, glass.create(), ops);
		    gui.setItem(42, glass.create(), ops);
		    gui.setItem(43, glass.create(), ops);
		    gui.setItem(44, glass.create(), ops);
		    gui.setItem(45, glass.create(), ops);
		    gui.setItem(46, glass.create(), ops);
		    gui.setItem(47, glass.create(), ops);
		    gui.setItem(48, glass.create(), ops);
		    gui.setItem(50, glass.create(), ops);
		    gui.setItem(51, glass.create(), ops);
		    gui.setItem(52, glass.create(), ops);
		    gui.setItem(53, glass.create(), ops);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
			gui.setItem(49, back.create(), ops);
		
	}}.runAsync();
	ops.remove(Options.RUNNABLE);
	}
	
	public static void Stone(Player p) {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	GUICreatorAPI gui = TheAPI.getGUICreatorAPI(p);
	gui.setSize(54);
	gui.setTitle("&8&lKamenný Grappler");
	gui.open();
	new Tasker() {

		@Override
		public void run() {
		    ItemCreatorAPI glass = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		    ItemCreatorAPI fishingrod = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
		    ItemCreatorAPI stone = TheAPI.getItemCreatorAPI(Material.COBBLESTONE);
		    
		    ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a20");
			
		    gui.setItem(0, glass.create(), ops);
		    gui.setItem(1, glass.create(), ops);
		    gui.setItem(2, glass.create(), ops);
		    gui.setItem(3, glass.create(), ops);
		    gui.setItem(4, glass.create(), ops);
		    gui.setItem(5, glass.create(), ops);
		    gui.setItem(6, glass.create(), ops);
		    gui.setItem(7, glass.create(), ops);
		    gui.setItem(8, glass.create(), ops);
		    gui.setItem(9, glass.create(), ops);
		    gui.setItem(11, stone.create(), ops);
		    gui.setItem(12, stone.create(), ops);
		    gui.setItem(21, stone.create(), ops);
		    gui.setItem(20, fishingrod.create(), ops);
		    gui.setItem(13, glass.create(), ops);
		    gui.setItem(24, grappler.create(), ops);
		    gui.setItem(14, glass.create(), ops);
		    gui.setItem(15, glass.create(), ops);
		    gui.setItem(16, glass.create(), ops);
		    gui.setItem(17, glass.create(), ops);
		    gui.setItem(18, glass.create(), ops);
		    gui.setItem(22, glass.create(), ops);
		    gui.setItem(23, glass.create(), ops);
		    gui.setItem(25, glass.create(), ops);
		    gui.setItem(26, glass.create(), ops);
		    gui.setItem(27, glass.create(), ops);
		    gui.setItem(31, glass.create(), ops);
		    gui.setItem(32, glass.create(), ops);
		    gui.setItem(33, glass.create(), ops);
		    gui.setItem(34, glass.create(), ops);
		    gui.setItem(35, glass.create(), ops);
		    gui.setItem(36, glass.create(), ops);
		    gui.setItem(37, glass.create(), ops);
		    gui.setItem(38, glass.create(), ops);
		    gui.setItem(39, glass.create(), ops);
		    gui.setItem(40, glass.create(), ops);
		    gui.setItem(41, glass.create(), ops);
		    gui.setItem(42, glass.create(), ops);
		    gui.setItem(43, glass.create(), ops);
		    gui.setItem(44, glass.create(), ops);
		    gui.setItem(45, glass.create(), ops);
		    gui.setItem(46, glass.create(), ops);
		    gui.setItem(47, glass.create(), ops);
		    gui.setItem(48, glass.create(), ops);
		    gui.setItem(50, glass.create(), ops);
		    gui.setItem(51, glass.create(), ops);
		    gui.setItem(52, glass.create(), ops);
		    gui.setItem(53, glass.create(), ops);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
			gui.setItem(49, back.create(), ops);
		
	}}.runAsync();
	ops.remove(Options.RUNNABLE);
	}
	
	public static void Iron(Player p) {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	GUICreatorAPI gui = TheAPI.getGUICreatorAPI(p);
	gui.setSize(54);
	gui.setTitle("&7&lŽelezný Grappler");
	gui.open();
	new Tasker() {

		@Override
		public void run() {
		    ItemCreatorAPI glass = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		    ItemCreatorAPI fishingrod = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
		    ItemCreatorAPI iron = TheAPI.getItemCreatorAPI(Material.IRON_INGOT);
		    
		    ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a30");
			
		    gui.setItem(0, glass.create(), ops);
		    gui.setItem(1, glass.create(), ops);
		    gui.setItem(2, glass.create(), ops);
		    gui.setItem(3, glass.create(), ops);
		    gui.setItem(4, glass.create(), ops);
		    gui.setItem(5, glass.create(), ops);
		    gui.setItem(6, glass.create(), ops);
		    gui.setItem(7, glass.create(), ops);
		    gui.setItem(8, glass.create(), ops);
		    gui.setItem(9, glass.create(), ops);
		    gui.setItem(11, iron.create(), ops);
		    gui.setItem(12, iron.create(), ops);
		    gui.setItem(21, iron.create(), ops);
		    gui.setItem(20, fishingrod.create(), ops);
		    gui.setItem(13, glass.create(), ops);
		    gui.setItem(24, grappler.create(), ops);
		    gui.setItem(14, glass.create(), ops);
		    gui.setItem(15, glass.create(), ops);
		    gui.setItem(16, glass.create(), ops);
		    gui.setItem(17, glass.create(), ops);
		    gui.setItem(18, glass.create(), ops);
		    gui.setItem(22, glass.create(), ops);
		    gui.setItem(23, glass.create(), ops);
		    gui.setItem(25, glass.create(), ops);
		    gui.setItem(26, glass.create(), ops);
		    gui.setItem(27, glass.create(), ops);
		    gui.setItem(31, glass.create(), ops);
		    gui.setItem(32, glass.create(), ops);
		    gui.setItem(33, glass.create(), ops);
		    gui.setItem(34, glass.create(), ops);
		    gui.setItem(35, glass.create(), ops);
		    gui.setItem(36, glass.create(), ops);
		    gui.setItem(37, glass.create(), ops);
		    gui.setItem(38, glass.create(), ops);
		    gui.setItem(39, glass.create(), ops);
		    gui.setItem(40, glass.create(), ops);
		    gui.setItem(41, glass.create(), ops);
		    gui.setItem(42, glass.create(), ops);
		    gui.setItem(43, glass.create(), ops);
		    gui.setItem(44, glass.create(), ops);
		    gui.setItem(45, glass.create(), ops);
		    gui.setItem(46, glass.create(), ops);
		    gui.setItem(47, glass.create(), ops);
		    gui.setItem(48, glass.create(), ops);
		    gui.setItem(50, glass.create(), ops);
		    gui.setItem(51, glass.create(), ops);
		    gui.setItem(52, glass.create(), ops);
		    gui.setItem(53, glass.create(), ops);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
			gui.setItem(49, back.create(), ops);
		
	}}.runAsync();
	ops.remove(Options.RUNNABLE);
	}
	
	public static void Gold(Player p) {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	GUICreatorAPI gui = TheAPI.getGUICreatorAPI(p);
	gui.setSize(54);
	gui.setTitle("&e&lZlatej Grappler");
	gui.open();
	new Tasker() {

		@Override
		public void run() {
		    ItemCreatorAPI glass = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		    ItemCreatorAPI fishingrod = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
		    ItemCreatorAPI gold = TheAPI.getItemCreatorAPI(Material.GOLD_INGOT);
		    
		    ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a50");
			
		    gui.setItem(0, glass.create(), ops);
		    gui.setItem(1, glass.create(), ops);
		    gui.setItem(2, glass.create(), ops);
		    gui.setItem(3, glass.create(), ops);
		    gui.setItem(4, glass.create(), ops);
		    gui.setItem(5, glass.create(), ops);
		    gui.setItem(6, glass.create(), ops);
		    gui.setItem(7, glass.create(), ops);
		    gui.setItem(8, glass.create(), ops);
		    gui.setItem(9, glass.create(), ops);
		    gui.setItem(11, gold.create(), ops);
		    gui.setItem(12, gold.create(), ops);
		    gui.setItem(21, gold.create(), ops);
		    gui.setItem(20, fishingrod.create(), ops);
		    gui.setItem(13, glass.create(), ops);
		    gui.setItem(24, grappler.create(), ops);
		    gui.setItem(14, glass.create(), ops);
		    gui.setItem(15, glass.create(), ops);
		    gui.setItem(16, glass.create(), ops);
		    gui.setItem(17, glass.create(), ops);
		    gui.setItem(18, glass.create(), ops);
		    gui.setItem(22, glass.create(), ops);
		    gui.setItem(23, glass.create(), ops);
		    gui.setItem(25, glass.create(), ops);
		    gui.setItem(26, glass.create(), ops);
		    gui.setItem(27, glass.create(), ops);
		    gui.setItem(31, glass.create(), ops);
		    gui.setItem(32, glass.create(), ops);
		    gui.setItem(33, glass.create(), ops);
		    gui.setItem(34, glass.create(), ops);
		    gui.setItem(35, glass.create(), ops);
		    gui.setItem(36, glass.create(), ops);
		    gui.setItem(37, glass.create(), ops);
		    gui.setItem(38, glass.create(), ops);
		    gui.setItem(39, glass.create(), ops);
		    gui.setItem(40, glass.create(), ops);
		    gui.setItem(41, glass.create(), ops);
		    gui.setItem(42, glass.create(), ops);
		    gui.setItem(43, glass.create(), ops);
		    gui.setItem(44, glass.create(), ops);
		    gui.setItem(45, glass.create(), ops);
		    gui.setItem(46, glass.create(), ops);
		    gui.setItem(47, glass.create(), ops);
		    gui.setItem(48, glass.create(), ops);
		    gui.setItem(50, glass.create(), ops);
		    gui.setItem(51, glass.create(), ops);
		    gui.setItem(52, glass.create(), ops);
		    gui.setItem(53, glass.create(), ops);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
			gui.setItem(49, back.create(), ops);
		
	}}.runAsync();
	ops.remove(Options.RUNNABLE);
	}
	
	public static void Dia(Player p) {
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	GUICreatorAPI gui = TheAPI.getGUICreatorAPI(p);
	gui.setSize(54);
	gui.setTitle("&b&lDiamantovej Grappler");
	gui.open();
	new Tasker() {

		@Override
		public void run() {
		    ItemCreatorAPI glass = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		    ItemCreatorAPI fishingrod = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
		    ItemCreatorAPI dia = TheAPI.getItemCreatorAPI(Material.DIAMOND);
		    
		    ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a70");
			
		    gui.setItem(0, glass.create(), ops);
		    gui.setItem(1, glass.create(), ops);
		    gui.setItem(2, glass.create(), ops);
		    gui.setItem(3, glass.create(), ops);
		    gui.setItem(4, glass.create(), ops);
		    gui.setItem(5, glass.create(), ops);
		    gui.setItem(6, glass.create(), ops);
		    gui.setItem(7, glass.create(), ops);
		    gui.setItem(8, glass.create(), ops);
		    gui.setItem(9, glass.create(), ops);
		    gui.setItem(11, dia.create(), ops);
		    gui.setItem(12, dia.create(), ops);
		    gui.setItem(21, dia.create(), ops);
		    gui.setItem(20, fishingrod.create(), ops);
		    gui.setItem(13, glass.create(), ops);
		    gui.setItem(24, grappler.create(), ops);
		    gui.setItem(14, glass.create(), ops);
		    gui.setItem(15, glass.create(), ops);
		    gui.setItem(16, glass.create(), ops);
		    gui.setItem(17, glass.create(), ops);
		    gui.setItem(18, glass.create(), ops);
		    gui.setItem(22, glass.create(), ops);
		    gui.setItem(23, glass.create(), ops);
		    gui.setItem(25, glass.create(), ops);
		    gui.setItem(26, glass.create(), ops);
		    gui.setItem(27, glass.create(), ops);
		    gui.setItem(31, glass.create(), ops);
		    gui.setItem(32, glass.create(), ops);
		    gui.setItem(33, glass.create(), ops);
		    gui.setItem(34, glass.create(), ops);
		    gui.setItem(35, glass.create(), ops);
		    gui.setItem(36, glass.create(), ops);
		    gui.setItem(37, glass.create(), ops);
		    gui.setItem(38, glass.create(), ops);
		    gui.setItem(39, glass.create(), ops);
		    gui.setItem(40, glass.create(), ops);
		    gui.setItem(41, glass.create(), ops);
		    gui.setItem(42, glass.create(), ops);
		    gui.setItem(43, glass.create(), ops);
		    gui.setItem(44, glass.create(), ops);
		    gui.setItem(45, glass.create(), ops);
		    gui.setItem(46, glass.create(), ops);
		    gui.setItem(47, glass.create(), ops);
		    gui.setItem(48, glass.create(), ops);
		    gui.setItem(50, glass.create(), ops);
		    gui.setItem(51, glass.create(), ops);
		    gui.setItem(52, glass.create(), ops);
		    gui.setItem(53, glass.create(), ops);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			ops.put(Options.RUNNABLE, new Runnable() {
				public void run() {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
			gui.setItem(49, back.create(), ops);
		
	}}.runAsync();
	ops.remove(Options.RUNNABLE);
	}
	
}
