package com.practice.arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[10];
		int i=0, j=0, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter nr of numbers: ");
		int counter = input.nextInt();
		
		System.out.println("enter numbers");
		for(i=0;i<counter;i++) {
			number[i] = input.nextInt();
		}
		
		for(i=0;i<counter;i++) {
			for(j=i+1;j<counter;j++) {
				temp=number[i];
				number[i]=number[j];
				number[j]=temp;
			}
		}
		System.out.println("reversed array");
		for(i=0;i<counter;i++) {
			System.out.println(number[i]);
		}
		
	}

}
