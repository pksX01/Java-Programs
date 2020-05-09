package com.info.poly;

class A{
	void m1(){	// 1000
		System.out.println("A-m1");
	}
	
	void m2() {	// 1500
		System.out.println("A-m2");
	}
}

class B extends A{
	void m1() {	// 2000
		System.out.println("B-m1");
	}
	
	void m3() {
		System.out.println("B-m3");
	}
}

public class PDemo2 {
	public static void main(String[] args) {
		A obj = new B();
		
		obj.m1();		// 1000		2000
		obj.m2(); 		// 1500 	1500
	//	obj.m3();
	}
}
