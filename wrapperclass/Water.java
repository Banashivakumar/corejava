class Water{
public static void main(String []args){
String quantity="5300";
String density="997";
String boilingpoint="100";
String molarmass="18.01";
String weight="8.34";
System.out.println(quantity);
System.out.println(density);
System.out.println(boilingpoint);
System.out.println(molarmass);
int amount =Integer.parseInt("5300");
short thickness =Short.parseShort(density);
long heatingpoint =Long.parseLong("100");
byte peak=Byte.parseByte(boilingpoint);
double molecularmass=Double.parseDouble("18.01");
float pressure=Float.parseFloat(weight);
System.out.println(amount);
System.out.println(thickness);
System.out.println(heatingpoint);
System.out.println(peak);
System.out.println(molecularmass);
System.out.println(pressure);



}
}