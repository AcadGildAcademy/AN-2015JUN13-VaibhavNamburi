package com.acadgild.firstsession;

public class CozaLoza {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i <=110; i++){
			
			boolean status=false;
			if(i%3==0){
				System.out.print("Coza ");
				status = true;
			}
			
			if(i%5==0){
				System.out.print("Loza ");
				status=true;
			}
			
			if(i%7==0){
				System.out.print("Woza ");
				status=true;
			}
			
			if(!status)
				System.out.print(i + " ");
			
			if(i%11==0 ){
				System.out.println();
				}
			
		}
		
		
		
	}

}
