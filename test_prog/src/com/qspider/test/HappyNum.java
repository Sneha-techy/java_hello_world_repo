package com.qspider.test;

import java.util.Scanner;

public class HappyNum {
	public static void main(String[] args) {
		System.out.println("Enter a interger no:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isHappyNum(num));
	}

	private static String isHappyNum(int num) {
		while(true)
		{

				int sum=0;
				while(num>0) {
					int rem=num%10;
					int sq=rem*rem;
					sum+=sq;
					num/=10;
				}
				num=sum;
				if(sum==1)
					return "Given no is a Happy Number";
						else if (sum==4)
				    return "Given no is a NOT Happy Number";	
				}
		}
}
