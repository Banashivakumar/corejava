package com.xworkz.abstraction.metro;

public abstract class Purpleline extends Metro {
	
	@Override
	public void greenline() {
		 System.out.println("Starting from Nagasandra to silkinstitute");
	}
	@Override
	   public void purpleline() {
		   System.out.println("Starting from Baiyapanahalli to Mysore road");
	   }
	  public abstract void yellowline();
	   }	

