package com.xworkz.string.dto;

public class TempleDetails {
	
	public int numberoftemples;
	public String templename;
	public String godname;
	public String place;
	
	public TempleDetails(int numberoftemples,String templename,String godname,String place) {
		this.numberoftemples= numberoftemples;
		this.templename= templename;
		this.godname= godname;
		this.place=place;
	}
  public String getAll() 
  {
	return numberoftemples +"\t" + templename +"\t" + godname +"\t" + place;
}

}
