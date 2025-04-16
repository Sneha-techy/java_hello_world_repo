package com.qspider.test;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) 
	{
		System.out.println("Enter a interger no:");
		Scanner sc= new Scanner(System.in);
		int  n =sc.nextInt();
		System.out.println( isProduct(n));
	}

	private static String isProduct(int n)
	{
		
         int pal =1;
		while(n>0)
		{
          int rem=n%10;
          pal=pal*rem;
          n/=10;
		}
		return "Product of Num is "+pal;
	}
}
