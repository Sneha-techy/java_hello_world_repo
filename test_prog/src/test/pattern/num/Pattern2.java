package test.pattern.num;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
	int	n=sc.nextInt();
	
	for(int row=1;row<=n*2-1;row++) {
		for(int col=1;col<=n*2-1;col++) {
			if(row+col>=n+1 && col-row<=n-1  &&  row-col<=n-1 && row+col<=n*3-1)
				System.out.print("*"+" ");
			else
			System.out.print(" "+" ");
		}
		System.out.println();
		}
	}
}	
