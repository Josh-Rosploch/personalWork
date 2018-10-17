package decisions;

import java.util.Scanner;

public class HeightTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double height = input.nextDouble();
		System.out.println("What is your shoe size?");
		double shoeSize = input.nextDouble();
		System.out.println(height < 62);
		System.out.println(shoeSize > 9);
		input.close();
	}
}