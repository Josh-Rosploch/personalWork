package arrays;

import java.util.Random;

public class testScores {
	public static void main(String[] args) {
		Random rng = new Random(5985);
		int length = 250;
		double largest = 0;
		double[] scores = new double[length];
		for (int j = 0; j < length; j++) {
			scores[j] = rng.nextInt(1001);
		}
		for (int j = 0; j < length; j++) {
			if (largest < scores[j]) {
				largest = scores[j];
			}
		}
		System.out.println(largest);
	}
}