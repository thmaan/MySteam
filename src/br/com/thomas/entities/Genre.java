package br.com.thomas.entities;

public class Genre {
	private String description;
	
	public Genre() {}
	public Genre(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
