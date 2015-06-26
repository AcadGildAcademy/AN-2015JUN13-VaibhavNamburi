package com.acadgild.firstsession;

public class LoopEx1 {

	public static void main(String[] args) {
		int i;
		int j;
		for(i =1; i <=100 ; i++){
			int counter = 0;
			for(j=i ; j>0 ; j--){
				if(i%j==0)
				{
					counter = counter +1;
				}
				
			}
			if(counter==2){
				System.out.print(i + " ");
			}
			
		}

}
}