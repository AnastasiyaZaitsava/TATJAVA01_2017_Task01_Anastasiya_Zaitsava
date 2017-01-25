package com.epam.task1;

public class Task1_10 {
	
	public static void main(String[] args) {
		if (args.length>0){
			int n = Integer.parseInt(args[0]);
			if (n%2 == 0){
				int[][] matrix = new int[n][n];
				for(int i = 0; i < n; i++){
					if (i % 2 == 0){
						for (int j=0; j<n; j++){
							matrix[i][j]=j+1;
						}
					}
					else{
						for (int j=0; j<n; j++){
							matrix[i][j]=n-j;
						}
					}
				}
				printMatrix(matrix, n);
			}
			else {
				System.out.println("Size of matrix must be even number");
			}
		}
		else {
			System.out.println("Enter the size 'n' of a square matrix");
		}
	}
	
	public static void printMatrix(int[][] arr, int n){
		for(int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
