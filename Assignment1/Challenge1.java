package com.acadgild.firstsession;
import java.util.Scanner;

public class Challenge1 {
	
	public static void numberOfDays(String month){
		switch(month){
		
		case "January":
		case "March":	
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			System.out.println("The month of " + month + " has 31 days");
		break;
			
		case "April":
		case "June":
		case "September":
		case "November":
			System.out.println("The month of " + month + " has 30 days");
		break;
		
		case "February":
			System.out.println("The month of " + month + " has 28 days");
		break;
		
		default:
			System.out.println("The month you entered is spelt incorrectly(Please capitalize the first letter)");
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the month: ");
		String inputMonth = input.nextLine();
		
		numberOfDays(inputMonth);
		
	}

}
