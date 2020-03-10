package br.com.thomas.testes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.thomas.entities.Game;
import br.com.thomas.entities.Genre;
import br.com.thomas.entities.Profile;

class ProfileTest {

	static float newWalletValue;
	Profile p;
	Game lastplayed ;
	
	public ProfileTest() {
		Genre moba = new Genre("MOBA");
		Genre competitive = new Genre("Competitive");
		Genre multiplayer = new Genre("Online Multiplayer");
		
		List<Genre> leagueGenres = new ArrayList<Genre>();
		List<Profile> myfriends = new ArrayList<Profile>();
		leagueGenres.add(moba);
		leagueGenres.add(competitive);
		leagueGenres.add(multiplayer);
		
		Game leagueOfLegends = new Game("League of Legends", 2010,2012, "Riot Games","Riot Games","a multiplayer online battle arena video"
				+ "game developed and published by Riot Games for Microsoft Windows and macOS. Inspired by the Warcraft III: The"
				+ " Frozen Throne mod Defense of the Ancients, the game follows a freemium model and is supported by microtransactions.",leagueGenres);
		List<Game> mygames = new ArrayList<>();
		mygames.add(leagueOfLegends);
		this.lastplayed = leagueOfLegends;
		
		this.p = new Profile("th", "Thomas", "Canoinhas", "Brazil", "logo", mygames, myfriends, leagueOfLegends, 7.0);
	}
	@BeforeAll
	public static void increaseWallet() {
		newWalletValue = 0;
	}
	@BeforeEach
	void test0() {
		Random rand = new Random();
		int i = rand.nextInt(10);
		newWalletValue= i ;
	}
	@Test
	void test() {
		assertEquals(newWalletValue, p.getWallet());
	}
	@Test
	void test1() {
		p.setWallet(newWalletValue);
		assertEquals(1, p.getWallet());
	}
	@Test
	void test2() {
		assertEquals("Brasil", p.getCountry());
	}
	@Test
	void test3() {
		assertNotEquals("thomas",p.getName());
	}
	@Test
	void test4() {
		assertNotEquals("Team Fight Tactics", p.getLastPlayed());
	}
	@AfterAll
	public static void showWallet() {
		System.out.println(newWalletValue);
	}
}
