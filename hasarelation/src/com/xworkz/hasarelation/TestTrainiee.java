package com.xworkz.hasarelation;

import com.xworkz.hasarelation.dao.TrainieeOperation;
import com.xworkz.hasarelation.dto.AdressDTO;
import com.xworkz.hasarelation.dto.AreaDTO;
import com.xworkz.hasarelation.dto.DistrictDTO;
import com.xworkz.hasarelation.dto.StateDTO;
import com.xworkz.hasarelation.dto.TalukDTO;
import com.xworkz.hasarelation.dto.TrainieeDetails;

public class TestTrainiee {
	
public static void main(String[] args) {
		
		TrainieeDetails trainieedetail = new TrainieeDetails();
		TrainieeDetails trainieedetail1 = new TrainieeDetails();
		TrainieeDetails trainieedetail2 = new TrainieeDetails();
		trainieedetail.setName("Bana");
		trainieedetail.setContactno(843177626);
		trainieedetail.setEmail("banaxworkz@gmail.com");
		
		trainieedetail1.setName("srushti");
		trainieedetail1.setContactno(962067263);
		trainieedetail1.setEmail("surushtixworkz@gmail.com");
		
		trainieedetail2.setName("Neelu");
		trainieedetail2.setContactno(88667755l);
		trainieedetail2.setEmail("neeluxworkz@gmail.com");
		
		AdressDTO adress = new AdressDTO();
		AdressDTO adress1 = new AdressDTO();
		AdressDTO adress2 = new AdressDTO();
		adress.setBuildingName("Tiptur");
		adress1.setBuildingName("Bagalkot");
		adress2.setBuildingName("Thalikot");
		
		trainieedetail.setAdress(adress);
		trainieedetail1.setAdress(adress1);
		trainieedetail2.setAdress(adress2);
		
		AreaDTO area = new AreaDTO();
		AreaDTO area1 = new AreaDTO();
		AreaDTO area2 = new AreaDTO();
		area.setAreaName("KRExtension");
		area1.setAreaName("shardhanagar");
		area2.setAreaName("jpnagar");
		
		adress.setArea(area);
		adress1.setArea(area1);
		adress2.setArea(area2);
		
		DistrictDTO district = new DistrictDTO();
		DistrictDTO district1 = new DistrictDTO();
		DistrictDTO district2 = new DistrictDTO();
		district.setName("Tumkur");
		district1.setName("Hubballi");
		district2.setName("Gulbaraga");
		
		area.setDistrict(district);
		area1.setDistrict(district1);
		area2.setDistrict(district2);

		
		TalukDTO taluk =new TalukDTO();
		TalukDTO taluk1 =new TalukDTO();
		TalukDTO taluk2 =new TalukDTO();
		taluk.setName("Tiptur");
		taluk1.setName("thurvekere");
		taluk2.setName("nittur");

		
		district.setTaluk(taluk);
		district1.setTaluk(taluk1);
		district2.setTaluk(taluk2);

		
		StateDTO state =new StateDTO();
		StateDTO state1 =new StateDTO();
		StateDTO state2 =new StateDTO();
		state.setName("Karnataka");
		state.setCountry("INDIA");
		
		state1.setName("Karnataka");
		state1.setCountry("INDIA");
		
		state2.setName("Karnataka");
		state2.setCountry("Maharashtra");
		
		taluk.setState(state);
		taluk1.setState(state1);
		taluk2.setState(state2);


		TrainieeOperation operation = new TrainieeOperation();
		operation.save(trainieedetail);
		operation.save(trainieedetail1);
		operation.save(trainieedetail2);
		operation.printAll();
		System.out.println();
		TrainieeDetails res=operation.updateCountryByName("srushti","hema");
		System.out.println(res.toString());
		System.out.println();
		operation.printAll();
	   System.out.println();
	   TrainieeDetails response =operation.getByCountry("kerala");
	   System.out.println(res.toString());
	   System.out.println();
	   TrainieeDetails response1 =operation.getByDistrict("Huballi");
	   System.out.println(response1.toString());
	   System.out.println();
	  
	}

}
