package randomNumbers;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		Random rng = new Random();
		int min = -50;
		int max = 50;
		int rndNum = min + rng.nextInt(max - min + 1);
		System.out.println(rndNum);
	}
}