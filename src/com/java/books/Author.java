package com.java.books;

import java.util.Scanner;

public class Author {
	private String authorName;
	private int age;
	//Default constructor
	public Author()
	{
		super();
	}
	//parameterized constructor
	public Author(String authorName, int age) {
		this.authorName = authorName;
		this.age = age;
	}
	/*Getters setters start*/
	void setAuthorDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Author  Name");
		authorName = sc.next();
		System.out.println("Enter the author age");
		age = sc.nextInt();
	}
	void getDetails()
	{
		System.out.println("Author Name is " + this.authorName);
		System.out.println("Author age is " + this.age );
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
