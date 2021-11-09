class TestBank
{
public static void main (String []args)
{
Bank b=new Bank(args);

Bank bank=new Bank("Karnataka");
String res=bank.printAll();
System.out.println(res);
byte customers=72;
float length=90.0f;
Bank banks=new Bank("ICICI","tiptur",customers,90.0f);
String result=banks.printAll();
System.out.println(result);
}
}