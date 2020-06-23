package GrapplingHook;

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

import me.DevTec.TheAPI;
import sm.AllGuis;

public class GHMenu implements CommandExecutor, TabCompleter{

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {

		Player p = (Player) s;
		String prefix = "&0[&bSuper&3Menu&0] ";
		
		if (p.hasPermission("supermenu.ghmenu.open")) {
		if (args.length == 0) {
			AllGuis.ghmenu(p);
			TheAPI.sendActionBar(p, prefix + "&eOtevíraní GraplingHook Menu...");
			p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 5, 1);
			return true;
	}
} else {
	TheAPI.msg(prefix + "&cNa tohle nemáš práva!", p);
	return true;
}
		
		return false;
	}

	@Override
	public List<String> onTabComplete(CommandSender s, Command arg1, String arg2, String[] args) {
		List<String> c = new ArrayList<>();
		if (args.length == 1) {
			c.addAll(StringUtil.copyPartialMatches(args[0], Arrays.asList("open"), new ArrayList<>()));
		}
		return c;
	}

}
