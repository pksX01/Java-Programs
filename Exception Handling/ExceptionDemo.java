package com.info.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	static int x, y, quotient, sum, product;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter any two values");
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			sum = x + y;
			System.out.println("\nSum = "+sum);
		
			quotient = x / y;
			System.out.println("\nQuotient = "+quotient);
		}
		catch (ArithmeticException e) {
			System.out.println("Second number should not be zero");
		}
		catch (InputMismatchException im) {
			System.out.println("Input must be numbers");
		}
		
		product = x * y;
		System.out.println("\nProduct = "+product);
		
		scanner.close();
	}
}
