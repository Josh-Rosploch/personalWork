package decisions;

import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double number = 0;
		double sum = 0;
		double total = -1;
		while (number != 9999) {
			total++;
			sum += number;
			System.out.println("Please enter a number. (9999 to quit)");
			number = input.nextDouble();
		}
		if (total == 0) {
			total = 1;
		}
		System.out.println(sum + "The average of the numbers entered is: " + (sum / total));
		input.close();
	}
}