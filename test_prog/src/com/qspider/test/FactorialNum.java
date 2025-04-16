package com.qspider.test;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) 
	{
		System.out.println("Enter a interger no:");
		Scanner sc= new Scanner(System.in);
		int  n =sc.nextInt();
		System.out.println(isFactNum(n));
		
	}

	private static String isFactNum(int n)
	{
         int fact=1;
		for(int i=n;i>=1;i--) 
		{
         fact=fact*i;
		}
return "Factor of Num is "+fact;
    
}
}