package com.practice.basicprograms;

import java.util.Scanner;

public class VowelsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		boolean isVowel = false;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter char:");
		ch = input.next().charAt(0);
		input.close();
		
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel = true;	
		}
		
		if(isVowel == true)
			System.out.println(ch+" is a Vowel");
		else
			System.out.println(ch+" is not a Vowel");
	}

}