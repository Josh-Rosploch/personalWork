package decisions;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double number = -9999;
		System.out.println("Please enter a number :");
		number = input.nextDouble();
		do {
			System.out.println("Magic product is : " + (number * 17));
			System.out.println("Please enter a number (9999 to quit) :");
			number = input.nextDouble();
		} while (number != 9999);
		input.close();
	}
}