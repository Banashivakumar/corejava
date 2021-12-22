package com.xworkz.inheritance9.dto;

public class Oppo {
	
	public String company;
	public long profit;
	public String founder;
	public int models;
	public boolean quality;
	
	public Oppo() {
		System.out.println("Invoking Oppo class");
	}
	
	public String company(String company) {
		this.company=company;
		return company;
	}
	
	public int models(int models) {
		this.models=models;
		return models;
	}
	
	public String founder(String founder) {
		this.founder=founder;
		return founder;
	}
	
	public boolean quality(boolean quality) {
		this.quality=quality;
		return quality;
	}
	
	public long profit(long profit) {
		this.profit=profit;
		return profit;
	}

}
