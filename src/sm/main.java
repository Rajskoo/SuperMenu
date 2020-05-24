package sm;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import me.Straiker123.TheAPI;

public class main extends JavaPlugin {


public static main instance;
private static String nmsver;
@SuppressWarnings("unused")
private static boolean useOldMethods = false;


	@Override
	public void onEnable() {
		instance = this;
		getConfig().options().copyDefaults(true);//vytvori config
		saveConfig();//ulozi config
		Bukkit.getPluginCommand("menu").setExecutor(new Menu());
		Bukkit.getPluginCommand("supermenu").setExecutor(new SMenu());
		
		TheAPI.msg("&bSuper&9Menu&7: &7****************", getConsole());
		TheAPI.msg("&bSuper&9Menu&7: &9Loading plugin..", getConsole());
		TheAPI.msg("&bSuper&9Menu&7: &7****************", getConsole());
		
		Server server = getServer();
        ConsoleCommandSender console = server.getConsoleSender();

        nmsver = Bukkit.getServer().getClass().getPackage().getName();
        nmsver = nmsver.substring(nmsver.lastIndexOf(".") + 1);

        if (nmsver.equalsIgnoreCase("v1_8_R1") || nmsver.startsWith("v1_7_")) { // Not sure if 1_7 works for the protocol hack?
            useOldMethods = true;
        }

        console.sendMessage(ChatColor.AQUA + getDescription().getName() + " V" + getDescription().getVersion() + " has been enabled!");
		
	}

	
	public void onDisable() {
		
	}

	public static CommandSender getConsole() {
		return Bukkit.getConsoleSender();
	}
}
