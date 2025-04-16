package com.qspider.test;

import java.util.Scanner;

public class ArmStrongNum {
	public static void main(String[] args) {
		System.out.println("Enter a interger no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isArmStongNum(n));
	}

	private static String isArmStongNum(int n) {
		int temp = n;
		int count = 0;
		int sum = 0;
		while (n > 0) {

			count++;
			n = n / 10;
		}

		n = temp;

		while (n > 0) {
			int pow = 1;
			int rem = n % 10;
			for (int i = 1; i <= count; i++) {
				pow = pow * rem;
			}
			n = n / 10;

			sum = sum + pow;
		}

		if (sum == temp)
			return "Given num is a ArmStrong no";
		else
			return "Given num is Not AS no";
	}
}
