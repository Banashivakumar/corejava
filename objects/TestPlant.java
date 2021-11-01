class TestPlant{
public static void main(String []args){
plant Mp=newPlant();
String plantName=Mp.name;
Mp.grow();
String response=Mp.obsorbco2();
System.out.println(plantName);
System.out.println(response);
}
}