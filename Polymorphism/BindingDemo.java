/*package com.info.poly;

class A{
	void m1(){	// 1000
		System.out.println("A-m1");
	}
}

class B extends A{
	
	void m1() {	// 2000
		System.out.println("B-m1");
	}
}

public class BindingDemo {
	public static void main(String[] args) {
		A obj = new A();
		obj.m1();		// 1000	1000
		
		B obj2 = new B();
		obj2.m1();		// 2000	2000
		
		A obj3 = new B();
		obj3.m1(); 		// 1000	2000
		
	}
}
*/