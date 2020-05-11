package com.practice.recursion;

public class ReverseNumber {

	public void revNumber(int number) {
		if(number<10) {
			System.out.print(number);
		}else {
			System.out.print(number%10);
			revNumber(number/10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber revNr = new ReverseNumber();
		revNr.revNumber(1245232);
		
	}

}
