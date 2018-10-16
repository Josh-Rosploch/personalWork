package decisions;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height?");
		double height = input.nextDouble();
		System.out.println("What is your shoe size?");
		double shoeSize = input.nextDouble();
		System.out.println(height + shoeSize >= 26);
		input.close();
	}
}
