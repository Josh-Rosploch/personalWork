package mathOpp;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		int speed = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What speed where you going?");
		speed = input.nextInt();
		input.close();
		System.out.println("The speed limit is 30 mph, your speed was " + speed
				+ ", the cost of the speeding ticket is " + (((speed - 31) * 40) + 55) + ".");
	}
}