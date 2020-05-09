package com.example;

import java.util.ArrayList;

public class FunWithInternalIterator {

	public static void main(String[] args) {
		// List which can hold the integers
				ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
				
				// Adding Data to list
				listOfNumbers.add(10);
				listOfNumbers.add(20);
				listOfNumbers.add(30);
				listOfNumbers.add(40);
				listOfNumbers.add(50);
				listOfNumbers.add(60);
				
				// Display the Data using Internal Iterator
				listOfNumbers.forEach((Integer x) -> System.out.println(x));
				
				// Display the Data using Type Inference 
				listOfNumbers.forEach((x) -> System.out.println(x));
				
				// Display the Data using 
				listOfNumbers.forEach(System.out :: println);
				
			
				
				

	}

}
