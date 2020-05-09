package com.info.threads;

class MyThread extends Thread{

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("I am running = "+name);
	}
}

public class MyThreadDemo {
	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();

		mt1.setName("First");
		mt2.setName("Second");
		mt3.setName("Third");
		
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
