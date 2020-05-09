package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParticipantNameList {

	public static void main(String[] args) {
		// List which can hold the integers
				ArrayList<String> namesList = new ArrayList<String>();
				
				// Adding Data to list
				namesList.add("Jane");
				namesList.add("Joe");
				namesList.add("Dane");
				namesList.add("Alley");
				namesList.add("Ama");
				namesList.add("Bob");
				
				// Display the Name starting with letter 'j'
				List<String> newNameList = namesList.stream()
													.filter(name -> name.startsWith("J"))
													.collect(Collectors.toList());
				System.out.println("Names Starting with 'J'");
				newNameList.forEach(System.out::println);
				
				
				// Display the Name where length of the name is Grater then 3
				List<String> filtered = namesList.stream()
												 .filter(x -> x.length() > 3)
												 .collect(Collectors.toList());
				System.out.println("Names length grater then 3");
				filtered.forEach(System.out::println);

	}

}