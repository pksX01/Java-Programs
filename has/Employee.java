package com.info.has;

public class Employee {
	int eno;
	String name;
	String designation;
	Address address;

	public Employee(int eno, String name, String designation, String street, String city) {
		System.out.println("Employee created");
		this.eno = eno;
		this.name = name;
		this.designation = designation;
		
		address = new Address(street, city);	// composition
	}
	
	
	public void printEmployee() {
		System.out.println("Number = "+eno);
		System.out.println("Name = "+name);
		System.out.println("Desingation = "+designation);
		
		address.printAddress();
	}
	
	
}
