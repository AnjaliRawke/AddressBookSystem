package com.bridgelabz;

import java.util.Scanner;

public class Contact {
	String FirstName;
    String LastName;
    String address;
    String city;
    String State;
    int zip;
    int phoneNumber;
    String email;
   
    
    
    public Contact(String firstName, String lastName, String address, String city, String state, int zip,
			int phoneNumber, String email) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.address = address;
		this.city = city;
		this.State = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
  

	public void Display() {
   	 System.out.println("FirstName: "+FirstName+" "+"LastName: "+LastName+" "+"Address: "+address+" "+"City: "+city+" "+"State: "+State+" "+"Zip: "+zip+" "+"PhoneNumber: "+phoneNumber+" "+"Email: "+email);
    }
	 public void addContact() {
 			
	 		Scanner myObj = new Scanner(System.in);  
	 		System.out.print("Enter first and last name: ");
	 	    String Name = myObj.nextLine();
	 	   
	 		
	 		System.out.print("Enter complete address: ");
	 		Scanner myObj1 = new Scanner(System.in);
	 		String address = myObj1.nextLine();
	 		
	 		System.out.print("Enter city, state and zip: ");
	 		Scanner myObj2 = new Scanner(System.in);
	 		String city = myObj2.next();
	 		String state = myObj2.next();
	 		String zip = myObj2.next();
	 		
	 		Scanner myObj3 = new Scanner(System.in);
	 		System.out.println("Enter phone number: ");
	 		String phoneNumber = myObj3.next();
	 		
	 		Scanner myObj4 = new Scanner(System.in);
	 		System.out.println("Enter email: ");
	 		String email = myObj4.next();
	 		
	 		System.out.println("Contact Added");
	 		System.out.println("-------------------------------------");
	 		System.out.println("FullName: "+Name);
	 		System.out.println("Address: "+address);
	 		System.out.println("City: "+city);
	 		System.out.println("State: "+state);
	 		System.out.println("ZipCode: "+zip);
	 		System.out.println("Phone Number: "+phoneNumber);
	 		System.out.println("Email: "+email);
	     
	     }
	
}

