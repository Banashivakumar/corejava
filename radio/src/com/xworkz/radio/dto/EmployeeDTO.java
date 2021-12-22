package com.xworkz.radio.dto;

public class EmployeeDTO {
	
	private String name;
	private byte id;
	private long salary;
	
	
	public void setName(String name) {
		this.name=name;
	}
   public String getName() {
	   return name;
   }
   
   public void setId(byte id) {
		this.id=id;
	}
  public byte getId() {
	   return id;
  }
  public void setSalary(long salary) {
		this.salary=salary;
	}
 public double getSalary() {
	   return salary;
 }
 
 public String getAll() {
	 return name +"\t" +id +"\t" +salary;
 }
 
}


