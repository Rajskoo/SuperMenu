package sm;

import java.util.HashMap;
import java.util.Map;

import me.DevTec.ConfigAPI;
import me.DevTec.TheAPI;

public class Configs {
	
	public static ConfigAPI config;
	public static ConfigAPI Translation;
	
	@SuppressWarnings("unused")
	private static void translationLoading() {
		Translation = TheAPI.getConfig("LevelTools", "Translation");
		Map<String, Object> c = new HashMap<String, Object>();
		c.put("Prefix", "&6&lM&f&loneyak &7|");
		c.put("NotPermissionsMessage", "&4Na tohle nemáš práva!");
		c.put("LevelTools.Reloading", "%prefix% &f----------&a Reloadujem&f ----------");
		
		c.put("Helper.no", "%prefix% OP práva jen tak nerozdávame, OP mají len lidi, kteøím vìøíme, a víme, že to myslí vážne.");
		c.put("Helper.nabor", "%prefix% Nábor se momentálne koná jen na Buildera, jestli máš zájem, pøidej se na náš discord, a zistíš více :)");
		
		Translation.addDefaults(c);
		Translation.create();
		main.Translation=Translation.getConfig();
	}

	public static void reload() {
		Translation.reload();
		main.Translation=Translation.getConfig();
	}

	
}
