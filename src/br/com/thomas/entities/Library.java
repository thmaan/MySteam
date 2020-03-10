package br.com.thomas.entities;

import java.util.List;

public class Library {
	private List<Game> mygames;
	private String purchasedDate;
	private double playedHours;
	
	

	public Library(List<Game> mygames) {
		super();
		this.mygames = mygames;
	}

	public double getPlayedHours() {
		return playedHours;
	}

	public void setPlayedHours(double playedHours) {
		this.playedHours = playedHours;
	}

	public List<Game> getMygames() {
		return mygames;
	}

	public String getPurchasedDate() {
		return purchasedDate;
	}

}

