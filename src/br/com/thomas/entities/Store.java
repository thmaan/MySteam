package br.com.thomas.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Store {

	private List<Game> games;
	private Map<Game ,Float> price;
	public Store() {
		
	}
	public Store(List<Game> games, Map<Game, Float> allprices) {
		super();
		this.games = games;
		this.price = new HashMap<>();
	}
	public List<Game> getGames() {
		return games;
	}
	public void generateSales() {
		for(int i=0;i<50000;i++) {
			System.out.println("Loading");
		}
	}
	public float getPrice(Game g) {
		return price.get(g);
	}
	public void addGames(Game game) {
		games.add(game);
	}
	public void setPrices(Float gamePrice, Game game) {
		price.put(game, gamePrice);
	}
	
}
