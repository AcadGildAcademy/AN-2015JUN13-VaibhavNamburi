package com.acadgild.firstsession;

public class Patternforg {

	public static void main(String[] args) {

		int i;
		int j;
		
		for(i=0 ; i<5 ; i++){
			for( j =1 ; j<5-i; j++){
				System.out.print(" ");
			}
			System.out.print(" #");
			System.out.println();
			System.out.println();
			
		}
	}

}

//for(i=0 ; i<5 ; i++){
//	for( j =0 ; j<5; j++){
//		if(i+j==4){
//			System.out.print("#");
//		}
//		else
//			System.out.print(" ");
//	}
//	System.out.println();	
//}
