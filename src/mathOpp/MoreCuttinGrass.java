package mathOpp;

import java.util.Scanner;

public class MoreCuttinGrass {
	public static void main(String[] args) {
		double l = -999.0;
		double w = -999.0;
		double width = -999.0;
		double mph = -999.0;
		double hours = -999.0;
		final double PRICE = 12.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What are the dimentions of the lawn? (In feet)");
		l = input.nextDouble();
		w = input.nextDouble();
		System.out.println("What is the width of the  mower? (In inches)");
		width = (input.nextDouble() / 12);
		System.out.println("What is the speed of the mower? (In mph)");
		mph = input.nextDouble();
		input.close();
		hours = Math.round(((l * w) / (mph * 5280 * width)) * 100.0) / 100.0;
		System.out.println(
				"It will take " + hours + " hours and cost $" + Math.round((hours * PRICE) * 100.0) / 100.0 + ".");
	}
}