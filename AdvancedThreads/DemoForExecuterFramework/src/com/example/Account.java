package com.example;

public class Account {

	private int currentBalance;
	private int accountId;
	private static int idGenerator = 1;
	
	private synchronized static int generateAccountID(){
		return idGenerator++;
	}
	public static final Object lock = new Object();
	
	public int getCurrentBalance() {
		return currentBalance;
	}

	// opening the Account for user
	public void open(Account account){
		account.currentBalance = 500;
		account.accountId = generateAccountID();
	}
	
	public int getAccountId(){
		return accountId;
	}
	
	// checking the Current Balance
	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}

	//  Withdrawing the money
	public synchronized void withdraw(int amount) {
		if (this.currentBalance >= amount) {
			currentBalance = currentBalance - amount;

		} else {
			System.out.println("Withdrawal not possible");
		}

	}
	
	// Depositing the money
	public synchronized void deposite(int amount) {
		currentBalance = currentBalance + amount;
	}

}
