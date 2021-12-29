package com.xworkz.enums.dto;

public class ContactDetailsDTO {
	
	private long phonenumber;
	private String mail;
	private String address;
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ContactDetailsDTO [phonenumber=" + phonenumber + ", mail=" + mail + ", address=" + address + "]";
	}
}
	
	
	