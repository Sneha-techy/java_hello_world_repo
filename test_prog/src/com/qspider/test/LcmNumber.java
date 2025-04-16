package com.qspider.test;

import java.util.Scanner;

public class LcmNumber {
	public static void main(String[] args) {
		System.out.println("Enter a interger no a:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter a interger no b:");
		int b = sc.nextInt();
		isLcmNum(a, b);
	}

	private static void isLcmNum(int a, int b) {
		int lcm;
		lcm = (a >= b) ? a : b;
	while(true) 
	{
		
			if (lcm % a == 0 && lcm% b == 0)
			{
				System.out.println("lcm is " + lcm);
			break;
			}
			else
		lcm++;
	}
}
}