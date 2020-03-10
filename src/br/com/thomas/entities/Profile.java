package br.com.thomas.entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Profile {
	private	String nickname;
	private String name;
	private String city;
	private String country;
	private String avatar;
	private List<Game> ownedGames;
	private List<Profile> friends;
	private Game lastPlayed;
	private double wallet;
	
	public List<Profile> getFriends() {
		return friends;
	}
	public void setFriends(List<Profile> friends) {
		this.friends = friends;
	}
	public Profile(String nickname, String name, String city, String country, String avatar, List<Game> ownedGames,
			List<Profile> friends, Game lastPlayed, double wallet) {
		super();
		this.nickname = nickname;
		this.name = name;
		this.city = city;
		this.country = country;
		this.avatar = avatar;
		this.ownedGames = ownedGames;
		this.friends = friends;
		this.lastPlayed = lastPlayed;
		this.wallet = wallet;
	}
	public Profile(String nickname) {
		this.nickname = nickname;
		emptyInit();
	}
	private void emptyInit() {
		this.friends = new ArrayList<Profile>();
		this.ownedGames = new ArrayList<Game>();
	}
	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public List<Game> getOwnedGames() {
		return ownedGames;
	}

	public void setOwnedGames(List<Game> ownedGames) {
		this.ownedGames = ownedGames;
	}

	public Game getLastPlayed() {
		return lastPlayed;
	}

	public void setLastPlayed(Game lastPlayed) {
		this.lastPlayed = lastPlayed;
	}
	public void addGame(Game game) {
		this.ownedGames.add(game);
	}
	public void addFriend(Profile friend) {
		this.friends.add(friend);
	}
	public void removeFriend(Profile p) {
		this.friends.remove(p);
	}
	public void removeGame(Game game) {
		this.ownedGames.remove(game);
	}
}
