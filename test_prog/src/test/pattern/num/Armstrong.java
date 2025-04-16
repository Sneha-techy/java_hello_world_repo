package test.pattern.num;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
	int	n=sc.nextInt();
	
	System.out.println(isArmStrong(n));
}

	private static String isArmStrong(int n) {
		int temp=n;
		int count=0;
		
		int sum=0;
		while(n>0)
		{
			count++;
			n=n/10;
			
		}
		
		n=temp;
		while(n>0) {
		int rem=n%10;
		int pow=1;
	for(int i=1;i<=count;i++)
	{
		pow=pow*rem;
		
	}
	
	sum=sum+pow;
	n=n/10;
		}
		
			if(sum==temp)
				return "The Given number is ArmStrong number";
			else
		        return "The given number is not a ArmStrong number";
	}
}