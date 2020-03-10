package br.com.thomas.entities;

public class Achievement {
	String game;
	private double hoursPlayed;
	private double purchaseDate;
	private boolean betaPlayer;
	
	public Achievement() {
		super();
	}
	
	public Achievement(String game, boolean betaPlayer) {
		super();
		this.game = game;
		this.betaPlayer = betaPlayer;
	}

	public double getHoursPlayed() {
		try {
			return hoursPlayed;
		}catch (NullPointerException e) {
			System.out.println("hoursPlayed is null");
		}	
		return 0.0;
	}

	public void setHoursPlayed(double hoursPlayed) {
		this.hoursPlayed = hoursPlayed;
	}

	public boolean isBetaPlayer() {
		return betaPlayer ;
	}

	public void setBetaPlayer(boolean betaPlayer) {
		this.betaPlayer = betaPlayer;
	}

	public String getGame() {
		return game;
	}

	public double getPurchaseDate() {
		return purchaseDate;
	}

}
