package com.acadgild.firstsession;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Please input year: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int inputYear= input.nextInt();
		
		if(inputYear%100==0){
			if(inputYear%100==0){
				System.out.println(inputYear + " year is a leap year");
			}
			else
				System.out.println(inputYear + " isn't a leap year");
		}
		else if(inputYear%4==0){
			System.out.println(inputYear + " is definitely a leap year");
		}
		else
			System.out.println(inputYear + " is not a leap year");
		
	}

}
