package com.java.bank;

import java.util.Scanner;

public class Bank {
	private String name;
	private int panNo;
	private double balance;
	//Constructor
	Bank()
	{
		this.name = name;
		this.panNo = panNo;
		this.balance = balance;
		
	}
	//setting account holder details
	void setAccDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account holder Name");
		name = sc.next();
		System.out.println("Enter the Pan Number");
		panNo = sc.nextInt();
		System.out.println("Enter the Balance");
		balance = sc.nextDouble();
	}
	//fetching info
	void getAccDetails()
	{
		System.out.println("Name of holder is " + this.name);
		System.out.println("Pan No of holder is " + this.panNo );
		System.out.println("Balance in account is " + this.balance );
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPanNo() {
		return panNo;
	}
	public void setPanNo(int panNo) {
		this.panNo = panNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
