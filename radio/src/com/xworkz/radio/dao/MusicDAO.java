package com.xworkz.radio.dao;

import com.xworkz.radio.dto.MusicDTO;

public class MusicDAO {
	
	MusicDTO[] dtos=new MusicDTO[5];
	int index=0;
	
	public String insert(MusicDTO dto) {
		if(dto==null) {
			return "this is null object";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getInstrument());
			index++;
			return "object added with the instrument name"+dtos[index-1].getInstrument();
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	
		
		public MusicDTO updateMusictypeByInstrument(String musictype,String instrument) {
			MusicDTO musicdetailsDTO=null;
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					if(instrument.equals(dtos[index].getInstrument())){
						dtos[index].setMusictype(musictype);
						musicdetailsDTO=dtos[index];
					}									
				}
			}
		return musicdetailsDTO;
			}

		public MusicDTO updateDynamicByInstrument(String dynamic,String instrument) {
			MusicDTO musicdetailsDTO=null;
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					if(instrument==(dtos[index].getInstrument())){
						dtos[index].setDynamic(dynamic);
						musicdetailsDTO=dtos[index];
					}									
				}
			}
		return musicdetailsDTO;
			}
	 

		
		public MusicDTO getByName(String name){
			for (int index = 0; index < dtos.length; index++) {
				if(name==dtos[index].getSinger().getName()) {
					return dtos[index];
				}
				
			}
			return null;
		}
		
		public MusicDTO getBySalary(long salary){
			for (int index = 0; index < dtos.length; index++) {
				if(salary==dtos[index].getSalary()){
					return dtos[index];
				}
				
			}
			return null;
		}
		
		
		public MusicDTO deleteByInstrument(String instrument) {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				if(instrument.equals(dtos[index].getInstrument())) {
					dtos[index]=null;
				}
			
				}
			}
			return dtos[index];
		}
		
		public MusicDTO deletebyMusictype(String musictype) {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				if(musictype.equals(dtos[index].getMusictype())) {
					dtos[index]=null;
				}
			
				}
			}
			return dtos[index];
		}

	}


}
