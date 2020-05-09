package com.info.exception;

import java.util.Scanner;

public class ISFDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much you want to withdraw?");
		double amount = scanner.nextDouble();
		
		Account account = new Account(10001, "Vilok");
		
		try {
			account.withdraw(amount);
			account.printAccount();
		}
		catch (ISFException is) {
			System.out.println(is.getCustomMessage());
		}
		
		scanner.close();
	}
}
