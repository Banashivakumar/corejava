package com.xworkz.radio.dto;

public class CaptainDTO {
	
	private String name;
	private int matches;
	private long salary;
	private byte wins;
	
	public void setName(String name) {
		this.name=name;
	}
   public String getName() {
	   return name;
   }
   
   public void setMatches(int matches) {
		this.matches=matches;
	}
  public int getMatches() {
	   return matches;
  }
  public void setSalary(long salary) {
		this.salary=salary;
	}
 public long getSalary() {
	   return salary;
 }
 public void setWins(byte wins) {
		this.wins=wins;
	}
public byte getWins() {
	   return wins;
}

public String getAll() {
	return name +"\t" +matches +"\t" + salary+"\t"+ wins;
}

}



