package sm;


import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import AT.builderteam;
import AT.helperteam;
import AT.ostatni;
import AT.vedenit;
import me.DevTec.TheAPI.TheAPI;
import me.DevTec.TheAPI.TheAPI.SudoType;
import me.DevTec.TheAPI.APIs.ItemCreatorAPI;
import me.DevTec.TheAPI.GUIAPI.GUI;
import me.DevTec.TheAPI.GUIAPI.ItemGUI;
import me.DevTec.TheAPI.Scheduler.Tasker;

public class AllGuis {

	public static void main(Player p) {
		GUI g = new GUI("&6&lM&f&lONEYAK'S &6&lM&f&lENU", 54, p);
		new Tasker() {
			public void run() {
				
				ItemStack shop = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzZGViNTdlYWEyZjRkNDAzYWQ1NzI4M2NlOGI0MTgwNWVlNWI2ZGU5MTJlZTJiNGVhNzM2YTlkMWY0NjVhNyJ9fX0="));
				ItemMeta shopmeta = shop.getItemMeta();
				shopmeta.setDisplayName(TheAPI.colorize("&6&lA&f&lukce"));			
				shop.setItemMeta(shopmeta);
				g.setItem(31, new ItemGUI(shop) {
					public void onClick(Player p, GUI gui, ClickType c) {	
						p.performCommand("ah");
						gui.close();
					}
				});
			
						
				ItemStack at = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTdkZDM0OTI0ZDJiNmEyMTNhNWVkNDZhZTU3ODNmOTUzNzNhOWVmNWNlNWM4OGY5ZDczNjcwNTk4M2I5NyJ9fX0="));
				ItemMeta atmeta = at.getItemMeta();
				atmeta.setDisplayName(TheAPI.colorize("&6&lA&f&ldmin&6&lT&f&leam"));			
				at.setItemMeta(atmeta);
				g.setItem(12, new ItemGUI(at) {
					public void onClick(Player p, GUI gui, ClickType c) {	
						ATGUI(p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				
				ItemStack vote = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjdhYWYyZWU2NGJkYjIxMTAxNGM3ZWNjNzAwNmZhYTIzNDQ4ZDc4ZjRiYjkwMmU4YTEzMjVlMWM5ZDdmMTFlIn19fQ=="));
				ItemMeta votemeta = vote.getItemMeta();
				votemeta.setDisplayName(TheAPI.colorize("&6&lV&f&lote"));			
				vote.setItemMeta(votemeta);
				g.setItem(13, new ItemGUI(vote) {
					public void onClick(Player p, GUI gui, ClickType c) {	
						TheAPI.sendMessage("&8-=-=-=-=-=-=-=-=-=-=- &6&lV&f&lote &8-=-=-=-=-=-=-=-=-=-=-", p);
						TheAPI.sendMessage("&6C&fzech-&6C&fraft &8- &ehttps://czech-craft.eu/server/moneyak/vote/", p);
						TheAPI.sendMessage("&6&6C&fraft&6l&fist &8- &ehttps://craftlist.org/moneyak", p);
						TheAPI.sendMessage("&8-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-", p);
						gui.close();
						p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
					}
				});
				
				ItemStack rules = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjZlNTIyZDkxODI1MjE0OWU2ZWRlMmVkZjNmZTBmMmMyYzU4ZmVlNmFjMTFjYjg4YzYxNzIwNzIxOGFlNDU5NSJ9fX0="));
				ItemMeta rulesmeta = rules.getItemMeta();
				rulesmeta.setDisplayName(TheAPI.colorize("&6&lP&f&lravidla"));			
				rules.setItemMeta(rulesmeta);
				g.setItem(14, new ItemGUI(rules) {
					public void onClick(Player p, GUI gui, ClickType c) {	
						Rules(p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				
				ItemStack info = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDAxYWZlOTczYzU0ODJmZGM3MWU2YWExMDY5ODgzM2M3OWM0MzdmMjEzMDhlYTlhMWEwOTU3NDZlYzI3NGEwZiJ9fX0="));
				ItemMeta infometa = info.getItemMeta();
				infometa.setDisplayName(TheAPI.colorize("&6&lI&f&lnfo o &6&ls&f&lerveru"));			
				info.setItemMeta(infometa);
				g.setItem(21, new ItemGUI(info) {
					public void onClick(Player p, GUI gui, ClickType c) {	
						info(p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				
				ItemStack tutorial = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ1NWMzMmFjYWNlNzY2ZjljOTRiNDNkMmEzNzYyMWViODVlMDdjMDlkZWJlNWUzM2UwZTBiMzIxZDI3MDkxMiJ9fX0="));
				ItemMeta tutmeta = tutorial.getItemMeta();
				tutmeta.setDisplayName(TheAPI.colorize("&6&lN&f&lávody"));			
				tutorial.setItemMeta(tutmeta);
				g.setItem(22, new ItemGUI(tutorial) {
					public void onClick(Player p, GUI gui, ClickType c) {	
						navod(p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
				
				ItemStack vip = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjdmYzRkZmE1ZjY1MmY2ZTFjMWIxOWZiODc2NTU5NjdlYjgyZmI1ZmE3MTkwNDJmOGM4MDVjYWQ3ZjAxZTQ4NyJ9fX0="));
				ItemMeta vipmeta = vip.getItemMeta();
				vipmeta.setDisplayName(TheAPI.colorize("&6&lV&f&lI&6&lP"));			
				vip.setItemMeta(vipmeta);
				g.setItem(23, new ItemGUI(vip) {
					public void onClick(Player p, GUI gui, ClickType c) {	
						vip(p);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}
				});
		
				ItemStack dc = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg3M2MxMmJmZmI1MjUxYTBiODhkNWFlNzVjNzI0N2NiMzlhNzVmZjFhODFjYmU0YzhhMzliMzExZGRlZGEifX19"));
				ItemMeta dcmeta = dc.getItemMeta();
				dcmeta.setDisplayName(TheAPI.colorize("&9&lDiscord"));	
				dcmeta.setLore(Arrays.asList(TheAPI.colorize("&eÁno, máme i Discord!"), TheAPI.colorize("&ePřijď si pokecat, jen tak s kamarádmi :)"), TheAPI.colorize("&eKlikni pro zaslání odkazu do chatu...")));
				dc.setItemMeta(dcmeta);
				g.setItem(26, new ItemGUI(dc) {
					public void onClick(Player p, GUI gui, ClickType c) {	
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
						p.closeInventory();
						TheAPI.sendMessage("&6&lD&f&liscord: &5discord.io/moneyak", p);
					}
				});

				ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.GRAY_STAINED_GLASS_PANE, 1, " ")){
					@Override
					public void onClick(Player p, GUI gui, ClickType c) {
					}
				};
				int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
				for (int slot : slots) {
					g.setItem(slot, okraj);
				}
				g.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")) {
					public void onClick(Player arg0, GUI arg1, ClickType arg2) {
						g.close();
						p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
					}
				});
			}}.runAsync();
	}
	

	public static void ATGUI(Player p) {
		GUI atgui = new GUI("&6&lA&f&lDMIN &6&lT&f&lEAM", 54, p);
		atgui.open();
		new Tasker() {
			public void run() {
		ItemStack vedeniteam = ItemCreatorAPI.create(Material.DIAMOND_CHESTPLATE, 1, "&c&lVedení serveru");
		atgui.setItem(20,  new ItemGUI(vedeniteam){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				vedenit.vedeni(p);
			}
		});
		ItemStack ostatniteam = ItemCreatorAPI.create(Material.CHAINMAIL_CHESTPLATE, 1, "&9&lOstatní členové AT");
		atgui.setItem(31, new ItemGUI(ostatniteam){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				ostatni.ostatnit(p);
			}
		});
		ItemStack helpers = ItemCreatorAPI.create(Material.IRON_CHESTPLATE, 1, "&5&lHelper Team");
		atgui.setItem(24, new ItemGUI(helpers){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				helperteam.helpert(p);
			}
		});
		ItemStack builders = ItemCreatorAPI.create(Material.GOLDEN_CHESTPLATE, 1, "&2&lBuilder Team");
		atgui.setItem(22, new ItemGUI(builders){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				builderteam.buildert(p);
			}
		});
		
		ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.GRAY_STAINED_GLASS_PANE, 1, " ")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
		for (int slot : slots) {
			atgui.setItem(slot, okraj);
		}
		
		ItemStack back = ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack");
		atgui.setItem(49,new ItemGUI(back){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
     }

	public static void Rules(Player p) {
	GUI rules = new GUI("&6&lP&f&lRAVIDLA", 54, p);
	rules.open();
	new Tasker() {
	public void run() {
    
	ItemStack build = ItemCreatorAPI.create(Material.BRICKS, 1, "&a&lPravidla stavění", Arrays.asList(
			"&8&l• &6Resky neaktivních hráčů budou odstraněny.",
			"&8&l• &6Je zakázáno vypalovat vesnice, krajiny.",
			"&8&l• &6Je zakázáno stavět neslušné stavby."));
    rules.setItem(24, new ItemGUI(build){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
		}
	});
    
    ItemStack tresty = ItemCreatorAPI.create(Material.SPAWNER, 1, "&c&lFormy trestů", Arrays.asList(
    		"&8&l• &6Za porušení pravidel, může být udělen &cJAIL.",
    		"&8&l• &6Další možností je DOČASTNÝ&f/&6TRVALÝ zákaz na server.",
    		"&8&l• &6Za trest lze považovat &cMUTE."));
    rules.setItem(13, new ItemGUI(tresty){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
		}
	});
    
    ItemStack chat = ItemCreatorAPI.create(Material.DARK_OAK_SIGN, 1, "&a&lPravidla chatu", Arrays.asList(
    		"&8&l• &6Povídej si slušně, bez urážení s hráči i s &6Admin&fTeamem.",
    		"&8&l• &6Dále je zakázáno diskutovat o urážlivých nebo sexuálních tématech.",
    		"&8&l• &6Také dělat reklamu, zahlcovat chat, obtěžovat ostatní hráče a pod.."));
    rules.setItem(20, new ItemGUI(chat){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
		}
	});
    
    ItemStack bugs = ItemCreatorAPI.create(Material.DAMAGED_ANVIL, 1, "&6&lChyby a bugy", Arrays.asList(
    		"&8&l• &4!! &6Jakékoli zneužití bugu nebo chyby serveru se také trestá&4 !!",
    		"&8&l• &6Pokud nějakou chybu naleznete prosím nahlašte ji..",
    		"&8&l• &6Za nahlášení chyby dostanete odměnu!"));
    rules.setItem(22, new ItemGUI(bugs){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
		}
	});
    
    rules.setItem(39, new ItemGUI(ItemCreatorAPI.create(Material.FILLED_MAP, 1, "&6V&fšechny &6p&fravidla &6n&falezneš &6n&fa:", Arrays.asList("&7(&c&lKlikni&7)"))){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
    		TheAPI.sendMessage("&a&lwww.moneyak.cz/pravidla", p);
    		rules.close();
		}
	});
    ItemStack eventrules = ItemCreatorAPI.create(Material.MAP, 1, "&6&lPravidla Eventů", Arrays.asList("&7(&c&lKlikni&7)"));
    rules.setItem(41, new ItemGUI(eventrules){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
			AllGuis.Erules(p);
			p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
		}
	});
	/* Pomůcka:
	 a.setItem(-, new ItemGUI(){
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
					}
				});
	 */
    ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.GRAY_STAINED_GLASS_PANE, 1, " ")){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
		}
	};
	int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
	for (int slot : slots) {
		rules.setItem(slot, okraj);
	}
	rules.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
			main(p);
			p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
		}
	});
	}}.runAsync();
	}
	
	public static void Erules(Player p) {
		GUI erules = new GUI("&6&lE&f&lVENT PRAVIDLA", 54, p);
		new Tasker() {
			public void run() {
				erules.setItem(20, new ItemGUI(ItemCreatorAPI.create(Material.LEATHER_BOOTS, 1, "&6&lP&f&larkour", Arrays.asList("&7(&c&lKlikni&7)"))){
					@Override
					public void onClick(Player p, GUI gui, ClickType c) {
						TheAPI.msg("&8---------------------------", p);
						TheAPI.msg("&c1. &6Vyhráva ten, kdo první doskáče do cíle.", p);
						TheAPI.msg("&c2. &6Zákaz /fly, /sethome, /tpa...", p);
						TheAPI.msg("&c3. &6Nepoužívat Ender Perly.", p);
						TheAPI.msg("&6Neznalost pravidel neomlouváme, dostanete trest.", p);
						TheAPI.msg("&8---------------------------", p);
						erules.close();
					}
				});;

	    
	    erules.setItem(22, new ItemGUI(ItemCreatorAPI.create(Material.IRON_SHOVEL, 1, "&6&lK&f&lopajda", Arrays.asList("&7(&c&lKlikni&7)"))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				TheAPI.msg("&8---------------------------", p);
				TheAPI.msg("&c1. &6Zákaz /fly.", p);
				TheAPI.msg("&c2. &6Používat pouze &cŽELEZNOU LOPATKU!", p);
				TheAPI.msg("&c3. &6Nepodkopávat hráče nad sebou!", p);
				TheAPI.msg("&c4. &6Neobkopávat se!", p);
				TheAPI.msg("&c5. &6Nepoužívat Ender Perly.", p);
				TheAPI.msg("&6Neznalost pravidel neomlouváme, dostanete trest.", p);
				TheAPI.msg("&8---------------------------", p);
				erules.close();
			}
		});

	    ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.GRAY_STAINED_GLASS_PANE, 1, " ")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
		for (int slot : slots) {
			erules.setItem(slot, okraj);
		}
		erules.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				AllGuis.main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
	
	public static void navod(Player p) {
		GUI navody = new GUI("&6&lN&f&lÁVODY", 54, p);
		new Tasker() {
			public void run() {
	    navody.setItem(20, new ItemGUI(ItemCreatorAPI.create(Material.STICK, 1, "&6&lR&f&leska", Arrays.asList(
	    		"&c&lPár příkazů pro jednoduché residence.",
	    		"&3/res auto &8- &6Vytvoří novou residenci.",
	    		"&3/res padd &8- &6Povolí hráči residenci.",
	    		"&3/res pdel &8- &6Odebere hráči práva do residenci.",
	    		"&3/res tp <res> &8- &6Teleportuje Vás na residenci.",
	    		"&3/res set <flag> &8- &6Nastaví práva pro všechny.",
	    		"&6U nás se dělá reska &9Drevěnou Tyčkou."))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		});
	    navody.setItem(29, new ItemGUI(ItemCreatorAPI.create(Material.OAK_WOOD, 1, "&6&lJ&f&lak &6&lv&f&lytvořit &6&lr&f&les?", Arrays.asList(
	    		"&41.) &bPrvní musíte tyčkou vybrat 2 různé body.",
	    		"&42.) &bPoté napište příkaz /res create <meno_resky>.",
	    		"&43.) &bA máte hotovo, užívejte hru :)",
	    		"&cHráč může mít 3 resky s velikostí 80x80."))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		});
	    navody.setItem(22, new ItemGUI(ItemCreatorAPI.create(Material.TOTEM_OF_UNDYING, 1, "&6&lM&f&lini&6&lh&f&lry", Arrays.asList(
	    		"&6&lN&f&la serveru máme tyto minihry:",
	    		"&9&lMOB ARENA",
	    		"&8- &6/ma leave &fpro odpojení z minihry.",
	    		"&8- &6/ma join &fpro připojení do minihry.",
	    		"&9&lPARKOUR",
	    		"&8- &6/pa leave &fpro odpojení z minihry.",
	    		"&8- &6/pa join &fpro připojení do minihry.",
	    		"&9&lTNTRUN",
	    		"&8- &6/tntrun leave &fpro odpojení z minihry.",
	    		"&8- &6/tntrun join &fpro připojení do minihry.",
	    		"&9&lPAINTBALL",
	    		"&8- &6/pa leave &fpro odpojení z minihry.",
	    		"&8- &6/pa join &fpro připojení do minihry."))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		});
	    
	    ItemStack teleport = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVjMWMzZjdkMDljZTZjMGNiNDhlZDMwYjQ1OTZhNWMxNGZhZTc5ZGVmOGJmZDE0YTU5ZmMxOTM1NjAwYmM3YiJ9fX0="));
		ItemMeta teleportmeta = teleport.getItemMeta();
		teleportmeta.setDisplayName(TheAPI.colorize("&6&lT&f&leleport na minihry"));			
		teleport.setItemMeta(teleportmeta);
		navody.setItem(31, new ItemGUI(teleport) {
			public void onClick(Player arg0, GUI arg1, ClickType arg2) {
				
				TheAPI.sudoConsole(SudoType.COMMAND, "warp MiniGames "+p.getName());
	    		TheAPI.sendTitle(p, TheAPI.colorize("&6&lM&f&loneyak.cz"), TheAPI.colorize("&9Byl si teleportován na MiniHry."));
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
	    		navody.close();
				
			}
		});
	    
	    navody.setItem(24, new ItemGUI(ItemCreatorAPI.create(Material.PAINTING, 1, "&6&lH&f&lomes", Arrays.asList(
	    		"&3/sethome <home> &8- &6Vytvoří domov na dané pozici.",
	    		"&3/delhome <home> &8- &6Vymaže domov.",
	    		"&3/home <home> &8- &6Teleportuje hráče na jeho domov.",
	    		"&cHráč může mít 2 domovy."))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		});
	    ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.GRAY_STAINED_GLASS_PANE, 1, " ")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
		for (int slot : slots) {
			navody.setItem(slot, okraj);
		}
		navody.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				AllGuis.main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();	
	}
	
	public static void vip(Player p) {
		GUI vip = new GUI("&6&lV&f&lI&6&lP", 54, p);
		new Tasker() {
			public void run() {
		vip.setItem(20, new ItemGUI(ItemCreatorAPI.create(Material.LIME_DYE, 1, "&a&lVIP", Arrays.asList("&3Klikni pro výhody."))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				VIP.vip.VIP(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		vip.setItem(22, new ItemGUI(ItemCreatorAPI.create(Material.ORANGE_DYE, 1, "&6&lSuper&a&lVIP", Arrays.asList("&3Klikni pro výhody."))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				VIP.supervip.SuperVIP(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		vip.setItem(24, new ItemGUI(ItemCreatorAPI.create(Material.LIGHT_BLUE_DYE, 1, "&b&lSponzor", Arrays.asList("&3Klikni pro výhody."))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				VIP.sponzor.Sponzor(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		vip.setItem(40, new ItemGUI(ItemCreatorAPI.create(Material.ENCHANTED_BOOK, 1, "&6&lV&f&lšechna &6&lV&f&lI&6&lP &6&ln&f&lajdete &6&ln&f&la:", Arrays.asList("&7(&c&lKlikni&7)"))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				TheAPI.sendMessage("&6&lwww.moneyak.cz/obchod", p);
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
				vip.close();
			}
		});
		ItemStack paypal = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDRkY2ZjZmFmNzcwZTU2M2MwY2ZkY2QzMDZhMTg1ZWE5NDIzZmUxNjljY2FjZWE2YjkwMzdmMjMzYTJiZjVjIn19fQ=="));
		ItemMeta paypalmeta = paypal.getItemMeta();
		paypalmeta.setDisplayName(TheAPI.colorize("&9&lDiscord"));	
		paypalmeta.setLore(Arrays.asList(TheAPI.colorize("&6Platbu PayPalem najdete na našem webu.")));
		paypal.setItemMeta(paypalmeta);
		vip.setItem(4, new ItemGUI(paypal) {
			public void onClick(Player p, GUI gui, ClickType c) {	
			}
		});
		
		ItemGUI okraj = new ItemGUI(ItemCreatorAPI.create(Material.GRAY_STAINED_GLASS_PANE, 1, " ")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
		for (int slot : slots) {
			vip.setItem(slot, okraj);
		}
		vip.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
	public static void info(Player p) {
		GUI i = new GUI("&6&lI&f&lnfo", 54, p);
		new Tasker() {
			public void run() {
	    i.setItem(20, new ItemGUI(ItemCreatorAPI.create(Material.GLOWSTONE, 1, "&6&lW&f&lEB", Arrays.asList("&7(&c&lKlikni&7)"))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				TheAPI.sendMessage("&6&lW&f&leb: &3www.moneyak.cz", p);
	    		i.close();
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
			}
		});
	    
	    ItemStack dc = new ItemStack(Utils.Utils.createSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg3M2MxMmJmZmI1MjUxYTBiODhkNWFlNzVjNzI0N2NiMzlhNzVmZjFhODFjYmU0YzhhMzliMzExZGRlZGEifX19"));
		ItemMeta dcmeta = dc.getItemMeta();
		dcmeta.setDisplayName(TheAPI.colorize("&9&lDiscord"));	
		dcmeta.setLore(Arrays.asList(TheAPI.colorize("&eÁno, máme i Discord!"), TheAPI.colorize("&ePřijď si pokecat, jen tak s kamarádmi :)"), TheAPI.colorize("&eKlikni pro zaslání odkazu do chatu...")));
		dc.setItemMeta(dcmeta);
		i.setItem(24, new ItemGUI(dc) {
			public void onClick(Player p, GUI gui, ClickType c) {	
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
				p.closeInventory();
				TheAPI.sendMessage("&6&lD&f&liscord: &5discord.io/moneyak", p);
			}
		});
	    
	    i.setItem(22, new ItemGUI(ItemCreatorAPI.create(Material.NAME_TAG, 1, "&6&lF&f&lorum", Arrays.asList("&7(&c&lKlikni&7)"))){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				TheAPI.sendMessage("&eKdyž budeš mít s něčím problém, nebo jsi našel bug,", p);
	    		TheAPI.sendMessage("&ea nikdo z AT nebude na serveru, tak nám to napiš na &3FORUM.", p);
	    		TheAPI.sendMessage("&bwww.moneyak.cz/forum", p);
	    		i.close();
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
			}
		});
	    
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.GRAY_STAINED_GLASS_PANE, 1, " ")) {
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		int[] slots = {0,1,7,8,17,44,53,52,45,36,46,9};
		for (int slot : slots) {
			i.setItem(slot, item);
		}		
		i.setItem(49, new ItemGUI(ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
}
