package com.acadgild.firstsession;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int inputAge= input.nextInt();
		
		if(inputAge%2==0)
			System.out.println(inputAge + " is even");
		else
			System.out.println(inputAge + " isn't even");
	}

}
