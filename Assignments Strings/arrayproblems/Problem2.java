package com.acadgild.arrayproblems;

import java.util.LinkedList;

public class Problem2 {

	public static void main(String[] args) {
		LinkedList<Integer> array = new LinkedList<Integer>();
		array.add(-9);
		array.add(-7);
		array.add(-3);
		array.add(-2);
		array.add(0);
		array.add(2);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(8);

		System.out.println("Sorted array: " + "[Length" + array.size() + "]");
		for(int i= 0 ; i < array.size() ; i++){
			System.out.print(array.get(i)+",");
		}
		System.out.println();
		array.add(5, 1);
		
		System.out.println("With 1 added: " + "[Length" + array.size() + "]");
		for(int i= 0 ; i < array.size() ; i++){
			System.out.print(array.get(i)+",");
		}
	}

}
