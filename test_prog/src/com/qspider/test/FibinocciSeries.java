package com.qspider.test;

import java.util.Scanner;

public class FibinocciSeries {
	public static void main(String[] args) 
	{
		System.out.println("Enter a interger no:");
		Scanner sc= new Scanner(System.in);
		int  n =sc.nextInt();
		isFibNum(n);
	}

	private static void isFibNum(int n)
	{
         int a =0,b=1,c=0;
		for(int i=1;i<=n;i++) 
		{
         System.out.println(a);
         c=a+b;
         a=b;
         b=c;
		}

    }
}