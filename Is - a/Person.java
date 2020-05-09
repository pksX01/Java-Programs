package com.info.isa;

public class Person {
	int no;
	String name;
	
	public Person(int no, String name) {
		System.out.println("Person is created");
		this.no = no;
		this.name = name;
	}

	
	public void print() {
		System.out.println("Number = "+no);
		System.out.println("Name = "+name);
	}
}	
