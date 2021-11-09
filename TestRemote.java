class TestRemote
{
public static void main(String []args)
{
Remote remote=new Remote("Zapper");
String remotes=remote.printAll();
System.out.println(remotes);


Remote remote1=new Remote("zapper","Logitech",245,30.0f);
System.out.println(remote1.printAll());
}
}