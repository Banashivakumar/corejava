class TestKeyBoard
{
public static void main(String []args)
{
KeyBoard keyboard=new KeyBoard("Dell");
String result=keyboard.printAll();
System.out.println(result);


KeyBoard keyboard2=new KeyBoard("Dell","Windows7",7,104);
System.out.println(keyboard2.printAll());
}
}