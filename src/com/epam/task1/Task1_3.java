package com.epam.task1;

public class Task1_3 {

	public static void main(String[] args) {
		if (args.length>0){
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Math.sqrt(a*a+b*b);
			double perimeter = a + b + c;
			double square = (a * b) / 2;
			System.out.println("Perimeter = " + perimeter);
			System.out.println("Square = " + square);
		}
		else {
			System.out.println("The programs calculates perimeter and square "
					+ "of the angled triangle."
					+ "Enter two cathetus of the triangle");
		}

	}

}
