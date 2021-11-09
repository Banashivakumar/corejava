class TestBluetooth
{
public static void main (String []args)
{
Bluetooth wire=new Bluetooth(args);

Bluetooth bluetooth=new Bluetooth("redmi");
String res=bluetooth.printAll();
System.out.println(res);
short price=100;
float length=20.0f;
Bluetooth wireless=new Bluetooth("redmi","mi",short,20.0f);
String result=wireless.printAll();
System.out.println(result);
}
}