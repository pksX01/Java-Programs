package com.example;

import java.util.concurrent.CountDownLatch;

public class QPPublisher extends Thread {
	
	private CountDownLatch countDownLatch;
	private String name;
	
	public QPPublisher(CountDownLatch countDownLatch, String name) {
		this.setName(name);
		this.countDownLatch = countDownLatch;
	}
	
	public void run(){
		System.out.println("Starting to Publish QP");
		long counter = countDownLatch.getCount();
		int count=1;
		
		while (counter>0) {
			System.out.println("Qp Publisher has published the question: "+count);
			count++;
			
			try {
				Thread.sleep(3000);
				countDownLatch.countDown(); // reduce the counter after 1 second
				counter = countDownLatch.getCount(); // updating the counter to make the loop run
				if(counter == 0){
					System.out.println("Please Login and Start");
				}
			} 
			catch (InterruptedException e) {
				System.out.println("Failed to Publish Question....");
				System.out.println(e.getMessage());
			}	
		}
		
	}
	
	public void startQPPublishing(){
		this.start();
	}

}
