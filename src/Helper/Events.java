package Helper;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.DevTec.TheAPI;
import sm.main;

public class Events implements Listener {

	public void onChat(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		String msg = e.getMessage();
		
		if (msg.toLowerCase().contains(main.s("mùžu")) && msg.toLowerCase().contains(main.s("op"))) {
			TheAPI.msg(main.s("Helper.no").replace("%prefix%", main.s("Prefix")), p);
		}
		
		if (msg.toLowerCase().contains(main.s("môžem")) && msg.toLowerCase().contains(main.s("op"))) {
			TheAPI.msg(main.s("Helper.no").replace("%prefix%", main.s("Prefix")), p);
		}
		
		if (msg.toLowerCase().contains(main.s("je")) && msg.toLowerCase().contains(main.s("nábor"))) {
			TheAPI.msg(main.s("Helper.no").replace("%prefix%", main.s("Prefix")), p);
		}
		
		
	}
	
}
