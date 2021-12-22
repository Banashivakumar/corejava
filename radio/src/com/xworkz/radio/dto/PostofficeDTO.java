package com.xworkz.radio.dto;

public class PostofficeDTO {
	private String branch;
	private String area;
	private long pincode;
	private EmployeeDTO employee;
	
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setArea(String area) {
		this.area=area;
	}
	public String getArea() {
		return area;
	}
	public void setPincode(long pincode) {
		this.pincode=pincode;
	}
	public long getPincode() {
		return pincode;
	}
	public void setEmployee(EmployeeDTO employee) {
		this.employee=employee;
	}
	public EmployeeDTO getEmployee() {
		return employee;
	}
   public String getAll() {
	   return branch + "\t" +area + "\t" + "\t"+ pincode+ "\t" + employee.getAll();
   }
}


