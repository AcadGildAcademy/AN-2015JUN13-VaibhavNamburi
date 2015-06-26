package com.acadgild.firstsession;

import java.util.Scanner;

public class test {
	private static char encryptChar(char ch, int ki){
		if(Character.isUpperCase(ch)){
			return ((char) ('A' + (ch-'A'+ ki)%26));
		}
		return ch;
	}
	
	
	private static String encryptCaesar(String txt, int ki){
		if(ki<0){
			ki = 26- (-ki%26);
		}
		String result = "";
		for ( int i = 0 ; i<txt.length(); i++){
			char  ch = txt.charAt(i);
			result+=encryptChar(ch,ki);
		}
		return result;
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text to encrypt: ");
		String text = input.nextLine();
		System.out.println("Enter the key: ");
		int key = input.nextInt();
		
		String encryptedText = encryptCaesar(text,key);
		
		System.out.println("CaeserCode: " + encryptedText);
		
		String decryptedText = encryptCaesar(encryptedText,-key);
		
		System.out.println("CaeserCode decrypted: " + decryptedText);
	}

}
