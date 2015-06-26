package com.acadgild.firstsession;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		int i = 0;
		
		while(i < 7){
			int rnumber= randomGenerator.nextInt(100);	
			
		System.out.println("Please input a number between 1 - 100: ");
		int inputValue=input.nextInt();
		if(inputValue>rnumber){
		System.out.println("Number is too high");
		System.out.println("The computer generated : " + rnumber );
		}
		if(inputValue<rnumber){
		System.out.println("Number is too low");
		System.out.println("The computer generated : " + rnumber );
		}
		if(inputValue==rnumber){
			System.out.println("Correct guess!");
			System.out.println("The computer generated : " + rnumber );
		break;
		}
		i++;
		}
		System.out.println("Number of tries exceeded");
	}

}
