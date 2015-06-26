package com.acadgild.firstsession;

public class Sum2Hundred {

	
	
	public static void main(String[] args) {
	int i;
	int result =0;
	int n =100;
	
	for(i=0; i<=n;i++ ){
		result = result + i;
		
	}
		System.out.println(result);
		System.out.println("Average is: " + (double)result/n);
		
	}

}
