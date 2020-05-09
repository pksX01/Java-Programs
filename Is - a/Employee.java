package com.info.isa;

public class Employee extends Person {
	String designation;
	
	public Employee(int no, String name, String designation) {
		super(no, name);
		System.out.println("Employee created");
		this.designation = designation;
	}
	
	public void print() {

		super.print();
		System.out.println("Desingation = "+designation);
	}

}
