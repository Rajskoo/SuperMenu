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
		c.put("NotPermissionsMessage", "&4Na tohle nem� pr�va!");
		c.put("LevelTools.Reloading", "%prefix% &f----------&a Reloadujem&f ----------");
		
		c.put("Helper.no", "%prefix% OP pr�va jen tak nerozd�vame, OP maj� len lidi, kte��m v���me, a v�me, �e to mysl� v�ne.");
		c.put("Helper.nabor", "%prefix% N�bor se moment�lne kon� jen na Buildera, jestli m� z�jem, p�idej se na n� discord, a zist� v�ce :)");
		
		Translation.addDefaults(c);
		Translation.create();
		main.Translation=Translation.getConfig();
	}

	public static void reload() {
		Translation.reload();
		main.Translation=Translation.getConfig();
	}

	
}
