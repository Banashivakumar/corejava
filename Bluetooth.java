class Bluetooth
{
String name;
String brand;
short price ;
float length;
String[] args=new String[5];
Bluetooth(String []args)
{
System.out.println("redmi bluetooth");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
	Bluetooth (String n)
	{
	name=n;
	}
	Bluetooth (String n ,String b,short p,float l){
	this(n) ;
	this.brand=b;
	this.price=p;
	this.length=l;
	}
	String printall(){
	String display=name +"\t" +brand +"\t" +price +"\t" +length;
	return display;
	}
	}
