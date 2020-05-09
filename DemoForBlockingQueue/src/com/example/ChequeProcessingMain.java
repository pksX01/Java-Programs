package com.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ChequeProcessingMain {

	public static void main(String[] args) {
		    BlockingQueue<Cheque> queue = new ArrayBlockingQueue<Cheque>(10);

	        ChequeProducer producer = new ChequeProducer(queue);
	        ChequeConsumer consumer = new ChequeConsumer(queue);

	       
	        try {
	        	 new Thread(producer).start();
	 	         new Thread(consumer).start();
 				 Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
