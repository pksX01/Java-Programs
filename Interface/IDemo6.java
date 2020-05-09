package com.info.iface;

interface I1{
	
	void m1();
	
	default void m2() {
		System.out.println("Default method is called");
	}
	
	static void m3() {
		System.out.println("Static method is called");
	}
}

class A implements I1{
	
	public void m1() {
		System.out.println("M1 is called");
	}
}

public class IDemo6 {
	public static void main(String[] args) {
		
		I1 obj = new A();
		obj.m1();
		obj.m2();
		I1.m3();
		
	}
}
