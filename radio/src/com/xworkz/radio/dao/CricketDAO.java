package com.xworkz.radio.dao;

import com.xworkz.radio.dto.CricketDetailsDTO;

public class CricketDAO {
	

	CricketDetailsDTO[] dtos=new CricketDetailsDTO[5];
	int index=0;
	
	public String insert(CricketDetailsDTO dto) {
		if(dto==null) {
			return "this object is null";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getTeam());
			index++;
			return "object added with the team name"+dtos[index-1].getTeam();
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	}
	public boolean deleteByPlayers(int players) {
		for(int index=0;index<dtos.length;index++) {
			if (players==dtos[index].getPlayers()) {
				dtos[index]=null;
				return true;
			}
		}
		return false;
	}


}


