package com.xworkz.string.dto;

public class CricketDetails {
	public int jersynumber;
	public String teamname;
	public short numberofplayers;
	public String captainname;
	
	public CricketDetails(int jersynumber,String teamname,short numberofplayers,String captainname) {
		this.jersynumber= jersynumber;
		this.teamname= teamname;
		this.numberofplayers= numberofplayers;
		this.captainname=captainname;
	}
public String getAll() {
	return jersynumber +"\t" + teamname +"\t" + numberofplayers +"\t" + captainname;
}



}
