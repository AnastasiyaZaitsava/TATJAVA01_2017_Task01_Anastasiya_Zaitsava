package com.epam.task1;

import java.util.Random;

public class Task1_9 {

	public static void main(String[] args) {
		if (args.length>2){
			int n = Integer.parseInt(args[0]);
			int m = Integer.parseInt(args[1]);
			int k = Integer.parseInt(args[2]);
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
		
			fillArray(arr1);
			fillArray(arr2);
			printArray(arr1);
			printArray(arr2);
			int[] unionedArr = new int[n+m];
			for (int i=0, l=0; i < n; i++, l++){
			
				if(i == k){
					for (int j = 0; j<m; j++){
						unionedArr[l]=arr2[j];
						l++;
					}
				}
					unionedArr[l]=arr1[i];
			}
			printArray(unionedArr);
		}
		else{
			System.out.println("Program inserts one array to another starting from the position k+1. Enter sizes of both arrays and number of position");
			//starting from k+1 == after k
		}
	}
	
	public static void fillArray(int[] arr){
		Random rnd = new Random(); 
		for (int i=0; i<arr.length; i++){
			arr[i]=rnd.nextInt(100);
		}
	}
	public static void printArray(int[] arr){
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}
