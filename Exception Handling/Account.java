package com.info.exception;

public class Account {
	int acno;
	String name;
	double balance;
	
	public Account(int acno, String name) {
		this.acno = acno;
		this.name = name;
		this.balance = 10000;
	}
	
	public void withdraw(double amount) throws ISFException {
		if(balance - amount < 6000) {
			ISFException isf = new ISFException();
			throw isf;
		}
		else {
			balance -= amount;
		}
	}
	
	public void printAccount() {
		System.out.println("Acno = "+acno);
		System.out.println("Name = "+name);
		System.out.println("Balance = "+balance);
	}
}
