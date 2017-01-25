package com.epam.task1;

import java.util.Random;

public class Task1_8 {

	public static void main(String[] args) {
		if (args.length>1){
			int N = Integer.parseInt(args[0]);
			int K = Integer.parseInt(args[1]);
			Random generator = new Random(); 
			double sum = 0;
			int[] A = new int[N];
			for (int i=0; i<N; i++){
			A[i]=generator.nextInt(Integer.MAX_VALUE);
				System.out.print(A[i] + " ");
				if(A[i] % K == 0){
					sum += A[i];
				}
			}
			System.out.println(sum);
		}
		else {
			System.out.println("Program calculates sum of the array elements, which multiples of a given number. Enter size of array and the number");
		}

	}

}
