package com.info.threads;

class MyRunnable implements Runnable {

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("I am Running = "+name);
	}
	
}

public class MyRunnableDemo{
	public static void main(String[] args) {
	
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "first");
		Thread t2 = new Thread(mr, "second");
		Thread t3 = new Thread(mr);
		t3.setName("Third");
		
		t1.start();
		t2.start();
		t3.start();
			
	}
}



