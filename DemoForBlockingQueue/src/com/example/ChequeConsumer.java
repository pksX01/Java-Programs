package com.example;

import java.util.concurrent.BlockingQueue;

public class ChequeConsumer extends Thread {

	protected BlockingQueue<Cheque> queue = null;
	private Cheque cheque = null;

	public ChequeConsumer(BlockingQueue<Cheque> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				System.out.println("Consumer: Started Cheque Processing");
				cheque = queue.take();
				System.out.println("Cheque No " + cheque.getChequeNo());
				System.out.println("Cheque Amount " + cheque.getAmount());
				System.out.println("Cheque Date " + cheque.getChequeDate());
				System.out.println("Done Cheque Processing");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
