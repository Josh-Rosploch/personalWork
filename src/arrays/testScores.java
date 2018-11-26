package arrays;

import java.util.Scanner;

public class testScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = 5;
		double[] scores = new double[length];
		System.out.println("Enter " + length + " test scores.");
		for (int j = 0; j < length; j++) {
			scores[j] = input.nextDouble();
		}
		for (int j = (length - 1); j >= 0; j--) {
			System.out.println("Score " + (j + 1) + " is: " + scores[j]);
		}
		input.close();
	}
}