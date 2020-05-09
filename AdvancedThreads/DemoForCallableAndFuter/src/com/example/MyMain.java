package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exeServ = Executors.newSingleThreadExecutor();
		
		System.out.println("Submitting the First Bank Service");
		Future<String[]> listOfService = exeServ.submit(new BankServices("Salary Account"));

		
		System.out.println("Submitting the Second Bank Service");
		listOfService = exeServ.submit(new BankServices("Current Account"));

		
		System.out.println("Submitting the Third Bank Service");
		listOfService = exeServ.submit(new BankServices("Salary Account"));

		String[] list = listOfService.get();
		
		System.out.println("List Of Servies which is added....");
		for(String nameOfService: list ){
			System.out.println(nameOfService);
		}
	
	}

}
