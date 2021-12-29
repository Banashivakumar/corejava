package com.xworkz.enums.operation;

import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.ContactDetailsDTO;
import com.xworkz.enums.dto.DonerDTO;
import com.xworkz.enums.dto.Gender;

public class Tester {
	
	public static void main(String[] args) {
		
			
			DonerDTO dto = new DonerDTO();
			dto.setName("Bana SY");
			dto.setAge((byte)23);
			dto.setWeight(60.5f);
			dto.setBloodgroup(BloodGroup.O_POSITIVE);
			dto.setGender(Gender.FEMALE);
			
			DonerDTO dto1 = new DonerDTO();
			dto1.setName("SPOO");
			dto1.setAge((byte)23);
			dto1.setWeight(45.5f);
			dto1.setBloodgroup(BloodGroup.A_POSITIVE);
			dto1.setGender(Gender.FEMALE);
			
			DonerDTO dto2 = new DonerDTO();
			dto2.setName("NITHYA");
			dto2.setAge((byte)24);
			dto2.setWeight(55.5f);
			dto2.setBloodgroup(BloodGroup.AB_POSITIVE);
			dto2.setGender(Gender.FEMALE);
			
			
			ContactDetailsDTO details = new ContactDetailsDTO();
			details.setPhonenumber(8431776263l);
			details.setMail("bana.xworkz@gmail.com");
			details.setAddress("tiptur");
			
			ContactDetailsDTO details1 = new ContactDetailsDTO();
			details1.setPhonenumber(8660203969l);
			details1.setMail("spoo.xworkz@gmail.com");
			details1.setAddress("banglore");
			
			ContactDetailsDTO details2 = new ContactDetailsDTO();
			details2.setPhonenumber(9900954350l);
			details2.setMail("nithya.xworkz@gmail.com");
			details2.setAddress("arsikere");
				
			dto.setDetails(details);
			dto1.setDetails(details1);
			dto2.setDetails(details2);
			
			DonarDAO operation = new DonarDAO();
			operation.save(dto);
			operation.save(dto1);
			operation.save(dto2);
			operation.printAll();
			System.out.println();
			System.out.println("get by bloodgroup");
			DonerDTO[] res=operation.getByBloodGroup(BloodGroup.A_POSITIVE);
			System.out.println(res.toString());
			System.out.println();
			System.out.println("get by gender");
			DonerDTO[] get = operation.getByGender(Gender.FEMALE);
			System.out.println(get.toString());
			System.out.println();
			System.out.println("updated contact number by name");
			DonerDTO update = operation.updateContactByName("SPOO",8660203969l);
			System.out.println(update.toString());
			System.out.println();
			operation.printAll();
			System.out.println();
				
				}
					
}	
		
		