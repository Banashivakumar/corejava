package com.xworkz.application.mobile;
import com.xworkz.application.mobile.Video;

class TestVideo {
	public static void main (String []args)
	{
		Video video=new Video(args);
		
		Video vid=new Video("videogames to play");
		
		
		
		String out=vid.printAll();
		System.out.println(out);
		
		short players=25;
        byte storage=30;
		
		Video videos=new Video("subwaysurfers","laptop",players,storage);
		String result=videos.printAll();
		System.out.println(result);
    }
}	