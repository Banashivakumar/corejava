package com.xworkz.radio.dto;

public class CricketDetailsDTO {
	
	private String team;
	private int players;
	private String wicketkeeper;
	private CaptainDTO captain;
	
	public void setTeam(String team) {
		this.team=team;
	}
	public String getTeam() {
		return team;
	}
	public void setPlayers(int players) {
		this.players=players;
	}
	public int getPlayers() {
		return players;
	}
	public void setWicketkeeper(String wicketkeeper) {
		this.wicketkeeper=wicketkeeper;
	}
	public String getWicketkeeper() {
		return wicketkeeper;
	}
	public void setCaptain(CaptainDTO captain) {
		this.captain=captain;
	}
	public CaptainDTO getCaptain() {
		return captain;
	}
	
	public String getAll() {
		return team + "\t" +players +"\t" +wicketkeeper+"\t" + captain.getAll();
	}

}




