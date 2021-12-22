package com.xworkz.radio.dto;

public class MusicDTO {
	
	private String instrument;
	private String musictype;
	private String dynamic;
	private SingerDTO singer;
	
	public void setInstrument(String instrument) {
		this.instrument=instrument;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setMusictype(String musictype) {
		this.musictype=musictype;
	}
	public String getMusictype() {
		return musictype;
	}
	public void setDynamic(String dynamic) {
		this.dynamic=dynamic;
	}
	public String getDynamic() {
		return dynamic;
	}
	public void setSinger(SingerDTO singer) {
		this.singer=singer;
	}
	public SingerDTO getSinger() {
		return singer;
	}
	public String getAll() {
		return instrument +"\t" +musictype +"\t" + dynamic+"\t"+ singer+"\t"+singer.getAll();
}


}
