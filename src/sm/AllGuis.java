package sm;


import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import AT.builderteam;
import AT.helperteam;
import AT.ostatni;
import AT.vedenit;
import me.Straiker123.GUICreatorAPI;
import me.Straiker123.GUICreatorAPI.Options;
import me.Straiker123.ItemCreatorAPI;
import me.Straiker123.TheAPI;
import me.Straiker123.TheAPI.SudoType;

@SuppressWarnings("deprecation")
public class AllGuis {
	
	main l = main.instance;
	public static void main(Player p) {
		GUICreatorAPI gui = TheAPI.getGUICreatorAPI(p);
		gui.setSize(54);
		gui.setTitle("&6&lM&f&lONEYAK'S &6&lM&f&lENU");
		
		HashMap<Options, Object> opt = new HashMap<Options, Object>();
		opt.put(Options.CANT_BE_TAKEN, true);
		
		ItemCreatorAPI shop = TheAPI.getItemCreatorAPI(Material.EMERALD);
		shop.setDisplayName("&6&lS&f&lhop");
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				gui.close();
				p.performCommand("shop");
			}
		});
		gui.setItem(31, shop.create(), opt);
		opt.remove(Options.RUNNABLE);
		
		ItemCreatorAPI AT = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		AT.setDisplayName("&6&lA&f&ldmin&6&lT&f&leam");
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				ATGUI(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		gui.setItem(12, AT.create(), opt);
		
		opt.remove(Options.RUNNABLE);
		
		ItemCreatorAPI stats = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		stats.setDisplayName("&6&lT&f&lvoje &6&lS&f&ltaty");
		stats.setSkullType(SkullType.PLAYER);
		stats.setOwner(p.getName());
		stats.addLore("&6Nick: &e%player_displayname%");
		stats.addLore("&6Ping: &e%player_ping%");
		stats.addLore("&6Rank: &e%luckperms_groups%");
		stats.addLore("&6Peníze: &e%money%");
		
		gui.setItem(18, stats.create(), opt);
		
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				TheAPI.sendMessage("&8-=-=-=-=-=-=-=-=-=-=- &6&lV&f&lote &8-=-=-=-=-=-=-=-=-=-=-", p);
				TheAPI.sendMessage("&6C&fzech-&6C&fraft &8- &ehttps://czech-craft.eu/server/moneyak/vote/", p);
				TheAPI.sendMessage("&6&6C&fraft&6l&fist &8- &ehttps://craftlist.org/moneyak", p);
				TheAPI.sendMessage("&8-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-", p);
				gui.close();
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		ItemCreatorAPI vote = TheAPI.getItemCreatorAPI(Material.DIAMOND_BLOCK);
		vote.setDisplayName("&6&lV&f&lote");
		gui.setItem(13, vote.create(), opt);
		opt.remove(Options.RUNNABLE);
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				Rules(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		ItemCreatorAPI pravidla = TheAPI.getItemCreatorAPI(Material.OAK_SIGN);
		pravidla.setDisplayName("&6&lP&f&lravidla");
		gui.setItem(14, pravidla.create(), opt);
		
		opt.remove(Options.RUNNABLE);
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				info(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		ItemCreatorAPI info = TheAPI.getItemCreatorAPI(Material.BOOK);
		info.setDisplayName("&6&lI&f&lnfo o &6&ls&f&lerveru");
		gui.setItem(21, info.create(), opt);
		
		opt.remove(Options.RUNNABLE);
		
		ItemCreatorAPI tutorial = TheAPI.getItemCreatorAPI(Material.BLUE_STAINED_GLASS);
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				navod(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		tutorial.setDisplayName("&6&lN&f&lávody");
		gui.setItem(22, tutorial.create(), opt);
		
		opt.remove(Options.RUNNABLE);
		ItemCreatorAPI vip = TheAPI.getItemCreatorAPI(Material.IRON_BLOCK);
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				vip(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		vip.setDisplayName("&6&lV&f&lI&6&lP");
		gui.setItem(23, vip.create(), opt);
		
		opt.remove(Options.RUNNABLE);
		ItemCreatorAPI dc = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		dc.setSkullType(SkullType.PLAYER);
		dc.setOwnerFromWeb("http://textures.minecraft.net/texture/4d42337be0bdca2128097f1c5bb1109e5c633c17926af5fb6fc20000011aeb53");
		dc.setDisplayName("&9&lDiscord");
		dc.addLore("&2&lAno &6m&fáme &9Discord");
		dc.addLore("&5https://discord.gg/t2WGpS9");
		dc.addLore("&7Klikni pro zaslání odkazu do chatu...");
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
				p.closeInventory();
				TheAPI.sendMessage("&6&lD&f&liscord : &5https://discord.gg/t2WGpS9", p);
			}
		});
		gui.setItem(26, dc.create(), opt);
		
		opt.remove(Options.RUNNABLE);
		ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		gui.setItem(0, okraj.create(), opt);
		gui.setItem(1, okraj.create(), opt);
		gui.setItem(7, okraj.create(), opt);
		gui.setItem(8, okraj.create(), opt);
		gui.setItem(17, okraj.create(), opt);
		gui.setItem(44, okraj.create(), opt);
		gui.setItem(53, okraj.create(), opt);
		gui.setItem(52, okraj.create(), opt);
		gui.setItem(46, okraj.create(), opt);
		gui.setItem(45, okraj.create(), opt);
		gui.setItem(36, okraj.create(), opt);
		gui.setItem(9, okraj.create(), opt);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				gui.close();
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 5, 1);
			}
		});
		gui.setItem(49, back.create(), opt);
		
		gui.open();
	}
	
	public static void ATGUI(Player p) {
		GUICreatorAPI atgui = TheAPI.getGUICreatorAPI(p);
		atgui.setSize(54);
		atgui.setTitle("&6&lA&f&lDMIN &6&lT&f&lEAM");
		
        ItemCreatorAPI vedeni = TheAPI.getItemCreatorAPI(Material.DIAMOND_HELMET);
        vedeni.setDisplayName("&c&lVedení serveru");
        HashMap<Options, Object> ops = new HashMap<Options, Object>();
          ops.put(Options.CANT_BE_TAKEN, true);
          ops.put(Options.RUNNABLE, new Runnable() {
        	  public void run() {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				vedenit.vedeni(p);
			}
		});
		atgui.setItem(20, vedeni.create(), ops);
		
		ItemCreatorAPI ostatnit = TheAPI.getItemCreatorAPI(Material.CHAINMAIL_HELMET);
        ostatnit.setDisplayName("&9&lOstatní členové AT");
          ops.put(Options.RUNNABLE, new Runnable() {
        	  public void run() {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				ostatni.ostatnit(p);
			}
		});
		atgui.setItem(31, ostatnit.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI helpert = TheAPI.getItemCreatorAPI(Material.IRON_HELMET);
		helpert.setDisplayName("&5&lHelper Tým");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				helperteam.helpert(p);
			}
		});
		atgui.setItem(24, helpert.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI buildert = TheAPI.getItemCreatorAPI(Material.GOLDEN_HELMET);
		buildert.setDisplayName("&2&lBuilder Tým");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				builderteam.buildert(p);
			}
		});
		atgui.setItem(22, buildert.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI okrajAT = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
    	HashMap<Options, Object> ops2 = new HashMap<Options, Object>();
        ops2.put(Options.CANT_BE_TAKEN, true);
		atgui.setItem(0, okrajAT.create(), ops2);
		atgui.setItem(1, okrajAT.create(), ops2);
		atgui.setItem(7, okrajAT.create(), ops2);
		atgui.setItem(8, okrajAT.create(), ops2);
		atgui.setItem(17, okrajAT.create(), ops2);
		atgui.setItem(44, okrajAT.create(), ops2);
		atgui.setItem(53, okrajAT.create(), ops2);
		atgui.setItem(52, okrajAT.create(), ops2);
		atgui.setItem(46, okrajAT.create(), ops2);
		atgui.setItem(45, okrajAT.create(), ops2);
		atgui.setItem(36, okrajAT.create(), ops2);
		atgui.setItem(9, okrajAT.create(), ops2);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		HashMap<Options, Object> bakk = new HashMap<Options, Object>();
		bakk.put(Options.CANT_BE_TAKEN, true);
		bakk.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		atgui.setItem(49, back.create(), bakk);
		
		atgui.open();
     }
	
	public static void Rules(Player p) {
	GUICreatorAPI rules = TheAPI.getGUICreatorAPI(p);
	rules.setSize(54);
	rules.setTitle("&6&lP&f&lRAVIDLA");
	HashMap<Options, Object> ops = new HashMap<Options, Object>();
    ops.put(Options.CANT_BE_TAKEN, true);
    
    ItemCreatorAPI build = TheAPI.getItemCreatorAPI(Material.BRICKS);
    build.setDisplayName("&a&lPravidla stavění");
    build.addLore("&8&l• &6R&fesky &6n&feaktivních &6h&fráčů &6b&fudou &6o&fdstraněny.");
    build.addLore("&8&l• &6J&fe &6z&fakázáno &6v&fypalovat &6v&fesnice, &6k&frajiny.");
    build.addLore("&8&l• &6J&fe &6z&fakázáno &6s&ftavět &6n&feslušné &6s&ftavby.");
    rules.setItem(24, build.create(), ops);
    
    ItemCreatorAPI tresty = TheAPI.getItemCreatorAPI(Material.SPAWNER);
    tresty.setDisplayName("&c&lFormy trestů");
    tresty.addLore("&8&l• &6Z&fa &6p&forušení &6p&fravidel, &6m&fůže &6b&fýt &6u&fdělen &6J&fAIL.");
    tresty.addLore("&8&l• &6D&falší &6m&fožností &6j&fe &6DOČASTNÝ&f/&6TRVALÝ &6z&fákaz n&fa &6s&ferver.");
    tresty.addLore("&8&l• &6Z&fa &6t&frest &6l&fze &6p&fovažovat &6M&fUTE.");
    rules.setItem(13, tresty.create(), ops);
    
    ItemCreatorAPI chat = TheAPI.getItemCreatorAPI(Material.OAK_SIGN);
    chat.setDisplayName("&a&lPravidla chatu");
    chat.addLore("&8&l• &6P&fovídej &6s&fi &6s&flušně, &6b&fez &6u&frážení s &6h&fráči i s &6Admin&fTeamem.");
    chat.addLore("&8&l• &6D&fále &6j&fe &6z&fakázáno &6d&fiskutovat o &6u&frážlivých &6n&febo &6s&fexuálních &6t&fématech.");
    chat.addLore("&8&l• &6T&faké &6d&fělat &6r&feklamu, &6z&fahlcovat &6c&fhat, &6o&fbtěžovat &6o&fstatní &6h&fráče a &6p&fod..");
    rules.setItem(20, chat.create(), ops);
    
    ItemCreatorAPI bugs = TheAPI.getItemCreatorAPI(Material.DAMAGED_ANVIL);
    bugs.setDisplayName("&6&lChyby a bugy");
    bugs.addLore("&8&l• &4!! &6J&fakékoli &6z&fneužití &6b&fugu &6n&febo &6c&fhyby &6s&ferveur &6s&fe &6t&faké &6t&frestá&4 !!");
    bugs.addLore("&8&l• &6P&fokud &6n&fějakou &6c&fhybu &6n&faleznete &6p&frosím &6n&fahlašte &6j&fi&6.&f.");
    bugs.addLore("&8&l• &6Z&fa &6n&fahlášení &6c&fhyby &6d&fostanete &6o&fdměnu&6!");
    
    rules.setItem(22, bugs.create(), ops);
    
    ItemCreatorAPI allrules = TheAPI.getItemCreatorAPI(Material.FILLED_MAP);
    allrules.setDisplayName("&6V&fšechny &6p&fravidla &6n&falezneš &6n&fa:");
    allrules.addLore("&7(&c&lKlikni&7)");
    ops.put(Options.RUNNABLE, new Runnable() {
    	public void run() {
    		TheAPI.sendMessage("&a&lwww.moneyak.cz/pravidla", p);
    		rules.close();
    	}
    });
    rules.setItem(40, allrules.create(), ops);
    
    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
	rules.setItem(0, okraj.create(), ops);
	rules.setItem(1, okraj.create(), ops);
	rules.setItem(7, okraj.create(), ops);
	rules.setItem(8, okraj.create(), ops);
	rules.setItem(17, okraj.create(), ops);
	rules.setItem(44, okraj.create(), ops);
	rules.setItem(53, okraj.create(), ops);
	rules.setItem(52, okraj.create(), ops);
	rules.setItem(46, okraj.create(), ops);
	rules.setItem(45, okraj.create(), ops);
	rules.setItem(36, okraj.create(), ops);
	rules.setItem(9, okraj.create(), ops);
	ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
	back.setDisplayName("&4&lBack");
	ops.put(Options.RUNNABLE, new Runnable() {
		public void run() {
			main(p);
			p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
		}
	});
	rules.setItem(49, back.create(), ops);
	
	rules.open();
	
	}
	
	public static void navod(Player p) {
		GUICreatorAPI navody = TheAPI.getGUICreatorAPI(p);
		navody.setSize(54);
		navody.setTitle("&6&lN&f&lÁVODY");
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	    
	    ItemCreatorAPI reska = TheAPI.getItemCreatorAPI(Material.STICK);
	    reska.setDisplayName("&6&lR&f&leska");
	    reska.addLore("&c&lPár příkazů pro jednoduché residence.");
	    reska.addLore("&3/res auto &8- &6Vytvoří novou residenci.");
	    reska.addLore("&3/res padd &8- &6Povolí hráči residenci.");
	    reska.addLore("&3/res pdel &8- &6Odebere hráči práva do residenci.");
	    reska.addLore("&3/res tp <res> &8- &6Teleportuje Vás na residenci.");
	    reska.addLore("&3/res set <flag> &8- &6Nastaví práva pro všechny.");
	    reska.addLore("&6U nás se delá reska &9Drevěnou Tyčkou.");
	    navody.setItem(20, reska.create(), ops);
	    
	    ItemCreatorAPI reskanavod = TheAPI.getItemCreatorAPI(Material.OAK_WOOD);
	    reskanavod.setDisplayName("&6&lJ&f&lak &6&lv&f&lytvořit &6&lr&f&les?");
	    reskanavod.addLore("&41.) &bPrvní musíte tyčkou vybrat 2 různé body.");
	    reskanavod.addLore("&42.) &bPoté napište příkaz /res create <meno_resky>.");
	    reskanavod.addLore("&43.) &bA máte hotovo, užívejte hru :)");
	    reskanavod.addLore("&cHráč může mít 3 resky s velikostí 80x80.");
	    navody.setItem(29, reskanavod.create(), ops);
	    
	    ItemCreatorAPI minihry = TheAPI.getItemCreatorAPI(Material.TOTEM_OF_UNDYING);
	    minihry.setDisplayName("&6&lM&f&lini&6&lh&f&lry");
	    minihry.addLore("&6&lN&f&la serveru máme tyto minihry:");
	    minihry.addLore("&9&lMOB ARENA");
	    minihry.addLore("&8- &6/ma leave &fpro odpojení z minihry.");
	    minihry.addLore("&8- &6/ma join &fpro připojení do minihry.");
	    minihry.addLore("&9&lPARKOUR");
	    minihry.addLore("&8- &6/pa leave &fpro odpojení z minihry.");
	    minihry.addLore("&8- &6/pa join &fpro připojení do minihry.");
	    minihry.addLore("&9&lTNTRUN");
	    minihry.addLore("&8- &6/tntrun leave &fpro odpojení z minihry.");
	    minihry.addLore("&8- &6/tntrun join &fpro připojení do minihry.");
	    minihry.addLore("&9&lPAINTBALL");
	    minihry.addLore("&8- &6/pa leave &fpro odpojení z minihry.");
	    minihry.addLore("&8- &6/pa join &fpro připojení do minihry.");
	    navody.setItem(22, minihry.create(), ops);
	    
	    ItemCreatorAPI minihryport = TheAPI.getItemCreatorAPI(Material.BELL);
	    ops.put(Options.RUNNABLE, new Runnable() {
	    	public void run() {
	    		TheAPI.sudoConsole(SudoType.COMMAND, "warp MiniGames "+p.getName());
	    		TheAPI.sendTitle(p, "&6&lM&f&loneyak.cz", "&9Byl si teleportován na MiniHry.");
	    		navody.close();
	    	}
	    });
	    minihryport.setDisplayName("&6&lP&f&lro &6&lp&f&lort &6&ln&f&la &6&lm&f&lini&6&lh&f&lry:");
	    minihryport.addLore("&7(&c&lKlikni&7)");
	    navody.setItem(31, minihryport.create(), ops);
	    
	    ops.remove(Options.RUNNABLE);
	    ItemCreatorAPI homes = TheAPI.getItemCreatorAPI(Material.PAINTING);
	    homes.setDisplayName("&6&lH&f&lome");
	    homes.addLore("&3/sethome <home> &8- &6Vytvoří domov na dané pozici.");
	    homes.addLore("&3/delhome <home> &8- &6Vymaže domov.");
	    homes.addLore("&3/home <home> &8- &6Teleportuje hráče na jeho domov.");
	    homes.addLore("&cHráč může mít 2 domovy.");
	    navody.setItem(24, homes.create(), ops);
	    
	    ops.remove(Options.RUNNABLE);
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		navody.setItem(0, okraj.create(), ops);
		navody.setItem(1, okraj.create(), ops);
		navody.setItem(7, okraj.create(), ops);
		navody.setItem(8, okraj.create(), ops);
		navody.setItem(17, okraj.create(), ops);
		navody.setItem(44, okraj.create(), ops);
		navody.setItem(53, okraj.create(), ops);
		navody.setItem(52, okraj.create(), ops);
		navody.setItem(46, okraj.create(), ops);
		navody.setItem(45, okraj.create(), ops);
		navody.setItem(36, okraj.create(), ops);
		navody.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				AllGuis.main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		navody.setItem(49, back.create(), ops);
		
		navody.open();
	}
	
	public static void vip(Player p) {
		GUICreatorAPI vip = TheAPI.getGUICreatorAPI(p);
		vip.setSize(54);
		vip.setTitle("&6&lV&f&lI&6&lP");
	
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
		
		ItemCreatorAPI vp = TheAPI.getItemCreatorAPI(Material.LIME_DYE);
		vp.setDisplayName("&a&lVIP");
		vp.addLore("&3Klikni pro výhody.");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				VIP.vip.VIP(p);
			}
		});
		vip.setItem(20, vp.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI sprvp = TheAPI.getItemCreatorAPI(Material.ORANGE_DYE);
		sprvp.setDisplayName("&6&lSuper&a&lVIP");
		sprvp.addLore("&3Klikni pro výhody.");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				VIP.supervip.SuperVIP(p);
			}
		});
		vip.setItem(22, sprvp.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI sponzor = TheAPI.getItemCreatorAPI(Material.LIGHT_BLUE_DYE);
		sponzor.setDisplayName("&b&lSponzor");
		sponzor.addLore("&3Klikni pro výhody.");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				VIP.sponzor.Sponzor(p);
			}
		});
		vip.setItem(24, sponzor.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI allVIP = TheAPI.getItemCreatorAPI(Material.ENCHANTED_BOOK);
		allVIP.setDisplayName("&6&lV&f&lšechna &6&lV&f&lI&6&lP &6&ln&f&lajdete &6&ln&f&la:");
		allVIP.addLore("&7(&c&lKlikni&7)");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				TheAPI.sendMessage("&6&lwww.moneyak.cz/obchod", p);
				vip.close();
			}
		});
		vip.setItem(40, allVIP.create(), ops);
		
		ops.remove(Options.RUNNABLE);
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		vip.setItem(0, okraj.create(), ops);
		vip.setItem(1, okraj.create(), ops);
		vip.setItem(7, okraj.create(), ops);
		vip.setItem(8, okraj.create(), ops);
		vip.setItem(17, okraj.create(), ops);
		vip.setItem(44, okraj.create(), ops);
		vip.setItem(53, okraj.create(), ops);
		vip.setItem(52, okraj.create(), ops);
		vip.setItem(46, okraj.create(), ops);
		vip.setItem(45, okraj.create(), ops);
		vip.setItem(36, okraj.create(), ops);
		vip.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		vip.setItem(49, back.create(), ops);
		
		vip.open();
	}
	
	public static void info(Player p) {
		GUICreatorAPI i = TheAPI.getGUICreatorAPI(p);
		i.setSize(54);
		i.setTitle("&6&lI&f&lnfo");
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	    
	    ItemCreatorAPI web = TheAPI.getItemCreatorAPI(Material.GLOWSTONE);
	    web.setDisplayName("&6&lW&f&lEB");
	    web.addLore("&7(&c&lKlikni&7)");
	    ops.put(Options.RUNNABLE, new Runnable() {
	    	public void run() {
	    		TheAPI.sendMessage("&6&lW&f&leb: &3www.moneyak.cz", p);
	    		i.close();
	    	}
	    });
	    i.setItem(20, web.create(), ops);
	    ops.remove(Options.RUNNABLE);
	    
	    ItemCreatorAPI dis = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
	    dis.setSkullType(SkullType.PLAYER);
	    dis.setOwnerFromWeb("http://textures.minecraft.net/texture/4d42337be0bdca2128097f1c5bb1109e5c633c17926af5fb6fc20000011aeb53");
	    dis.setDisplayName("&9&lDiscord");
	    dis.addLore("&7(&c&lKlikni&7)");
	    ops.put(Options.RUNNABLE, new Runnable() {
	    	public void run() {
	    		TheAPI.sendMessage("&6&lD&f&liscord: &5https://discord.gg/cpS4Zn9", p);
	    		i.close();
	    	}
	    });
	    i.setItem(24, dis.create(), ops);
	    ops.remove(Options.RUNNABLE);
	    
	    ItemCreatorAPI forum = TheAPI.getItemCreatorAPI(Material.NAME_TAG);
	    forum.setDisplayName("&6&lF&f&lorum");
	    forum.addLore("&7(&c&lKlikni&7)");
	    ops.put(Options.RUNNABLE, new Runnable() {
	    	public void run() {
	    		TheAPI.sendMessage("&eKdyž budeš mít s něčím problém, nebo jsi našel bug,", p);
	    		TheAPI.sendMessage("&ea nikdo z AT nebude na serveru, tak nám to napiš na &3FORUM.", p);
	    		TheAPI.sendMessage("&bwww.moneyak.cz/forum", p);
	    		i.close();
	    	}
	    });
	    i.setItem(22, forum.create(), ops);
	    ops.remove(Options.RUNNABLE);
	    
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		i.setItem(0, okraj.create(), ops);
		i.setItem(1, okraj.create(), ops);
		i.setItem(7, okraj.create(), ops);
		i.setItem(8, okraj.create(), ops);
		i.setItem(17, okraj.create(), ops);
		i.setItem(44, okraj.create(), ops);
		i.setItem(53, okraj.create(), ops);
		i.setItem(52, okraj.create(), ops);
		i.setItem(46, okraj.create(), ops);
		i.setItem(45, okraj.create(), ops);
		i.setItem(36, okraj.create(), ops);
		i.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		i.setItem(49, back.create(), ops);
		
		i.open();
	}
}
