package GrapplingHook;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;
import me.DevTec.GUI.GUICreatorAPI;
import me.DevTec.GUI.ItemGUI;
import me.DevTec.Scheduler.Tasker;
import sm.AllGuis;

public class GHGUI {

	/* Pomùcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void Wood(Player p) {
	GUICreatorAPI gui = new GUICreatorAPI("&6&lDøevenej Grappler", 54, p);
	new Tasker() {

		@Override
		public void run() {
			ItemGUI glass = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI fishingrod = new ItemGUI(TheAPI.getItemCreatorAPI(Material.FISHING_ROD).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI wood = new ItemGUI(TheAPI.getItemCreatorAPI(Material.OAK_LOG).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a10");
			
		    gui.setItem(0, glass);
		    gui.setItem(1, glass);
		    gui.setItem(2, glass);
		    gui.setItem(3, glass);
		    gui.setItem(4, glass);
		    gui.setItem(5, glass);
		    gui.setItem(6, glass);
		    gui.setItem(7, glass);
		    gui.setItem(8, glass);
		    gui.setItem(9, glass);
		    gui.setItem(11, wood);
		    gui.setItem(12, wood);
		    gui.setItem(21, wood);
		    gui.setItem(20, fishingrod);
		    gui.setItem(13, glass);
		    gui.setItem(24, new ItemGUI( grappler.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					
				}
			});		
		    gui.setItem(14, glass);
		    gui.setItem(15, glass);
		    gui.setItem(16, glass);
		    gui.setItem(17, glass);
		    gui.setItem(18, glass);
		    gui.setItem(22, glass);
		    gui.setItem(23, glass);
		    gui.setItem(25, glass);
		    gui.setItem(26, glass);
		    gui.setItem(27, glass);
		    gui.setItem(31, glass);
		    gui.setItem(32, glass);
		    gui.setItem(33, glass);
		    gui.setItem(34, glass);
		    gui.setItem(35, glass);
		    gui.setItem(36, glass);
		    gui.setItem(37, glass);
		    gui.setItem(38, glass);
		    gui.setItem(39, glass);
		    gui.setItem(40, glass);
		    gui.setItem(41, glass);
		    gui.setItem(42, glass);
		    gui.setItem(43, glass);
		    gui.setItem(44, glass);
		    gui.setItem(45, glass);
		    gui.setItem(46, glass);
		    gui.setItem(47, glass);
		    gui.setItem(48, glass);
		    gui.setItem(50, glass);
		    gui.setItem(51, glass);
		    gui.setItem(52, glass);
		    gui.setItem(53, glass);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			gui.setItem(49, new ItemGUI(back.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
		
	}}.runAsync();
	}
	
	public static void Stone(Player p) {
	GUICreatorAPI gui = new GUICreatorAPI("&8&lKamenný Grappler", 54, p);
	new Tasker() {

		@Override
		public void run() {
			ItemGUI glass = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI fishingrod = new ItemGUI(TheAPI.getItemCreatorAPI(Material.FISHING_ROD).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI stone = new ItemGUI(TheAPI.getItemCreatorAPI(Material.COBBLESTONE).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a20");
			
		    gui.setItem(0, glass);
		    gui.setItem(1, glass);
		    gui.setItem(2, glass);
		    gui.setItem(3, glass);
		    gui.setItem(4, glass);
		    gui.setItem(5, glass);
		    gui.setItem(6, glass);
		    gui.setItem(7, glass);
		    gui.setItem(8, glass);
		    gui.setItem(9, glass);
		    gui.setItem(11, stone);
		    gui.setItem(12, stone);
		    gui.setItem(21, stone);
		    gui.setItem(20, fishingrod);
		    gui.setItem(13, glass);
		    gui.setItem(24, new ItemGUI( grappler.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			});
		    gui.setItem(14, glass);
		    gui.setItem(15, glass);
		    gui.setItem(16, glass);
		    gui.setItem(17, glass);
		    gui.setItem(18, glass);
		    gui.setItem(22, glass);
		    gui.setItem(23, glass);
		    gui.setItem(25, glass);
		    gui.setItem(26, glass);
		    gui.setItem(27, glass);
		    gui.setItem(31, glass);
		    gui.setItem(32, glass);
		    gui.setItem(33, glass);
		    gui.setItem(34, glass);
		    gui.setItem(35, glass);
		    gui.setItem(36, glass);
		    gui.setItem(37, glass);
		    gui.setItem(38, glass);
		    gui.setItem(39, glass);
		    gui.setItem(40, glass);
		    gui.setItem(41, glass);
		    gui.setItem(42, glass);
		    gui.setItem(43, glass);
		    gui.setItem(44, glass);
		    gui.setItem(45, glass);
		    gui.setItem(46, glass);
		    gui.setItem(47, glass);
		    gui.setItem(48, glass);
		    gui.setItem(50, glass);
		    gui.setItem(51, glass);
		    gui.setItem(52, glass);
		    gui.setItem(53, glass);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			gui.setItem(49, new ItemGUI(back.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
		
	}}.runAsync();
	}
	
	public static void Iron(Player p) {
	GUICreatorAPI gui = new GUICreatorAPI("&7&lŽelezný Grappler", 54, p);
	new Tasker() {

		@Override
		public void run() {
			ItemGUI glass = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI fishingrod = new ItemGUI(TheAPI.getItemCreatorAPI(Material.FISHING_ROD).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI iron = new ItemGUI(TheAPI.getItemCreatorAPI(Material.IRON_INGOT).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a30");
			
		    gui.setItem(0, glass);
		    gui.setItem(1, glass);
		    gui.setItem(2, glass);
		    gui.setItem(3, glass);
		    gui.setItem(4, glass);
		    gui.setItem(5, glass);
		    gui.setItem(6, glass);
		    gui.setItem(7, glass);
		    gui.setItem(8, glass);
		    gui.setItem(9, glass);
		    gui.setItem(11, iron);
		    gui.setItem(12, iron);
		    gui.setItem(21, iron);
		    gui.setItem(20, fishingrod);
		    gui.setItem(13, glass);
		    gui.setItem(24, new ItemGUI( grappler.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			});
		    gui.setItem(14, glass);
		    gui.setItem(15, glass);
		    gui.setItem(16, glass);
		    gui.setItem(17, glass);
		    gui.setItem(18, glass);
		    gui.setItem(22, glass);
		    gui.setItem(23, glass);
		    gui.setItem(25, glass);
		    gui.setItem(26, glass);
		    gui.setItem(27, glass);
		    gui.setItem(31, glass);
		    gui.setItem(32, glass);
		    gui.setItem(33, glass);
		    gui.setItem(34, glass);
		    gui.setItem(35, glass);
		    gui.setItem(36, glass);
		    gui.setItem(37, glass);
		    gui.setItem(38, glass);
		    gui.setItem(39, glass);
		    gui.setItem(40, glass);
		    gui.setItem(41, glass);
		    gui.setItem(42, glass);
		    gui.setItem(43, glass);
		    gui.setItem(44, glass);
		    gui.setItem(45, glass);
		    gui.setItem(46, glass);
		    gui.setItem(47, glass);
		    gui.setItem(48, glass);
		    gui.setItem(50, glass);
		    gui.setItem(51, glass);
		    gui.setItem(52, glass);
		    gui.setItem(53, glass);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			gui.setItem(49, new ItemGUI(back.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
		
	}}.runAsync();
	}
	
	public static void Gold(Player p) {
	GUICreatorAPI gui = new GUICreatorAPI("&e&lZlatej Grappler", 54, p);
	new Tasker() {

		@Override
		public void run() {
			ItemGUI glass = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI fishingrod = new ItemGUI(TheAPI.getItemCreatorAPI(Material.FISHING_ROD).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI gold = new ItemGUI(TheAPI.getItemCreatorAPI(Material.GOLD_INGOT).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a50");
			
		    gui.setItem(0, glass);
		    gui.setItem(1, glass);
		    gui.setItem(2, glass);
		    gui.setItem(3, glass);
		    gui.setItem(4, glass);
		    gui.setItem(5, glass);
		    gui.setItem(6, glass);
		    gui.setItem(7, glass);
		    gui.setItem(8, glass);
		    gui.setItem(9, glass);
		    gui.setItem(11, gold);
		    gui.setItem(12, gold);
		    gui.setItem(21, gold);
		    gui.setItem(20, fishingrod);
		    gui.setItem(13, glass);
		    gui.setItem(24, new ItemGUI( grappler.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			});
		    gui.setItem(14, glass);
		    gui.setItem(15, glass);
		    gui.setItem(16, glass);
		    gui.setItem(17, glass);
		    gui.setItem(18, glass);
		    gui.setItem(22, glass);
		    gui.setItem(23, glass);
		    gui.setItem(25, glass);
		    gui.setItem(26, glass);
		    gui.setItem(27, glass);
		    gui.setItem(31, glass);
		    gui.setItem(32, glass);
		    gui.setItem(33, glass);
		    gui.setItem(34, glass);
		    gui.setItem(35, glass);
		    gui.setItem(36, glass);
		    gui.setItem(37, glass);
		    gui.setItem(38, glass);
		    gui.setItem(39, glass);
		    gui.setItem(40, glass);
		    gui.setItem(41, glass);
		    gui.setItem(42, glass);
		    gui.setItem(43, glass);
		    gui.setItem(44, glass);
		    gui.setItem(45, glass);
		    gui.setItem(46, glass);
		    gui.setItem(47, glass);
		    gui.setItem(48, glass);
		    gui.setItem(50, glass);
		    gui.setItem(51, glass);
		    gui.setItem(52, glass);
		    gui.setItem(53, glass);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			gui.setItem(49, new ItemGUI(back.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
		
	}}.runAsync();
	}
	
	public static void Dia(Player p) {
	GUICreatorAPI gui = new GUICreatorAPI("&b&lDiamantovej Grappler", 54, p);
	new Tasker() {

		@Override
		public void run() {
			ItemGUI glass = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI fishingrod = new ItemGUI(TheAPI.getItemCreatorAPI(Material.FISHING_ROD).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			
			ItemGUI dia = new ItemGUI(TheAPI.getItemCreatorAPI(Material.DIAMOND).create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			};
			ItemCreatorAPI grappler = TheAPI.getItemCreatorAPI(Material.FISHING_ROD);
			grappler.setDisplayName("&6&lM&f&loneyak &7Grappler");
			grappler.addLore("&7Použití: &a70");
			
		    gui.setItem(0, glass);
		    gui.setItem(1, glass);
		    gui.setItem(2, glass);
		    gui.setItem(3, glass);
		    gui.setItem(4, glass);
		    gui.setItem(5, glass);
		    gui.setItem(6, glass);
		    gui.setItem(7, glass);
		    gui.setItem(8, glass);
		    gui.setItem(9, glass);
		    gui.setItem(11, dia);
		    gui.setItem(12, dia);
		    gui.setItem(21, dia);
		    gui.setItem(20, fishingrod);
		    gui.setItem(13, glass);
		    gui.setItem(24, new ItemGUI( grappler.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				}
			});
		    gui.setItem(14, glass);
		    gui.setItem(15, glass);
		    gui.setItem(16, glass);
		    gui.setItem(17, glass);
		    gui.setItem(18, glass);
		    gui.setItem(22, glass);
		    gui.setItem(23, glass);
		    gui.setItem(25, glass);
		    gui.setItem(26, glass);
		    gui.setItem(27, glass);
		    gui.setItem(31, glass);
		    gui.setItem(32, glass);
		    gui.setItem(33, glass);
		    gui.setItem(34, glass);
		    gui.setItem(35, glass);
		    gui.setItem(36, glass);
		    gui.setItem(37, glass);
		    gui.setItem(38, glass);
		    gui.setItem(39, glass);
		    gui.setItem(40, glass);
		    gui.setItem(41, glass);
		    gui.setItem(42, glass);
		    gui.setItem(43, glass);
		    gui.setItem(44, glass);
		    gui.setItem(45, glass);
		    gui.setItem(46, glass);
		    gui.setItem(47, glass);
		    gui.setItem(48, glass);
		    gui.setItem(50, glass);
		    gui.setItem(51, glass);
		    gui.setItem(52, glass);
		    gui.setItem(53, glass);
		    
		    ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
			back.setDisplayName("&4&lBack");
			gui.setItem(49, new ItemGUI(back.create()){
				@Override
				public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					AllGuis.ghmenu(p);
					p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				}
			});
		
	}}.runAsync();
	}
	
}
