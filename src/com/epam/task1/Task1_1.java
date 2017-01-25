package com.epam.task1;

public class Task1_1 {

	public static void main(String[] args) {
		if (args.length>0){
			String number = args[0];
			if (number.length()!=4){
				System.out.println("false");
			}
			else {
				int firstDigit = Character.getNumericValue(number.charAt(0));
				int secondDigit = Character.getNumericValue(number.charAt(1));
				int thirdDigit = Character.getNumericValue(number.charAt(2));
				int fourthDigit = Character.getNumericValue(number.charAt(3));
				if ((firstDigit + secondDigit) == (thirdDigit + fourthDigit)){
					System.out.println("true");
				}
				else{
					System.out.println("false");
				}
			}
		}
		else{
			System.out.println("The program checks whether the sum of the first two digits "
					+ "is equal to the sum of the last two. "
					+ "Enter a four-digit integer.");
		}
	}

}
