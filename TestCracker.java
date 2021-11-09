class TestCracker
{
public static void main(String []args)
{
Cracker cracker=new Cracker("Rocket");
String crackers=cracker.printAll();
System.out.println(crackers);


Cracker crackers2=new Cracker("Rocket",75,80,90.0d);
System.out.println(crackers2.printAll());
}
}