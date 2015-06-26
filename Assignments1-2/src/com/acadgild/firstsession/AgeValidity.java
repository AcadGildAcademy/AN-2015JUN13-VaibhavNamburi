package com.acadgild.firstsession;

import java.util.Scanner;

public class AgeValidity {

	public static void main(String[] args) {
		System.out.println("Please input your age: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int inputAge= input.nextInt();
		
		if(inputAge>=18)
			System.out.println("Congratulations! You are allowed to vote");
			else
				System.out.println("Sorry you aren't old enough to vote yet");
		}
	}


