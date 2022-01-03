package com.xworkz.abstraction.metro;

public class Greenline extends Purpleline {
	
	@Override
	public void greenline() {
		 System.out.println("Starting from Nagasandra to silkinstitute");
	}
	@Override
	   public void purpleline() {
		   System.out.println("Starting from Baiyapanahalli to Mysore road");
	   }
	@Override
	public void yellowline() {
		System.out.println("Starting from Nagasandra to jaynagar");	
	}
}