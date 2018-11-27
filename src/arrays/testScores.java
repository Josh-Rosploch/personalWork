package arrays;

import java.util.Random;

public class testScores {
	public static void main(String[] args) {
		Random rng = new Random(5985);
		double largest = 0;
		double[] scores = new double[250];
		for (int j = 0; j < scores.length; j++) {
			scores[j] = rng.nextInt(1001);
		}
		for (int j = 0; j < scores.length; j++) {
			if (largest < scores[j]) {
				largest = scores[j];
			}
		}
		System.out.println(largest);
	}
}	