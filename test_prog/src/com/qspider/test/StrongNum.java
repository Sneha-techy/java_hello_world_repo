package com.qspider.test;

import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		System.out.println("Enter a interger no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isStongNum(n));
	}

	private static String isStongNum(int n) {
		int temp = n;
		int sum = 0;
		while (n > 0) {

			int rem = n % 10;

			int fact = 1;
			for (int i = rem; i >= 1; i--) {
				fact = fact * i;
			}
			n = n / 10;
			sum = sum + fact;
		}

		if (sum == temp)
			return "Given num is a Strong no";
		else
			return "Given num is Not Strong no";
	}
}
