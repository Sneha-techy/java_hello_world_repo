package test.pattern.num;

import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:"); 
	int	n=sc.nextInt();
	
	System.out.println(isStrong(n));
}

	private static String isStrong(int n) {
		int temp=n;
        int sum=0;
       
		while(n>0) {
		int rem=n%10;


		 int fact=1;
	for(int i=rem;i>=1;i--)
	{
		fact=fact*i;
		
	}
	
	sum=sum+fact;
	n=n/10;
		}
		
			if(sum==temp)
				return "The Given number is Strong number";
			else
		        return "The given number is not a Strong number";
	}
}