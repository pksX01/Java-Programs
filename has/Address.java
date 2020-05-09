package com.info.has;

public class Address {
	String street;
	String city;

	public Address(String street, String city) {
		System.out.println("Address created");
		this.street = street;
		this.city = city;
	}
	
	public void printAddress() {
		System.out.println("Street = "+street);
		System.out.println("City = "+city);
		System.out.println("***************************");
	}
	
}
