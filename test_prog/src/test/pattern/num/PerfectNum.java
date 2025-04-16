package test.pattern.num;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
	int	n=sc.nextInt();
	
	System.out.println(isPerfectNum(n));
}

	private static String isPerfectNum(int n) {
		  int sum=0;
	      int temp=n;
			for(int i=1;i<=n/2;i++) {
			if(n%i==0)
		sum=sum+i;
			}
			if(sum==temp)
				return "The Given number is Perfect number";
			else
		        return "The given number is not a perfect number";
	}
}