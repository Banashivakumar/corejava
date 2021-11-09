class TestTraffic
{
public static void main(String []args)
{
Traffic traffic=new Traffic("Greensignal");
String result=traffic.printAll();
System.out.println(result);


Traffic traffic2=new Traffic("Greensignal",5280,172,130.0d);
System.out.println(traffic2.printAll());
}
}