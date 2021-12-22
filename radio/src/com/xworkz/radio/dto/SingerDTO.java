package com.xworkz.radio.dto;

public class SingerDTO {
	
	private String name;
	private int noofsongs ;
	private long salary;
	private String genres;
	
	public void setName(String name) {
		this.name=name;
	}
   public String getName() {
	   return name;
   }
   
   public void setNoofsongs(int noofsongs) {
		this.noofsongs=noofsongs;
	}
  public int getNoofsongs() {
	   return noofsongs;
  }
  public void setSalary(long salary) {
		this.salary=salary;
	}
 public long getSalary() {
	   return salary;
 }
 public void setGenres(String genres) {
		this.genres=genres;
	}
public String getGenres() {
	   return genres;
}
public String getAll() {
	return name +"\t" +noofsongs +"\t" + salary+"\t"+ genres;
 
}
}



