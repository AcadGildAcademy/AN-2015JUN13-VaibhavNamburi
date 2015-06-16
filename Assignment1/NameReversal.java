package com.acadgild.firstsession;

public class NameReversal {

	public static String stringRecursion(String name) {
		int nameLength = name.length()-1;
		if(nameLength==0)
		return Character.toString(name.charAt(nameLength));
		else
			return name.charAt(nameLength) + stringRecursion(name.substring(0, nameLength));
		
//		int nameLength = name.length() - 1;
//		char c = name.charAt(nameLength);
//		if (nameLength == 0)
//			return Character.toString(c);
//
//		else
//			return c + stringRecursion(name.substring(0, nameLength));
//
	}

	public static void main(String[] args) {

		System.out.println(stringRecursion("Vaibhav Namburi"));
		
//		OR this can be done as well
		
		String Name = "Vaibhav Namburi";
		int nameLength= Name.length();
		for(int i = nameLength-1; i>=0 ; i--){
			System.out.print(Name.charAt(i));
		}

	}

}
