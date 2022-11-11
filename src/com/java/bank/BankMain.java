package com.java.bank;

public class BankMain {

	public static void main(String[] args) {
		Bank b = new Bank();
		BankDetails bd = new BankDetails();
		b.setAccDetails();
		b.getAccDetails();
		bd.checkBalance(b);
		

	}

}
