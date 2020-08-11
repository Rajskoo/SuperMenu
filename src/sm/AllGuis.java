package sm;


import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import AT.builderteam;
import AT.helperteam;
import AT.ostatni;
import AT.vedenit;
import GrapplingHook.GHGUI;
import Utils.Create;
import me.DevTec.ItemCreatorAPI;
import me.DevTec.TheAPI;
import me.DevTec.TheAPI.SudoType;
import me.DevTec.GUI.GUICreatorAPI;
import me.DevTec.GUI.ItemGUI;
import me.DevTec.Scheduler.Tasker;

@SuppressWarnings("deprecation")
public class AllGuis {
	
	main l = main.instance;
	public static void main(Player p) {
		GUICreatorAPI gui = new GUICreatorAPI("&6&lM&f&lONEYAK'S &6&lM&f&lENU", 54, p);
		new Tasker() {
			public void run() {// ten rum má být v celém tom GUI ne:
				
				gui.setItem(31, new ItemGUI(Utils.Create.createItem(Material.EMERALD,"&6&lS&f&lhop")) {
					@Override	
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
						if (c.isRightClick()) {
							p.performCommand("shop");
							gui.close();
						}
					}});
				gui.setItem(12, new ItemGUI(ItemCreatorAPI.create(Material.PLAYER_HEAD, 1, "&6&lA&f&ldmin&6&lT&f&leam")) {
				
					@Override
					public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
						if (c.isRightClick()) {
							ATGUI(p);
							p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
						}
					}});
			
			
		ItemCreatorAPI AT = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		AT.setDisplayName("&6&lA&f&ldmin&6&lT&f&leam");
		AT.setSkullType(SkullType.PLAYER);
		AT.setOwnerFromWeb("http://textures.minecraft.net/texture/11bb4266a22dcbc4607621b9c768932950160c2b96708267d707d44551378cd7");
		gui.setItem(12,new ItemGUI( AT.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				ATGUI(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				
			}
		});		
		ItemCreatorAPI vote = TheAPI.getItemCreatorAPI(Material.DIAMOND_BLOCK);
		vote.setDisplayName("&6&lV&f&lote");
		gui.setItem(13, new ItemGUI(vote.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				TheAPI.sendMessage("&8-=-=-=-=-=-=-=-=-=-=- &6&lV&f&lote &8-=-=-=-=-=-=-=-=-=-=-", p);
				TheAPI.sendMessage("&6C&fzech-&6C&fraft &8- &ehttps://czech-craft.eu/server/moneyak/vote/", p);
				TheAPI.sendMessage("&6&6C&fraft&6l&fist &8- &ehttps://craftlist.org/moneyak", p);
				TheAPI.sendMessage("&8-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-", p);
				gui.close();
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		ItemCreatorAPI pravidla = TheAPI.getItemCreatorAPI(Material.OAK_SIGN);
		pravidla.setDisplayName("&6&lP&f&lravidla");
		gui.setItem(14, new ItemGUI(pravidla.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				Rules(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		ItemCreatorAPI info = TheAPI.getItemCreatorAPI(Material.BOOK);
		info.setDisplayName("&6&lI&f&lnfo o &6&ls&f&lerveru");
		gui.setItem(21,  new ItemGUI(info.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				info(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		
		ItemCreatorAPI tutorial = TheAPI.getItemCreatorAPI(Material.BLUE_STAINED_GLASS);
		tutorial.setDisplayName("&6&lN&f&lávody");
		gui.setItem(22, new ItemGUI(tutorial.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				navod(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		ItemCreatorAPI vip = TheAPI.getItemCreatorAPI(Material.IRON_BLOCK);
		vip.setDisplayName("&6&lV&f&lI&6&lP");
		gui.setItem(23, new ItemGUI(vip.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				vip(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		ItemCreatorAPI dc = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		dc.setSkullType(SkullType.PLAYER);
		dc.setOwnerFromWeb("http://textures.minecraft.net/texture/4d42337be0bdca2128097f1c5bb1109e5c633c17926af5fb6fc20000011aeb53");
		dc.setDisplayName("&9&lDiscord");
		dc.addLore("&aÁno, máme i Discord!");
		dc.addLore("&6Přijď si pokecat, jen tak s kamarádmi :)");
		dc.addLore("&eKlikni pro zaslání odkazu do chatu...");
		gui.setItem(26, new ItemGUI(dc.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
				p.closeInventory();
				TheAPI.sendMessage("&6&lD&f&liscord: &5discord.io/moneyak", p);
			}
		});
		ItemCreatorAPI okraj = TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE);
		
		
		ItemGUI item = new ItemGUI(okraj.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
		gui.setItem(0, item);
		gui.setItem(1, item);
		gui.setItem(7,item);
		gui.setItem(8, item);
		gui.setItem(17, item);
		gui.setItem(44, item);
		gui.setItem(53,item);
		gui.setItem(52, item);
		gui.setItem(46, item);
		gui.setItem(45, item);
		gui.setItem(36, item);
		gui.setItem(9, item);
		gui.setItem(49,  new ItemGUI(Create.createItem("&4&lBack", Material.BARRIER)){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				gui.close();
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 5, 1);
			}
		});;
			}}.runAsync();
	}
	

	public static void ATGUI(Player p) {
		GUICreatorAPI atgui = new GUICreatorAPI("&6&lA&f&lDMIN &6&lT&f&lEAM", 54, p);
		atgui.open();
		new Tasker() {
			public void run() {
		atgui.setItem(20,  new ItemGUI(Create.createItem(Material.DIAMOND_HELMET, "&c&lVedení serveru")){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				vedenit.vedeni(p);
			}
		});
		atgui.setItem(31, new ItemGUI(Create.createItem(Material.CHAINMAIL_HELMET, "&9&lOstatní členové AT")){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				ostatni.ostatnit(p);
			}
		});
		
		ItemCreatorAPI helpert = TheAPI.getItemCreatorAPI(Material.IRON_HELMET);
		helpert.setDisplayName("&5&lHelper Tým");
		atgui.setItem(24, new ItemGUI(helpert.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				helperteam.helpert(p);
			}
		});
		
		ItemCreatorAPI buildert = TheAPI.getItemCreatorAPI(Material.GOLDEN_HELMET);
		buildert.setDisplayName("&2&lBuilder Tým");
		atgui.setItem(22, new ItemGUI(buildert.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
				builderteam.buildert(p);
			}
		});
		ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
		atgui.setItem(0, item);
		atgui.setItem(1, item);
		atgui.setItem(7, item);
		atgui.setItem(8, item);
		atgui.setItem(17, item);
		atgui.setItem(44, item);
		atgui.setItem(53,item);
		atgui.setItem(52, item);
		atgui.setItem(46, item);
		atgui.setItem(45, item);
		atgui.setItem(36, item);
		atgui.setItem(9, item);
		atgui.setItem(49,new ItemGUI( Create.createItem(Material.BARRIER, "&4&lBack")){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
     }

	public static void Rules(Player p) {
	GUICreatorAPI rules = new GUICreatorAPI("&6&lP&f&lRAVIDLA", 54, p);
	rules.open();
	new Tasker() {
	public void run() {
    
    ItemCreatorAPI build = TheAPI.getItemCreatorAPI(Material.BRICKS);
    build.setDisplayName("&a&lPravidla stavění");
    build.addLore("&8&l• &6Resky neaktivních hráčů budou odstraněny.");
    build.addLore("&8&l• &6Je zakázáno vypalovat vesnice, krajiny.");
    build.addLore("&8&l• &6Je zakázáno stavět neslušné stavby.");
    rules.setItem(24, new ItemGUI(build.create()){
		@Override
		public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
		}
	});
    
    ItemCreatorAPI tresty = TheAPI.getItemCreatorAPI(Material.SPAWNER);
    tresty.setDisplayName("&c&lFormy trestů");
    tresty.addLore("&8&l• &6Za porušení pravidel, může být udělen &cJAIL.");
    tresty.addLore("&8&l• &6Další možností je DOČASTNÝ&f/&6TRVALÝ zákaz na server.");
    tresty.addLore("&8&l• &6Za trest lze považovat &cMUTE.");
    rules.setItem(13, new ItemGUI(tresty.create()){
		@Override
		public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
		}
	});
    
    ItemCreatorAPI chat = TheAPI.getItemCreatorAPI(Material.OAK_SIGN);
    chat.setDisplayName("&a&lPravidla chatu");
    chat.addLore("&8&l• &6Povídej si slušně, bez urážení s hráči i s &6Admin&fTeamem.");
    chat.addLore("&8&l• &6Dále je zakázáno diskutovat o urážlivých nebo sexuálních tématech.");
    chat.addLore("&8&l• &6Také dělat reklamu, zahlcovat chat, obtěžovat ostatní hráče a pod..");
    rules.setItem(20, new ItemGUI(chat.create()){
		@Override
		public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
		}
	});
    

    ItemCreatorAPI bugs = TheAPI.getItemCreatorAPI(Material.DAMAGED_ANVIL);
    bugs.setDisplayName("&6&lChyby a bugy");
    bugs.addLore("&8&l• &4!! &6Jakékoli zneužití bugu nebo chyby serveru se také trestá&4 !!");
    bugs.addLore("&8&l• &6Pokud nějakou chybu naleznete prosím nahlašte ji..");
    bugs.addLore("&8&l• &6Za nahlášení chyby dostanete odměnu!");
    
    rules.setItem(22, new ItemGUI(bugs.create()){
		@Override
		public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
		}
	});
    
    ItemCreatorAPI allrules = TheAPI.getItemCreatorAPI(Material.FILLED_MAP);
    allrules.setDisplayName("&6V&fšechny &6p&fravidla &6n&falezneš &6n&fa:");
    allrules.addLore("&7(&c&lKlikni&7)");
    rules.setItem(39, new ItemGUI(allrules.create()){
		@Override
		public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
    		TheAPI.sendMessage("&a&lwww.moneyak.cz/pravidla", p);
    		rules.close();
		}
	});
    
    ItemCreatorAPI eventrules = TheAPI.getItemCreatorAPI(Material.MAP);
    eventrules.setDisplayName("&6&lPravidla Eventů");
    eventrules.addLore("&7(&c&lKlikni&7)");
    rules.setItem(41, new ItemGUI(eventrules.create()){
		@Override
		public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
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
    ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
		@Override
		public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
		}
	};
	rules.setItem(0, item);
	rules.setItem(1, item);
	rules.setItem(7, item);
	rules.setItem(8, item);
	rules.setItem(17, item);
	rules.setItem(44, item);
	rules.setItem(53, item);
	rules.setItem(52, item);
	rules.setItem(46, item);
	rules.setItem(45, item);
	rules.setItem(36, item);
	rules.setItem(9, item);
	ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
	back.setDisplayName("&4&lBack");
	rules.setItem(49, new ItemGUI(back.create()){
		@Override
		public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			main(p);
			p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
		}
	});
	}}.runAsync();
	}
	
	public static void Erules(Player p) {
		GUICreatorAPI erules = new GUICreatorAPI("&6&lE&f&lVENT PRAVIDLA", 54, p);
		new Tasker() {
			public void run() {
	    
	    ItemCreatorAPI parkour = TheAPI.getItemCreatorAPI(Material.LEATHER_BOOTS);
	    parkour.setDisplayName("&6&lP&f&larkour");
	    parkour.addLore("&7(&c&lKlikni&7)");
	    erules.setItem(20, new ItemGUI(parkour.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				TheAPI.msg("&8---------------------------", p);
				TheAPI.msg("&c1. &6Vyhráva ten, kdo první doskáče do cíle.", p);
				TheAPI.msg("&c2. &6Zákaz /fly, /sethome, /tpa...", p);
				TheAPI.msg("&c3. &6Nepoužívat Ender Perly.", p);
				TheAPI.msg("&6Neznalost pravidel neomlouváme, dostanete trest.", p);
				TheAPI.msg("&8---------------------------", p);
				erules.close();
			}
		});;

	    
	    ItemCreatorAPI kopajda = TheAPI.getItemCreatorAPI(Material.IRON_SHOVEL);
	    kopajda.setDisplayName("&6&lK&f&lopajda");
	    kopajda.addLore("&7(&c&lKlikni&7)");
	    erules.setItem(22, new ItemGUI(kopajda.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
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

	    ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
	    erules.setItem(0, item);
	    erules.setItem(1, item);
	    erules.setItem(7, item);
	    erules.setItem(8, item);
		erules.setItem(17, item);
		erules.setItem(44, item);
		erules.setItem(53, item);
		erules.setItem(52, item);
		erules.setItem(46, item);
		erules.setItem(45, item);
		erules.setItem(36, item);
		erules.setItem(9, item);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		erules.setItem(49, new ItemGUI(back.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				AllGuis.main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
	
	public static void navod(Player p) {
		GUICreatorAPI navody = new GUICreatorAPI("&6&lN&f&lÁVODY", 54, p);
		new Tasker() {
			public void run() {
	    
	    ItemCreatorAPI reska = TheAPI.getItemCreatorAPI(Material.STICK);
	    reska.setDisplayName("&6&lR&f&leska");
	    reska.addLore("&c&lPár příkazů pro jednoduché residence.");
	    reska.addLore("&3/res auto &8- &6Vytvoří novou residenci.");
	    reska.addLore("&3/res padd &8- &6Povolí hráči residenci.");
	    reska.addLore("&3/res pdel &8- &6Odebere hráči práva do residenci.");
	    reska.addLore("&3/res tp <res> &8- &6Teleportuje Vás na residenci.");
	    reska.addLore("&3/res set <flag> &8- &6Nastaví práva pro všechny.");
	    reska.addLore("&6U nás se dělá reska &9Drevěnou Tyčkou.");
	    navody.setItem(20, new ItemGUI(reska.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		});
	    
	    ItemCreatorAPI reskanavod = TheAPI.getItemCreatorAPI(Material.OAK_WOOD);
	    reskanavod.setDisplayName("&6&lJ&f&lak &6&lv&f&lytvořit &6&lr&f&les?");
	    reskanavod.addLore("&41.) &bPrvní musíte tyčkou vybrat 2 různé body.");
	    reskanavod.addLore("&42.) &bPoté napište příkaz /res create <meno_resky>.");
	    reskanavod.addLore("&43.) &bA máte hotovo, užívejte hru :)");
	    reskanavod.addLore("&cHráč může mít 3 resky s velikostí 80x80.");
	    navody.setItem(29, new ItemGUI(reskanavod.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		});
	    
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
	    navody.setItem(22, new ItemGUI(minihry.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		});
	    
	    ItemCreatorAPI minihryport = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
	    minihryport.setSkullType("PLAYER");
	    minihryport.setOwnerFromWeb("http://textures.minecraft.net/texture/4ec1c3f7d09ce6c0cb48ed30b4596a5c14fae79def8bfd14a59fc1935600bc7b");
	    minihryport.setDisplayName("&6&lP&f&lort ma minihry:");
	    minihryport.addLore("&7(&c&lKlikni&7)");
	    navody.setItem(31, new ItemGUI(minihryport.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				TheAPI.sudoConsole(SudoType.COMMAND, "warp MiniGames "+p.getName());
	    		TheAPI.sendTitle(p, TheAPI.colorize("&6&lM&f&loneyak.cz"), TheAPI.colorize("&9Byl si teleportován na MiniHry."));
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
	    		navody.close();
			}
		});

	    ItemCreatorAPI homes = TheAPI.getItemCreatorAPI(Material.PAINTING);
	    homes.setDisplayName("&6&lH&f&lome");
	    homes.addLore("&3/sethome <home> &8- &6Vytvoří domov na dané pozici.");
	    homes.addLore("&3/delhome <home> &8- &6Vymaže domov.");
	    homes.addLore("&3/home <home> &8- &6Teleportuje hráče na jeho domov.");
	    homes.addLore("&cHráč může mít 2 domovy.");
	    navody.setItem(24, new ItemGUI(homes.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		});
	    ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
		navody.setItem(0, item);
		navody.setItem(1, item);
		navody.setItem(7, item);
		navody.setItem(8, item);
		navody.setItem(17, item);
		navody.setItem(44, item);
		navody.setItem(53, item);
		navody.setItem(52, item);
		navody.setItem(46, item);
		navody.setItem(45, item);
		navody.setItem(36, item);
		navody.setItem(9, item);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		navody.setItem(49, new ItemGUI(back.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				AllGuis.main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
		
	}
	
	public static void vip(Player p) {
		GUICreatorAPI vip = new GUICreatorAPI("&6&lV&f&lI&6&lP", 54, p);
		new Tasker() {
			public void run() {
		
		ItemCreatorAPI vp = TheAPI.getItemCreatorAPI(Material.LIME_DYE);
		vp.setDisplayName("&a&lVIP");
		vp.addLore("&3Klikni pro výhody.");
		vip.setItem(20, new ItemGUI(vp.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				VIP.vip.VIP(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});

		ItemCreatorAPI sprvp = TheAPI.getItemCreatorAPI(Material.ORANGE_DYE);
		sprvp.setDisplayName("&6&lSuper&a&lVIP");
		sprvp.addLore("&3Klikni pro výhody.");
		vip.setItem(22, new ItemGUI(sprvp.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				VIP.supervip.SuperVIP(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});

		ItemCreatorAPI sponzor = TheAPI.getItemCreatorAPI(Material.LIGHT_BLUE_DYE);
		sponzor.setDisplayName("&b&lSponzor");
		sponzor.addLore("&3Klikni pro výhody.");
		vip.setItem(24, new ItemGUI(sponzor.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				VIP.sponzor.Sponzor(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		
		ItemCreatorAPI allVIP = TheAPI.getItemCreatorAPI(Material.ENCHANTED_BOOK);
		allVIP.setDisplayName("&6&lV&f&lšechna &6&lV&f&lI&6&lP &6&ln&f&lajdete &6&ln&f&la:");
		allVIP.addLore("&7(&c&lKlikni&7)");
		vip.setItem(40, new ItemGUI(allVIP.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				TheAPI.sendMessage("&6&lwww.moneyak.cz/obchod", p);
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
				vip.close();
			}
		});
		
		ItemCreatorAPI paypal = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
		paypal.setSkullType(SkullType.PLAYER);
		paypal.setOwnerFromWeb("http://textures.minecraft.net/texture/d4dcfcfaf770e563c0cfdcd306a185ea9423fe169ccacea6b9037f233a2bf5c");
		paypal.setDisplayName("&6&lP&f&layPal");
		paypal.addLore("&6Platbu PayPalem najdete na našem webu.");
		
		vip.setItem(4, new ItemGUI(paypal.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		});
		
		ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
		vip.setItem(0, item);
		vip.setItem(1, item);
		vip.setItem(7, item);
		vip.setItem(8, item);
		vip.setItem(17, item);
		vip.setItem(44, item);
		vip.setItem(53, item);
		vip.setItem(52, item);
		vip.setItem(46, item);
		vip.setItem(45, item);
		vip.setItem(36, item);
		vip.setItem(9, item);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		vip.setItem(49, new ItemGUI(back.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
	public static void info(Player p) {
		GUICreatorAPI i = new GUICreatorAPI("&6&lI&f&lnfo", 54, p);
		new Tasker() {
			public void run() {
	    
	    ItemCreatorAPI web = TheAPI.getItemCreatorAPI(Material.GLOWSTONE);
	    web.setDisplayName("&6&lW&f&lEB");
	    web.addLore("&7(&c&lKlikni&7)");
	    i.setItem(20, new ItemGUI(web.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				TheAPI.sendMessage("&6&lW&f&leb: &3www.moneyak.cz", p);
	    		i.close();
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
			}
		});
	    
	    ItemCreatorAPI dis = TheAPI.getItemCreatorAPI(Material.PLAYER_HEAD);
	    dis.setSkullType(SkullType.PLAYER);
	    dis.setOwnerFromWeb("http://textures.minecraft.net/texture/4d42337be0bdca2128097f1c5bb1109e5c633c17926af5fb6fc20000011aeb53");
	    dis.setDisplayName("&9&lDiscord");
	    dis.addLore("&7(&c&lKlikni&7)");
	    i.setItem(24, new ItemGUI(dis.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				TheAPI.sendMessage("&6&lD&f&liscord: &5discord.io/moneyak", p);
	    		i.close();
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
			}
		});
	    
	    ItemCreatorAPI forum = TheAPI.getItemCreatorAPI(Material.NAME_TAG);
	    forum.setDisplayName("&6&lF&f&lorum");
	    forum.addLore("&7(&c&lKlikni&7)");
	    i.setItem(22, new ItemGUI(forum.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				TheAPI.sendMessage("&eKdyž budeš mít s něčím problém, nebo jsi našel bug,", p);
	    		TheAPI.sendMessage("&ea nikdo z AT nebude na serveru, tak nám to napiš na &3FORUM.", p);
	    		TheAPI.sendMessage("&bwww.moneyak.cz/forum", p);
	    		i.close();
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
			}
		});
	    
	    ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
		i.setItem(0, item);
		i.setItem(1, item);
		i.setItem(7, item);
		i.setItem(8, item);
		i.setItem(17, item);
		i.setItem(44, item);
		i.setItem(53, item);
		i.setItem(52, item);
		i.setItem(46, item);
		i.setItem(45, item);
		i.setItem(36, item);
		i.setItem(9, item);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		i.setItem(49, new ItemGUI(back.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
	
	public static void ghmenu(Player p) {
		GUICreatorAPI i = new GUICreatorAPI("&6&lGH &f&lMenu", 54, p);
		new Tasker() {
			public void run() {
	    
	    ItemCreatorAPI wood = TheAPI.getItemCreatorAPI(Material.OAK_LOG);
	    wood.setDisplayName("&6Dřevěný Grappler");
	    wood.addLore("&7Klikni pro recept");
	    i.setItem(20, new ItemGUI(wood.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				GHGUI.Wood(p);
	    		p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
	    
	    ItemCreatorAPI stone = TheAPI.getItemCreatorAPI(Material.STONE);
	    stone.setDisplayName("&8Kamenný Grappler");
	    stone.addLore("&7Klikni pro recept");
	    i.setItem(22, new ItemGUI(stone.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				GHGUI.Stone(p);
	    		p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
	    
	    ItemCreatorAPI iron = TheAPI.getItemCreatorAPI(Material.IRON_BLOCK);
	    iron.setDisplayName("&7Železný Grappler");
	    iron.addLore("&7Klikni pro recept");
	    i.setItem(24, new ItemGUI(iron.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				GHGUI.Iron(p);
	    		p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});

	    ItemCreatorAPI gold = TheAPI.getItemCreatorAPI(Material.GOLD_BLOCK);
	    gold.setDisplayName("&eZlatej Grappler");
	    gold.addLore("&7Klikni pro recept");
	    i.setItem(30, new ItemGUI(gold.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				GHGUI.Gold(p);
	    		p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
	    
	    ItemCreatorAPI dia = TheAPI.getItemCreatorAPI(Material.DIAMOND_BLOCK);
	    dia.setDisplayName("&bDiamantovej Grappler");
	    dia.addLore("&7Klikni pro recept");
	    i.setItem(32, new ItemGUI(dia.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				GHGUI.Dia(p);
	    		p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
	    
	    ItemGUI item = new ItemGUI(TheAPI.getItemCreatorAPI(Material.BLACK_STAINED_GLASS_PANE).create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
			}
		};
		i.setItem(0, item);
		i.setItem(1, item);
		i.setItem(7, item);
		i.setItem(8, item);
		i.setItem(17, item);
		i.setItem(44, item);
		i.setItem(53, item);
		i.setItem(52, item);
		i.setItem(46, item);
		i.setItem(45, item);
		i.setItem(36, item);
		i.setItem(9, item);
		ItemCreatorAPI back = TheAPI.getItemCreatorAPI(Material.BARRIER);
		back.setDisplayName("&4&lBack");
		i.setItem(49, new ItemGUI(back.create()){
			@Override
			public void onClick(Player p, GUICreatorAPI gui, ClickType c) {
				main(p);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
			}}.runAsync();
	}
}
