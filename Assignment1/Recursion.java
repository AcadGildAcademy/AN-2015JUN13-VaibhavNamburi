package com.acadgild.firstsession;

public class Recursion {

//	public void getTNumber(int number){
//		int result = 0;
//		while(number>0){
//		result+= number;
//		number--;
//		}
//		System.out.println(result);
//	}
	
	public int RecurMethod(int number){
		if(number==1){
			return 1;
		}
		else
		{
			int result = number + RecurMethod(number-1);
			System.out.println(result);
			return result;
			
		}
	}
		
	int getF(int numbero){
		if(numbero == 1){
			return 1;
		}
		else{
			int result = numbero*getF(numbero-1);
//			System.out.println(result);
			return result;
		}
	}
		
	
	
	public static void main(String[] args) {

		Recursion r = new Recursion();
		System.out.println(r.getF(6));
		
		
	}

}
