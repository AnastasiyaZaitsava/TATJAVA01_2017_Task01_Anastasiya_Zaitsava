package com.epam.task1;

public class Task1_6 {
	public static void main(String[] args) {
		if (args.length>0 && args.length<4){
			int n = 3;
			double[] numbers = new double[n];
			for (int i=0; i<n; i++){
				numbers[i] = Double.parseDouble(args[i]);
			}
			double minNumber = numbers[0];
			double maxNumber = numbers[0];
			for(int i = 0; i < n; i++){
				if (numbers[i] < minNumber){
					minNumber = numbers[i];
				}
				else if (numbers[i] > maxNumber){
					maxNumber = numbers[i];
				}
			}
			System.out.println(minNumber+maxNumber);
		}
		else{
			System.out.println("Enter three real numbers. The program will sum "
					+ "min and max from them");
		}
	}

}
