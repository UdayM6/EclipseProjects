package com.practice.strings;

import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		String temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter nr of strings to sort: ");
		count = scan.nextInt();
		
		String[] str=new String[count];
		Scanner scan2= new Scanner(System.in);
		System.out.println("Enter strings");
		
		for(int i=0; i<count;i++) {
			str[i]=scan2.nextLine();
		}
		//bubble sort
		for(int i=0; i<count;i++) {
			for(int j=i+1; j<count;j++) {
				if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
				
			}
		}
		
		System.out.println("Sorted as below");
		for(int i=0; i<count;i++) {
			System.out.print(str[i]+", ");
		}
		
	}

}