package com.example;

import java.util.concurrent.CountDownLatch;
//this Trainee class simulates a trainee. The Trainee waits until the Qp is Published
//or count down timer gets to zero and then starts Exam

public class Trainee extends Thread {
	private CountDownLatch timer;

	public Trainee(CountDownLatch cdl, String name) {
		timer = cdl;
		this.setName(name);
	}

	public void run() {
		try {
			// wait for the timer count down to reach 0
			timer.await();
		} catch (InterruptedException ie) {
			System.err.println("interrupted -- can't start exam the race");
		}
		System.out.println(this.getName() + " started Exam");
	}
	
	public void takeExam(){
		System.out.println(this.getName() + " has logged in and Waiting for Exam to be Published...");
		this.start();
	}
	
	
}
