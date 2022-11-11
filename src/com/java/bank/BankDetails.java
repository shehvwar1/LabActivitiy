package com.java.bank;

import java.util.Scanner;

public class BankDetails {

private Bank[] account;
private int entry;
//contructor
BankDetails()
{
	//trying input
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of accounts to be added");
	int n = sc.nextInt();
	account = new Bank[n];
	//setting no account 
	for(int i=0; i<n;i++)
	{
		account[i] = sc.nextInt();
	}*/
	//for fetching
	/*
	 * for(int i=0; i<n;i++){
	 * System.out.println(account[i]);
	 * }*/
	
	account = new Bank[10];
	//account = new Bank[];
}

	void checkBalance(Bank input)
	{
		if(entry < account.length)
		{
			account[entry] = input;
			entry++;
			if(input.getBalance() <9999)
			{
				System.out.println("Low account balance is " + input.getName() + ":" + input.getPanNo() + ": " + input.getBalance());
			}
		}
	}
public Bank[] getAccount() {
	return account;
}
public void setAccount(Bank[] account) {
	this.account = account;
}
public int getEntry() {
	return entry;
}
public void setEntry(int entry) {
	this.entry = entry;
}
}
