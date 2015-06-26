package com.acadgild.firstsession;

public class patternf {

	public static void main(String[] args) {

		int i;
		int j;
		int k;
		
		for(i=10 ; i>0 ; i--){
			for(j = 1; j<10-i;j++){
				System.out.print(" ");
			}
			System.out.print("# ");
			for(k=i; k> 0 ; k-=2){
				System.out.print("  ");
			}
			System.out.print(" #");
			System.out.println();
		}
		
	}

}
