package com.xworkz.earphone.gadget;
import com.xworkz.earphone.gadget.Bluetooth;

 class TestBluetooth {
	public static void main (String []args)
	{
		Bluetooth bluetooth=new Bluetooth(args);
		
		Bluetooth blue=new Bluetooth("oneplus earbud quality is too good");
		
		
		
		String out=blue.printAll();
		System.out.println(out);
		
		short price=500;
        byte numbers=2;
		
		Bluetooth bluetooths=new Bluetooth("jbl","headphone",price,numbers);
		String result=bluetooths.printAll();
		System.out.println(result);
    }
}	
