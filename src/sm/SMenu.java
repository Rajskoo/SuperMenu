package sm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import me.DevTec.TheAPI;

public class SMenu implements CommandExecutor, TabCompleter {
	
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(args.length==0) {return true;}
		
		if (args[0].equalsIgnoreCase("info")) {
			TheAPI.sendMessage("&6-------------------< &bSuper&9Menu &6>--------------------", s);
			TheAPI.sendMessage("&3Plugin byl vytvořen pro server &6&lM&f&loneyak.cz,", s);
			TheAPI.sendMessage("&3hráčem &6_ItsRajsko_ &3s klukami z &bDev&fTec.", s);
			TheAPI.sendMessage("&3Pokud chceš vědet více, přijď na discord: &6https://discord.gg/dutZXb3", s);
			TheAPI.sendMessage("&6----------------------------------------------------", s);
			return true;
		}
		
		return false;
	}
	
	public List<String> onTabComplete(CommandSender s, Command arg1, String arg2, String[] args) {
		List<String> c = new ArrayList<>();
		if (args.length == 1) {
			c.addAll(StringUtil.copyPartialMatches(args[0], Arrays.asList("info"), new ArrayList<>()));
			
		}
		return c;
		
	}
}
