package com.java.books;

import java.util.Scanner;

public class Book {
	//Instance/Class Variables
	private String bookName;
	private int yearOfPublication;
	private int price;
	private Author aur;//Ref of author class
	//default constructor
	public Book()
	{
		super();
	}
	//Parameterizes constructor
	
	/*public Book(String bookName, int yearOfPublication, int price, Author aur )
	{
		this.bookName = bookName;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
		this.aur = aur;
	}*/
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the book name");
		bookName = sc.next();
		System.out.println("Provide the Year Of Publication");
		yearOfPublication = sc.nextInt();
		System.out.println("Provide the book price");
		price = sc.nextInt();
		/*System.out.println("Provide the Author Name");
		aur = sc.next();*/
	}
	//Getting details
		void getDetails()
		{
			System.out.println("Book Name is " + this.bookName);
			System.out.println("year od publication is" + this.yearOfPublication);
			System.out.println("Price is" + this.price);
			//System.out.println("Author is " + this.aur);
		}
	/*getters and setters start*/
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getAur() {
		return aur;
	}
	public void setAur(Author aur) {
		this.aur = aur;
	}

}
