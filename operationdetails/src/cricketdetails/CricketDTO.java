package cricketdetails;

public class CricketDTO {
	int jersynumber;
	String name;
	short numberofplayers;
	String teamname;
	
	
	public CricketDTO(int jersynumber,String name,short numberofplayers,String teamname) {
		this.jersynumber=jersynumber;
		this.name=name;
		this.numberofplayers=numberofplayers;
		this.teamname=teamname;
	}
	public String getAll()
	{
		return jersynumber+"\t"+name+"\t"+numberofplayers+"\t"+teamname;
		
	}

}
