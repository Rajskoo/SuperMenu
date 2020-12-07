package sm;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import Commands.MMenu;
import Commands.Menu;
import me.DevTec.TheAPI.TheAPI;
import me.DevTec.TheAPI.ConfigAPI.Config;
import me.DevTec.TheAPI.Utils.DataKeeper.Data;

public class main extends JavaPlugin {


public static main plugin;
public static FileConfiguration Translation;
public static Config c;

	@Override
	public void onEnable() {
		plugin = this;
		Bukkit.getPluginCommand("menu").setExecutor(new Menu());
		Bukkit.getPluginCommand("moneyakmenu").setExecutor(new MMenu());
		TheAPI.msg("&bSuper&aMenu&7: &7****************", getConsole());
		TheAPI.msg("&bSuper&aMenu&7: &aEnabling plugin..", getConsole());
		TheAPI.msg("&bSuper&aMenu&7: &7****************", getConsole());
		copyDefaults();
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
	
	private void copyDefaults() {
		try {
			JarFile file = new JarFile(new File("plugins/"+new File(main.class.getProtectionDomain()
					  .getCodeSource().getLocation().getPath()).getName()));
			boolean found = false;
	    	Data data = new Data();
	    	Enumeration<? extends JarEntry> entries = file.entries();
			while (entries.hasMoreElements()) {
		    	JarEntry entry = entries.nextElement();
		    	if(!entry.getName().startsWith("Configs/"))
		    		if(found)break;
		    		else continue;
		    	if(entry.getName().endsWith("/"))continue;
		    	found=true;
		    	BufferedReader is = new BufferedReader(new InputStreamReader(file.getInputStream(entry), StandardCharsets.UTF_8));
		    	StringBuffer s = new StringBuffer();
		    	String readBytes;
		    	while ((readBytes = is.readLine()) != null)
		    		s.append(readBytes+System.lineSeparator());
		    	data.reload(s.toString());
		    	Config c = new Config("SuperMenu/"+entry.getName().replaceFirst("Configs/", ""));
		    	boolean add = false;
		    	for(String sr : data.getKeys(true)) {
		    		if(!c.exists(sr) || c.get(sr)==null && data.get(sr)!=null) {
		    			add=true;
		    			c.set(sr, data.get(sr));
		    			c.setComments(sr, data.getComments(sr));
		    		}
		    	}
		    	if(add)
		    	c.save();
		    	switch(c.getData().getFile().getName()) {
		    	case "Config.yml":
		    		main.c=c;
		    		break;
		    	}
			}
			data.clear();
			file.close();
	}catch(Exception e) {}
	}

	public static CommandSender getConsole() {
		return Bukkit.getConsoleSender();
	}
	
	public static main getInstance() {
		return plugin;
	}	

}
