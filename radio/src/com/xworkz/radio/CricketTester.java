package com.xworkz.radio;

import com.xworkz.radio.dao.CricketDAO;
import com.xworkz.radio.dto.CaptainDTO;
import com.xworkz.radio.dto.CricketDetailsDTO;

public class CricketTester {
	
	public static void main(String[] args) {
		CricketDetailsDTO detailsdto=new CricketDetailsDTO();
		detailsdto.setTeam("INDIA");
		detailsdto.setPlayers((int)11);
		detailsdto.setWicketkeeper("Rishabpanth");
		
		
		CaptainDTO dto=new CaptainDTO();
		dto.setName("Dhoni");
		dto.setMatches((int)364);
		dto.setSalary((long)1350000000);
		dto.setWins((byte)89);
		detailsdto.setCaptain(dto);
		
		CricketDAO dao=new CricketDAO();
		String resp1=dao.insert(detailsdto);
		String resp2=dao.insert(null);
		
		System.out.println(resp1);
		System.out.println(resp2);
		
		dao.printAll();
		boolean isdelete=dao.deleteByPlayers(11);
		System.out.println("data deleted"+isdelete);
		dao.printAll();


}
}
