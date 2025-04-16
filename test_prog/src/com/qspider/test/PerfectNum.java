package com.qspider.test;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		System.out.println("Enter a interger no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPerfectNum(n));
	}

	private static String isPerfectNum(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (sum == n)
			return "Given num is a Perfect no";
		else
			return "Given num is Not Perfect  no";
	}
}
