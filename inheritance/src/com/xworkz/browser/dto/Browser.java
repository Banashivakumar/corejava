package com.xworkz.browser.dto;

public class Browser {
	
	

	public String search(String search) {
		return "Data of"+search;
		
	}
	
	public boolean download(String app) {
		System.out.println("downloading application:"+app);
		return true;
	}

}
