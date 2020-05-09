package com.info.threads;
  
class CustomThread implements Runnable{
	EvenOdd evenOdd;
	public CustomThread() {
		evenOdd = new EvenOdd();
	}
	
	public void run() {		
		evenOdd.even();
		evenOdd.odd();
	}
}

class EvenOdd{
	
	synchronized void even() {
		String name = Thread.currentThread().getName();

		for (int index = 0; index <= 100; index++) {
			if(index % 2 == 0) {
				System.out.print(index+"-"+name+"\t");
			}
		}	
		System.out.println();
	}
	
	synchronized void odd() {
		String name = Thread.currentThread().getName();

		for (int index = 0; index <= 100; index++) {
			if(index % 2 != 0) {
				System.out.print(index+"-"+name+"\t");
			}
		}	
		System.out.println();
	}
	
}

public class SynchronizationDemo {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("Main is called = "+name);
		
		CustomThread customThread = new CustomThread();
		Thread t1 = new Thread(customThread, "t1");
		Thread t2 = new Thread(customThread, "t2");
		Thread t3 = new Thread(customThread, "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}