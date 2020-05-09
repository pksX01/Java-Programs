package com.example;

public class AccountService implements Runnable {
	
		private Account account;
		private int action;
		
		public AccountService(int action){
			this.action = action;
		}
				
		// with run we are performing the task for opening the Account
		public  void run(){
			if(action == 1){
				account = new Account();
				account.open(account);
				System.out.println("Account Created " + account.getAccountId());	
			}
		}
}
