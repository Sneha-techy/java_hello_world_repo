package test.pattern.num;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
	int	n=sc.nextInt();
	
	System.out.println(isPrimeNum(n));
}

	private static String isPrimeNum(int n) {
		int count=0;
	
			for(int i=2;i<=n/2;i++) {
			if(n%i==0)
		count++;
			}
			if(count==0)
				return "The Given number is Prime number";
			else
		        return "The given number is not a prime number";
	}
}