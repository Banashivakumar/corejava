package com.xworkz.gun.dto;

import java.util.Objects;

public class Gundeatilsdto {
	
	private String gunName;
	private int price;
	private String barrelMaterial;
	private double range;
	private byte scope;
	private Bulletdto bullet;
	private Companydto company;
	private Types types;
	
	public String getGunName() {
		return gunName;
	}
	public void setGunName(String gunName) {
		this.gunName = gunName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBarrelMaterial() {
		return barrelMaterial;
	}
	public void setBarrelMaterial(String barrelMaterial) {
		this.barrelMaterial = barrelMaterial;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public byte getScope() {
		return scope;
	}
	public void setScope(byte scope) {
		this.scope = scope;
	}
	public Bulletdto getBullet() {
		return bullet;
	}
	public void setBullet(Bulletdto bullet) {
		this.bullet = bullet;
	}
	public Companydto getCompany() {
		return company;
	}
	public void setCompany(Companydto company) {
		this.company = company;
	}
	public Types getTypes() {
		return types;
	}
	public void setTypes(Types types) {
		this.types = types;
	}
	
	@Override
	public String toString() {
		return "GunDetailsDTO [gunName=" + gunName + ", price=" + price + ", barrelMaterial=" + barrelMaterial
				+ ", range=" + range + ", scope=" + scope + ", bullet=" + bullet + ", company=" + company + ", types="
				+ types + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(barrelMaterial, bullet, company, gunName, price, range, scope, types);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Gundeatilsdto)) {
			return false;
		}
		Gundeatilsdto other = (Gundeatilsdto) obj;
		return Objects.equals(barrelMaterial, other.barrelMaterial) && Objects.equals(bullet, other.bullet)
				&& Objects.equals(company, other.company) && Objects.equals(gunName, other.gunName)
				&& price == other.price ;
	}
	
   
	

}
