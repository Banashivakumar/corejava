package com.xworkz.browser.dto;

public class Chrome extends Browser {
	
	private String realesedate;
	private float version;
	private float size;
	
	public Chrome() {
		System.out.println("chrome constructer");
	}
	public String getRealesedate() {
		return realesedate;
	}
	public void setRealesedate(String realesedate) {
		this.realesedate=realesedate;
	}
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version=version;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size=size;
	}
	
	

}
