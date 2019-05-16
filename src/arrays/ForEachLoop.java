package arrays;

import java.util.Random;

public class ForEachLoop {
	public static void main(String[] args) {
		Random rng = new Random();
		int[] scores = new int[6];
		for (int j = 0; j < scores.length; j++) {
			scores[j] = rng.nextInt(101);
		}

		System.out.println("Here are the scores:");
		for (int j = 0; j < scores.length; j++) {
			System.out.println(scores[j]);
		}

		System.out.println("-----\nHere are the scores:");
		for (int x : scores) {
			System.out.println(x);
		}
	}
}