package arrays;

import java.util.Scanner;

public class testScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter FIVE test scores.");
		double[] scores = new double[5];
		int totalScore = 0;
		for (int j = 0; j < 5; j++) {
			scores[j] = input.nextDouble();
		}
		for (int j = 0; j < 5; j++) {
			totalScore += scores[j];
		}
		System.out.println("The sum of the scores is: " + totalScore);
		input.close();
	}
}