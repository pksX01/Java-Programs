package com.example;

import java.util.concurrent.Callable;

public class BankServices implements Callable<String[]> {

	private static String[] listOfService = new String[0];
	private String nameOfService;
	
	public BankServices(String nameOfService){ 
		this.nameOfService = nameOfService;
	}
	
	@Override
	public String[] call() throws Exception {
		updateList(nameOfService);
		System.out.println("Added Bank Service in the list......");
		return listOfService;
	}

	public void updateList(String nameOfService){
		String[] oldServiceList = listOfService;
		listOfService = new String[listOfService.length + 1];
			for(int i = 0; i < oldServiceList.length; i++){
				listOfService[i] = oldServiceList[i];
			}
		listOfService[oldServiceList.length] = nameOfService;
	}
}


	
	

