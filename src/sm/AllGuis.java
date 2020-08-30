package sm;


import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

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
	
	main l = main.instance;
	public static void main(Player p) {
		GUI gui = new GUI("&6&lM&f&lONEYAK'S &6&lM&f&lENU", 54, p);
		new Tasker() {
			public void run() {
				ItemStack shop = ItemCreatorAPI.createHeadByWeb(1, "&6&lA&f&lukce", "http://textures.minecraft.net/texture/7e3deb57eaa2f4d403ad57283ce8b41805ee5b6de912ee2b4ea736a9d1f465a7");
				gui.setItem(31, new ItemGUI(shop) {
					@Override	
					public void onClick(Player p, GUI gui, ClickType c) {
							p.performCommand("ah");
							gui.close();
					}});
				ItemStack at = ItemCreatorAPI.createHeadByWeb(1, "&6&lA&f&ldmin&6&lT&f&leam", "http://textures.minecraft.net/texture/11bb4266a22dcbc4607621b9c768932950160c2b96708267d707d44551378cd7");
				gui.setItem(12, new ItemGUI(at) {
				
					@Override
					public void onClick(Player p, GUI gui, ClickType c) {
							ATGUI(p);
							p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
					}});
			
		ItemStack vote = ItemCreatorAPI.createHeadByWeb(1, "&6&lV&f&lote", "http://textures.minecraft.net/texture/445edaf59364162480fcbf0d91df1bd680f273583b6609fb22bf58fc64a8ee65");
		gui.setItem(13, new ItemGUI(vote){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				TheAPI.sendMessage("&8-=-=-=-=-=-=-=-=-=-=- &6&lV&f&lote &8-=-=-=-=-=-=-=-=-=-=-", p);
				TheAPI.sendMessage("&6C&fzech-&6C&fraft &8- &ehttps://czech-craft.eu/server/moneyak/vote/", p);
				TheAPI.sendMessage("&6&6C&fraft&6l&fist &8- &ehttps://craftlist.org/moneyak", p);
				TheAPI.sendMessage("&8-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-", p);
				gui.close();
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 5, 1);
			}
		});
		ItemStack pravidla = ItemCreatorAPI.create(Material.OAK_SIGN, 1, "&6&lP&f&lravidla");
		gui.setItem(14, new ItemGUI(pravidla){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				Rules(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		ItemStack info = ItemCreatorAPI.create(Material.BOOK, 1, "&6&lI&f&lnfo o &6&ls&f&lerveru");
		gui.setItem(21,  new ItemGUI(info){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				info(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		
		ItemStack tutorial = ItemCreatorAPI.createHeadByWeb(1, "&6&lN&f&lávody", "http://textures.minecraft.net/texture/d01afe973c5482fdc71e6aa10698833c79c437f21308ea9a1a095746ec274a0f");
		gui.setItem(22, new ItemGUI(tutorial){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				navod(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		ItemStack vip = ItemCreatorAPI.createHeadByWeb(1, "&6&lV&f&lI&6&lP", "http://textures.minecraft.net/texture/303500dd09b454eab9f7de833db188a2f65e5fcedf128ae51ff2807f3de2aed8");
		gui.setItem(23, new ItemGUI(vip){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				vip(p);
				p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 5, 1);
			}
		});
		ItemStack dc = ItemCreatorAPI.createHeadByWeb(1, "&9&lDiscord", Arrays.asList("&aÁno, máme i Discord!", "&6Přijď si pokecat, jen tak s kamarádmi :)", "&eKlikni pro zaslání odkazu do chatu..."), "http://textures.minecraft.net/texture/4d42337be0bdca2128097f1c5bb1109e5c633c17926af5fb6fc20000011aeb53");
		gui.setItem(26, new ItemGUI(dc){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
				p.closeInventory();
				TheAPI.sendMessage("&6&lD&f&liscord: &5discord.io/moneyak", p);
			}
		});
		ItemStack okraj = ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "");
		
		
		ItemGUI item = new ItemGUI(okraj){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		
		ItemStack back = ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack");
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
		gui.setItem(46, item);
		gui.setItem(36, item);
		gui.setItem(9, item);
		gui.setItem(49,  new ItemGUI(back){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				gui.close();
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 5, 1);
			}
		});;
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
		ItemStack okraj = ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "");
		ItemGUI item = new ItemGUI(okraj){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		};
		ItemStack back = ItemCreatorAPI.create(Material.BARRIER, 1, "&4&lBack");
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
    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
		@Override
		public void onClick(Player p, GUI gui, ClickType c) {
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

	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
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
	    navody.setItem(31, new ItemGUI(ItemCreatorAPI.createHeadByWeb(1, "&6&lP&f&lort na minihry:", Arrays.asList("&7(&c&lKlikni&7)"), "http://textures.minecraft.net/texture/4ec1c3f7d09ce6c0cb48ed30b4596a5c14fae79def8bfd14a59fc1935600bc7b")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
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
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
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
		vip.setItem(4, new ItemGUI(ItemCreatorAPI.createHeadByWeb(1, "&6&lP&f&layPal", Arrays.asList("&6Platbu PayPalem najdete na našem webu."), "http://textures.minecraft.net/texture/d4dcfcfaf770e563c0cfdcd306a185ea9423fe169ccacea6b9037f233a2bf5c")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
			}
		});
		
		ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
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
	    i.setItem(24, new ItemGUI(ItemCreatorAPI.createHeadByWeb(1, "&9&lDiscord", Arrays.asList("&7(&c&lKlikni&7)"), "http://textures.minecraft.net/texture/4d42337be0bdca2128097f1c5bb1109e5c633c17926af5fb6fc20000011aeb53")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
				TheAPI.sendMessage("&6&lD&f&liscord: &5discord.io/moneyak", p);
	    		i.close();
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 1);
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
	    
	    ItemGUI item = new ItemGUI(ItemCreatorAPI.create(Material.BLACK_STAINED_GLASS_PANE, 1, "")){
			@Override
			public void onClick(Player p, GUI gui, ClickType c) {
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
