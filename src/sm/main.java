package sm;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import Commands.MMenu;
import Commands.Menu;
import me.DevTec.TheAPI.TheAPI;

public class main extends JavaPlugin {


public static main plugin;
public static FileConfiguration Translation;


	@Override
	public void onEnable() {
		plugin = this;
		getConfig().options().copyDefaults(true);
		saveConfig();
		Bukkit.getPluginCommand("menu").setExecutor(new Menu());
		Bukkit.getPluginCommand("moneyakmenu").setExecutor(new MMenu());
		TheAPI.msg("&bSuper&aMenu&7: &7****************", getConsole());
		TheAPI.msg("&bSuper&aMenu&7: &aEnabling plugin..", getConsole());
		TheAPI.msg("&bSuper&aMenu&7: &7****************", getConsole());
		}

	public void onDisable() {
		TheAPI.msg("&bSuper&aMenu&7: &7**************************", getConsole());
		TheAPI.msg("&bSuper&aMenu&7: &aDisabling, saving plugin..", getConsole());
		TheAPI.msg("&bSuper&aMenu&7: &7**************************", getConsole());
	}
	
	public void onLoad() {
		TheAPI.msg("&bSuper&aMenu&7: &7**************************", getConsole());
		TheAPI.msg("&bSuper&aMenu&7: &aPlugin has been loaded..", getConsole());
		TheAPI.msg("&bSuper&aMenu&7: &7**************************", getConsole());
	}

	public static CommandSender getConsole() {
		return Bukkit.getConsoleSender();
	}
	
	public static main getInstance() {
		return plugin;
		
	}
	
	public static String s(String s) {
		if(Translation.getString(s)!=null)
			return Translation.getString(s);
			else {
				warn("String '"+s+"' isn't in Tranlations.yml, please report this bug on https://github.com/TheDevTec/LevelTools");
		return "&4ERROR, Missing path, See console for more informations";}
	}
    public static void warn(String s) {
    	Bukkit.getLogger().warning(TheAPI.colorize(s));
    }
	

}
