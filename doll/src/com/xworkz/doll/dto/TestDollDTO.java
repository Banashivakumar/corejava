package com.xworkz.doll.dto;

public class TestDollDTO {
	public static void main (String []args) {
		DollDTO dolldto = new DollDTO();
		dolldto.designDoll();
		dolldto.designDoll("blue");
		dolldto.designDoll((byte)7);
		dolldto.designDoll((byte)8, "pink");
		dolldto.designDoll("Blue", (byte)6);
		
		
	}

}
