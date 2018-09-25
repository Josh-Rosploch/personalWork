package mathOpp;

import java.util.Scanner;

public class CuttinGrass {
	public static void main(String[] args) {
		double l = -999.0;
		double w = -999.0;
		double r = -999.0;
		final double PRICE = 1.25;
		final double REG = 100.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What are the dimentions of the lawn? (In feet)");
		l = input.nextDouble();
		w = input.nextDouble();
		System.out.println("What is the radius of the fountain? (In feet)");
		r = input.nextDouble();
		input.close();
		System.out.println("The cost of cuttin the lawn is $"
				+ Math.round(((l * w) - (Math.PI * r * r)) / REG * PRICE * 100.0) / 100.0 + ".");
	}
}
