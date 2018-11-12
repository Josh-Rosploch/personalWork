package randomNumbers;

import java.util.Random;

public class Yahtzee {
	public static void main(String[] args) {
		Random generator = new Random();
		int rolls = 0;
		double fith = 1;
		double total = 0;
		do {
			total = 0;
			for (int die = 1; die <= 4; die++) {
				total += (1 + generator.nextInt(6));
			}
			fith = (1 + generator.nextInt(6)) * 4;
			rolls++;
		} while ((total / fith) != 1);
		System.out.println("You rolled five " + (int) (fith / 4) + "'s after " + rolls + " rolls for Yahtzee");
	}
}