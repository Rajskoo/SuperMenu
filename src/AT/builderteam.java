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

public class builderteam {

	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
	
	public static void buildert(Player p) {
		GUI b = new GUI("&2&lBuilder Team", 54, p);

		new Tasker() {
		public void run() {
			ItemStack mat = ItemCreatorAPI.createHeadByWeb(1, "&e&lHLEDÁME!", Arrays.asList("&aJestli jsi myslíš, že umíš stavět.", "&aUrčite se nám ozvi!"), "http://textures.minecraft.net/texture/1035c528036b384c53c9c8a1a125685e16bfb369c197cc9f03dfa3b835b1aa55");
		b.setItem(13, new ItemGUI(mat){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		});
		Player s = p;
		ItemStack cirik = ItemCreatorAPI.createHead(1, "&e&lCirikCZ", "CirikCZ", Arrays.asList("&aPozice: &2Builder", "&aStatus: " + (s!=null && s.getName().equals("CirikCZ") ? "&2&lONLINE" : "&4&lOFFLINE")));
		b.setItem(31, new ItemGUI(cirik){
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
		b.setItem(46, okraj);
		b.setItem(45, okraj);
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
