package Utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import me.DevTec.ServerControlReloaded.SCR.API;
import me.DevTec.ServerControlReloaded.SCR.API.SeenType;
import me.DevTec.TheAPI.TheAPI;
import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import sm.main;

public class Utils {
	
	public main plugin;
	public Utils(main plugin) {
		this.plugin = plugin;
	}

	public static ItemStack createSkull(String url) {
        @SuppressWarnings("deprecation")
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        if (url.isEmpty())
            return head;

        SkullMeta headMeta = (SkullMeta) head.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);

        profile.getProperties().put("textures", new Property("textures", url));

        try {
            Field profileField = headMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(headMeta, profile);

        } catch (IllegalArgumentException | NoSuchFieldException | SecurityException | IllegalAccessException error) {
            error.printStackTrace();
        }
        head.setItemMeta(headMeta);
        return head;
    }
	public static void metoda(GUI g, int misto,String name, Groups group) {
		if(TheAPI.hasVanish(name)) {
			g.setItem(misto, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l"+name, name, Arrays.asList(group.get(), "&aStatus: &c&lOFFLINE &7" + API.getSeen(name, SeenType.Offline)))) {				
				@Override
				public void onClick(Player arg0, GUI arg1, ClickType arg2) {			
					
				}
			});
			return;
		}
		g.setItem(misto, new ItemGUI(ItemCreatorAPI.createHead(1, "&e&l"+name, name, Arrays.asList(group.get(), "&aStatus: " + (TheAPI.getOnlinePlayers().toString().contains(name)?"&a&lONLINE &7"+API.getSeen(name, SeenType.Online):"&c&lOFFLINE &7" + API.getSeen(name, SeenType.Offline))))) {
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	}
	public static void metoda2(GUI g, Material material, String name, int amount,int position, List<String> coll) {
		g.setItem(position, new ItemGUI(ItemCreatorAPI.create(material, amount, name, coll)) {
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
			}
		});
	}
	public static void metoda2(GUI g, Material material, String name, int amount,int position) {
		g.setItem(position, new ItemGUI(ItemCreatorAPI.create(material, amount, name)) {
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				
			}
		});
	}
}
