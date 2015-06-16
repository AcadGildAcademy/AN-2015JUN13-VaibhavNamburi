package com.acadgild.firstsession;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		System.out.println("Please input a letter: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String inputLetter= input.nextLine();
		char inputLetterChar = inputLetter.charAt(0);
//		char capitalLetter = Character.toUpperCase(inputLetterChar);
		if(inputLetterChar == 'a' || inputLetterChar == 'A') {
			System.out.println(inputLetterChar + " is a vowel");
		}
		if(inputLetterChar == 'e' || inputLetterChar == 'E'){
			System.out.println(inputLetterChar + " is a vowel");
		}
		if(inputLetterChar == 'i' || inputLetterChar == 'I'){
			System.out.println(inputLetterChar + " is a vowel");
		}
		if(inputLetterChar == 'o' || inputLetterChar == 'O'){
			System.out.println(inputLetterChar + " is a vowel");
		}
		if(inputLetterChar == 'u' || inputLetterChar == 'U')
			System.out.println(inputLetterChar + " is a vowel");
		else
			System.out.println(inputLetterChar + " isn't a vowel");
	}

}
