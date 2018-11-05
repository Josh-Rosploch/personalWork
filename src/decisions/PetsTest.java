package decisions;

import java.util.Scanner;

public class PetsTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of pets in your house??");
		int pets = input.nextInt();
		System.out.println("How many cars fit in your garage?");
		int carsFit = input.nextInt();
		System.out.println("It is " + (pets >= 5 || carsFit > 3)
				+ " that you have at least 5 pets or can fit more than 3 cars in your garage.");
		input.close();
	}
}