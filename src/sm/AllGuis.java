package sm;


import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import me.Straiker123.GUICreatorAPI;
import me.Straiker123.GUICreatorAPI.Options;
import me.Straiker123.HoverMessage;
import me.Straiker123.HoverMessage.ClickAction;
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
				new HoverMessage("&6Klikni pro otevření shopu.").setClickEvent(ClickAction.RUN_COMMAND, "/shop").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				gui.close();
			}
		});
		gui.setItem(31, shop.create(), opt);
		opt.remove(Options.RUNNABLE);
		
		ItemCreatorAPI warps = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		warps.setDisplayName("&6&lW&f&larps");
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				ATGUI(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		gui.setItem(30, warps.create(), opt);
		
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
		
		ItemCreatorAPI navody = TheAPI.getItemCreatorAPI(Material.BLUE_STAINED_GLASS);
		opt.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				navody(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		navody.setDisplayName("&6&lN&f&lávody");
		gui.setItem(22, navody.create(), opt);
		
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
        String hoff = "&7(&4&lOFFLINE&7)";
        String whoff = "&cnull";
        String houska = "&7(&4&lOFFLINE&7)";
        String whouska = "&cnull";
        String rajce = "&7(&4&lOFFLINE&7)";
        String wrajce = "&cnull";
        String kitiny = "&7(&4&lOFFLINE&7)";
        String wkit = "&cnull";
        String trimic = "&7(&4&lOFFLINE&7)";
        String wtrimi = "&cnull";
        String babys = "&7(&4&lOFFLINE&7)";
        String wbaby = "&cnull";
        String bob = "&7(&4&lOFFLINE&7)";
        String wbob = "&cnull";
        String seal = "&7(&4&lOFFLINE&7)";
        String wseal = "&cnull";
        String endi = "&7(&4&lOFFLINE&7)";
        String wendi = "&cnull";
       
        
        	for (Player ssp: Bukkit.getOnlinePlayers()) {	
	        	if(ssp.getName().equals("Hoff")) {
	        		hoff = "&7(&2&lONLINE&7)";
	        		whoff = ssp.getWorld().getName();
	        	}
	        	if(ssp.getName().equals("Houska02")) {
	        		houska = "&7(&2&lONLINE&7)";
	        		whouska = ssp.getWorld().getName();
	        	}
	        	if(ssp.getName().equals("_ItsRajsko_")) {
	        		rajce = "&7(&2&lONLINE&7)";
	        		wrajce = ssp.getWorld().getName();
	        	}
	        	if(ssp.getName().equals("Kethanee")) {
	        		kitiny = "&7(&2&lONLINE&7)";
	        		wkit = ssp.getWorld().getName();
	        	}
	        	if(ssp.getName().equals("Tramicful")) {
	        		trimic = "&7(&2&lONLINE&7)";
	        		wtrimi = ssp.getWorld().getName();
	        	}
	        	if(ssp.getName().equals("BaySirak")) {
	        		babys = "&7(&2&lONLINE&7)";
	        		wbaby = ssp.getWorld().getName();
	        	}
	        	if(ssp.getName().equals("Saelo")) {
	        		seal = "&7(&2&lONLINE&7)";
	        		wseal = ssp.getWorld().getName();
	        	}
	        	if(ssp.getName().equals("BobaFett")) {
	        		bob = "&7(&2&lONLINE&7)";
	        		wbob = ssp.getWorld().getName();
	        	}
	        	if(ssp.getName().equals("EndivMan594")) {
	        		endi = "&7(&2&lONLINE&7)";
	        		wendi = ssp.getWorld().getName();
	        	}
        	}
        	HashMap<Options, Object> ops = new HashMap<Options, Object>();
            ops.put(Options.CANT_BE_TAKEN, true);
		ItemCreatorAPI m = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		m.setSkullType(SkullType.PLAYER);
		m.setOwner("Hoff");
		m.addLore("&aPozice: &3Majitel");
		m.addLore("&aStatus: " + hoff);
		m.addLore("&aSvět: &7" + whoff);
		m.setDisplayName("&e&lHoff");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráči Hoff").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg Hoff ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(4, m.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI dev = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		dev.setSkullType(SkullType.PLAYER);
		dev.setOwner("Houska02");
		dev.addLore("&aPozice: &bDeveloper");
		dev.addLore("&aStatus: " + houska);
		dev.addLore("&aSvět: &7" + whouska);
		dev.setDisplayName("&e&lHouska02");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráči Houska02").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg Houska02 ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(22, dev.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI a = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		a.setSkullType(SkullType.PLAYER);
		a.setOwner("BobaFett");
		a.addLore("&aPozice: &4Admin");
		a.addLore("&aStatus: " + bob);
		a.addLore("&aSvět: &7" + wbob);
		a.setDisplayName("&e&lBobaFett");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráči BobaFett").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg BobaFett").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(12, a.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI trimi = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		trimi.setSkullType(SkullType.PLAYER);
		trimi.setOwner("Tramicful");
		trimi.addLore("&aPozice: &2Hl. Builder");
		trimi.addLore("&aStatus: " + trimic);
		trimi.addLore("&aSvět: &7" + wtrimi);
		trimi.setDisplayName("&e&lTramicful");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráči Tramicful").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg Tramicful ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(14, trimi.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI kitini = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		kitini.setSkullType(SkullType.PLAYER);
		kitini.setOwner("Kethanee");
		kitini.addLore("&aPozice: &2Builderka");
		kitini.addLore("&aStatus: " + kitiny);
		kitini.addLore("&aSvět: &7" + wkit);
		kitini.setDisplayName("&e&lKethanee");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráčce Kethanee").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg Kethanee ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(24, kitini.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI rajsko = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		rajsko.setSkullType(SkullType.PLAYER);
		rajsko.setOwner("_ItsRajsko_");
		rajsko.addLore("&aPozice: &5Helper");
		rajsko.addLore("&aStatus: " + rajce);
		rajsko.addLore("&aSvět: &7" + wrajce);
		rajsko.setDisplayName("&e&l_ItsRajsko_");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráči _ItsRajsko_").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg _ItsRajsko_ ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(20, rajsko.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI baby = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		baby.setSkullType(SkullType.PLAYER);
		baby.setOwner("BaySirak");
		baby.addLore("&aPozice: &5Helper");
		baby.addLore("&aStatus: " + babys);
		baby.addLore("&aSvět: &7" + wbaby);
		baby.setDisplayName("&e&lBaySirak");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráči BaySirak").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg BaySirak ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(28, baby.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI endiv = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		endiv.setSkullType(SkullType.PLAYER);
		endiv.setOwner("EndivMan594");
		endiv.addLore("&aPozice: &5Helper");
		endiv.addLore("&aStatus: " + endi);
		endiv.addLore("&aSvět: &7" + wendi);
		endiv.setDisplayName("&e&lEndivMan594");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráči EndivMan594").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg EndivMan594 ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(29, endiv.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI saelo = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		saelo.setSkullType(SkullType.PLAYER);
		saelo.setOwner("Saelo");
		saelo.addLore("&aPozice: &6Eventer");
		saelo.addLore("&aStatus: " + seal);
		saelo.addLore("&aSvět: &7" + wseal);
		saelo.setDisplayName("&e&lSaelo");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				new HoverMessage("&6Klikni pro poslání soukromé zprávy hráči Saelo").setClickEvent(ClickAction.SUGGEST_COMMAND, "/msg Saelo ").send(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
				atgui.close();
			}
		});
		atgui.setItem(34, saelo.create(), ops);
		
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
    tresty.setDisplayName("&cFormy trestů");
    tresty.addLore("&8&l• &6Z&fa &6p&forušení &6p&fravidel, &6m&fůže &6b&fýt &6u&fdělen &6J&fAIL.");
    tresty.addLore("&8&l• &6D&falší &6m&fožností &6j&fe &6DOČASTNÝ&f/&6TRVALÝ &6z&fákaz n&fa &6s&ferver.");
    tresty.addLore("&8&l• &6Z&fa &6t&frest &6l&fze &6p&fovažovat &6M&fUTE.");
    rules.setItem(22, tresty.create(), ops);
    
    ItemCreatorAPI chat = TheAPI.getItemCreatorAPI(Material.OAK_SIGN);
    chat.setDisplayName("&aPravidla chatu");
    chat.addLore("&8&l• &6P&fovídej &6s&fi &6s&flušně, &6b&fez &6u&frážení s &6h&fráči i s &6Admin&fTeamem.");
    chat.addLore("&8&l• &6D&fále &6j&fe &6z&fakázáno &6d&fiskutovat o &6u&frážlivých &6n&febo &6s&fexuálních &6t&fématech.");
    chat.addLore("&8&l• &6T&faké &6d&fělat &6r&feklamu, &6z&fahlcovat &6c&fhat, &6o&fbtěžovat &6o&fstatní &6h&fráče a &6p&fod..");
    rules.setItem(20, chat.create(), ops);
    
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
	//najdi git složku :D
	//teda ještě ne 
	public static void navody(Player p) {
		GUICreatorAPI navody = TheAPI.getGUICreatorAPI(p);
		navody.setSize(54);
		navody.setTitle("&6&lP&f&lRAVIDLA");
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
	    minihry.addLore("&9&lTnTRun");
	    minihry.addLore("&8- &6/tntrun leave &fpro odpojení z minihry.");
	    minihry.addLore("&8- &6/tntrun join &fpro připojení do minihry.");
	    minihry.addLore("&9&lPaintBall");
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
				main(p);
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
				VIP(p);
			}
		});
		vip.setItem(20, vp.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI sprvp = TheAPI.getItemCreatorAPI(Material.ORANGE_DYE);
		sprvp.setDisplayName("&6&lSuper&a&lVIP");
		sprvp.addLore("&3Klikni pro výhody.");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				SuperVIP(p);
			}
		});
		vip.setItem(22, sprvp.create(), ops);
		
		ops.remove(Options.RUNNABLE);
		ItemCreatorAPI sponzor = TheAPI.getItemCreatorAPI(Material.LIGHT_BLUE_DYE);
		sponzor.setDisplayName("&b&lSponzor");
		sponzor.addLore("&3Klikni pro výhody.");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				Sponzor(p);
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
	
	public static void VIP(Player p) {
		GUICreatorAPI vp = TheAPI.getGUICreatorAPI(p);
		vp.setSize(54);
		vp.setTitle("&a&lVIP");
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	    
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.LIME_STAINED_GLASS);
	    czk.setDisplayName("&a&lVIP pro Česko:");
	    czk.addLore("&6&lC&f&lena: &350kč");
	    czk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 50 VIP NICK");
	    czk.addLore("&6&lNa &f&lčíslo: &390733.");
	    czk.addLore("&aVIP je na &631 dní.");
	    czk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    vp.setItem(20, czk.create(), ops);
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.GREEN_STAINED_GLASS);
	    svk.setDisplayName("&a&lVIP pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &32€");
	    svk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 2 VIP NICK");
	    svk.addLore("&6&lNa &f&lčíslo: &38866.");
	    svk.addLore("&aVIP je na &631 dní.");
	    svk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    vp.setItem(29, svk.create(), ops);
	    
	    ItemCreatorAPI vyhody = TheAPI.getItemCreatorAPI(Material.DIAMOND);
	    vyhody.setDisplayName("&a&lVIP Výhody:");
	    vyhody.addLore("&9&l• &ePrefix v Chatu a TABu &aVIP");
	    vyhody.addLore("&9&l• &ePri koupě dostanete &62500$");
	    vyhody.addLore("&9&l• &eMožnost teleportovat se na inýho hráče &7(&6/tp&7).");
	    vyhody.addLore("&9&l• &eMožnost nasadit si na hlavu jakýkoliv předmět &7(&6/hat&7).");
	    vyhody.addLore("&9&l• &eVIP residence (5 residencí o velikosti 150x150).");
	    vyhody.addLore("&9&l• &eTeleportace na místo smrti/posledního warpu &7(&6/back&7).");
	    vyhody.addLore("&9&l• &6/kit VIP &e(Enchantované železný nástroje).");
	    vyhody.addLore("&9&l• &eAntiAFK kick, (AFK kick na vás nebude působit).");
	    vyhody.addLore("&9&l• &eMožnost psát barevné zprávy na cedulky nebo do chatu.)");
	    vp.setItem(23, vyhody.create(), ops);
	    
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		vp.setItem(0, okraj.create(), ops);
		vp.setItem(1, okraj.create(), ops);
		vp.setItem(7, okraj.create(), ops);
		vp.setItem(8, okraj.create(), ops);
		vp.setItem(17, okraj.create(), ops);
		vp.setItem(44, okraj.create(), ops);
		vp.setItem(53, okraj.create(), ops);
		vp.setItem(52, okraj.create(), ops);
		vp.setItem(46, okraj.create(), ops);
		vp.setItem(45, okraj.create(), ops);
		vp.setItem(36, okraj.create(), ops);
		vp.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		vp.setItem(49, back.create(), ops);
		
		vp.open();
	}
	
	public static void SuperVIP(Player p) {
		GUICreatorAPI sprvp = TheAPI.getGUICreatorAPI(p);
		sprvp.setSize(54);
		sprvp.setTitle("&a&lVIP");
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	    
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.ORANGE_STAINED_GLASS);
	    czk.setDisplayName("&6&lSuper&a&lVIP pro Česko:");
	    czk.addLore("&6&lC&f&lena: &399kč");
	    czk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 99 SUPERVIP NICK");
	    czk.addLore("&6&lNa &f&lčíslo: &390733.");
	    czk.addLore("&6Super&aVIP je na &631 dní.");
	    czk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    sprvp.setItem(20, czk.create(), ops);
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.RED_STAINED_GLASS);
	    svk.setDisplayName("&6&lSuper&a&lVIP pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &34€");
	    svk.addLore("&6&lS&f&lM&6&lS Tvar: &3FAKAHEDA V31534 4 SUPERVIP NICK");
	    svk.addLore("&6&lNa &f&lčíslo: &38866.");
	    svk.addLore("&6Super&aVIP je na &631 dní.");
	    svk.addLore("&cMísto 'NICK' napište své herní jméno.");
	    sprvp.setItem(29, svk.create(), ops);
	    
	    ItemCreatorAPI vyhody = TheAPI.getItemCreatorAPI(Material.DIAMOND);
	    vyhody.setDisplayName("&a&lVIP Výhody:");
	    vyhody.addLore("&9&l• &ePrefix v Chatu a TABu &6S&aVIP");
	    vyhody.addLore("&9&l• &ePri koupě dostanete &65000$");
	    vyhody.addLore("&9&l• &eStejná práva jako &aVIP.");
	    vyhody.addLore("&9&l• &eMožnost měnit počasí &7(&6/sun, /rain, /thunder&7).");
	    vyhody.addLore("&9&l• &eSuperVIP residence (6 residencí o velikosti 200x200).");
	    vyhody.addLore("&9&l• &eMožnost měnit den a noc &7(&6/day, /night&7).");
	    vyhody.addLore("&9&l• &6/kit VIP &e(Enchantované železný nástroje).");
	    vyhody.addLore("&9&l• &eVirtuální crafting table &7(&6/craft&7).");
	    vyhody.addLore("&9&l• &eOkamžité vyléčení &7(&6/heal, /feed&7).");
	    sprvp.setItem(23, vyhody.create(), ops);
	    
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		sprvp.setItem(0, okraj.create(), ops);
		sprvp.setItem(1, okraj.create(), ops);
		sprvp.setItem(7, okraj.create(), ops);
		sprvp.setItem(8, okraj.create(), ops);
		sprvp.setItem(17, okraj.create(), ops);
		sprvp.setItem(44, okraj.create(), ops);
		sprvp.setItem(53, okraj.create(), ops);
		sprvp.setItem(52, okraj.create(), ops);
		sprvp.setItem(46, okraj.create(), ops);
		sprvp.setItem(45, okraj.create(), ops);
		sprvp.setItem(36, okraj.create(), ops);
		sprvp.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		sprvp.setItem(49, back.create(), ops);
		
		sprvp.open();
	}
	
	public static void Sponzor(Player p) {
		GUICreatorAPI spzr = TheAPI.getGUICreatorAPI(p);
		spzr.setSize(54);
		spzr.setTitle("&b&lSponzor");
		HashMap<Options, Object> ops = new HashMap<Options, Object>();
	    ops.put(Options.CANT_BE_TAKEN, true);
	    
	    ItemCreatorAPI czk = TheAPI.getItemCreatorAPI(Material.ORANGE_STAINED_GLASS);
	    czk.setDisplayName("&b&lSponzor pro Česko:");
	    czk.addLore("&6&lC&f&lena: &3500kč");
	    czk.addLore("&6&lP&f&lladba možná pouze přes &6&lPayPal.");
	    czk.addLore("&bSponzor je navždy.");
	    spzr.setItem(20, czk.create(), ops);
	    
	    ItemCreatorAPI svk = TheAPI.getItemCreatorAPI(Material.RED_STAINED_GLASS);
	    svk.setDisplayName("&b&lSponzor pro Slovensko:");
	    svk.addLore("&6&lC&f&lena: &320€");
	    svk.addLore("&6&lP&f&lladba možná pouze přes &6&lPayPal.");
	    svk.addLore("&bSponzor je navždy.");
	    spzr.setItem(29, svk.create(), ops);
	    
	    ItemCreatorAPI vyhody = TheAPI.getItemCreatorAPI(Material.DIAMOND);
	    vyhody.setDisplayName("&b&lSponor Výhody:");
	    vyhody.addLore("&9&l• &ePrefix v Chatu a TABu &bSponzor");
	    vyhody.addLore("&9&l• &ePri koupě dostanete &625,000$");
	    vyhody.addLore("&9&l• &eStejná práva jako &aVIP a &6Super&aVIP.");
	    vyhody.addLore("&9&l• &eSponzorské residence (20 residencí o velikosti 350x350).");
	    vyhody.addLore("&9&l• &eNezničitelné nástroje, vlastní názvy a lore &7(&6/item&7).");
	    vyhody.addLore("&9&l• &6/kit Sponzor &e(Enchantované diamantové nástroje).");
	    vyhody.addLore("&9&l• &eMožnost měnit hrení mód mezi Survival, Spectator, Adventure.");
	    vyhody.addLore("&9&l• &cCREATIVE mód není obsažen!");
	    spzr.setItem(23, vyhody.create(), ops);
	    
	    ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		spzr.setItem(0, okraj.create(), ops);
		spzr.setItem(1, okraj.create(), ops);
		spzr.setItem(7, okraj.create(), ops);
		spzr.setItem(8, okraj.create(), ops);
		spzr.setItem(17, okraj.create(), ops);
		spzr.setItem(44, okraj.create(), ops);
		spzr.setItem(53, okraj.create(), ops);
		spzr.setItem(52, okraj.create(), ops);
		spzr.setItem(46, okraj.create(), ops);
		spzr.setItem(45, okraj.create(), ops);
		spzr.setItem(36, okraj.create(), ops);
		spzr.setItem(9, okraj.create(), ops);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		ops.put(Options.RUNNABLE, new Runnable() {
			public void run() {
				vip(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		spzr.setItem(49, back.create(), ops);
		
		spzr.open();
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
	    
	    ItemCreatorAPI dis = TheAPI.getItemCreatorAPI(Material.OBSIDIAN);
	    dis.setDisplayName("&6&lD&f&liscord");
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
