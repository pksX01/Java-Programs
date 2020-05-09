package com.example;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTester2 {
	
	public static void main(String[] args) {
		
		CountDownLatch latch  = new CountDownLatch(5);
		
		QPPublisher publisher = new QPPublisher(latch,"MSD Qp Publisher");
		
		Trainee trainee1 = new Trainee(latch, "Vilok");
		Trainee trainee2 = new Trainee(latch, "Shraman");
		Trainee trainee3 = new Trainee(latch, "Nandan");
		Trainee trainee4 = new Trainee(latch, "Anshul");
		
		trainee1.takeExam();
		trainee2.takeExam();
		trainee3.takeExam();
		trainee4.takeExam();
		
		publisher.startQPPublishing();
		
	}
	
}








//https://howtodoinjava.com/core-java/multi-threading/when-to-use-countdownlatch-java-concurrency-example-tutorial/
// it says that all the thread will wait for a thread to complete its job and then will start the execution