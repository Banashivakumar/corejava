class Bank
{
String name;
String location;
byte customers;
float length;
String[] args=new String[5];
Bank(String []args)
{
System.out.println("ICICI bank");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
	Bank (String n)
	{
	name=n;
	}
	Bank (String n ,String l,byte c,float b){
	this(n) ;
	this.location=l;
	this.customers=c;
	this.length=b;
	}
	String printall(){
	String display=name +"\t" +location +"\t" +customers +"\t" +length;
	return display;
	}
	}
