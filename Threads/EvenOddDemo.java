/*package com.info.threads;

class CustomThread implements Runnable{
	EvenOdd evenOdd;
	public CustomThread() {
		evenOdd = new EvenOdd();
	}
	public void run() {		
		String name = Thread.currentThread().getName();
		
		if(name.equals("even"))
			evenOdd.even();
		else
			evenOdd.odd();
	}
}

class EvenOdd{
	
	void even() {
		String name = Thread.currentThread().getName();
		System.out.println("Even is called = "+name);
	}
	
	void odd() {
		String name = Thread.currentThread().getName();
		System.out.println("Odd is called = "+name);
	}
	
}

public class EvenOddDemo {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("Main is called = "+name);
		
		CustomThread customThread = new CustomThread();
		Thread t1 = new Thread(customThread, "even");
		Thread t2 = new Thread(customThread, "odd");
		
		t1.start();
		t2.start();
	}

}
*/