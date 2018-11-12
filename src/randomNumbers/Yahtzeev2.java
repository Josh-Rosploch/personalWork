package randomNumbers;

import java.util.Random;

public class Yahtzeev2 {
	public static void main(String[] args) {
		Random generator = new Random();
		int rolls = 0;
		double d1 = 0;
		double d2 = 0;
		double d3 = 0;
		double d4 = 0;
		double d5 = 0;
		do {
			d1 = (1 + generator.nextInt(6));
			d2 = (1 + generator.nextInt(6));
			d3 = (1 + generator.nextInt(6));
			d4 = (1 + generator.nextInt(6));
			d5 = (1 + generator.nextInt(6));
			rolls++;
			System.out.println(d1 + " | " + d2 + " | " + d3 + " | " + d4 + " | " + d5);
		} while (d1 != d2 && d2 != d3 && d3 != d4 && d4 != d5);
		System.out.println("You rolled five " + d1 + "'s after " + rolls + " rolls for Yahtzee");
	}
}