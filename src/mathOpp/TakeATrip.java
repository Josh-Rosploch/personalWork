package mathOpp;

import java.util.Scanner;

public class TakeATrip {

	public static void main(String[] args) {
		double distance = -999.0;
		double mpg = -999.0;
		double gas = -999.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the distance of the trip in miles?");
		distance = input.nextDouble();
		System.out.println("What is the miles per gallon of the car?");
		mpg = input.nextDouble();
		System.out.println("What was the total price of gas?");
		gas = input.nextDouble();
		input.close();
		System.out
				.println("The trip is " + distance + " miles long, " + (distance / mpg) + " gallons of gas was used, $"
						+ gas + " was the total cost of the gas, and the average cost per gallon of gas was $"
						+ (distance / gas) + ".");
	}
}