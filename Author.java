package com.orchard;
import java.util.*;
public class Author {
	String name, author;
	int year;
	double cost;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title of the book : ");
		name = sc.nextLine();
		System.out.print("Enter author : ");
		author = sc.nextLine();
		System.out.print("Enter publish year : ");
		year = sc.nextInt();
		System.out.print("Enter price :" );
		cost = sc.nextDouble();
	}
	void calculate() 
	{
		double Discount = cost*(13.5 / 100);
		double Cost_After = cost - Discount;
		System.out.println("Discount : " + Discount);
		System.out.println("Cost after discount : " + Cost_After);
	}
	void display() 
	{
		System.out.println("Book Title : " + name);
		System.out.println("Author Name : " + author);
		System.out.println("Publication year : " + year);
		System.out.println("Price : " + cost);
	}
	public static void main(String args[]) 
	{
		Author b = new Author();
		b.input();
		b.display();
		b.calculate();

	}
}
