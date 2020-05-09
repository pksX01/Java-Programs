package com.info.poly;

public class PaymentDemo {
	public static void main(String[] args) {
		
		Process process = new Process();
		
		process.processPayment(new DebitCard());
		
	}
}
