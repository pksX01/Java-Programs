package com.info.overriding;

class A{
	
	public void print(int x) {				//overriden
		System.out.println("A-print");
	}
}

class B extends A{
	
	public void print(int x) {					// overriding
		super.print(678);
		System.out.println("B-print");
	}
}

public class ODemo1 {
	public static void main(String[] args) {
		B obj = new B();
		
		obj.print(123);
		
	}
}
