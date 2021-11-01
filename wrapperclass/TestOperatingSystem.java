class TestOperatingSystem{
public static void main(String []nik){
   OperatingSystem os=new OperatingSystem();

os.name=nik[0];
String osName=os.name;
System.out.println(osName);

os.version=Float.parseFloat(nik[1]);
float osVersion=os.version;
System.out.println(osVersion);

os.price=Integer.parseInt(nik[2]);
int osPrice=os.price;
System.out.println(osPrice);
}
}