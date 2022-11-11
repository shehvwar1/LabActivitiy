package com.java.books;

public class BookDetails {
	static void dispalyDetails(Book b, Author a) {
		System.out.println("Nmae of the book is" + b.getBookName());
		System.out.println("Year of Book publication is " +b.getYearOfPublication());
		System.out.println("Price of the book is " + b.getPrice());
		//System.out.println("Author of Book is" + b.getAur());
	}
	
	public static void main(String[] args) {
		//Creating book object and fetching author values
		
		Book b1 = new Book();
		Author a = new Author();
		b1.setDetails();
		a.setAuthorDetails();
		System.out.println("The Book Details and author details are as follows");
		b1.getDetails();	
		a.getDetails();
		dispalyDetails(b1, a);
		//dispalyDetails(a);
	}

}

