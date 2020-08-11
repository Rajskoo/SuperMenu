package Utils;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;

public class Create {
    public static ItemStack createItem(String name, Material material) {
    	ItemCreatorAPI a = TheAPI.getItemCreatorAPI(material);
    	a.setDisplayName(name);
    	return a.create();
    }
    public static ItemStack createItem( Material material,String name) {
    	ItemCreatorAPI a = TheAPI.getItemCreatorAPI(material);
    	a.setDisplayName(name);
    	return a.create();
    }
	public static ItemStack createItem(String name, Material material, List<String> lore) {
    	ItemCreatorAPI a = TheAPI.getItemCreatorAPI(material);
    	a.setDisplayName(name);
    	a.setLore(lore);
    	return a.create();
    }
}
