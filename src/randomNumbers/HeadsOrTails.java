package randomNumbers;

import java.util.Random;

public class HeadsOrTails {
	public static void main(String[] args) {
		Random rng = new Random();
		int min = 1;
		int max = 13;
		int multOfThree = 0;
		for (int flips = 1; flips <= 87; flips++) {
			if (((min + rng.nextInt(max - min + 1)) % 3) == 0) {
				multOfThree++;
			}
		}
		System.out.println("Total Multiples of Three: " + multOfThree);
	}
}