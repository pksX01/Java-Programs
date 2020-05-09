package com.info.isa;

class A{
	A(){
		System.out.println("A ZC is called");
	}
	A(int x){
		this();
		System.out.println("A PC is called");
	}
}

class B extends A{
	B(){
		super(234);
		System.out.println("B ZC is called");
	}
	B(int x){
		this();
		System.out.println("B PC is called");
	}	
}

public class IDemo5 {
	public static void main(String[] args) {	
		B obj = new B(123);
	}
}
