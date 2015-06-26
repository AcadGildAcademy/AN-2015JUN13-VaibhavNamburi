package com.acadgild.arrayproblems;

public class Problem5 {

	public static void main(String[] args) {
		int[][] mat1 = new int [2][2];
		
		mat1[0][0]=1;
		mat1[0][1]=2;
		mat1[1][0]=3;
		mat1[1][1]=4;
		
		int maxValue=0;
				
		for(int i = 0 ; i<mat1.length;i++){
			for(int j = 0 ; j < mat1[0].length ; j++){
			if(mat1[i][j]>maxValue){
				maxValue=mat1[i][j];
			}
			}
			System.out.println("Dimension1 :" +  maxValue);
		}
	}

}
