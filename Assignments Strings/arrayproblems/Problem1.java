package com.acadgild.arrayproblems;

public class Problem1 {

	public static void main(String[] args) {
		String hello = "Hello how are you";
		
		for(int i=(hello.length()-1) ; i >= 0 ; i--){
			System.out.print(hello.charAt(i));
		}
	}

}
