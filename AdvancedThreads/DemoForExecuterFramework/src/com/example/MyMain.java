package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyMain{
	private static final int NUMBER_OF_THREADS = 20;

	public static void main(String args[]){
		
		//Defining the Thread Pool with size 20
		ExecutorService executorService= Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        
        //Submit Tasks using Executor Services
		// Here we are directly submitting the task 
		// we have not created any Thread
        for(int i=1; i<=100; i++){
            executorService.submit(new AccountService(1));
        }
        System.out.println("Submitted All Tasks... ");
        
        //Calling this method will ensure that no more tasks are submitted now
        executorService.shutdown();
        
        //Calling this method will ensure that we wait until all tasks are completed
        while(!executorService.isTerminated()){
            
        }
    }
    
    
	

}