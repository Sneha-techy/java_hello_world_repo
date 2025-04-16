package com.qspider.test;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) 
	{
		System.out.println("Enter a interger no:");
		Scanner sc= new Scanner(System.in);
		int  n =sc.nextInt();
		System.out.println(isBtoDNum(n));
		
	}

	private static String isBtoDNum(int n)
	{
		int decimal=0;
		int pow=1;
		while(n>0)
		{
        decimal=decimal+(n%10)*pow;
        pow=pow*2;
        n=n/10;
		}
        
	
return "Binary to Decimal  is "+decimal;
    
}

}
