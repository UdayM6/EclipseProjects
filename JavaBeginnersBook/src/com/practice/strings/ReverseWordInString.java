package com.practice.strings;

public class ReverseWordInString {

	public void reverseWord(String str) {
		String[] words=	 str.split(" ");
		String reversedString ="";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reversedWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reversedWord=reversedWord+word.charAt(j);
			}
			reversedString = reversedString + reversedWord + " ";
		}
		System.out.println("input str: "+ str);
		System.out.println("Reversed word string: "+ reversedString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordInString rs= new ReverseWordInString();
		rs.reverseWord("uday kumar automation engineer");
	}

}
