package com.acadgild.firstsession;

public class harmonicSum {

	public static void main(String[] args) {
		
		double i;
		double result=0;
		for(i=1; i <=50000;i++){
			result += 1/i;
		}
		System.out.println(result);
		
		
		double j;
		double result1=0;
		for(j=50000; j >0;j--){
			result1 += 1/j;
		}
		System.out.println(result1);
	}
	
	
}
	


