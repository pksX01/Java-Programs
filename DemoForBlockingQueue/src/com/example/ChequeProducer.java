package com.example;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class ChequeProducer extends Thread {

	BlockingQueue<Cheque> queue = null;
	Cheque cheque = null;

	public ChequeProducer(BlockingQueue<Cheque> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			Scanner input = new Scanner(System.in);
			while (true) {
				
				cheque = new Cheque();
				System.out.println("Producer: Enter the Details of Cheque");
				System.out.println("Enter the cheque Id");
				cheque.setChequeNo(Integer.parseInt(input.nextLine()));
				System.out.println("Enter the cheque Amount");
				cheque.setAmount(Integer.parseInt(input.nextLine()));
				System.out.println("Enter the cheque Date");
				cheque.setChequeDate(input.nextLine());

				System.out.println("Submitting the Cheque");
				queue.put(cheque);

				Thread.sleep(1000);
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
