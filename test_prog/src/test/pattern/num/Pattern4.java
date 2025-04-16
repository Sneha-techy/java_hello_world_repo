package test.pattern.num;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
	int	n=sc.nextInt();
	int a=2 ;
	for(int row=1;row<=n;row++) {
		      
	
		for(int col=1;col<=n*2-1;col++) {
			if(row+col>=n+1 && col-row<=n-1 )
			{
			      if(col<=row )
		           	{
			    	  a++;
			    	  System.out.print(a+" ");
			          }
			       else {
				      a--;
			  System.out.print(a+" ");
			            }
		    }
			else
				System.out.print(" "+" ");
		}
		System.out.println();
		}
	}
}	
