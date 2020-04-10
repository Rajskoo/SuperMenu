package sm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;

import me.Straiker123.TheAPI;



public class Menu implements CommandExecutor, TabCompleter {
	
	main l = main.instance;
	
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		
		Player p = (Player) s;
		
		String prefix = "&0[&bSuper&3Menu&0] ";
		
		if (args.length == 0) {
			AllGuis.main((Player)s);
			TheAPI.sendMessage( prefix + "&eOtevíraní menu...", p);
			p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 5, 1);
			return true;
		}
		
		if (args.length == 1) {
			if (args[0].equalsIgnoreCase("at")) {
				AllGuis.ATGUI((Player)s);
				TheAPI.sendMessage( prefix + "&eOtevíraní menu... &7(&6AdminTeam&7)", p);
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 5, 1);
				return true;
			}
			
			if (args[0].equalsIgnoreCase("navody")) {
				AllGuis.navod((Player)s);
				TheAPI.sendMessage( prefix + "&eOtevíraní menu... &7(&6Návody&7)", p);
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 5, 1);
				return true;
			}
			
			if (args[0].equalsIgnoreCase("vip")) {
				AllGuis.vip((Player)s);
				TheAPI.sendMessage( prefix + "&eOtevíraní menu... &7(&6VIP&7)", p);
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 5, 1);
				return true;
			}
			
			if (args[0].equalsIgnoreCase("pravidla")) {
				AllGuis.Rules((Player)s);
				TheAPI.sendMessage( prefix + "&eOtevíraní menu... &7(&6Pravidla&7)", p);
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 5, 1);
				return true;
			}
			
			if (args[0].equalsIgnoreCase("info")) {
				AllGuis.info((Player)s);
				TheAPI.sendMessage( prefix + "&eOtevíraní menu... &7(&6Info&7)", p);
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 5, 1);
				return true;
			}
			return true;
		}
		
		return true;
	}

	@Override
	public List<String> onTabComplete(CommandSender s, Command arg1, String arg2, String[] args) {
		List<String> c = new ArrayList<>();
		if (args.length == 1) {
			c.addAll(StringUtil.copyPartialMatches(args[0], Arrays.asList("at", "navody", "vip", "pravidla", "info"), new ArrayList<>()));
		}
		return c;
	}

}
