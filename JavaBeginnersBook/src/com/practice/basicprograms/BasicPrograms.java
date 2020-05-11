package com.practice.basicprograms;

import java.util.Scanner;

public class BasicPrograms {

	public static void main(String[] args) {
		
		// Even Odd Number program
		/*
		int num;
		System.out.println("Enter an integer:");
		Scanner input = new Scanner(System.in);
		num=input.nextInt();
		if(num%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		*/
		
		// Add two binary numbers
		
		long b1, b2;
		int i=0, carry=0;
		
		int[] sum=new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("enter 1st binary nr:");
		b1=input.nextLong();
		System.out.print("enter 2nd binary nr:");
		b2=input.nextLong();
		
		input.close();
		
		while (b1!=0 || b2!=0)
		{
			sum[i++] = (int)((b1%10 + b2%10 + carry)%2);
			carry = (int)((b1%10 + b2%10 + carry)/2);
			b1=b1/10;
			b2=b2/10;
		}
		if (carry!=0)
			sum[i++]=carry;
	    --i;
	    System.out.print("Sum : ");
	    while (i>=0)
	    {
	    	System.out.print(sum[i--]);
	    }
		
	}

}
