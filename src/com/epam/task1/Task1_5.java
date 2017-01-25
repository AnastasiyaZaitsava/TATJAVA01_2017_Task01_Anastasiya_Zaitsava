package com.epam.task1;

public class Task1_5 {

	public static void main(String[] args) {
		if (args.length>0 && args.length<4){
			int n=3;
			double[] numbers = new double[n];
			for (int i=0; i<n; i++){
				numbers[i] = Double.parseDouble(args[i]);
				if (numbers[i] >= 0){
					numbers[i] *= numbers[i];
				}
				else {
					numbers[i] *= Math.pow(numbers[i], 3);
				}
				System.out.println("Number " + (i + 1) + " = " + numbers[i]);
			}
		}
		else{
			System.out.println("Enter three real numbers. The program squares "
					+ "non-negative numbers and raises on the fourth degree negative numbers");
		}
	}

}
