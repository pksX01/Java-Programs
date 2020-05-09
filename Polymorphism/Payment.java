package com.info.poly;

public class Payment {
	void payBill() {
	}
}

class CreditCard extends Payment{
	void payBill() {
		System.out.println("CreditCard: Paybill");
	}
}

class DebitCard extends Payment{
	void payBill() {
		System.out.println("DebitCard: Paybill");
	}
}

class Paytm extends Payment{
	void payBill() {
		System.out.println("Paytm: Paybill");
	}
}

class Cash extends Payment{
	void payBill() {
		System.out.println("Cash: Paybill");
	}
}
