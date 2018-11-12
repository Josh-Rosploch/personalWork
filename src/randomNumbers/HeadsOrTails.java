package randomNumbers;

import java.util.Random;

public class HeadsOrTails {
	public static void main(String[] args) {
		Random rng = new Random();
		int min = 1;
		int max = 2;
		int heads = 0;
		int tails = 0;
		for (int flips = 1; flips <= 100; flips++) {
			if (min == (min + rng.nextInt(max - min + 1))) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Total Heads: " + heads + "\nTotal Tails: " + tails);
	}
}