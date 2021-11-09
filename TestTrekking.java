class TestTrekking
{
public static void main(String []args)
{
Trekking trekking=new Trekking("Nandihills");
String trek=trekking.printAll();
System.out.println(trek);


Trekking trekking2=new Trekking("Nandhihills",15,1,15.2f);
System.out.println(trekking2.printAll());
}
}