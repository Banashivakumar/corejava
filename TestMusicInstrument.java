class TestMusicInstrument
{
public static void main(String []args)
{
MusicInstrument musicinstrument=new MusicInstrument("Guitar");
String instrument=musicinstrument.printAll();
System.out.println(instrument);


MusicInstrument instruments=new MusicInstrument("Guitar","Gibson",2649,70.0d);
System.out.println(instruments.printAll());
}
}