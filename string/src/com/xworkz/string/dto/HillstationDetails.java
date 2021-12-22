package com.xworkz.string.dto;

public class HillstationDetails {

	
	long peakvalue;
	String name;
	short distance;
	String place;
	
	public HillstationDetails(long peakvalue,String name,short distance,String place) {
		this.peakvalue= peakvalue;
		this.name= name;
		this.distance= distance;
		this.place=place;
	}
  public String getAll() 
  {
	return peakvalue +"\t" + name +"\t" + distance +"\t" + place;
}

}
