package decisions;

import java.util.Scanner;

public class Round {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n = 0;
		for (boolean q = false; q == false;) {
			System.out.println("Enter a number");
			n = input.nextInt();
			System.out.println((int) n + " rounded is " + Math.round(n / 100) * 100
					+ "\n Would you like to quit? True = Quit, False = Continue");
			q = input.nextBoolean();
		}
		input.close();
	}
}