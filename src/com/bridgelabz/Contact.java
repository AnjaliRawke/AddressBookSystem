package com.bridgelabz;

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
    
	
}


