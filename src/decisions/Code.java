package decisions;

import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double number = 0;
		double sum = 0;
		double bigBoy = -999999;
		double total = -1;
		while (number != 9999) {
			sum += number;
			if (number > bigBoy) {
				bigBoy = number;
			}
			System.out.println("Please enter a number. (9999 to quit)");
			number = input.nextDouble();
			total++;
		}
		if (total == 0) {
			total = 1;
		}
		if (bigBoy == -999999) {
			bigBoy = 0;
		}
		System.out.println("The average of the numbers entered is: " + (sum / total)
				+ "\nThe largest number entered is: " + bigBoy);
		input.close();
	}
}
