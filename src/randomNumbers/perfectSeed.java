package randomNumbers;

import java.util.Random;

public class perfectSeed {
	public static void main(String[] args) {
		int min = 26;
		int max = 43;
		int kidsOverThree = 0;
		for (int sed = 0; sed <= 9999999; sed++) {
			Random rng = new Random(sed);
			for (int kid = 1; kid <= 248; kid++) {
				if ((min + rng.nextInt(max - min + 1)) > 36) {
					kidsOverThree++;
				}
			}
			if (kidsOverThree >= 230) {
				System.out.println("Perfect seed: " + sed);
			}
			kidsOverThree = 0;
		}
	}
}