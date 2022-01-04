package com.xworkz.gamess;

import com.xworkz.gamess.dto.Game;
import com.xworkz.gamess.dto.Indoorgame;
import com.xworkz.gamess.dto.Outdoorgame;

public class Tester {
	
	public static void main(String[] args) {
		
		Game game=new Game();
		game.earningMoney();
		
		Indoorgame indoorgame=new Indoorgame();
		indoorgame.earningMoney();
		
		Outdoorgame outdoorgame=new Outdoorgame();
		outdoorgame.earningMoney();
		
		indoorgame.anyTime1();
		outdoorgame.anyTime1();
		
		indoorgame.anyTime2((byte)5);
		outdoorgame.anyTime2((byte)5);
	}

}
