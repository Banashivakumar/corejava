package com.xworkz.bank;
import com.xworkz.bank.employee.Employee;
 class Testemployee {
	

		public static void main(String[] args) {
			
			Employee employee= new Employee();
	      
	Employee employee1 = new Employee("nithin",98567,"tiptur",4.5f,"assistant","nit@gmail.com","e11");
	String result = employee1.printAll();
	System.out.println(result);


		}

	}
