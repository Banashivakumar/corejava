package com.xworkz.innova.materials;

 class TestCar {
	public static void main (String []args)
	{
		Car car=new Car(args);
		
		Car cars=new Car("carrawmaterials");
		
		
		
		String out=cars.printAll();
		System.out.println(out);
		
		short price=500;
        byte numbers=5;
		
	com.xworkz.innova.materials.Car carr=new com.xworkz.innova.materials.Car("rolsroyals","thebest",price,numbers);
		String result=carr.printAll();
		System.out.println(result);
    }
}	