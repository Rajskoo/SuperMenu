package CleniAT;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import AT.vedenit;
import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;
import me.DevTec.GUI.GUICreatorAPI;
import me.DevTec.GUI.ItemGUI;
import me.DevTec.Other.HoverMessage;
import me.DevTec.Other.HoverMessage.ClickAction;
import me.DevTec.Scheduler.Tasker;

public class UserAT {
	public UserAT(String user, Player p) {
		
		Player u = TheAPI.getPlayer(user);
		
		/* Pomùcka:
		 a.setItem(-, new ItemGUI(){
						@Override
						public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
						}
					});
		 */
		
		GUICreatorAPI b = new GUICreatorAPI("&e&l"+u.getName(), 27, p);
	
		new Tasker() {
			public void run() {
		
		ItemCreatorAPI msg = TheAPI.getItemCreatorAPI(Material.PAPER);
		msg.setDisplayName("&3Pošli súkromnou zprávu.");
		msg.addLore("&6KLIKNI");
		b.setItem(11, new ItemGUI(msg.create()) {
			@Override
			public void onClick(Player p, GUICreatorAPI b, ClickType c) {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy adminovi "+u.getName()).setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg "+u.getName()+" ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				b.close();
			}
		});
		
		ItemCreatorAPI mail = TheAPI.getItemCreatorAPI(Material.BOOK);
		mail.setDisplayName("&3Pošli mail zprávu.");
		mail.addLore("&6KLIKNI");
		b.setItem(15, new ItemGUI(mail.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI b, ClickType c) {
				new HoverMessage("&6Klikni pro poslání mail zprávy adminovi "+u.getName()).setClickEvent(ClickAction.SUGGEST_COMMAND, "/mail send "+u.getName()+" ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				b.close();
			}
		});
		
		ItemGUI okraj = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
		b.setItem(0, okraj);
		b.setItem(1, okraj);
		b.setItem(2, okraj);
		b.setItem(3, okraj);
		b.setItem(4, okraj);
		b.setItem(5, okraj);
		b.setItem(6, okraj);
		b.setItem(7, okraj);
		b.setItem(8, okraj);
		b.setItem(18, okraj);
		b.setItem(19, okraj);
		b.setItem(20, okraj);
		b.setItem(21, okraj);
		b.setItem(23, okraj);
		b.setItem(24, okraj);
		b.setItem(25, okraj);
		b.setItem(26, okraj);
		
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		b.setItem(22, new ItemGUI(back.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				vedenit.vedeni(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
}
