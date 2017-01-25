package com.epam.task1;

public class Task1_2 {
	
	public static void main(String[] args) {
		if (args.length>2){
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Double.parseDouble(args[2]);
			double value=(b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - b * Math.pow(c, 3) + Math.pow(b, -2);
			System.out.println("Value = " + value);
		}
		else{
			System.out.println("Enter three real number. The program will calculate mathematical expression using them");
		}
	}

}
