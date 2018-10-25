package decisions;

import java.util.Scanner;

public class Range {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number :");
		double number = input.nextDouble();
		double small = number;
		double big = number;
		do {
			if (number > big) {
				big = number;
			} else {
				if (number < small) {
					small = number;
				}
			}
			System.out.println("Please enter a number (9999 to quit) :");
			number = input.nextDouble();
		} while (number != 9999);
		System.out.println("The range of the numbers you entered in is : " + (big - small));
		input.close();
	}
}