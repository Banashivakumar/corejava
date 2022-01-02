package com.xworkz.gun;

import com.xworkz.gun.dao.Gunoperation;
import com.xworkz.gun.dto.Bulletdto;
import com.xworkz.gun.dto.Companydto;
import com.xworkz.gun.dto.Gundeatilsdto;
import com.xworkz.gun.dto.Types;

public class Tester {
	
public static void main(String[] args) {
		
		Gundeatilsdto dto = new Gundeatilsdto();
		dto.setBarrelMaterial("bronze");
		dto.setGunName("M416");
		dto.setPrice(45000);
		dto.setScope((byte)6);
		dto.setRange(588.65f);
		dto.setTypes(Types.ASSAULT_RIFELS);
		
		Gundeatilsdto dto1 = new Gundeatilsdto();
		dto1.setBarrelMaterial("gun metal");
		dto1.setGunName("AKM");
		dto1.setPrice(35000);
		dto1.setScope((byte)6);
		dto1.setRange(288.65f);
		dto1.setTypes(Types.ASSAULT_RIFELS);
		
		Gundeatilsdto dto2 = new Gundeatilsdto();
		dto2.setBarrelMaterial("bronze");
		dto2.setGunName("AK14");
		dto2.setPrice(85000);
		dto2.setScope((byte)8);
		dto2.setRange(888.65f);
		dto2.setTypes(Types.DMRS);
		
		Gundeatilsdto dto3 = new Gundeatilsdto();
		dto3.setBarrelMaterial("gunMetal");
		dto3.setGunName("AWM");
		dto3.setPrice(95000);
		dto3.setScope((byte)8);
		dto3.setRange(1000.65f);
		dto3.setTypes(Types.BOLTACTION_RIFELS);
		
		Bulletdto bullet = new Bulletdto();
		bullet.setComponent("nitrate_powder");
		bullet.setGrams(3.56f);
		bullet.setMm(5.56);
		
		Bulletdto bullet1 = new Bulletdto();
		bullet1.setComponent("nitrate_powder");
		bullet1.setGrams(2.56f);
		bullet1.setMm(3.56);
		
		Bulletdto bullet2 = new Bulletdto();
		bullet2.setComponent("nitrate_powder");
		bullet2.setGrams(5.56f);
		bullet2.setMm(7.56);
		
		Bulletdto bullet3 = new Bulletdto();
		bullet3.setComponent("phosporous nitrate");
		bullet3.setGrams(7.56f);
		bullet3.setMm(12.56);
		
		Companydto company = new Companydto();
		company.setFounder("richard");
		company.setName("gatling arms");
		company.setLocation("abudabi");
		company.setContact(8431776263l);
		
		Companydto company1 = new Companydto();
		company1.setFounder("hiram");
		company1.setName("maxim arms ");
		company1.setLocation("jammu");
		company1.setContact(9620671632l);
		
		Companydto company2 = new Companydto();
		company2.setFounder("gatling");
		company2.setName("union force");
		company2.setLocation("america");
		company2.setContact(8660203969l);
		
		Companydto company3 = new Companydto();
		company3.setFounder("samuel");
		company3.setName("colt force");
		company3.setLocation("china");
		company3.setContact(6754321899l);
		
		dto.setBullet(bullet);
		dto.setCompany(company);
		
		dto1.setBullet(bullet1);
		dto1.setCompany(company1);
		
		dto2.setBullet(bullet2);
		dto2.setCompany(company2);
		
		dto3.setBullet(bullet3);
		dto3.setCompany(company3);
		
		Gunoperation operations =new Gunoperation();
		operations.save(dto);
		operations.save(dto1);
		operations.save(dto2);
		operations.save(dto3);
		operations.printAll();
		System.out.println();
		System.out.println("get by types--");
		Gundeatilsdto[] res=operations.getAllByTypes(Types.ASSAULT_RIFELS);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
			
		}
		System.out.println();
		System.out.println("get by barrelmaterial--");
		Gundeatilsdto[] response=operations.getByBarrelmaterial("bronze");
		for (int h = 0; h < response.length; h++) {
			System.out.println(response[h]);
			
		}
		System.out.println();
		System.out.println("update component by name------");
		Gundeatilsdto upd =operations.updateComponentByGunName("phosporous nitrate", "AKM");
		System.out.println(upd.toString());
		System.out.println();
		System.out.println("update location by name-----");
		Gundeatilsdto upd1 =operations.updateLocationByGunName("AK14", "Abudabi");
		System.out.println(upd1.toString());
		System.out.println();
		System.out.println("get by scope---");
		Gundeatilsdto[] get1=operations.getAllByScope((byte)8);
		for (int k = 0; k < get1.length; k++) {
			System.out.println(get1[k]);
			
		}
		System.out.println();
		Gundeatilsdto del =operations.deleteByName("AKM");
		System.out.println(del);
		System.out.println();
		operations.printAll();
		
		
	}

}
