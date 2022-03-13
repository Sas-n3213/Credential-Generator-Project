package com.credentials.main;
import java.util.Scanner;
import com.credentials.model.Employee;
import com.credentials.service.CredentialService;




public class Main {
	

	public static void main (String[]args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("first name::");
		String firstName = sc.next();
		System.out.print("last name::");
		String lastName = sc.next();
		
		Employee e1= new Employee(firstName,lastName);
		CredentialService cs = new CredentialService();
		
		
		System.out.print("Please enter the department from the following ");
		System.out.print("1.Technical\n2.Admin\n3.HumanResource\n4.Legal");
		
		int option = sc.nextInt();
		
		
		switch (option) {
		
		case 1: 
			
			cs.showCredentials(e1,"tech");
		    break;

		case 2: 
			
			cs.showCredentials(e1,"admin");
		    break;

		case 3: 
			
			cs.showCredentials(e1,"hr");
		    break;

		case 4: 
			
			cs.showCredentials(e1,"legal");
		    break;

		default: 
			System.out.print("Invalid Department! ");
		
		    break;
		
		}
		
		sc.close();
	
		
		
	

		
	}

}