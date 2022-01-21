package com.xworkz.jewellery.dto;

import com.xworkz.jewellery.dao.JewelleryOperation;

public class Tester {
	
	public static void main(String[] args) {
		
		JewelleryDTO jewellery = new JewelleryDTO();
		JewelleryDTO jewellery1 = new JewelleryDTO();
		
		jewellery.setMetaltype("gold");
		jewellery.setJeweltype("earrings");
		jewellery.setPrice(765400);
		jewellery.setDesign("temple design");
		jewellery.setCarats(9.55f);
		jewellery.setWeight(18.55f);
		jewellery.setMaterials("shells");
		jewellery.setColor("goldenyellow");
		
		jewellery1.setMetaltype("daimond");
		jewellery1.setJeweltype("neck chain");
		jewellery1.setPrice(700000);
		jewellery1.setDesign("mango design");
		jewellery1.setCarats(5.98f);
		jewellery1.setWeight(53.55f);
		jewellery1.setMaterials("corals");
		jewellery1.setColor("stonewhite");
		
		
		JewelleryOperation operation = new JewelleryOperation();
		operation.add(jewellery);
		operation.add(jewellery1);
		operation.printAll();
		System.out.println();
		try {
			JewelleryDTO update=operation.updatepriceByJeweltype("earrings", 765400);
			System.out.println(update.toString());
		}catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
		operation.printAll();
		System.out.println();
		
		
		try {
			JewelleryDTO get=operation.getByMetaltype("daimond");
			System.out.println(get.toString());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println();
		try {
			JewelleryDTO update1=operation.updateMetaltypeBymaterials("daimond", "coral");
			System.out.println(update1.toString());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		operation.printAll();
		System.out.println();
	
		try {
			String delete = operation.deleteByJeweltype("neckchain");
		System.out.println(delete);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		operation.printAll();
		
		
		}	
	}
