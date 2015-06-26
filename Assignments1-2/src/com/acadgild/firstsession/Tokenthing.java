package com.acadgild.firstsession;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenthing {
	public static int count =0 ;

	public static void main(String[] args) {
		
		System.out.println("Enter string to tokenize: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String stn = input.nextLine();
		StringTokenizer token = new StringTokenizer(stn, ", .?");
		for(count=0; token.hasMoreTokens() ;count ++ ){
			System.out.println("Token" + count + " : " + token.nextToken());
		}
		
		
		
	}

}
