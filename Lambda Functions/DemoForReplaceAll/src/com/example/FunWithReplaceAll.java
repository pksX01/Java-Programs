package com.example;

import java.util.ArrayList;


public class FunWithReplaceAll {

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
				
			
				// Replacing the list by Adding 1 to all element
				for(int i = 0 ; i < listOfNumbers.size() ; i++){
					listOfNumbers.set(i , listOfNumbers.get(i) + 1);
				}
				System.out.println("updating 1 to the list with for loop");
				listOfNumbers.forEach(System.out::println);
				
				// Using replace all method
				listOfNumbers.replaceAll(x -> x + 1);
				System.out.println("updating 1 to the list with replaceAll");
				listOfNumbers.forEach(System.out::println);
				
				// Using replace all method by adding 1 if the number is even
				listOfNumbers.replaceAll(x -> x %2==0 ? x + 1: x);
				System.out.println("updating 1 to the list with replaceAll if the list element is even");
				listOfNumbers.forEach(System.out::println);
				
		
				
				

	}

}



