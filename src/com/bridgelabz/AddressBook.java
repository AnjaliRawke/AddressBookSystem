package com.bridgelabz;

public class AddressBook {
	public void createContact() {

		ContactPerson person = new ContactPerson("Anjali", "Rawke", "Bhagwant nagar", "Nanded", "Maharashtra",
				"anjalirawke21@gmail.com", 431605, "7058162286");
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
		System.out.println("Address: " + person.getAddress());
		System.out.println("City: " + person.getCity());
		System.out.println("State: " + person.getState());
		System.out.println("Email: " + person.getEmail());
		System.out.println("Zip Code: " + person.getZipCode());
		System.out.println("Phone Number: " + person.getPhoneNumber());
		System.out.println("Contact created successfully.....");
	}
}
