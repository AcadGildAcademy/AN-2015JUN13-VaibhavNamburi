package com.acadgild.arrayproblems;

public class Problem4 {

	public static void main(String[] args) {
		
		int[][] mat1 = new int [2][2];
		
		mat1[0][0]=1;
		mat1[0][1]=2;
		mat1[1][0]=3;
		mat1[1][1]=4;
		
		
		int[][] mat2 = new int [2][2];
		
		mat2[0][0]=1;
		mat2[0][1]=2;
		mat2[1][0]=3;
		mat2[1][1]=4;
		
		int[][] mat3 = new int [2][2];
		
		for(int i=0 ; i < mat1.length ; i++){
			for(int j = 0 ; j <mat2[0].length; j++){
				for(int k = 0 ; k < mat1[0].length;k++){
					mat3[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		
		for (int i = 0 ; i < 2 ; i ++){
			for(int j = 0 ; j <2 ; j++){
				System.out.print(mat3[i][j] + "   ");
			}
			System.out.println();
		}
		
	}
}
