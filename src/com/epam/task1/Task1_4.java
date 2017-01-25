package com.epam.task1;

public class Task1_4 {

	public static void main(String[] args) {
		if (args.length>1){
			double x = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);
			int upperLineX = 4;
			int bottomLineX = -4;
			int upperLineTwoX = 2;
			int bottomLineTwoX = -2;
			int upperLineY = 4;
			int bottomLineY = -3;
			int middleLineY = 0;
			if((y <=  middleLineY) && (y >= bottomLineY) && (x <= upperLineX) && (x >= bottomLineX)){
				System.out.println("true");
			}
			else if ((y >= middleLineY) && (y <= upperLineY) && (x <= upperLineTwoX) && (x >= bottomLineTwoX)){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
		else{
			System.out.println("The program checks if entered point belongs to the defined area. Enter x and y coordinates of the point");
		}
	}

}
