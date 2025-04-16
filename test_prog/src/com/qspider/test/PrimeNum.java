package com.qspider.test;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		System.out.println("Enter a interger no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrimeNum(n));
	}

	private static String isPrimeNum(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 0)
			return "Given num is a Prime no";
		else
			return "Given num is Not Prime no";
	}
}
