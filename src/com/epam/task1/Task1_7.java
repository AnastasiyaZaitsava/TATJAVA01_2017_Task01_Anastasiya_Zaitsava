package com.epam.task1;

public class Task1_7 {
	public static void main(String[] args) {
		if (args.length>2){
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double h = Double.parseDouble(args[2]);
			double Fx = 0;
			double x = a;
			System.out.println("\t x \t F(x)");
			while(x <= b){
				Fx = Math.sin(x) * Math.sin(x) - Math.cos(2 * x);
				System.out.printf("%8.3f", x);
				System.out.printf("%8.3f", Fx);
				System.out.println("");
				x+=h;
			}
		}
		else {
			System.out.println("Enter bounds of segment and step 'h'. The progam will calculate function values on specified segment with that step");	
		}
	}

}
