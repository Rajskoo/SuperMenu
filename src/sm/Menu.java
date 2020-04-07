package sm;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class Menu implements CommandExecutor {
	
	main l = main.instance;
	
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		
		Player p = (Player) s;
		
		AllGuis.main((Player)s);
		p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 5, 1);
		return true;
	}

}
