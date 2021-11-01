class TestFish{
public static void main(String []args){
   Fish fh=new Fish();
fh.name=args[0];
String fhName=fh.name;
System.out.println(fhName);

fh.weight=Byte.parseByte(args[1]);
byte fhWeight=fh.weight;
System.out.println(fhWeight);

fh.species=Long.parseLong(args[2]);
long fhSpecies=fh.species;
System.out.println(fhSpecies);

fh.survival=Short.parseShort(args[3]);
short fhSurvival=fh.survival;
System.out.println(fhSurvival);

fh.fin=Integer.parseInt(args[4]);
int fhFin=fh.fin;
System.out.println(fhFin);

fh.protein=Float.parseFloat(args[5]);
float fhProtein=fh.protein;
System.out.println(fhProtein);
}
}




