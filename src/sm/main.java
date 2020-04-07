package sm;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import me.Straiker123.TheAPI;

public class main extends JavaPlugin {


public static main instance;
	
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
	}

	public void onDisable() {
		
	}

	public static CommandSender getConsole() {
		return Bukkit.getConsoleSender();
	}
}
