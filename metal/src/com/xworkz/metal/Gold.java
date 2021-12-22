package com.xworkz.metal;

public class Gold extends Metal {
		
		public String chemicalName;
		public float meltingPoint; 
		public String catalyst;
		public byte automicNumber;
		public byte electrons;

		public Gold() {
			System.out.println("Invoking Default Contructor");
		     }

		public Gold(byte electrons,String chemicalName,float meltingPoint,double weight, String color, boolean isductile, double price, float size, String catalyst, byte automicNumber) {
			super(weight, color, isductile, price, size);
			this.meltingPoint = meltingPoint;
			this.chemicalName = chemicalName;
			this.catalyst = catalyst;
			this.automicNumber = automicNumber;
			this.electrons = electrons;
			System.out.println("Invoking Parameter Contructor");
		    }


}
