package com.qspider.test;

import java.util.Scanner;

public class PalindroneNum {
	public static void main(String[] args) {
		System.out.println("Enter a interger no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPalNum(n));
	}

	private static String isPalNum(int n) {
		int temp = n;
		int pal = 0;
		while (n > 0) {
			int rem = n % 10;
			pal = pal * 10 + rem;
			n /= 10;
		}
		if (pal == temp)
			return "Given num is a Palindrome no";
		else
			return "Given num is Not Palindrome  no";
	}
}
