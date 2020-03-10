package br.com.thomas.entities;

import java.util.List;

public class Game {	
	private String name;
	private int year;
	private int purchasedYear;
	private String publisher;
	private String developer;
	private String description;
	private Achievement achievement;
	private List<Genre> genres;
	public Game() {	
	}


	public Game(String name, int year, int purchasedYear, String publisher, String developer, String description, List<Genre> genres) {
		super();
		this.name = name;
		this.year = year;
		this.purchasedYear = purchasedYear;
		this.publisher = publisher;
		this.developer = developer;
		this.description = description;
		this.genres = genres;
		newAchievement();
	}
	public void newAchievement() {
		if(year == purchasedYear) {
		this.achievement = new Achievement(name,true);
		}
	}
	public boolean testBetaPlayer() {
		if( year == purchasedYear)
			return true;
		else
			return false;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setPurchaseYear(int year) {
		this.purchasedYear = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public Achievement getAchievement() {
		try {
			return achievement;
		}catch(NullPointerException n) {
			System.out.println("achievement is null");
		}
		return null;
	}		
}
