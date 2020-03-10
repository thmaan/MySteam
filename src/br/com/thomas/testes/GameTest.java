package br.com.thomas.testes;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.thomas.entities.Game;
import br.com.thomas.entities.Genre;

class GameTest {
	Game g;
	List<Genre> leagueGenres = new ArrayList<Genre>();
	
	public GameTest() {
		super();
		Genre moba = new Genre("MOBA");
		Genre competitive = new Genre("Competitive");
		Genre multiplayer = new Genre("Online Multiplayer");
		
		
		leagueGenres.add(moba);
		leagueGenres.add(competitive);
		leagueGenres.add(multiplayer);
		
		Game leagueOfLegends = new Game("League of Legends", 2010 ,2012,"Riot Games","Riot Games","a multiplayer online battle arena video"
				+ "game developed and published by Riot Games for Microsoft Windows and macOS. Inspired by the Warcraft III: The"
				+ " Frozen Throne mod Defense of the Ancients, the game follows a freemium model and is supported by microtransactions.", leagueGenres);
		
		this.g = leagueOfLegends;
	}

	@BeforeEach
	public void setup() {
		Genre newGenre = new Genre("Example");
		leagueGenres.add(newGenre);
		newGenre = new Genre("Empty");
		leagueGenres.add(newGenre);
	}
	@Test
	void test() {
		assertNotNull(g.getYear());
	}
	@Test
	void throwsNull() {
		assertThrows(NullPointerException.class, 
				()->{
					g.getAchievement().getHoursPlayed();	
				});
	}	
	@Test
	void isTrue() {
		// Testando como funciona o Before Each
		assumeTrue(leagueGenres.size() == 5);		
	}
	@Test
	public void test0() {
		Genre testGen = new Genre("Test");
		g.getGenres().add(0,testGen);
	}
	@Test
	void test3() {
		assumeFalse(g.testBetaPlayer());
	}
	@Test
	void test4() {
		g.setPurchaseYear(2010);
		assumeTrue(g.testBetaPlayer());
	}
	@AfterEach
	void test5() {
		for (Genre genre : leagueGenres) {
			System.out.println(genre.getDescription());
		}
		System.out.println();
	}
}
