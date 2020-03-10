package br.com.thomas.entities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class main {

	public static void main(String[] args) {
		
		/*Steam tem, loja, jogos, amigos, biblioteca, conquistas, perfil
		 * 
		 * 
		 * 
		 */
		List<Game> allgames  = new ArrayList<>();
		Map<Game, Float> allprices = new HashMap<>();
		
		Store store = new Store(allgames,allprices);
	
		List<Game> mygames = new ArrayList<>();
		List<String> categories = new ArrayList<>();
		categories.add("MOBA");
		categories.add("Multiplayer");
		categories.add("Competitive");
		
		Genre moba = new Genre("MOBA");
		Genre competitive = new Genre("Competitive");
		Genre multiplayer = new Genre("Online Multiplayer");
		Genre autoBattler = new Genre("Auto Battler");
		
		List<Genre> leagueGenres = new ArrayList<Genre>();
		leagueGenres.add(moba);
		leagueGenres.add(competitive);
		leagueGenres.add(multiplayer);
		
		List<Genre> tftGenres = new ArrayList<Genre>();
		tftGenres.add(autoBattler);
		tftGenres.add(competitive);
		tftGenres.add(multiplayer);
		
		Game leagueOfLegends = new Game("League of Legends", 2010, 2012,"Riot Games","Riot Games","a multiplayer online battle arena video"
				+ "game developed and published by Riot Games for Microsoft Windows and macOS. Inspired by the Warcraft III: The"
				+ " Frozen Throne mod Defense of the Ancients, the game follows a freemium model and is supported by microtransactions.", leagueGenres);
		
	
		Game teamFightTactics = new Game("Team Fight Tactics", 2019, 2019,"Riot Games", "Riot Games", "Teamfight Tactics is an auto battler developed and published by"
				+ " Riot Games. It was initially released as a game mode for League of Legends for"
				+ " Microsoft Windows and macOS in June 2019, and is scheduled to be released for Android and iOS in March 2020, "
				+ "excluding Southeast Asia, which is delayed until Fall 2020",tftGenres);
		
		mygames.add(teamFightTactics);
		allprices.put(leagueOfLegends, (float) 0.0);
		allprices.put(teamFightTactics, (float) 0.0);
		
		Profile thomas = new Profile("Thomas");
		Profile lucas = new Profile("Lucas");
		Profile jubileu = new Profile("Jubileu");
		
		thomas.addFriend(jubileu);
		jubileu.addFriend(thomas);
		thomas.addFriend(lucas);
		lucas.addFriend(thomas);
		jubileu.addFriend(lucas);
		
		/* Adicionar games
		 * 
		 */
		
		

		
	}
	
}
