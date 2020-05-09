package com.info.iface;

interface Payment {
	void payBill();		// public abstact void payBill();
}

class CreditCard implements Payment{
	public void payBill() {
		System.out.println("CreditCard: Paybill");
	}
}

class DebitCard implements Payment{
	public void payBill() {
		System.out.println("DebitCard: Paybill");
	}
}

class Paytm implements Payment{
	public void payBill() {
		System.out.println("Paytm: Paybill");
	}
}

class Cash implements Payment{
	public void payBill() {
		System.out.println("Cash: Paybill");
	}
}
