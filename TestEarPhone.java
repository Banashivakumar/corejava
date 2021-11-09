class TestEarPhone
{
public static void main(String []args)
{
EarPhone earphone=new EarPhone("E15");
String earphones=earphone.printAll();
System.out.println(earphones);

long price = 1631;
EarPhone earphone2=new EarPhone("E15","Redmi",1631,20.0f);
System.out.println(earphone2.printAll());
}
}