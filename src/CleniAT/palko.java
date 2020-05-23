package CleniAT;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import AT.helperteam;
import me.Straiker123.GUICreatorAPI;
import me.Straiker123.HoverMessage;
import me.Straiker123.ItemCreatorAPI;
import me.Straiker123.TheAPI;
import me.Straiker123.GUICreatorAPI.Options;
import me.Straiker123.HoverMessage.ClickAction;

public class palko {

	public static void p4lko(Player p) {
		GUICreatorAPI b = TheAPI.getGUICreatorAPI(p);
		b.setSize(27);
		b.setTitle("&e&P4LKO");
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
		ops.put(Options.CANT_BE_TAKEN, true);
		
		ItemCreatorAPI msg = TheAPI.getItemCreatorAPI(Material.PAPER);
		msg.setDisplayName("&3Po�li s�kromnou zpr�vu.");
		msg.addLore("&6KLIKNI");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro posl�n� soukrom� zpr�vy hr��i P4LKO").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg P4LKO ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				b.close();
			}
		});
		b.setItem(11, msg.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI mail = TheAPI.getItemCreatorAPI(Material.BOOK);
		mail.setDisplayName("&3Po�li mail zpr�vu.");
		mail.addLore("&6KLIKNI");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro posl�n� mail zpr�vy hr��i P4LKO").setClickEvent(ClickAction.SUGGEST_COMMAND, "/mail send P4LKO ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				b.close();
			}
		});
		b.setItem(15, mail.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		b.setItem(0, okraj.create(), ops);
		b.setItem(1, okraj.create(), ops);
		b.setItem(2, okraj.create(), ops);
		b.setItem(3, okraj.create(), ops);
		b.setItem(4, okraj.create(), ops);
		b.setItem(5, okraj.create(), ops);
		b.setItem(6, okraj.create(), ops);
		b.setItem(7, okraj.create(), ops);
		b.setItem(8, okraj.create(), ops);
		b.setItem(18, okraj.create(), ops);
		b.setItem(19, okraj.create(), ops);
		b.setItem(20, okraj.create(), ops);
		b.setItem(21, okraj.create(), ops);
		b.setItem(23, okraj.create(), ops);
		b.setItem(24, okraj.create(), ops);
		b.setItem(25, okraj.create(), ops);
		b.setItem(26, okraj.create(), ops);
		
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				helperteam.helpert(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		b.setItem(22, back.create(), ops);
		
		b.open();
	}
}
