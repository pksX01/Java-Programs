package com.example;

public class PrintMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(() ->  System.out.println("Hello World")).start();
	}
}